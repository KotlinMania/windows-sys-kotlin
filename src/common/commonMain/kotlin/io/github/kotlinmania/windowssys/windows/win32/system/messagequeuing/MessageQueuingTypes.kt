package io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public typealias ForeignStatus = Int

public typealias Mqaccess = Int

public typealias Mqauthenticate = Int

public typealias Mqcalg = Int

public typealias MqcertRegister = Int

public typealias MQConnectionState = Int

public typealias Mqdefault = Int

public typealias Mqerror = Int

public typealias Mqjournal = Int

public typealias Mqmax = Int

public typealias Mqmsgacknowledgement = Int

public typealias Mqmsgauthentication = Int

public typealias Mqmsgauthlevel = Int

public typealias Mqmsgclass = Int

public typealias Mqmsgcursor = Int

public typealias Mqmsgdelivery = Int

public typealias Mqmsgidsize = Int

public typealias Mqmsgjournal = Int

public typealias Mqmsgmax = Int

public typealias Mqmsgprivlevel = Int

public typealias Mqmsgsenderidtype = Int

public typealias Mqmsgtrace = Int

public typealias Mqpriority = Int

public typealias Mqprivlevel = Int

public typealias Mqqueueaccessmask = UInt

public typealias Mqshare = Int

public typealias Mqtransaction = Int

public typealias Mqtransactional = Int

public typealias Mqwarning = Int

public fun interface PmqreceivecallbackFn {
    public operator fun invoke(hrstatus: Hresult, hsource: Long, dwtimeout: UInt, dwaction: UInt, pmessageprops: COpaquePointer?, lpoverlapped: COpaquePointer?, hcursor: Handle)
}

public typealias Pmqreceivecallback = PmqreceivecallbackFn?

public typealias QueueState = Int

public typealias QueueType = Int

public typealias Relops = Int

public typealias XactStatus = Int
