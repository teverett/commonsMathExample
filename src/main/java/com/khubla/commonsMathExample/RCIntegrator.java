package com.khubla.commonsMathExample;

import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math3.ode.sampling.StepHandler;

/**
 * @author tom
 */
public class RCIntegrator {
   public double[] integrate(double R, double C, double V, double t0, double tn) {
      /*
       * equation
       */
      FirstOrderDifferentialEquations ode = new RC(R, C, V);
      /*
       * assume that the capacitor has no charge at the start. Vc=0
       */
      double[] y = new double[] { 0.0 };
      /*
       * integrator
       */
      FirstOrderIntegrator integrator = new ClassicalRungeKuttaIntegrator(1.0e-6);
      /*
       * a step handler to show the output
       */
      StepHandler stepHandler = new RCStepHandler();
      integrator.addStepHandler(stepHandler);
      /*
       * integrate
       */
      integrator.integrate(ode, t0, y, tn, y);
      return y;
   }
}
