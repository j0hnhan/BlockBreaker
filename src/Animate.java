
public class Animate implements Runnable{
	
	BlockBreakerPanel bp;
	
	Animate(BlockBreakerPanel b){
		bp = b;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			bp.update();
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
	}
	
}
