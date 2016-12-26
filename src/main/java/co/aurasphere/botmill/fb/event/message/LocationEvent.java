package co.aurasphere.botmill.fb.event.message;

import java.util.regex.Pattern;

import co.aurasphere.botmill.fb.bean.FbBotMillBean;
import co.aurasphere.botmill.fb.event.FbBotMillEvent;
import co.aurasphere.botmill.fb.model.incoming.MessageEnvelope;

public class LocationEvent extends FbBotMillBean implements FbBotMillEvent {
	/**
	 * @see BasePatternEvent#BasePatternEvent(Pattern)
	 */
	public LocationEvent() {}

	/**
	 * @return true if the text message received from the callback is a location.
	 */
	public final boolean verifyEventCondition(MessageEnvelope envelope) {
		String message = safeGetLocationMessage(envelope);
		return (!message.equals(""));
	}
}
