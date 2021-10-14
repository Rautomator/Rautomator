package rautomator.error;

public class NotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotFoundException(Long id) {
		super("No se puede encontrar la siguiente id: " + id);
	}
}
