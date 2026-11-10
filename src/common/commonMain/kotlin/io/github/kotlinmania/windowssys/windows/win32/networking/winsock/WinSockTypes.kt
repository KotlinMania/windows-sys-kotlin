package io.github.kotlinmania.windowssys.windows.win32.networking.winsock

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam

public typealias AalType = Int

public typealias AddressFamily = UShort

public typealias ArpHardwareType = Int

public typealias ArpOpcode = Int

public typealias ControlChannelTriggerStatus = Int

public typealias FallbackIndex = Int

public typealias Icmp4TimeExceedCode = Int

public typealias Icmp4UnreachCode = Int

public typealias IgmpMaxRespCodeType = Int

public typealias Ipproto = Int

public typealias Ipv4OptionType = Int

public typealias Ipv6OptionType = Int

public typealias IpOptionTimestampFlags = Int

public fun interface LpblockingcallbackFn {
    public operator fun invoke(dwcontext: ULong): Bool
}

public typealias Lpblockingcallback = LpblockingcallbackFn?

public fun interface LpconditionprocFn {
    public operator fun invoke(lpcallerid: COpaquePointer?, lpcallerdata: COpaquePointer?, lpsqos: COpaquePointer?, lpgqos: COpaquePointer?, lpcalleeid: COpaquePointer?, lpcalleedata: COpaquePointer?, g: COpaquePointer?, dwcallbackdata: ULong): Int
}

public typealias Lpconditionproc = LpconditionprocFn?

public fun interface LpfnAcceptexFn {
    public operator fun invoke(slistensocket: Socket, sacceptsocket: Socket, lpoutputbuffer: COpaquePointer?, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, lpdwbytesreceived: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool
}

public typealias LpfnAcceptex = LpfnAcceptexFn?

public fun interface LpfnConnectexFn {
    public operator fun invoke(s: Socket, name: COpaquePointer?, namelen: Int, lpsendbuffer: COpaquePointer?, dwsenddatalength: UInt, lpdwbytessent: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool
}

public typealias LpfnConnectex = LpfnConnectexFn?

public fun interface LpfnDisconnectexFn {
    public operator fun invoke(s: Socket, lpoverlapped: COpaquePointer?, dwflags: UInt, dwreserved: UInt): Bool
}

public typealias LpfnDisconnectex = LpfnDisconnectexFn?

public fun interface LpfnGetacceptexsockaddrsFn {
    public operator fun invoke(lpoutputbuffer: COpaquePointer?, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, localsockaddr: COpaquePointer?, localsockaddrlength: COpaquePointer?, remotesockaddr: COpaquePointer?, remotesockaddrlength: COpaquePointer?)
}

public typealias LpfnGetacceptexsockaddrs = LpfnGetacceptexsockaddrsFn?

public fun interface LpfnNspapiFn {
    public operator fun invoke(): UInt
}

public typealias LpfnNspapi = LpfnNspapiFn?

public fun interface LpfnRioclosecompletionqueueFn {
    public operator fun invoke(cq: RioCq)
}

public typealias LpfnRioclosecompletionqueue = LpfnRioclosecompletionqueueFn?

public fun interface LpfnRiocreatecompletionqueueFn {
    public operator fun invoke(queuesize: UInt, notificationcompletion: COpaquePointer?): RioCq
}

public typealias LpfnRiocreatecompletionqueue = LpfnRiocreatecompletionqueueFn?

public fun interface LpfnRiocreaterequestqueueFn {
    public operator fun invoke(socket: Socket, maxoutstandingreceive: UInt, maxreceivedatabuffers: UInt, maxoutstandingsend: UInt, maxsenddatabuffers: UInt, receivecq: RioCq, sendcq: RioCq, socketcontext: COpaquePointer?): RioRq
}

public typealias LpfnRiocreaterequestqueue = LpfnRiocreaterequestqueueFn?

public fun interface LpfnRiodequeuecompletionFn {
    public operator fun invoke(cq: RioCq, array: COpaquePointer?, arraysize: UInt): UInt
}

public typealias LpfnRiodequeuecompletion = LpfnRiodequeuecompletionFn?

public fun interface LpfnRioderegisterbufferFn {
    public operator fun invoke(bufferid: RioBufferid)
}

public typealias LpfnRioderegisterbuffer = LpfnRioderegisterbufferFn?

public fun interface LpfnRionotifyFn {
    public operator fun invoke(cq: RioCq): Int
}

public typealias LpfnRionotify = LpfnRionotifyFn?

public fun interface LpfnRioreceiveFn {
    public operator fun invoke(socketqueue: RioRq, pdata: COpaquePointer?, databuffercount: UInt, flags: UInt, requestcontext: COpaquePointer?): Bool
}

public typealias LpfnRioreceive = LpfnRioreceiveFn?

public fun interface LpfnRioreceiveexFn {
    public operator fun invoke(socketqueue: RioRq, pdata: COpaquePointer?, databuffercount: UInt, plocaladdress: COpaquePointer?, premoteaddress: COpaquePointer?, pcontrolcontext: COpaquePointer?, pflags: COpaquePointer?, flags: UInt, requestcontext: COpaquePointer?): Int
}

public typealias LpfnRioreceiveex = LpfnRioreceiveexFn?

public fun interface LpfnRioregisterbufferFn {
    public operator fun invoke(databuffer: Pcstr, datalength: UInt): RioBufferid
}

public typealias LpfnRioregisterbuffer = LpfnRioregisterbufferFn?

public fun interface LpfnRioresizecompletionqueueFn {
    public operator fun invoke(cq: RioCq, queuesize: UInt): Bool
}

public typealias LpfnRioresizecompletionqueue = LpfnRioresizecompletionqueueFn?

public fun interface LpfnRioresizerequestqueueFn {
    public operator fun invoke(rq: RioRq, maxoutstandingreceive: UInt, maxoutstandingsend: UInt): Bool
}

public typealias LpfnRioresizerequestqueue = LpfnRioresizerequestqueueFn?

public fun interface LpfnRiosendFn {
    public operator fun invoke(socketqueue: RioRq, pdata: COpaquePointer?, databuffercount: UInt, flags: UInt, requestcontext: COpaquePointer?): Bool
}

public typealias LpfnRiosend = LpfnRiosendFn?

public fun interface LpfnRiosendexFn {
    public operator fun invoke(socketqueue: RioRq, pdata: COpaquePointer?, databuffercount: UInt, plocaladdress: COpaquePointer?, premoteaddress: COpaquePointer?, pcontrolcontext: COpaquePointer?, pflags: COpaquePointer?, flags: UInt, requestcontext: COpaquePointer?): Bool
}

public typealias LpfnRiosendex = LpfnRiosendexFn?

public fun interface LpfnTransmitfileFn {
    public operator fun invoke(hsocket: Socket, hfile: Handle, nnumberofbytestowrite: UInt, nnumberofbytespersend: UInt, lpoverlapped: COpaquePointer?, lptransmitbuffers: COpaquePointer?, dwreserved: UInt): Bool
}

public typealias LpfnTransmitfile = LpfnTransmitfileFn?

public fun interface LpfnTransmitpacketsFn {
    public operator fun invoke(hsocket: Socket, lppacketarray: COpaquePointer?, nelementcount: UInt, nsendsize: UInt, lpoverlapped: COpaquePointer?, dwflags: UInt): Bool
}

public typealias LpfnTransmitpackets = LpfnTransmitpacketsFn?

public fun interface LpfnWsapollFn {
    public operator fun invoke(fdarray: COpaquePointer?, nfds: UInt, timeout: Int): Int
}

public typealias LpfnWsapoll = LpfnWsapollFn?

public fun interface LpfnWsarecvmsgFn {
    public operator fun invoke(s: Socket, lpmsg: COpaquePointer?, lpdwnumberofbytesrecvd: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int
}

public typealias LpfnWsarecvmsg = LpfnWsarecvmsgFn?

public fun interface LpfnWsasendmsgFn {
    public operator fun invoke(s: Socket, lpmsg: COpaquePointer?, dwflags: UInt, lpnumberofbytessent: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int
}

public typealias LpfnWsasendmsg = LpfnWsasendmsgFn?

public fun interface LplookupserviceCompletionRoutineFn {
    public operator fun invoke(dwerror: UInt, dwbytes: UInt, lpoverlapped: COpaquePointer?)
}

public typealias LplookupserviceCompletionRoutine = LplookupserviceCompletionRoutineFn?

public fun interface LpnspcleanupFn {
    public operator fun invoke(lpproviderid: COpaquePointer?): Int
}

public typealias Lpnspcleanup = LpnspcleanupFn?

public fun interface LpnspgetserviceclassinfoFn {
    public operator fun invoke(lpproviderid: COpaquePointer?, lpdwbufsize: COpaquePointer?, lpserviceclassinfo: COpaquePointer?): Int
}

public typealias Lpnspgetserviceclassinfo = LpnspgetserviceclassinfoFn?

public fun interface LpnspinstallserviceclassFn {
    public operator fun invoke(lpproviderid: COpaquePointer?, lpserviceclassinfo: COpaquePointer?): Int
}

public typealias Lpnspinstallserviceclass = LpnspinstallserviceclassFn?

public fun interface LpnspioctlFn {
    public operator fun invoke(hlookup: Handle, dwcontrolcode: UInt, lpvinbuffer: COpaquePointer?, cbinbuffer: UInt, lpvoutbuffer: COpaquePointer?, cboutbuffer: UInt, lpcbbytesreturned: COpaquePointer?, lpcompletion: COpaquePointer?, lpthreadid: COpaquePointer?): Int
}

public typealias Lpnspioctl = LpnspioctlFn?

public fun interface LpnsplookupservicebeginFn {
    public operator fun invoke(lpproviderid: COpaquePointer?, lpqsrestrictions: COpaquePointer?, lpserviceclassinfo: COpaquePointer?, dwcontrolflags: UInt, lphlookup: COpaquePointer?): Int
}

public typealias Lpnsplookupservicebegin = LpnsplookupservicebeginFn?

public fun interface LpnsplookupserviceendFn {
    public operator fun invoke(hlookup: Handle): Int
}

public typealias Lpnsplookupserviceend = LpnsplookupserviceendFn?

public fun interface LpnsplookupservicenextFn {
    public operator fun invoke(hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: COpaquePointer?, lpqsresults: COpaquePointer?): Int
}

public typealias Lpnsplookupservicenext = LpnsplookupservicenextFn?

public fun interface LpnspremoveserviceclassFn {
    public operator fun invoke(lpproviderid: COpaquePointer?, lpserviceclassid: COpaquePointer?): Int
}

public typealias Lpnspremoveserviceclass = LpnspremoveserviceclassFn?

public fun interface LpnspsetserviceFn {
    public operator fun invoke(lpproviderid: COpaquePointer?, lpserviceclassinfo: COpaquePointer?, lpqsreginfo: COpaquePointer?, essoperation: Wsaesetserviceop, dwcontrolflags: UInt): Int
}

public typealias Lpnspsetservice = LpnspsetserviceFn?

public fun interface LpnspstartupFn {
    public operator fun invoke(lpproviderid: COpaquePointer?, lpnsproutines: COpaquePointer?): Int
}

public typealias Lpnspstartup = LpnspstartupFn?

public fun interface Lpnspv2cleanupFn {
    public operator fun invoke(lpproviderid: COpaquePointer?, pvclientsessionarg: COpaquePointer?): Int
}

public typealias Lpnspv2cleanup = Lpnspv2cleanupFn?

public fun interface Lpnspv2clientsessionrundownFn {
    public operator fun invoke(lpproviderid: COpaquePointer?, pvclientsessionarg: COpaquePointer?)
}

public typealias Lpnspv2clientsessionrundown = Lpnspv2clientsessionrundownFn?

public fun interface Lpnspv2lookupservicebeginFn {
    public operator fun invoke(lpproviderid: COpaquePointer?, lpqsrestrictions: COpaquePointer?, dwcontrolflags: UInt, lpvclientsessionarg: COpaquePointer?, lphlookup: COpaquePointer?): Int
}

public typealias Lpnspv2lookupservicebegin = Lpnspv2lookupservicebeginFn?

public fun interface Lpnspv2lookupserviceendFn {
    public operator fun invoke(hlookup: Handle): Int
}

public typealias Lpnspv2lookupserviceend = Lpnspv2lookupserviceendFn?

public fun interface Lpnspv2lookupservicenextexFn {
    public operator fun invoke(hasynccall: Handle, hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: COpaquePointer?, lpqsresults: COpaquePointer?)
}

public typealias Lpnspv2lookupservicenextex = Lpnspv2lookupservicenextexFn?

public fun interface Lpnspv2setserviceexFn {
    public operator fun invoke(hasynccall: Handle, lpproviderid: COpaquePointer?, lpqsreginfo: COpaquePointer?, essoperation: Wsaesetserviceop, dwcontrolflags: UInt, lpvclientsessionarg: COpaquePointer?)
}

public typealias Lpnspv2setserviceex = Lpnspv2setserviceexFn?

public fun interface Lpnspv2startupFn {
    public operator fun invoke(lpproviderid: COpaquePointer?, ppvclientsessionarg: COpaquePointer?): Int
}

public typealias Lpnspv2startup = Lpnspv2startupFn?

public fun interface LpserviceCallbackProcFn {
    public operator fun invoke(lparam: Lparam, hasynctaskhandle: Handle)
}

public typealias LpserviceCallbackProc = LpserviceCallbackProcFn?

public fun interface LpwpucloseeventFn {
    public operator fun invoke(hevent: Wsaevent, lperrno: COpaquePointer?): Bool
}

public typealias Lpwpucloseevent = LpwpucloseeventFn?

public fun interface LpwpuclosesockethandleFn {
    public operator fun invoke(s: Socket, lperrno: COpaquePointer?): Int
}

public typealias Lpwpuclosesockethandle = LpwpuclosesockethandleFn?

public fun interface LpwpuclosethreadFn {
    public operator fun invoke(lpthreadid: COpaquePointer?, lperrno: COpaquePointer?): Int
}

public typealias Lpwpuclosethread = LpwpuclosethreadFn?

public fun interface LpwpucompleteoverlappedrequestFn {
    public operator fun invoke(s: Socket, lpoverlapped: COpaquePointer?, dwerror: UInt, cbtransferred: UInt, lperrno: COpaquePointer?): Int
}

public typealias Lpwpucompleteoverlappedrequest = LpwpucompleteoverlappedrequestFn?

public fun interface LpwpucreateeventFn {
    public operator fun invoke(lperrno: COpaquePointer?): Wsaevent
}

public typealias Lpwpucreateevent = LpwpucreateeventFn?

public fun interface LpwpucreatesockethandleFn {
    public operator fun invoke(dwcatalogentryid: UInt, dwcontext: ULong, lperrno: COpaquePointer?): Socket
}

public typealias Lpwpucreatesockethandle = LpwpucreatesockethandleFn?

public fun interface LpwpufdissetFn {
    public operator fun invoke(s: Socket, fdset: COpaquePointer?): Int
}

public typealias Lpwpufdisset = LpwpufdissetFn?

public fun interface LpwpugetproviderpathFn {
    public operator fun invoke(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: COpaquePointer?, lperrno: COpaquePointer?): Int
}

public typealias Lpwpugetproviderpath = LpwpugetproviderpathFn?

public fun interface LpwpumodifyifshandleFn {
    public operator fun invoke(dwcatalogentryid: UInt, proposedhandle: Socket, lperrno: COpaquePointer?): Socket
}

public typealias Lpwpumodifyifshandle = LpwpumodifyifshandleFn?

public fun interface LpwpuopencurrentthreadFn {
    public operator fun invoke(lpthreadid: COpaquePointer?, lperrno: COpaquePointer?): Int
}

public typealias Lpwpuopencurrentthread = LpwpuopencurrentthreadFn?

public fun interface LpwpupostmessageFn {
    public operator fun invoke(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool
}

public typealias Lpwpupostmessage = LpwpupostmessageFn?

public fun interface LpwpuqueryblockingcallbackFn {
    public operator fun invoke(dwcatalogentryid: UInt, lplpfncallback: COpaquePointer?, lpdwcontext: COpaquePointer?, lperrno: COpaquePointer?): Int
}

public typealias Lpwpuqueryblockingcallback = LpwpuqueryblockingcallbackFn?

public fun interface LpwpuquerysockethandlecontextFn {
    public operator fun invoke(s: Socket, lpcontext: COpaquePointer?, lperrno: COpaquePointer?): Int
}

public typealias Lpwpuquerysockethandlecontext = LpwpuquerysockethandlecontextFn?

public fun interface LpwpuqueueapcFn {
    public operator fun invoke(lpthreadid: COpaquePointer?, lpfnuserapc: Lpwsauserapc, dwcontext: ULong, lperrno: COpaquePointer?): Int
}

public typealias Lpwpuqueueapc = LpwpuqueueapcFn?

public fun interface LpwpureseteventFn {
    public operator fun invoke(hevent: Wsaevent, lperrno: COpaquePointer?): Bool
}

public typealias Lpwpuresetevent = LpwpureseteventFn?

public fun interface LpwpuseteventFn {
    public operator fun invoke(hevent: Wsaevent, lperrno: COpaquePointer?): Bool
}

public typealias Lpwpusetevent = LpwpuseteventFn?

public fun interface LpwsaoverlappedCompletionRoutineFn {
    public operator fun invoke(dwerror: UInt, cbtransferred: UInt, lpoverlapped: COpaquePointer?, dwflags: UInt)
}

public typealias LpwsaoverlappedCompletionRoutine = LpwsaoverlappedCompletionRoutineFn?

public fun interface LpwsauserapcFn {
    public operator fun invoke(dwcontext: ULong)
}

public typealias Lpwsauserapc = LpwsauserapcFn?

public fun interface LpwscdeinstallproviderFn {
    public operator fun invoke(lpproviderid: COpaquePointer?, lperrno: COpaquePointer?): Int
}

public typealias Lpwscdeinstallprovider = LpwscdeinstallproviderFn?

public fun interface LpwscenablensproviderFn {
    public operator fun invoke(lpproviderid: COpaquePointer?, fenable: Bool): Int
}

public typealias Lpwscenablensprovider = LpwscenablensproviderFn?

public fun interface LpwscenumprotocolsFn {
    public operator fun invoke(lpiprotocols: COpaquePointer?, lpprotocolbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lperrno: COpaquePointer?): Int
}

public typealias Lpwscenumprotocols = LpwscenumprotocolsFn?

public fun interface LpwscgetproviderpathFn {
    public operator fun invoke(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: COpaquePointer?, lperrno: COpaquePointer?): Int
}

public typealias Lpwscgetproviderpath = LpwscgetproviderpathFn?

public fun interface LpwscinstallnamespaceFn {
    public operator fun invoke(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: COpaquePointer?): Int
}

public typealias Lpwscinstallnamespace = LpwscinstallnamespaceFn?

public fun interface LpwscinstallproviderFn {
    public operator fun invoke(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: COpaquePointer?, dwnumberofentries: UInt, lperrno: COpaquePointer?): Int
}

public typealias Lpwscinstallprovider = LpwscinstallproviderFn?

public fun interface LpwscuninstallnamespaceFn {
    public operator fun invoke(lpproviderid: COpaquePointer?): Int
}

public typealias Lpwscuninstallnamespace = LpwscuninstallnamespaceFn?

public fun interface LpwscupdateproviderFn {
    public operator fun invoke(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: COpaquePointer?, dwnumberofentries: UInt, lperrno: COpaquePointer?): Int
}

public typealias Lpwscupdateprovider = LpwscupdateproviderFn?

public fun interface LpwscwritenamespaceorderFn {
    public operator fun invoke(lpproviderid: COpaquePointer?, dwnumberofentries: UInt): Int
}

public typealias Lpwscwritenamespaceorder = LpwscwritenamespaceorderFn?

public fun interface LpwscwriteproviderorderFn {
    public operator fun invoke(lpwdcatalogentryid: COpaquePointer?, dwnumberofentries: UInt): Int
}

public typealias Lpwscwriteproviderorder = LpwscwriteproviderorderFn?

public fun interface LpwspacceptFn {
    public operator fun invoke(s: Socket, addr: COpaquePointer?, addrlen: COpaquePointer?, lpfncondition: Lpconditionproc, dwcallbackdata: ULong, lperrno: COpaquePointer?): Socket
}

public typealias Lpwspaccept = LpwspacceptFn?

public fun interface LpwspaddresstostringFn {
    public operator fun invoke(lpsaaddress: COpaquePointer?, dwaddresslength: UInt, lpprotocolinfo: COpaquePointer?, lpszaddressstring: Pwstr, lpdwaddressstringlength: COpaquePointer?, lperrno: COpaquePointer?): Int
}

public typealias Lpwspaddresstostring = LpwspaddresstostringFn?

public fun interface LpwspasyncselectFn {
    public operator fun invoke(s: Socket, hwnd: Hwnd, wmsg: UInt, levent: Int, lperrno: COpaquePointer?): Int
}

public typealias Lpwspasyncselect = LpwspasyncselectFn?

public fun interface LpwspbindFn {
    public operator fun invoke(s: Socket, name: COpaquePointer?, namelen: Int, lperrno: COpaquePointer?): Int
}

public typealias Lpwspbind = LpwspbindFn?

public fun interface LpwspcancelblockingcallFn {
    public operator fun invoke(lperrno: COpaquePointer?): Int
}

public typealias Lpwspcancelblockingcall = LpwspcancelblockingcallFn?

public fun interface LpwspcleanupFn {
    public operator fun invoke(lperrno: COpaquePointer?): Int
}

public typealias Lpwspcleanup = LpwspcleanupFn?

public fun interface LpwspclosesocketFn {
    public operator fun invoke(s: Socket, lperrno: COpaquePointer?): Int
}

public typealias Lpwspclosesocket = LpwspclosesocketFn?

public fun interface LpwspconnectFn {
    public operator fun invoke(s: Socket, name: COpaquePointer?, namelen: Int, lpcallerdata: COpaquePointer?, lpcalleedata: COpaquePointer?, lpsqos: COpaquePointer?, lpgqos: COpaquePointer?, lperrno: COpaquePointer?): Int
}

public typealias Lpwspconnect = LpwspconnectFn?

public fun interface LpwspduplicatesocketFn {
    public operator fun invoke(s: Socket, dwprocessid: UInt, lpprotocolinfo: COpaquePointer?, lperrno: COpaquePointer?): Int
}

public typealias Lpwspduplicatesocket = LpwspduplicatesocketFn?

public fun interface LpwspenumnetworkeventsFn {
    public operator fun invoke(s: Socket, heventobject: Handle, lpnetworkevents: COpaquePointer?, lperrno: COpaquePointer?): Int
}

public typealias Lpwspenumnetworkevents = LpwspenumnetworkeventsFn?

public fun interface LpwspeventselectFn {
    public operator fun invoke(s: Socket, heventobject: Wsaevent, lnetworkevents: Int, lperrno: COpaquePointer?): Int
}

public typealias Lpwspeventselect = LpwspeventselectFn?

public fun interface LpwspgetoverlappedresultFn {
    public operator fun invoke(s: Socket, lpoverlapped: COpaquePointer?, lpcbtransfer: COpaquePointer?, fwait: Bool, lpdwflags: COpaquePointer?, lperrno: COpaquePointer?): Bool
}

public typealias Lpwspgetoverlappedresult = LpwspgetoverlappedresultFn?

public fun interface LpwspgetpeernameFn {
    public operator fun invoke(s: Socket, name: COpaquePointer?, namelen: COpaquePointer?, lperrno: COpaquePointer?): Int
}

public typealias Lpwspgetpeername = LpwspgetpeernameFn?

public fun interface LpwspgetqosbynameFn {
    public operator fun invoke(s: Socket, lpqosname: COpaquePointer?, lpqos: COpaquePointer?, lperrno: COpaquePointer?): Bool
}

public typealias Lpwspgetqosbyname = LpwspgetqosbynameFn?

public fun interface LpwspgetsocknameFn {
    public operator fun invoke(s: Socket, name: COpaquePointer?, namelen: COpaquePointer?, lperrno: COpaquePointer?): Int
}

public typealias Lpwspgetsockname = LpwspgetsocknameFn?

public fun interface LpwspgetsockoptFn {
    public operator fun invoke(s: Socket, level: Int, optname: Int, optval: Pstr, optlen: COpaquePointer?, lperrno: COpaquePointer?): Int
}

public typealias Lpwspgetsockopt = LpwspgetsockoptFn?

public fun interface LpwspioctlFn {
    public operator fun invoke(s: Socket, dwiocontrolcode: UInt, lpvinbuffer: COpaquePointer?, cbinbuffer: UInt, lpvoutbuffer: COpaquePointer?, cboutbuffer: UInt, lpcbbytesreturned: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine, lpthreadid: COpaquePointer?, lperrno: COpaquePointer?): Int
}

public typealias Lpwspioctl = LpwspioctlFn?

public fun interface LpwspjoinleafFn {
    public operator fun invoke(s: Socket, name: COpaquePointer?, namelen: Int, lpcallerdata: COpaquePointer?, lpcalleedata: COpaquePointer?, lpsqos: COpaquePointer?, lpgqos: COpaquePointer?, dwflags: UInt, lperrno: COpaquePointer?): Socket
}

public typealias Lpwspjoinleaf = LpwspjoinleafFn?

public fun interface LpwsplistenFn {
    public operator fun invoke(s: Socket, backlog: Int, lperrno: COpaquePointer?): Int
}

public typealias Lpwsplisten = LpwsplistenFn?

public fun interface LpwsprecvFn {
    public operator fun invoke(s: Socket, lpbuffers: COpaquePointer?, dwbuffercount: UInt, lpnumberofbytesrecvd: COpaquePointer?, lpflags: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine, lpthreadid: COpaquePointer?, lperrno: COpaquePointer?): Int
}

public typealias Lpwsprecv = LpwsprecvFn?

public fun interface LpwsprecvdisconnectFn {
    public operator fun invoke(s: Socket, lpinbounddisconnectdata: COpaquePointer?, lperrno: COpaquePointer?): Int
}

public typealias Lpwsprecvdisconnect = LpwsprecvdisconnectFn?

public fun interface LpwsprecvfromFn {
    public operator fun invoke(s: Socket, lpbuffers: COpaquePointer?, dwbuffercount: UInt, lpnumberofbytesrecvd: COpaquePointer?, lpflags: COpaquePointer?, lpfrom: COpaquePointer?, lpfromlen: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine, lpthreadid: COpaquePointer?, lperrno: COpaquePointer?): Int
}

public typealias Lpwsprecvfrom = LpwsprecvfromFn?

public fun interface LpwspselectFn {
    public operator fun invoke(nfds: Int, readfds: COpaquePointer?, writefds: COpaquePointer?, exceptfds: COpaquePointer?, timeout: COpaquePointer?, lperrno: COpaquePointer?): Int
}

public typealias Lpwspselect = LpwspselectFn?

public fun interface LpwspsendFn {
    public operator fun invoke(s: Socket, lpbuffers: COpaquePointer?, dwbuffercount: UInt, lpnumberofbytessent: COpaquePointer?, dwflags: UInt, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine, lpthreadid: COpaquePointer?, lperrno: COpaquePointer?): Int
}

public typealias Lpwspsend = LpwspsendFn?

public fun interface LpwspsenddisconnectFn {
    public operator fun invoke(s: Socket, lpoutbounddisconnectdata: COpaquePointer?, lperrno: COpaquePointer?): Int
}

public typealias Lpwspsenddisconnect = LpwspsenddisconnectFn?

public fun interface LpwspsendtoFn {
    public operator fun invoke(s: Socket, lpbuffers: COpaquePointer?, dwbuffercount: UInt, lpnumberofbytessent: COpaquePointer?, dwflags: UInt, lpto: COpaquePointer?, itolen: Int, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine, lpthreadid: COpaquePointer?, lperrno: COpaquePointer?): Int
}

public typealias Lpwspsendto = LpwspsendtoFn?

public fun interface LpwspsetsockoptFn {
    public operator fun invoke(s: Socket, level: Int, optname: Int, optval: Pcstr, optlen: Int, lperrno: COpaquePointer?): Int
}

public typealias Lpwspsetsockopt = LpwspsetsockoptFn?

public fun interface LpwspshutdownFn {
    public operator fun invoke(s: Socket, how: Int, lperrno: COpaquePointer?): Int
}

public typealias Lpwspshutdown = LpwspshutdownFn?

public fun interface LpwspsocketFn {
    public operator fun invoke(af: Int, type: Int, protocol: Int, lpprotocolinfo: COpaquePointer?, g: UInt, dwflags: UInt, lperrno: COpaquePointer?): Socket
}

public typealias Lpwspsocket = LpwspsocketFn?

public fun interface LpwspstartupFn {
    public operator fun invoke(wversionrequested: UShort, lpwspdata: COpaquePointer?, lpprotocolinfo: COpaquePointer?, upcalltable: Wspupcalltable, lpproctable: COpaquePointer?): Int
}

public typealias Lpwspstartup = LpwspstartupFn?

public fun interface LpwspstringtoaddressFn {
    public operator fun invoke(addressstring: Pcwstr, addressfamily: Int, lpprotocolinfo: COpaquePointer?, lpaddress: COpaquePointer?, lpaddresslength: COpaquePointer?, lperrno: COpaquePointer?): Int
}

public typealias Lpwspstringtoaddress = LpwspstringtoaddressFn?

public typealias MldMaxRespCodeType = Int

public typealias MulticastModeType = Int

public typealias NapiProviderLevel = Int

public typealias NapiProviderType = Int

public typealias NdOptionType = Int

public typealias NlaBlobDataType = Int

public typealias NlaConnectivityType = Int

public typealias NlaInternet = Int

public typealias NlAddressType = Int

public typealias NlBandwidthFlag = Int

public typealias NlDadState = Int

public typealias NlInterfaceNetworkCategoryState = Int

public typealias NlLinkLocalAddressBehavior = Int

public typealias NlNeighborState = Int

public typealias NlNetworkCategory = Int

public typealias NlNetworkConnectivityCostHint = Int

public typealias NlNetworkConnectivityLevelHint = Int

public typealias NlPrefixOrigin = Int

public typealias NlRouterDiscoveryBehavior = Int

public typealias NlRouteOrigin = Int

public typealias NlRouteProtocol = Int

public typealias NlSuffixOrigin = Int

public typealias NpiModuleidType = Int

public typealias PmtudState = Int

public typealias Q2931IeType = Int

public typealias RcvallValue = Int

public typealias ResourceDisplayType = UInt

public typealias RioBufferid = Long

public typealias RioCq = Long

public typealias RioNotificationCompletionType = Int

public typealias RioRq = Long

public typealias ScopeLevel = Int

public typealias SendRecvFlags = Int

public typealias SetServiceOperation = UInt

public typealias Socket = ULong

public typealias SocketPriorityHint = Int

public typealias SocketSecurityProtocol = Int

public typealias SocketUsageType = Int

public typealias Tcpstate = Int

public typealias TcpIcwLevel = Int

public typealias TunnelSubType = Int

public typealias WinsockShutdownHow = Int

public typealias WinsockSocketType = Int

public typealias Wsacompletiontype = Int

public typealias Wsaecomparator = Int

public typealias Wsaesetserviceop = Int

public typealias Wsaevent = Long

public typealias WsapollEventFlags = Short

public typealias WsaCompatibilityBehaviorId = Int

public typealias WsaError = Int

public typealias WscProviderInfoType = Int

public typealias EWindowAdvanceMethod = Int

public typealias SocklenT = Int
