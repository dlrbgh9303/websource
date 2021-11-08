package book.action;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class BookActionForward {
	private String path;
	private boolean sendRedirect;
	public boolean isRedirect() {
		
		return false;
	}
}
