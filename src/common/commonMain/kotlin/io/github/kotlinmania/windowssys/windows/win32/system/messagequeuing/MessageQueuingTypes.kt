package io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing

import io.github.kotlinmania.windowssys.core.HRESULT

public typealias FOREIGN_STATUS = Int

public typealias MQACCESS = Int

public typealias MQAUTHENTICATE = Int

public typealias MQCALG = Int

public typealias MQCERT_REGISTER = Int

public typealias MQConnectionState = Int

public typealias MQDEFAULT = Int

public typealias MQERROR = Int

public typealias MQJOURNAL = Int

public typealias MQMAX = Int

public typealias MQMSGACKNOWLEDGEMENT = Int

public typealias MQMSGAUTHENTICATION = Int

public typealias MQMSGAUTHLEVEL = Int

public typealias MQMSGCLASS = Int

public typealias MQMSGCURSOR = Int

public typealias MQMSGDELIVERY = Int

public typealias MQMSGIDSIZE = Int

public typealias MQMSGJOURNAL = Int

public typealias MQMSGMAX = Int

public typealias MQMSGPRIVLEVEL = Int

public typealias MQMSGSENDERIDTYPE = Int

public typealias MQMSGTRACE = Int

public typealias MQPRIORITY = Int

public typealias MQPRIVLEVEL = Int

public typealias MQQUEUEACCESSMASK = UInt

public typealias MQSHARE = Int

public typealias MQTRANSACTION = Int

public typealias MQTRANSACTIONAL = Int

public typealias MQWARNING = Int

public fun interface PMQRECEIVECALLBACKFn {
    public operator fun invoke(hrstatus: HRESULT, hsource: Long, dwtimeout: UInt, dwaction: UInt, pmessageprops: Long, lpoverlapped: Long, hcursor: Foundation.HANDLE)
}

public typealias PMQRECEIVECALLBACK = PMQRECEIVECALLBACKFn?

public typealias QUEUE_STATE = Int

public typealias QUEUE_TYPE = Int

public typealias RELOPS = Int

public typealias XACT_STATUS = Int
