package softserve.com.number;

public enum HTTPError {
	ERROR400() {
		@Override
		public void errorDiscribe() {
			System.out.println("Bad Request");
		}

	},
	ERROR401() {
		@Override
		public void errorDiscribe() {
			System.out.println("Unauthorized");
		}
	},
	ERROR402() {
		@Override
		public void errorDiscribe() {
			System.out.println("Payment Required");
		}
	};

	public void errorDiscribe() {
	}
}
