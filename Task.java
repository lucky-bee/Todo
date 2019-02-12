class Task {
	private String text;
	private Boolean status;

	public Task() {
		this.text = "Kori Be Nom";
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

	public String getText() {
		return this.text;
	}

	public Task setText(String text) {
		this.text = text;
		return this;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public Task setStatus(Boolean status) {
		this.status = status;
		return this;
	}
}