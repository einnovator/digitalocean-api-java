/**
 * The MIT License
 *
 * <p>Copyright (c) 2013-2020 Jeevanandam M. (jeeva@myjeeva.com)
 *
 * <p>Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * <p>The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * <p>THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.myjeeva.digitalocean;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import com.myjeeva.digitalocean.exception.DigitalOceanException;
import com.myjeeva.digitalocean.exception.RequestUnsuccessfulException;
import com.myjeeva.digitalocean.impl.DigitalOceanClient;
import com.myjeeva.digitalocean.pojo.Cluster;
import com.myjeeva.digitalocean.pojo.ClusterCredentials;
import com.myjeeva.digitalocean.pojo.Clusters;
import com.myjeeva.digitalocean.pojo.Delete;
import com.myjeeva.digitalocean.pojo.Node;
import com.myjeeva.digitalocean.pojo.NodePool;
import com.myjeeva.digitalocean.pojo.NodePools;
import org.apache.commons.lang3.StringUtils;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Junit Integration Test case for DigitalOcean API client wrapper methods
 *
 * <p><strong>Please Note:</strong> <i>Kindly go through and update private variable value before
 * using executing this test case(s).</i>
 *
 * @author Jeevanandam M. (jeeva@myjeeva.com)
 */
// Marked as Ignore since its a Integration Test case with real values
@RunWith(JUnit4.class)
public class DigitalOceanKubernetesIntegrationTests {

  private final Logger log = LoggerFactory.getLogger(DigitalOceanKubernetesIntegrationTests.class);

  /**
   * This is testing values of my own respective to DigitalOcean account, to real-time integration
   * with API. So place your's for integration test case before use
   */
  private final String authTokenRW = "";

  private final Integer dropletIdForInfo = 10001; // to be placed before use
  private final String volumeIdForInfo = "10001"; // to be placed before use
  private final String volumeNameForInfo = "test-volume"; // to be placed before use, should have
  private final String loadBalancerIdForInfo =
      "155fa6cd-3e74-406d-90bd-5671488c7157"; // to be placed
  // before use
  private final String firewallIdForInfo =
      "190ceeb7-779a-4b04-9091-4dd175de65ec"; // to be placed before use

  private final String domainName = "";

  private String projectId;

  private String clusterId;

  private final DigitalOcean apiClient = new DigitalOceanClient(authTokenRW);

  //
  //
  //

  @Test
  public void testGetAvailableClusters()
      throws DigitalOceanException, RequestUnsuccessfulException {
    Clusters clusters = apiClient.getAvailableClusters(0, 100);

    assertNotNull(clusters);
    assertNotNull(clusters.getClusters());
    assertFalse(clusters.getClusters().isEmpty());
    for (Cluster cluster : clusters.getClusters()) {
      log.info(cluster.toString());
      Cluster cluster2 = apiClient.getCluster(cluster.getId());
      assertNotNull(cluster2);
      log.info(cluster2.toString());
      for (NodePool nodepool : cluster2.getNodePools()) {
        log.info(nodepool.toString());
        assertNotNull(nodepool);
        if (nodepool.getNodes() != null) {
          assertFalse(nodepool.getNodes().isEmpty());
          for (Node node : nodepool.getNodes()) {
            log.info("" + node);
          }
        }
      }
      NodePools nodepools = apiClient.getAllNodePools(cluster2.getId());
      assertNotNull(nodepools);
      assertNotNull(nodepools.getNodePools());
      assertFalse(nodepools.getNodePools().isEmpty());
      for (NodePool nodepool : nodepools.getNodePools()) {
        log.info(nodepool.toString());
        assertNotNull(nodepool);
        if (nodepool.getNodes() != null) {
          assertFalse(nodepool.getNodes().isEmpty());
          for (Node node : nodepool.getNodes()) {
            log.info("" + node);
          }
        }
      }
      String kubeconfig = apiClient.getKubeConfig(cluster2.getId());
      assertNotNull(kubeconfig);
      assertFalse(StringUtils.isEmpty(kubeconfig));
      System.out.println(kubeconfig);

      ClusterCredentials crendentials =
          apiClient.getClusterCrendentials(cluster2.getId(), 3600 * 24 * 7);
      assertNotNull(crendentials);
      System.out.println(crendentials);
    }
  }

  @Test
  @Ignore
  public void createCluster() throws DigitalOceanException, RequestUnsuccessfulException {
    Cluster cluster = new Cluster();
    cluster.setName("test cluster");

    Cluster p = apiClient.createCluster(cluster);
    clusterId = p.getId();

    assertNotNull(p);
    assertNotNull(p.getId());

    log.info(p.toString());
  }

  @Test
  @Ignore
  public void testUpdateCluster() throws DigitalOceanException, RequestUnsuccessfulException {
    Cluster cluster = apiClient.getCluster(clusterId);
    cluster.setName("updated cluster name");

    Cluster p = apiClient.updateCluster(cluster);

    assertNotNull(p);
    assertNotNull(p.getId());

    log.info(p.toString());
  }

  @Test
  @Ignore
  public void testDeleteCluster() throws DigitalOceanException, RequestUnsuccessfulException {
    Delete result = apiClient.deleteCluster(clusterId);
    assertNotNull(result);
  }
}
