package io.github.kotlinmania.windowssys.windows.win32.devices.tapi

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult

public typealias AcdgroupEvent = Int

public typealias AcdqueueEvent = Int

public typealias AddressCapability = Int

public typealias AddressCapabilityString = Int

public typealias AddressEvent = Int

public typealias AddressState = Int

public typealias AgenthandlerEvent = Int

public typealias AgentEvent = Int

public typealias AgentSessionEvent = Int

public typealias AgentSessionState = Int

public typealias AgentState = Int

public fun interface AsyncCompletionFn {
    public operator fun invoke(dwrequestid: UInt, lresult: Int)
}

public typealias AsyncCompletion = AsyncCompletionFn?

public typealias CallhubEvent = Int

public typealias CallhubState = Int

public typealias CallinfochangeCause = Int

public typealias CallinfoBuffer = Int

public typealias CallinfoLong = Int

public typealias CallinfoString = Int

public typealias CallMediaEvent = Int

public typealias CallMediaEventCause = Int

public typealias CallNotificationEvent = Int

public typealias CallPrivilege = Int

public typealias CallState = Int

public typealias CallStateEventCause = Int

public typealias DirectoryObjectType = Int

public typealias DirectoryType = Int

public typealias DisconnectCode = Int

public typealias FinishMode = Int

public typealias FtStateEventCause = Int

public typealias FullduplexSupport = Int

public typealias Hdrvcall = COpaquePointer?

public typealias Hdrvdialoginstance = COpaquePointer?

public typealias Hdrvline = COpaquePointer?

public typealias Hdrvmspline = COpaquePointer?

public typealias Hdrvphone = COpaquePointer?

public typealias Hprovider = COpaquePointer?

public typealias Htapicall = COpaquePointer?

public typealias Htapiline = COpaquePointer?

public typealias Htapiphone = COpaquePointer?

public fun interface LinecallbackFn {
    public operator fun invoke(hdevice: UInt, dwmessage: UInt, dwinstance: ULong, dwparam1: ULong, dwparam2: ULong, dwparam3: ULong)
}

public typealias Linecallback = LinecallbackFn?

public fun interface LineeventFn {
    public operator fun invoke(htline: Htapiline, htcall: Htapicall, dwmsg: UInt, dwparam1: ULong, dwparam2: ULong, dwparam3: ULong)
}

public typealias Lineevent = LineeventFn?

public fun interface LpgettnefstreamcodepageFn {
    public operator fun invoke(lpstream: COpaquePointer?, lpulcodepage: COpaquePointer?, lpulsubcodepage: COpaquePointer?): Hresult
}

public typealias Lpgettnefstreamcodepage = LpgettnefstreamcodepageFn?

public fun interface LpopentnefstreamFn {
    public operator fun invoke(lpvsupport: COpaquePointer?, lpstream: COpaquePointer?, lpszstreamname: COpaquePointer?, ulflags: UInt, lpmessage: COpaquePointer?, wkeyval: UShort, lpptnef: COpaquePointer?): Hresult
}

public typealias Lpopentnefstream = LpopentnefstreamFn?

public fun interface LpopentnefstreamexFn {
    public operator fun invoke(lpvsupport: COpaquePointer?, lpstream: COpaquePointer?, lpszstreamname: COpaquePointer?, ulflags: UInt, lpmessage: COpaquePointer?, wkeyval: UShort, lpadressbook: COpaquePointer?, lpptnef: COpaquePointer?): Hresult
}

public typealias Lpopentnefstreamex = LpopentnefstreamexFn?

public typealias MspAddressEvent = Int

public typealias MspCallEvent = Int

public typealias MspCallEventCause = Int

public typealias MspEvent = Int

public fun interface PhonecallbackFn {
    public operator fun invoke(hdevice: UInt, dwmessage: UInt, dwinstance: ULong, dwparam1: ULong, dwparam2: ULong, dwparam3: ULong)
}

public typealias Phonecallback = PhonecallbackFn?

public typealias PhonecapsBuffer = Int

public typealias PhonecapsLong = Int

public typealias PhonecapsString = Int

public fun interface PhoneeventFn {
    public operator fun invoke(htphone: Htapiphone, dwmsg: UInt, dwparam1: ULong, dwparam2: ULong, dwparam3: ULong)
}

public typealias Phoneevent = PhoneeventFn?

public typealias PhoneButtonFunction = Int

public typealias PhoneButtonMode = Int

public typealias PhoneButtonState = Int

public typealias PhoneEvent = Int

public typealias PhoneHookSwitchDevice = Int

public typealias PhoneHookSwitchState = Int

public typealias PhoneLampMode = Int

public typealias PhonePrivilege = Int

public typealias PhoneTone = Int

public typealias QosEvent = Int

public typealias QosServiceLevel = Int

public typealias RndAdvertisingScope = Int

public typealias TapiobjectEvent = Int

public typealias TapiEvent = Int

public typealias TapiGatherterm = Int

public typealias TapiObjectType = Int

public typealias TapiTonemode = Int

public typealias TerminalDirection = Int

public typealias TerminalMediaState = Int

public typealias TerminalState = Int

public typealias TerminalType = Int

public fun interface TuispidllcallbackFn {
    public operator fun invoke(dwobjectid: ULong, dwobjecttype: UInt, lpparams: COpaquePointer?, dwsize: UInt): Int
}

public typealias Tuispidllcallback = TuispidllcallbackFn?
