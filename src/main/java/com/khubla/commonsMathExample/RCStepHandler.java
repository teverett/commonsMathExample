package com.khubla.commonsMathExample;

import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepInterpolator;

/**
 * @author tom
 */
public class RCStepHandler implements StepHandler {
   @Override
   public void init(double t0, double[] y0, double t) {
   }

   @Override
   public void handleStep(StepInterpolator interpolator, boolean isLast) throws MaxCountExceededException {
      System.out.println(interpolator.getCurrentTime() + "," + interpolator.getInterpolatedState()[0]);
   }
}
