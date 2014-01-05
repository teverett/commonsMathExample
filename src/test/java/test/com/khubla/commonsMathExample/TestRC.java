package test.com.khubla.commonsMathExample;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.khubla.commonsMathExample.RCIntegrator;

/**
 * @author tom
 */
public class TestRC {
   /*
    * V=12V R=100Kohm C=10nF
    */
   @Test
   public void test1() {
      try {
         /*
          * integrator
          */
         RCIntegrator ode1Integrator = new RCIntegrator();
         double R = 100 * 1000;
         double V = 12;
         double C = 10 * 10e-9;
         /*
          * integrate
          */
         double[] y = ode1Integrator.integrate(R, C, V, 0, 0.1);
         System.out.println(y[0]);
      } catch (Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }
}
