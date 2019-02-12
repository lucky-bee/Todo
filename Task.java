class Task {
	String text;
	Boolean status;

	public Task() {
		this.text = "Untitled";
		this.status = false;
	}

	public Task(String text) {
		this.text = text;
		this.status = false;
	}

	public Task(String text, Boolean status) {
		this.text = text;
		this.status = status;
	}
}