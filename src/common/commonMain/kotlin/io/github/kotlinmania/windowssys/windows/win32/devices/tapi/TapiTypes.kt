package io.github.kotlinmania.windowssys.windows.win32.devices.tapi

import io.github.kotlinmania.windowssys.core.HRESULT

public typealias ACDGROUP_EVENT = Int

public typealias ACDQUEUE_EVENT = Int

public typealias ADDRESS_CAPABILITY = Int

public typealias ADDRESS_CAPABILITY_STRING = Int

public typealias ADDRESS_EVENT = Int

public typealias ADDRESS_STATE = Int

public typealias AGENTHANDLER_EVENT = Int

public typealias AGENT_EVENT = Int

public typealias AGENT_SESSION_EVENT = Int

public typealias AGENT_SESSION_STATE = Int

public typealias AGENT_STATE = Int

public fun interface ASYNC_COMPLETIONFn {
    public operator fun invoke(dwrequestid: UInt, lresult: Int)
}

public typealias ASYNC_COMPLETION = ASYNC_COMPLETIONFn?

public typealias CALLHUB_EVENT = Int

public typealias CALLHUB_STATE = Int

public typealias CALLINFOCHANGE_CAUSE = Int

public typealias CALLINFO_BUFFER = Int

public typealias CALLINFO_LONG = Int

public typealias CALLINFO_STRING = Int

public typealias CALL_MEDIA_EVENT = Int

public typealias CALL_MEDIA_EVENT_CAUSE = Int

public typealias CALL_NOTIFICATION_EVENT = Int

public typealias CALL_PRIVILEGE = Int

public typealias CALL_STATE = Int

public typealias CALL_STATE_EVENT_CAUSE = Int

public typealias DIRECTORY_OBJECT_TYPE = Int

public typealias DIRECTORY_TYPE = Int

public typealias DISCONNECT_CODE = Int

public typealias FINISH_MODE = Int

public typealias FT_STATE_EVENT_CAUSE = Int

public typealias FULLDUPLEX_SUPPORT = Int

public typealias HDRVCALL = Long

public typealias HDRVDIALOGINSTANCE = Long

public typealias HDRVLINE = Long

public typealias HDRVMSPLINE = Long

public typealias HDRVPHONE = Long

public typealias HPROVIDER = Long

public typealias HTAPICALL = Long

public typealias HTAPILINE = Long

public typealias HTAPIPHONE = Long

public fun interface LINECALLBACKFn {
    public operator fun invoke(hdevice: UInt, dwmessage: UInt, dwinstance: ULong, dwparam1: ULong, dwparam2: ULong, dwparam3: ULong)
}

public typealias LINECALLBACK = LINECALLBACKFn?

public fun interface LINEEVENTFn {
    public operator fun invoke(htline: HTAPILINE, htcall: HTAPICALL, dwmsg: UInt, dwparam1: ULong, dwparam2: ULong, dwparam3: ULong)
}

public typealias LINEEVENT = LINEEVENTFn?

public fun interface LPGETTNEFSTREAMCODEPAGEFn {
    public operator fun invoke(lpstream: Long, lpulcodepage: Long, lpulsubcodepage: Long): HRESULT
}

public typealias LPGETTNEFSTREAMCODEPAGE = LPGETTNEFSTREAMCODEPAGEFn?

public fun interface LPOPENTNEFSTREAMFn {
    public operator fun invoke(lpvsupport: Long, lpstream: Long, lpszstreamname: Long, ulflags: UInt, lpmessage: Long, wkeyval: UShort, lpptnef: Long): HRESULT
}

public typealias LPOPENTNEFSTREAM = LPOPENTNEFSTREAMFn?

public fun interface LPOPENTNEFSTREAMEXFn {
    public operator fun invoke(lpvsupport: Long, lpstream: Long, lpszstreamname: Long, ulflags: UInt, lpmessage: Long, wkeyval: UShort, lpadressbook: Long, lpptnef: Long): HRESULT
}

public typealias LPOPENTNEFSTREAMEX = LPOPENTNEFSTREAMEXFn?

public typealias MSP_ADDRESS_EVENT = Int

public typealias MSP_CALL_EVENT = Int

public typealias MSP_CALL_EVENT_CAUSE = Int

public typealias MSP_EVENT = Int

public fun interface PHONECALLBACKFn {
    public operator fun invoke(hdevice: UInt, dwmessage: UInt, dwinstance: ULong, dwparam1: ULong, dwparam2: ULong, dwparam3: ULong)
}

public typealias PHONECALLBACK = PHONECALLBACKFn?

public typealias PHONECAPS_BUFFER = Int

public typealias PHONECAPS_LONG = Int

public typealias PHONECAPS_STRING = Int

public fun interface PHONEEVENTFn {
    public operator fun invoke(htphone: HTAPIPHONE, dwmsg: UInt, dwparam1: ULong, dwparam2: ULong, dwparam3: ULong)
}

public typealias PHONEEVENT = PHONEEVENTFn?

public typealias PHONE_BUTTON_FUNCTION = Int

public typealias PHONE_BUTTON_MODE = Int

public typealias PHONE_BUTTON_STATE = Int

public typealias PHONE_EVENT = Int

public typealias PHONE_HOOK_SWITCH_DEVICE = Int

public typealias PHONE_HOOK_SWITCH_STATE = Int

public typealias PHONE_LAMP_MODE = Int

public typealias PHONE_PRIVILEGE = Int

public typealias PHONE_TONE = Int

public typealias QOS_EVENT = Int

public typealias QOS_SERVICE_LEVEL = Int

public typealias RND_ADVERTISING_SCOPE = Int

public typealias TAPIOBJECT_EVENT = Int

public typealias TAPI_EVENT = Int

public typealias TAPI_GATHERTERM = Int

public typealias TAPI_OBJECT_TYPE = Int

public typealias TAPI_TONEMODE = Int

public typealias TERMINAL_DIRECTION = Int

public typealias TERMINAL_MEDIA_STATE = Int

public typealias TERMINAL_STATE = Int

public typealias TERMINAL_TYPE = Int

public fun interface TUISPIDLLCALLBACKFn {
    public operator fun invoke(dwobjectid: ULong, dwobjecttype: UInt, lpparams: Long, dwsize: UInt): Int
}

public typealias TUISPIDLLCALLBACK = TUISPIDLLCALLBACKFn?
