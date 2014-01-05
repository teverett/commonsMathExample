package com.khubla.commonsMathExample;

import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;

/**
 * <p>
 * Equation is assumed to be of the form y' = f(t,y)
 * <p>
 * <p>
 * In this case we're modeling an RC circuit so (Vc-Vin)/R + C*Vc'=0;
 * </p>
 * 
 * @author tom
 */
public class RC implements FirstOrderDifferentialEquations {
   private final double R, C, V;

   public RC(double R, double C, double V) {
      this.R = R;
      this.V = V;
      this.C = C;
   }

   /**
    * system has 1 equations
    */
   public int getDimension() {
      return 1;
   }

   /**
    * Vc' = - (Vc-Vin)/RC;
    */
   public void computeDerivatives(double t, double[] y, double[] yDot) {
      double rcTimeConstant = (R * C);
      yDot[0] = (-1 / rcTimeConstant) * (y[0] - V);
   }
}
