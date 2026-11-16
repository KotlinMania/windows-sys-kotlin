package io.github.kotlinmania.windowssys.windows.win32.networking.winsock

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
    public operator fun invoke(lpcallerid: MutPtr, lpcallerdata: MutPtr, lpsqos: MutPtr, lpgqos: MutPtr, lpcalleeid: MutPtr, lpcalleedata: MutPtr, g: MutPtr, dwcallbackdata: ULong): Int
}

public typealias Lpconditionproc = LpconditionprocFn?

public fun interface LpfnAcceptexFn {
    public operator fun invoke(slistensocket: Socket, sacceptsocket: Socket, lpoutputbuffer: MutPtr, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, lpdwbytesreceived: MutPtr, lpoverlapped: MutPtr): Bool
}

public typealias LpfnAcceptex = LpfnAcceptexFn?

public fun interface LpfnConnectexFn {
    public operator fun invoke(s: Socket, name: ConstPtr, namelen: Int, lpsendbuffer: ConstPtr, dwsenddatalength: UInt, lpdwbytessent: MutPtr, lpoverlapped: MutPtr): Bool
}

public typealias LpfnConnectex = LpfnConnectexFn?

public fun interface LpfnDisconnectexFn {
    public operator fun invoke(s: Socket, lpoverlapped: MutPtr, dwflags: UInt, dwreserved: UInt): Bool
}

public typealias LpfnDisconnectex = LpfnDisconnectexFn?

public fun interface LpfnGetacceptexsockaddrsFn {
    public operator fun invoke(lpoutputbuffer: ConstPtr, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, localsockaddr: MutPtr, localsockaddrlength: MutPtr, remotesockaddr: MutPtr, remotesockaddrlength: MutPtr)
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
    public operator fun invoke(queuesize: UInt, notificationcompletion: ConstPtr): RioCq
}

public typealias LpfnRiocreatecompletionqueue = LpfnRiocreatecompletionqueueFn?

public fun interface LpfnRiocreaterequestqueueFn {
    public operator fun invoke(socket: Socket, maxoutstandingreceive: UInt, maxreceivedatabuffers: UInt, maxoutstandingsend: UInt, maxsenddatabuffers: UInt, receivecq: RioCq, sendcq: RioCq, socketcontext: ConstPtr): RioRq
}

public typealias LpfnRiocreaterequestqueue = LpfnRiocreaterequestqueueFn?

public fun interface LpfnRiodequeuecompletionFn {
    public operator fun invoke(cq: RioCq, array: MutPtr, arraysize: UInt): UInt
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
    public operator fun invoke(socketqueue: RioRq, pdata: ConstPtr, databuffercount: UInt, flags: UInt, requestcontext: ConstPtr): Bool
}

public typealias LpfnRioreceive = LpfnRioreceiveFn?

public fun interface LpfnRioreceiveexFn {
    public operator fun invoke(socketqueue: RioRq, pdata: ConstPtr, databuffercount: UInt, plocaladdress: ConstPtr, premoteaddress: ConstPtr, pcontrolcontext: ConstPtr, pflags: ConstPtr, flags: UInt, requestcontext: ConstPtr): Int
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
    public operator fun invoke(socketqueue: RioRq, pdata: ConstPtr, databuffercount: UInt, flags: UInt, requestcontext: ConstPtr): Bool
}

public typealias LpfnRiosend = LpfnRiosendFn?

public fun interface LpfnRiosendexFn {
    public operator fun invoke(socketqueue: RioRq, pdata: ConstPtr, databuffercount: UInt, plocaladdress: ConstPtr, premoteaddress: ConstPtr, pcontrolcontext: ConstPtr, pflags: ConstPtr, flags: UInt, requestcontext: ConstPtr): Bool
}

public typealias LpfnRiosendex = LpfnRiosendexFn?

public fun interface LpfnTransmitfileFn {
    public operator fun invoke(hsocket: Socket, hfile: Handle, nnumberofbytestowrite: UInt, nnumberofbytespersend: UInt, lpoverlapped: MutPtr, lptransmitbuffers: ConstPtr, dwreserved: UInt): Bool
}

public typealias LpfnTransmitfile = LpfnTransmitfileFn?

public fun interface LpfnTransmitpacketsFn {
    public operator fun invoke(hsocket: Socket, lppacketarray: ConstPtr, nelementcount: UInt, nsendsize: UInt, lpoverlapped: MutPtr, dwflags: UInt): Bool
}

public typealias LpfnTransmitpackets = LpfnTransmitpacketsFn?

public fun interface LpfnWsapollFn {
    public operator fun invoke(fdarray: MutPtr, nfds: UInt, timeout: Int): Int
}

public typealias LpfnWsapoll = LpfnWsapollFn?

public fun interface LpfnWsarecvmsgFn {
    public operator fun invoke(s: Socket, lpmsg: MutPtr, lpdwnumberofbytesrecvd: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int
}

public typealias LpfnWsarecvmsg = LpfnWsarecvmsgFn?

public fun interface LpfnWsasendmsgFn {
    public operator fun invoke(s: Socket, lpmsg: ConstPtr, dwflags: UInt, lpnumberofbytessent: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int
}

public typealias LpfnWsasendmsg = LpfnWsasendmsgFn?

public fun interface LplookupserviceCompletionRoutineFn {
    public operator fun invoke(dwerror: UInt, dwbytes: UInt, lpoverlapped: ConstPtr)
}

public typealias LplookupserviceCompletionRoutine = LplookupserviceCompletionRoutineFn?

public fun interface LpnspcleanupFn {
    public operator fun invoke(lpproviderid: ConstPtr): Int
}

public typealias Lpnspcleanup = LpnspcleanupFn?

public fun interface LpnspgetserviceclassinfoFn {
    public operator fun invoke(lpproviderid: ConstPtr, lpdwbufsize: ConstPtr, lpserviceclassinfo: ConstPtr): Int
}

public typealias Lpnspgetserviceclassinfo = LpnspgetserviceclassinfoFn?

public fun interface LpnspinstallserviceclassFn {
    public operator fun invoke(lpproviderid: ConstPtr, lpserviceclassinfo: ConstPtr): Int
}

public typealias Lpnspinstallserviceclass = LpnspinstallserviceclassFn?

public fun interface LpnspioctlFn {
    public operator fun invoke(hlookup: Handle, dwcontrolcode: UInt, lpvinbuffer: ConstPtr, cbinbuffer: UInt, lpvoutbuffer: MutPtr, cboutbuffer: UInt, lpcbbytesreturned: MutPtr, lpcompletion: ConstPtr, lpthreadid: ConstPtr): Int
}

public typealias Lpnspioctl = LpnspioctlFn?

public fun interface LpnsplookupservicebeginFn {
    public operator fun invoke(lpproviderid: ConstPtr, lpqsrestrictions: ConstPtr, lpserviceclassinfo: ConstPtr, dwcontrolflags: UInt, lphlookup: MutPtr): Int
}

public typealias Lpnsplookupservicebegin = LpnsplookupservicebeginFn?

public fun interface LpnsplookupserviceendFn {
    public operator fun invoke(hlookup: Handle): Int
}

public typealias Lpnsplookupserviceend = LpnsplookupserviceendFn?

public fun interface LpnsplookupservicenextFn {
    public operator fun invoke(hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: MutPtr, lpqsresults: MutPtr): Int
}

public typealias Lpnsplookupservicenext = LpnsplookupservicenextFn?

public fun interface LpnspremoveserviceclassFn {
    public operator fun invoke(lpproviderid: ConstPtr, lpserviceclassid: ConstPtr): Int
}

public typealias Lpnspremoveserviceclass = LpnspremoveserviceclassFn?

public fun interface LpnspsetserviceFn {
    public operator fun invoke(lpproviderid: ConstPtr, lpserviceclassinfo: ConstPtr, lpqsreginfo: ConstPtr, essoperation: Wsaesetserviceop, dwcontrolflags: UInt): Int
}

public typealias Lpnspsetservice = LpnspsetserviceFn?

public fun interface LpnspstartupFn {
    public operator fun invoke(lpproviderid: ConstPtr, lpnsproutines: MutPtr): Int
}

public typealias Lpnspstartup = LpnspstartupFn?

public fun interface Lpnspv2cleanupFn {
    public operator fun invoke(lpproviderid: ConstPtr, pvclientsessionarg: ConstPtr): Int
}

public typealias Lpnspv2cleanup = Lpnspv2cleanupFn?

public fun interface Lpnspv2clientsessionrundownFn {
    public operator fun invoke(lpproviderid: ConstPtr, pvclientsessionarg: ConstPtr)
}

public typealias Lpnspv2clientsessionrundown = Lpnspv2clientsessionrundownFn?

public fun interface Lpnspv2lookupservicebeginFn {
    public operator fun invoke(lpproviderid: ConstPtr, lpqsrestrictions: ConstPtr, dwcontrolflags: UInt, lpvclientsessionarg: ConstPtr, lphlookup: MutPtr): Int
}

public typealias Lpnspv2lookupservicebegin = Lpnspv2lookupservicebeginFn?

public fun interface Lpnspv2lookupserviceendFn {
    public operator fun invoke(hlookup: Handle): Int
}

public typealias Lpnspv2lookupserviceend = Lpnspv2lookupserviceendFn?

public fun interface Lpnspv2lookupservicenextexFn {
    public operator fun invoke(hasynccall: Handle, hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: ConstPtr, lpqsresults: MutPtr)
}

public typealias Lpnspv2lookupservicenextex = Lpnspv2lookupservicenextexFn?

public fun interface Lpnspv2setserviceexFn {
    public operator fun invoke(hasynccall: Handle, lpproviderid: ConstPtr, lpqsreginfo: ConstPtr, essoperation: Wsaesetserviceop, dwcontrolflags: UInt, lpvclientsessionarg: ConstPtr)
}

public typealias Lpnspv2setserviceex = Lpnspv2setserviceexFn?

public fun interface Lpnspv2startupFn {
    public operator fun invoke(lpproviderid: ConstPtr, ppvclientsessionarg: MutPtr): Int
}

public typealias Lpnspv2startup = Lpnspv2startupFn?

public fun interface LpserviceCallbackProcFn {
    public operator fun invoke(lparam: Lparam, hasynctaskhandle: Handle)
}

public typealias LpserviceCallbackProc = LpserviceCallbackProcFn?

public fun interface LpwpucloseeventFn {
    public operator fun invoke(hevent: Wsaevent, lperrno: MutPtr): Bool
}

public typealias Lpwpucloseevent = LpwpucloseeventFn?

public fun interface LpwpuclosesockethandleFn {
    public operator fun invoke(s: Socket, lperrno: MutPtr): Int
}

public typealias Lpwpuclosesockethandle = LpwpuclosesockethandleFn?

public fun interface LpwpuclosethreadFn {
    public operator fun invoke(lpthreadid: ConstPtr, lperrno: MutPtr): Int
}

public typealias Lpwpuclosethread = LpwpuclosethreadFn?

public fun interface LpwpucompleteoverlappedrequestFn {
    public operator fun invoke(s: Socket, lpoverlapped: MutPtr, dwerror: UInt, cbtransferred: UInt, lperrno: MutPtr): Int
}

public typealias Lpwpucompleteoverlappedrequest = LpwpucompleteoverlappedrequestFn?

public fun interface LpwpucreateeventFn {
    public operator fun invoke(lperrno: MutPtr): Wsaevent
}

public typealias Lpwpucreateevent = LpwpucreateeventFn?

public fun interface LpwpucreatesockethandleFn {
    public operator fun invoke(dwcatalogentryid: UInt, dwcontext: ULong, lperrno: MutPtr): Socket
}

public typealias Lpwpucreatesockethandle = LpwpucreatesockethandleFn?

public fun interface LpwpufdissetFn {
    public operator fun invoke(s: Socket, fdset: ConstPtr): Int
}

public typealias Lpwpufdisset = LpwpufdissetFn?

public fun interface LpwpugetproviderpathFn {
    public operator fun invoke(lpproviderid: ConstPtr, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: MutPtr, lperrno: MutPtr): Int
}

public typealias Lpwpugetproviderpath = LpwpugetproviderpathFn?

public fun interface LpwpumodifyifshandleFn {
    public operator fun invoke(dwcatalogentryid: UInt, proposedhandle: Socket, lperrno: MutPtr): Socket
}

public typealias Lpwpumodifyifshandle = LpwpumodifyifshandleFn?

public fun interface LpwpuopencurrentthreadFn {
    public operator fun invoke(lpthreadid: MutPtr, lperrno: MutPtr): Int
}

public typealias Lpwpuopencurrentthread = LpwpuopencurrentthreadFn?

public fun interface LpwpupostmessageFn {
    public operator fun invoke(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool
}

public typealias Lpwpupostmessage = LpwpupostmessageFn?

public fun interface LpwpuqueryblockingcallbackFn {
    public operator fun invoke(dwcatalogentryid: UInt, lplpfncallback: MutPtr, lpdwcontext: MutPtr, lperrno: MutPtr): Int
}

public typealias Lpwpuqueryblockingcallback = LpwpuqueryblockingcallbackFn?

public fun interface LpwpuquerysockethandlecontextFn {
    public operator fun invoke(s: Socket, lpcontext: MutPtr, lperrno: MutPtr): Int
}

public typealias Lpwpuquerysockethandlecontext = LpwpuquerysockethandlecontextFn?

public fun interface LpwpuqueueapcFn {
    public operator fun invoke(lpthreadid: ConstPtr, lpfnuserapc: Lpwsauserapc, dwcontext: ULong, lperrno: MutPtr): Int
}

public typealias Lpwpuqueueapc = LpwpuqueueapcFn?

public fun interface LpwpureseteventFn {
    public operator fun invoke(hevent: Wsaevent, lperrno: MutPtr): Bool
}

public typealias Lpwpuresetevent = LpwpureseteventFn?

public fun interface LpwpuseteventFn {
    public operator fun invoke(hevent: Wsaevent, lperrno: MutPtr): Bool
}

public typealias Lpwpusetevent = LpwpuseteventFn?

public fun interface LpwsaoverlappedCompletionRoutineFn {
    public operator fun invoke(dwerror: UInt, cbtransferred: UInt, lpoverlapped: MutPtr, dwflags: UInt)
}

public typealias LpwsaoverlappedCompletionRoutine = LpwsaoverlappedCompletionRoutineFn?

public fun interface LpwsauserapcFn {
    public operator fun invoke(dwcontext: ULong)
}

public typealias Lpwsauserapc = LpwsauserapcFn?

public fun interface LpwscdeinstallproviderFn {
    public operator fun invoke(lpproviderid: ConstPtr, lperrno: MutPtr): Int
}

public typealias Lpwscdeinstallprovider = LpwscdeinstallproviderFn?

public fun interface LpwscenablensproviderFn {
    public operator fun invoke(lpproviderid: ConstPtr, fenable: Bool): Int
}

public typealias Lpwscenablensprovider = LpwscenablensproviderFn?

public fun interface LpwscenumprotocolsFn {
    public operator fun invoke(lpiprotocols: ConstPtr, lpprotocolbuffer: MutPtr, lpdwbufferlength: MutPtr, lperrno: MutPtr): Int
}

public typealias Lpwscenumprotocols = LpwscenumprotocolsFn?

public fun interface LpwscgetproviderpathFn {
    public operator fun invoke(lpproviderid: ConstPtr, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: MutPtr, lperrno: MutPtr): Int
}

public typealias Lpwscgetproviderpath = LpwscgetproviderpathFn?

public fun interface LpwscinstallnamespaceFn {
    public operator fun invoke(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr): Int
}

public typealias Lpwscinstallnamespace = LpwscinstallnamespaceFn?

public fun interface LpwscinstallproviderFn {
    public operator fun invoke(lpproviderid: ConstPtr, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr, dwnumberofentries: UInt, lperrno: MutPtr): Int
}

public typealias Lpwscinstallprovider = LpwscinstallproviderFn?

public fun interface LpwscuninstallnamespaceFn {
    public operator fun invoke(lpproviderid: ConstPtr): Int
}

public typealias Lpwscuninstallnamespace = LpwscuninstallnamespaceFn?

public fun interface LpwscupdateproviderFn {
    public operator fun invoke(lpproviderid: ConstPtr, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr, dwnumberofentries: UInt, lperrno: MutPtr): Int
}

public typealias Lpwscupdateprovider = LpwscupdateproviderFn?

public fun interface LpwscwritenamespaceorderFn {
    public operator fun invoke(lpproviderid: MutPtr, dwnumberofentries: UInt): Int
}

public typealias Lpwscwritenamespaceorder = LpwscwritenamespaceorderFn?

public fun interface LpwscwriteproviderorderFn {
    public operator fun invoke(lpwdcatalogentryid: MutPtr, dwnumberofentries: UInt): Int
}

public typealias Lpwscwriteproviderorder = LpwscwriteproviderorderFn?

public fun interface LpwspacceptFn {
    public operator fun invoke(s: Socket, addr: MutPtr, addrlen: MutPtr, lpfncondition: Lpconditionproc, dwcallbackdata: ULong, lperrno: MutPtr): Socket
}

public typealias Lpwspaccept = LpwspacceptFn?

public fun interface LpwspaddresstostringFn {
    public operator fun invoke(lpsaaddress: ConstPtr, dwaddresslength: UInt, lpprotocolinfo: ConstPtr, lpszaddressstring: Pwstr, lpdwaddressstringlength: MutPtr, lperrno: MutPtr): Int
}

public typealias Lpwspaddresstostring = LpwspaddresstostringFn?

public fun interface LpwspasyncselectFn {
    public operator fun invoke(s: Socket, hwnd: Hwnd, wmsg: UInt, levent: Int, lperrno: MutPtr): Int
}

public typealias Lpwspasyncselect = LpwspasyncselectFn?

public fun interface LpwspbindFn {
    public operator fun invoke(s: Socket, name: ConstPtr, namelen: Int, lperrno: MutPtr): Int
}

public typealias Lpwspbind = LpwspbindFn?

public fun interface LpwspcancelblockingcallFn {
    public operator fun invoke(lperrno: MutPtr): Int
}

public typealias Lpwspcancelblockingcall = LpwspcancelblockingcallFn?

public fun interface LpwspcleanupFn {
    public operator fun invoke(lperrno: MutPtr): Int
}

public typealias Lpwspcleanup = LpwspcleanupFn?

public fun interface LpwspclosesocketFn {
    public operator fun invoke(s: Socket, lperrno: MutPtr): Int
}

public typealias Lpwspclosesocket = LpwspclosesocketFn?

public fun interface LpwspconnectFn {
    public operator fun invoke(s: Socket, name: ConstPtr, namelen: Int, lpcallerdata: ConstPtr, lpcalleedata: MutPtr, lpsqos: ConstPtr, lpgqos: ConstPtr, lperrno: MutPtr): Int
}

public typealias Lpwspconnect = LpwspconnectFn?

public fun interface LpwspduplicatesocketFn {
    public operator fun invoke(s: Socket, dwprocessid: UInt, lpprotocolinfo: MutPtr, lperrno: MutPtr): Int
}

public typealias Lpwspduplicatesocket = LpwspduplicatesocketFn?

public fun interface LpwspenumnetworkeventsFn {
    public operator fun invoke(s: Socket, heventobject: Handle, lpnetworkevents: MutPtr, lperrno: MutPtr): Int
}

public typealias Lpwspenumnetworkevents = LpwspenumnetworkeventsFn?

public fun interface LpwspeventselectFn {
    public operator fun invoke(s: Socket, heventobject: Wsaevent, lnetworkevents: Int, lperrno: MutPtr): Int
}

public typealias Lpwspeventselect = LpwspeventselectFn?

public fun interface LpwspgetoverlappedresultFn {
    public operator fun invoke(s: Socket, lpoverlapped: ConstPtr, lpcbtransfer: MutPtr, fwait: Bool, lpdwflags: MutPtr, lperrno: MutPtr): Bool
}

public typealias Lpwspgetoverlappedresult = LpwspgetoverlappedresultFn?

public fun interface LpwspgetpeernameFn {
    public operator fun invoke(s: Socket, name: MutPtr, namelen: MutPtr, lperrno: MutPtr): Int
}

public typealias Lpwspgetpeername = LpwspgetpeernameFn?

public fun interface LpwspgetqosbynameFn {
    public operator fun invoke(s: Socket, lpqosname: ConstPtr, lpqos: MutPtr, lperrno: MutPtr): Bool
}

public typealias Lpwspgetqosbyname = LpwspgetqosbynameFn?

public fun interface LpwspgetsocknameFn {
    public operator fun invoke(s: Socket, name: MutPtr, namelen: MutPtr, lperrno: MutPtr): Int
}

public typealias Lpwspgetsockname = LpwspgetsocknameFn?

public fun interface LpwspgetsockoptFn {
    public operator fun invoke(s: Socket, level: Int, optname: Int, optval: Pstr, optlen: MutPtr, lperrno: MutPtr): Int
}

public typealias Lpwspgetsockopt = LpwspgetsockoptFn?

public fun interface LpwspioctlFn {
    public operator fun invoke(s: Socket, dwiocontrolcode: UInt, lpvinbuffer: ConstPtr, cbinbuffer: UInt, lpvoutbuffer: MutPtr, cboutbuffer: UInt, lpcbbytesreturned: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine, lpthreadid: ConstPtr, lperrno: MutPtr): Int
}

public typealias Lpwspioctl = LpwspioctlFn?

public fun interface LpwspjoinleafFn {
    public operator fun invoke(s: Socket, name: ConstPtr, namelen: Int, lpcallerdata: ConstPtr, lpcalleedata: MutPtr, lpsqos: ConstPtr, lpgqos: ConstPtr, dwflags: UInt, lperrno: MutPtr): Socket
}

public typealias Lpwspjoinleaf = LpwspjoinleafFn?

public fun interface LpwsplistenFn {
    public operator fun invoke(s: Socket, backlog: Int, lperrno: MutPtr): Int
}

public typealias Lpwsplisten = LpwsplistenFn?

public fun interface LpwsprecvFn {
    public operator fun invoke(s: Socket, lpbuffers: ConstPtr, dwbuffercount: UInt, lpnumberofbytesrecvd: MutPtr, lpflags: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine, lpthreadid: ConstPtr, lperrno: ConstPtr): Int
}

public typealias Lpwsprecv = LpwsprecvFn?

public fun interface LpwsprecvdisconnectFn {
    public operator fun invoke(s: Socket, lpinbounddisconnectdata: ConstPtr, lperrno: MutPtr): Int
}

public typealias Lpwsprecvdisconnect = LpwsprecvdisconnectFn?

public fun interface LpwsprecvfromFn {
    public operator fun invoke(s: Socket, lpbuffers: ConstPtr, dwbuffercount: UInt, lpnumberofbytesrecvd: MutPtr, lpflags: MutPtr, lpfrom: MutPtr, lpfromlen: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine, lpthreadid: ConstPtr, lperrno: MutPtr): Int
}

public typealias Lpwsprecvfrom = LpwsprecvfromFn?

public fun interface LpwspselectFn {
    public operator fun invoke(nfds: Int, readfds: MutPtr, writefds: MutPtr, exceptfds: MutPtr, timeout: ConstPtr, lperrno: MutPtr): Int
}

public typealias Lpwspselect = LpwspselectFn?

public fun interface LpwspsendFn {
    public operator fun invoke(s: Socket, lpbuffers: ConstPtr, dwbuffercount: UInt, lpnumberofbytessent: MutPtr, dwflags: UInt, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine, lpthreadid: ConstPtr, lperrno: MutPtr): Int
}

public typealias Lpwspsend = LpwspsendFn?

public fun interface LpwspsenddisconnectFn {
    public operator fun invoke(s: Socket, lpoutbounddisconnectdata: ConstPtr, lperrno: MutPtr): Int
}

public typealias Lpwspsenddisconnect = LpwspsenddisconnectFn?

public fun interface LpwspsendtoFn {
    public operator fun invoke(s: Socket, lpbuffers: ConstPtr, dwbuffercount: UInt, lpnumberofbytessent: MutPtr, dwflags: UInt, lpto: ConstPtr, itolen: Int, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine, lpthreadid: ConstPtr, lperrno: MutPtr): Int
}

public typealias Lpwspsendto = LpwspsendtoFn?

public fun interface LpwspsetsockoptFn {
    public operator fun invoke(s: Socket, level: Int, optname: Int, optval: Pcstr, optlen: Int, lperrno: MutPtr): Int
}

public typealias Lpwspsetsockopt = LpwspsetsockoptFn?

public fun interface LpwspshutdownFn {
    public operator fun invoke(s: Socket, how: Int, lperrno: MutPtr): Int
}

public typealias Lpwspshutdown = LpwspshutdownFn?

public fun interface LpwspsocketFn {
    public operator fun invoke(af: Int, type: Int, protocol: Int, lpprotocolinfo: ConstPtr, g: UInt, dwflags: UInt, lperrno: MutPtr): Socket
}

public typealias Lpwspsocket = LpwspsocketFn?

public fun interface LpwspstartupFn {
    public operator fun invoke(wversionrequested: UShort, lpwspdata: ConstPtr, lpprotocolinfo: ConstPtr, upcalltable: Wspupcalltable, lpproctable: MutPtr): Int
}

public typealias Lpwspstartup = LpwspstartupFn?

public fun interface LpwspstringtoaddressFn {
    public operator fun invoke(addressstring: Pcwstr, addressfamily: Int, lpprotocolinfo: ConstPtr, lpaddress: MutPtr, lpaddresslength: MutPtr, lperrno: MutPtr): Int
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
