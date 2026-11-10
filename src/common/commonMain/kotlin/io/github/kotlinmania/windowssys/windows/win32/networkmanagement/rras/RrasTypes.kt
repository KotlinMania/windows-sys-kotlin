package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public typealias Hrasconn = COpaquePointer?

public typealias Ikev2IdPayloadType = Int

public typealias MgmEnumTypes = Int

public typealias MprapiObjectType = Int

public typealias MprEt = UInt

public typealias MprInterfaceDialMode = UInt

public typealias MprVpnTsType = Int

public typealias MprVs = UInt

public fun interface OrasadfuncFn {
    public operator fun invoke(param0: Hwnd, param1: Pcstr, param2: UInt, param3: COpaquePointer?): Bool
}

public typealias Orasadfunc = OrasadfuncFn?

public fun interface PfnrasfreebufferFn {
    public operator fun invoke(pbufer: COpaquePointer?): UInt
}

public typealias Pfnrasfreebuffer = PfnrasfreebufferFn?

public fun interface PfnrasgetbufferFn {
    public operator fun invoke(ppbuffer: COpaquePointer?, pdwsize: COpaquePointer?): UInt
}

public typealias Pfnrasgetbuffer = PfnrasgetbufferFn?

public fun interface PfnrasreceivebufferFn {
    public operator fun invoke(hport: Handle, pbuffer: COpaquePointer?, pdwsize: COpaquePointer?, dwtimeout: UInt, hevent: Handle): UInt
}

public typealias Pfnrasreceivebuffer = PfnrasreceivebufferFn?

public fun interface PfnrasretrievebufferFn {
    public operator fun invoke(hport: Handle, pbuffer: COpaquePointer?, pdwsize: COpaquePointer?): UInt
}

public typealias Pfnrasretrievebuffer = PfnrasretrievebufferFn?

public fun interface PfnrassendbufferFn {
    public operator fun invoke(hport: Handle, pbuffer: COpaquePointer?, dwsize: UInt): UInt
}

public typealias Pfnrassendbuffer = PfnrassendbufferFn?

public fun interface PfnrassetcommsettingsFn {
    public operator fun invoke(hport: Handle, prascommsettings: COpaquePointer?, pvreserved: COpaquePointer?): UInt
}

public typealias Pfnrassetcommsettings = PfnrassetcommsettingsFn?

public fun interface PmgmCreationAlertCallbackFn {
    public operator fun invoke(dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwinifindex: UInt, dwinifnexthopaddr: UInt, dwifcount: UInt, pmieoutiflist: COpaquePointer?): UInt
}

public typealias PmgmCreationAlertCallback = PmgmCreationAlertCallbackFn?

public fun interface PmgmDisableIgmpCallbackFn {
    public operator fun invoke(dwifindex: UInt, dwifnexthopaddr: UInt): UInt
}

public typealias PmgmDisableIgmpCallback = PmgmDisableIgmpCallbackFn?

public fun interface PmgmEnableIgmpCallbackFn {
    public operator fun invoke(dwifindex: UInt, dwifnexthopaddr: UInt): UInt
}

public typealias PmgmEnableIgmpCallback = PmgmEnableIgmpCallbackFn?

public fun interface PmgmJoinAlertCallbackFn {
    public operator fun invoke(dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, bmemberupdate: Bool): UInt
}

public typealias PmgmJoinAlertCallback = PmgmJoinAlertCallbackFn?

public fun interface PmgmLocalJoinCallbackFn {
    public operator fun invoke(dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopaddr: UInt): UInt
}

public typealias PmgmLocalJoinCallback = PmgmLocalJoinCallbackFn?

public fun interface PmgmLocalLeaveCallbackFn {
    public operator fun invoke(dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopaddr: UInt): UInt
}

public typealias PmgmLocalLeaveCallback = PmgmLocalLeaveCallbackFn?

public fun interface PmgmPruneAlertCallbackFn {
    public operator fun invoke(dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopaddr: UInt, bmemberdelete: Bool, pdwtimeout: COpaquePointer?): UInt
}

public typealias PmgmPruneAlertCallback = PmgmPruneAlertCallbackFn?

public fun interface PmgmRpfCallbackFn {
    public operator fun invoke(dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, pdwinifindex: COpaquePointer?, pdwinifnexthopaddr: COpaquePointer?, pdwupstreamnbr: COpaquePointer?, dwhdrsize: UInt, pbpackethdr: COpaquePointer?, pbroute: COpaquePointer?): UInt
}

public typealias PmgmRpfCallback = PmgmRpfCallbackFn?

public fun interface PmgmWrongIfCallbackFn {
    public operator fun invoke(dwsourceaddr: UInt, dwgroupaddr: UInt, dwifindex: UInt, dwifnexthopaddr: UInt, dwhdrsize: UInt, pbpackethdr: COpaquePointer?): UInt
}

public typealias PmgmWrongIfCallback = PmgmWrongIfCallbackFn?

public fun interface PmpradminacceptnewconnectionFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?): Bool
}

public typealias Pmpradminacceptnewconnection = PmpradminacceptnewconnectionFn?

public fun interface Pmpradminacceptnewconnection2Fn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): Bool
}

public typealias Pmpradminacceptnewconnection2 = Pmpradminacceptnewconnection2Fn?

public fun interface Pmpradminacceptnewconnection3Fn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?): Bool
}

public typealias Pmpradminacceptnewconnection3 = Pmpradminacceptnewconnection3Fn?

public fun interface PmpradminacceptnewconnectionexFn {
    public operator fun invoke(param0: COpaquePointer?): Bool
}

public typealias Pmpradminacceptnewconnectionex = PmpradminacceptnewconnectionexFn?

public fun interface PmpradminacceptnewlinkFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?): Bool
}

public typealias Pmpradminacceptnewlink = PmpradminacceptnewlinkFn?

public fun interface PmpradminacceptreauthenticationFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?): Bool
}

public typealias Pmpradminacceptreauthentication = PmpradminacceptreauthenticationFn?

public fun interface PmpradminacceptreauthenticationexFn {
    public operator fun invoke(param0: COpaquePointer?): Bool
}

public typealias Pmpradminacceptreauthenticationex = PmpradminacceptreauthenticationexFn?

public fun interface PmpradminaccepttunnelendpointchangeexFn {
    public operator fun invoke(param0: COpaquePointer?): Bool
}

public typealias Pmpradminaccepttunnelendpointchangeex = PmpradminaccepttunnelendpointchangeexFn?

public fun interface PmpradminconnectionhangupnotificationFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?)
}

public typealias Pmpradminconnectionhangupnotification = PmpradminconnectionhangupnotificationFn?

public fun interface Pmpradminconnectionhangupnotification2Fn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?)
}

public typealias Pmpradminconnectionhangupnotification2 = Pmpradminconnectionhangupnotification2Fn?

public fun interface Pmpradminconnectionhangupnotification3Fn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?)
}

public typealias Pmpradminconnectionhangupnotification3 = Pmpradminconnectionhangupnotification3Fn?

public fun interface PmpradminconnectionhangupnotificationexFn {
    public operator fun invoke(param0: COpaquePointer?)
}

public typealias Pmpradminconnectionhangupnotificationex = PmpradminconnectionhangupnotificationexFn?

public fun interface PmpradmingetipaddressforuserFn {
    public operator fun invoke(param0: Pcwstr, param1: Pcwstr, param2: COpaquePointer?, param3: COpaquePointer?): UInt
}

public typealias Pmpradmingetipaddressforuser = PmpradmingetipaddressforuserFn?

public fun interface Pmpradmingetipv6addressforuserFn {
    public operator fun invoke(param0: Pcwstr, param1: Pcwstr, param2: COpaquePointer?, param3: COpaquePointer?): UInt
}

public typealias Pmpradmingetipv6addressforuser = Pmpradmingetipv6addressforuserFn?

public fun interface PmpradminlinkhangupnotificationFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?)
}

public typealias Pmpradminlinkhangupnotification = PmpradminlinkhangupnotificationFn?

public fun interface PmpradminrasvalidatepreauthenticatedconnectionexFn {
    public operator fun invoke(param0: COpaquePointer?): UInt
}

public typealias Pmpradminrasvalidatepreauthenticatedconnectionex = PmpradminrasvalidatepreauthenticatedconnectionexFn?

public fun interface PmpradminreleaseipadressFn {
    public operator fun invoke(param0: Pcwstr, param1: Pcwstr, param2: COpaquePointer?)
}

public typealias Pmpradminreleaseipadress = PmpradminreleaseipadressFn?

public fun interface Pmpradminreleaseipv6addressforuserFn {
    public operator fun invoke(param0: Pcwstr, param1: Pcwstr, param2: COpaquePointer?)
}

public typealias Pmpradminreleaseipv6addressforuser = Pmpradminreleaseipv6addressforuserFn?

public fun interface PmpradminterminatedllFn {
    public operator fun invoke(): UInt
}

public typealias Pmpradminterminatedll = PmpradminterminatedllFn?

public typealias PppLcp = UInt

public typealias PppLcpInfoAuthData = UInt

public fun interface RasadfuncaFn {
    public operator fun invoke(param0: Pcstr, param1: Pcstr, param2: COpaquePointer?, param3: COpaquePointer?): Bool
}

public typealias Rasadfunca = RasadfuncaFn?

public fun interface RasadfuncwFn {
    public operator fun invoke(param0: Pcwstr, param1: Pcwstr, param2: COpaquePointer?, param3: COpaquePointer?): Bool
}

public typealias Rasadfuncw = RasadfuncwFn?

public typealias Rasapiversion = Int

public typealias Rasconnstate = Int

public typealias Rasconnsubstate = Int

public fun interface RasdialfuncFn {
    public operator fun invoke(param0: UInt, param1: Rasconnstate, param2: UInt)
}

public typealias Rasdialfunc = RasdialfuncFn?

public fun interface Rasdialfunc1Fn {
    public operator fun invoke(param0: Hrasconn, param1: UInt, param2: Rasconnstate, param3: UInt, param4: UInt)
}

public typealias Rasdialfunc1 = Rasdialfunc1Fn?

public fun interface Rasdialfunc2Fn {
    public operator fun invoke(param0: ULong, param1: UInt, param2: Hrasconn, param3: UInt, param4: Rasconnstate, param5: UInt, param6: UInt): UInt
}

public typealias Rasdialfunc2 = Rasdialfunc2Fn?

public typealias RasentryDialMode = UInt

public typealias RasikevProjectionInfoFlags = UInt

public fun interface RaspbdlgfuncaFn {
    public operator fun invoke(param0: ULong, param1: UInt, param2: Pcstr, param3: COpaquePointer?)
}

public typealias Raspbdlgfunca = RaspbdlgfuncaFn?

public fun interface RaspbdlgfuncwFn {
    public operator fun invoke(param0: ULong, param1: UInt, param2: Pcwstr, param3: COpaquePointer?)
}

public typealias Raspbdlgfuncw = RaspbdlgfuncwFn?

public typealias RaspppProjectionInfoServerAuthData = UInt

public typealias RaspppProjectionInfoServerAuthProtocol = UInt

public typealias Rasprojection = Int

public typealias RasprojectionInfoType = Int

public fun interface RassecurityprocFn {
    public operator fun invoke(): UInt
}

public typealias Rassecurityproc = RassecurityprocFn?

public typealias RasFlags = UInt

public typealias RasHardwareCondition = Int

public typealias RasPortCondition = Int

public typealias RasQuarantineState = Int

public typealias RouterConnectionState = Int

public typealias RouterInterfaceType = Int

public fun interface RtmEntityExportMethodFn {
    public operator fun invoke(callerhandle: Long, calleehandle: Long, input: COpaquePointer?, output: COpaquePointer?)
}

public typealias RtmEntityExportMethod = RtmEntityExportMethodFn?

public fun interface RtmEventCallbackFn {
    public operator fun invoke(rtmreghandle: Long, eventtype: RtmEventType, context1: COpaquePointer?, context2: COpaquePointer?): UInt
}

public typealias RtmEventCallback = RtmEventCallbackFn?

public typealias RtmEventType = Int

public fun interface RasCustomDeleteEntryNotifyFnFn {
    public operator fun invoke(lpszphonebook: Pcwstr, lpszentry: Pcwstr, dwflags: UInt): UInt
}

public typealias RasCustomDeleteEntryNotifyFn = RasCustomDeleteEntryNotifyFnFn?

public fun interface RasCustomDialDlgFnFn {
    public operator fun invoke(hinstdll: Hinstance, dwflags: UInt, lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpszphonenumber: Pcwstr, lpinfo: COpaquePointer?, pvinfo: COpaquePointer?): Bool
}

public typealias RasCustomDialDlgFn = RasCustomDialDlgFnFn?

public fun interface RasCustomDialFnFn {
    public operator fun invoke(hinstdll: Hinstance, lprasdialextensions: COpaquePointer?, lpszphonebook: Pcwstr, lprasdialparams: COpaquePointer?, dwnotifiertype: UInt, lpvnotifier: COpaquePointer?, lphrasconn: COpaquePointer?, dwflags: UInt): UInt
}

public typealias RasCustomDialFn = RasCustomDialFnFn?

public fun interface RasCustomEntryDlgFnFn {
    public operator fun invoke(hinstdll: Hinstance, lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpinfo: COpaquePointer?, dwflags: UInt): Bool
}

public typealias RasCustomEntryDlgFn = RasCustomEntryDlgFnFn?

public fun interface RasCustomHangUpFnFn {
    public operator fun invoke(hrasconn: Hrasconn): UInt
}

public typealias RasCustomHangUpFn = RasCustomHangUpFnFn?

public fun interface RasCustomScriptExecuteFnFn {
    public operator fun invoke(hport: Handle, lpszphonebook: Pcwstr, lpszentryname: Pcwstr, pfnrasgetbuffer: Pfnrasgetbuffer, pfnrasfreebuffer: Pfnrasfreebuffer, pfnrassendbuffer: Pfnrassendbuffer, pfnrasreceivebuffer: Pfnrasreceivebuffer, pfnrasretrievebuffer: Pfnrasretrievebuffer, hwnd: Hwnd, prasdialparams: COpaquePointer?, pvreserved: COpaquePointer?): UInt
}

public typealias RasCustomScriptExecuteFn = RasCustomScriptExecuteFnFn?

public typealias SecurityMessageMsgId = UInt
