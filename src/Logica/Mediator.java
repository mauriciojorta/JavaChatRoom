package Logica;

import java.util.ArrayList;

public interface Mediator {

	/**
	 * It transmits a message sent by a colleague object to the others of the system.
	 * In this case it embodies a chat user message which is sent to himself and the others
	 * connected to the chat room
	 * @param message - message to send
	 */
	  public void send(String message);

	  /**
	   * It adds a colleague to the mediator's colleague list. In this case, an user to the
	   * chat room
	   * @param colleague - Chat user.
	   */

	  public void addColleague(Colleague colleague);

	  /**
	   * Removes a colleague from the mediator's colleague list. In this case, a chat user
	   * connected to the chat room.
	   * @param colleague - Chat user to remove from the chat room
	   */

	  public void removeColleague(Colleague colleague);

	  /**
	   * @return list of messages sent to the chat room
	   */

	  public ArrayList<String> getMessages();




	}
