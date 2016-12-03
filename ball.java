public class ball {
    public double[] x = new double[3]; //[p,v,a]
    public double[] y = new double[3]; //[p,v,a]
    public double[] z = new double[3]; //[p,v,a]
    //public float xf;
    //public float yf;
    //public float zf;
    //public float xa;
    public int spinx = 0;
    public int spinz = 0;
    //public int thetaz;
    //public int thetay;
    //public int speed; // force?
    public double g = -10;
    public double m = 1;
    public double t = 60;

    public ball() {
	x[1] = 4.5;
	y[1] = 10.0;
	z[1] = 7.5;
	y[2] = -10;
	spinx = 1;
	spinz = 0;
    }
    
    public void p() {
	System.out.print(x[0] + "," + y[0] + "," + z[0]);
    }

    //bounce(), move(), hit()
    //bounce checks height relative to table
    
    public void bounce() {
	y[0] = .0001;
	y[1] *= -.9;
	x[2] += 4.5*spinx/t;
	z[2] += 4.5*spinz/t;
    }

    public void move() {
	//p();
	x[0] += x[1]/t;
	y[0] += y[1]/t;
	z[0] += z[1]/t;

	x[1] += x[2]/t;
	y[1] += y[2]/t;
	z[1] += z[2]/t;
	if(y[0] <= 0) { // x 0-5 z 0-9
	    //System.out.println("bounce");
	    bounce();
	}

    }

    public void hit() {
	//assum
	
    }
    
    public static void main(String[] args) {
	ball fuck = new ball();
	for (int i = 0; i < 500; i++) {
	    System.out.print("[");
	    fuck.move();
	    fuck.p();
	    System.out.println("]");
	}

    }
}
