package snippet;

public class Snippet {
	long milliseconds = 10000000;
	int seconds = (int)milliseconds / 1000;
	int days = seconds / 60 / 60 / 24;
	int hours = seconds / 60 / 60 - days * 60 * 60 * 24;
	int minutes = seconds / 60 - hours * 60 * 60;
	seconds = seconds - minutes * 60;
}

