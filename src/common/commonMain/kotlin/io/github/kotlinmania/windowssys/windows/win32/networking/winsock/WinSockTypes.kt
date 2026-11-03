package io.github.kotlinmania.windowssys.windows.win32.networking.winsock

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public typealias AAL_TYPE = Int

public typealias ADDRESS_FAMILY = UShort

public typealias ARP_HARDWARE_TYPE = Int

public typealias ARP_OPCODE = Int

public typealias CONTROL_CHANNEL_TRIGGER_STATUS = Int

public typealias FALLBACK_INDEX = Int

public typealias ICMP4_TIME_EXCEED_CODE = Int

public typealias ICMP4_UNREACH_CODE = Int

public typealias IGMP_MAX_RESP_CODE_TYPE = Int

public typealias IPPROTO = Int

public typealias IPV4_OPTION_TYPE = Int

public typealias IPV6_OPTION_TYPE = Int

public typealias IP_OPTION_TIMESTAMP_FLAGS = Int

public fun interface LPBLOCKINGCALLBACKFn {
    public operator fun invoke(dwcontext: ULong): BOOL
}

public typealias LPBLOCKINGCALLBACK = LPBLOCKINGCALLBACKFn?

public fun interface LPCONDITIONPROCFn {
    public operator fun invoke(lpcallerid: Long, lpcallerdata: Long, lpsqos: Long, lpgqos: Long, lpcalleeid: Long, lpcalleedata: Long, g: Long, dwcallbackdata: ULong): Int
}

public typealias LPCONDITIONPROC = LPCONDITIONPROCFn?

public fun interface LPFN_ACCEPTEXFn {
    public operator fun invoke(slistensocket: SOCKET, sacceptsocket: SOCKET, lpoutputbuffer: Long, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, lpdwbytesreceived: Long, lpoverlapped: Long): BOOL
}

public typealias LPFN_ACCEPTEX = LPFN_ACCEPTEXFn?

public fun interface LPFN_CONNECTEXFn {
    public operator fun invoke(s: SOCKET, name: Long, namelen: Int, lpsendbuffer: Long, dwsenddatalength: UInt, lpdwbytessent: Long, lpoverlapped: Long): BOOL
}

public typealias LPFN_CONNECTEX = LPFN_CONNECTEXFn?

public fun interface LPFN_DISCONNECTEXFn {
    public operator fun invoke(s: SOCKET, lpoverlapped: Long, dwflags: UInt, dwreserved: UInt): BOOL
}

public typealias LPFN_DISCONNECTEX = LPFN_DISCONNECTEXFn?

public fun interface LPFN_GETACCEPTEXSOCKADDRSFn {
    public operator fun invoke(lpoutputbuffer: Long, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, localsockaddr: Long, localsockaddrlength: Long, remotesockaddr: Long, remotesockaddrlength: Long)
}

public typealias LPFN_GETACCEPTEXSOCKADDRS = LPFN_GETACCEPTEXSOCKADDRSFn?

public fun interface LPFN_NSPAPIFn {
    public operator fun invoke(): UInt
}

public typealias LPFN_NSPAPI = LPFN_NSPAPIFn?

public fun interface LPFN_RIOCLOSECOMPLETIONQUEUEFn {
    public operator fun invoke(cq: RIO_CQ)
}

public typealias LPFN_RIOCLOSECOMPLETIONQUEUE = LPFN_RIOCLOSECOMPLETIONQUEUEFn?

public fun interface LPFN_RIOCREATECOMPLETIONQUEUEFn {
    public operator fun invoke(queuesize: UInt, notificationcompletion: Long): RIO_CQ
}

public typealias LPFN_RIOCREATECOMPLETIONQUEUE = LPFN_RIOCREATECOMPLETIONQUEUEFn?

public fun interface LPFN_RIOCREATEREQUESTQUEUEFn {
    public operator fun invoke(socket: SOCKET, maxoutstandingreceive: UInt, maxreceivedatabuffers: UInt, maxoutstandingsend: UInt, maxsenddatabuffers: UInt, receivecq: RIO_CQ, sendcq: RIO_CQ, socketcontext: Long): RIO_RQ
}

public typealias LPFN_RIOCREATEREQUESTQUEUE = LPFN_RIOCREATEREQUESTQUEUEFn?

public fun interface LPFN_RIODEQUEUECOMPLETIONFn {
    public operator fun invoke(cq: RIO_CQ, array: Long, arraysize: UInt): UInt
}

public typealias LPFN_RIODEQUEUECOMPLETION = LPFN_RIODEQUEUECOMPLETIONFn?

public fun interface LPFN_RIODEREGISTERBUFFERFn {
    public operator fun invoke(bufferid: RIO_BUFFERID)
}

public typealias LPFN_RIODEREGISTERBUFFER = LPFN_RIODEREGISTERBUFFERFn?

public fun interface LPFN_RIONOTIFYFn {
    public operator fun invoke(cq: RIO_CQ): Int
}

public typealias LPFN_RIONOTIFY = LPFN_RIONOTIFYFn?

public fun interface LPFN_RIORECEIVEFn {
    public operator fun invoke(socketqueue: RIO_RQ, pdata: Long, databuffercount: UInt, flags: UInt, requestcontext: Long): BOOL
}

public typealias LPFN_RIORECEIVE = LPFN_RIORECEIVEFn?

public fun interface LPFN_RIORECEIVEEXFn {
    public operator fun invoke(socketqueue: RIO_RQ, pdata: Long, databuffercount: UInt, plocaladdress: Long, premoteaddress: Long, pcontrolcontext: Long, pflags: Long, flags: UInt, requestcontext: Long): Int
}

public typealias LPFN_RIORECEIVEEX = LPFN_RIORECEIVEEXFn?

public fun interface LPFN_RIOREGISTERBUFFERFn {
    public operator fun invoke(databuffer: PCSTR, datalength: UInt): RIO_BUFFERID
}

public typealias LPFN_RIOREGISTERBUFFER = LPFN_RIOREGISTERBUFFERFn?

public fun interface LPFN_RIORESIZECOMPLETIONQUEUEFn {
    public operator fun invoke(cq: RIO_CQ, queuesize: UInt): BOOL
}

public typealias LPFN_RIORESIZECOMPLETIONQUEUE = LPFN_RIORESIZECOMPLETIONQUEUEFn?

public fun interface LPFN_RIORESIZEREQUESTQUEUEFn {
    public operator fun invoke(rq: RIO_RQ, maxoutstandingreceive: UInt, maxoutstandingsend: UInt): BOOL
}

public typealias LPFN_RIORESIZEREQUESTQUEUE = LPFN_RIORESIZEREQUESTQUEUEFn?

public fun interface LPFN_RIOSENDFn {
    public operator fun invoke(socketqueue: RIO_RQ, pdata: Long, databuffercount: UInt, flags: UInt, requestcontext: Long): BOOL
}

public typealias LPFN_RIOSEND = LPFN_RIOSENDFn?

public fun interface LPFN_RIOSENDEXFn {
    public operator fun invoke(socketqueue: RIO_RQ, pdata: Long, databuffercount: UInt, plocaladdress: Long, premoteaddress: Long, pcontrolcontext: Long, pflags: Long, flags: UInt, requestcontext: Long): BOOL
}

public typealias LPFN_RIOSENDEX = LPFN_RIOSENDEXFn?

public fun interface LPFN_TRANSMITFILEFn {
    public operator fun invoke(hsocket: SOCKET, hfile: Foundation.HANDLE, nnumberofbytestowrite: UInt, nnumberofbytespersend: UInt, lpoverlapped: Long, lptransmitbuffers: Long, dwreserved: UInt): BOOL
}

public typealias LPFN_TRANSMITFILE = LPFN_TRANSMITFILEFn?

public fun interface LPFN_TRANSMITPACKETSFn {
    public operator fun invoke(hsocket: SOCKET, lppacketarray: Long, nelementcount: UInt, nsendsize: UInt, lpoverlapped: Long, dwflags: UInt): BOOL
}

public typealias LPFN_TRANSMITPACKETS = LPFN_TRANSMITPACKETSFn?

public fun interface LPFN_WSAPOLLFn {
    public operator fun invoke(fdarray: Long, nfds: UInt, timeout: Int): Int
}

public typealias LPFN_WSAPOLL = LPFN_WSAPOLLFn?

public fun interface LPFN_WSARECVMSGFn {
    public operator fun invoke(s: SOCKET, lpmsg: Long, lpdwnumberofbytesrecvd: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int
}

public typealias LPFN_WSARECVMSG = LPFN_WSARECVMSGFn?

public fun interface LPFN_WSASENDMSGFn {
    public operator fun invoke(s: SOCKET, lpmsg: Long, dwflags: UInt, lpnumberofbytessent: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int
}

public typealias LPFN_WSASENDMSG = LPFN_WSASENDMSGFn?

public fun interface LPLOOKUPSERVICE_COMPLETION_ROUTINEFn {
    public operator fun invoke(dwerror: UInt, dwbytes: UInt, lpoverlapped: Long)
}

public typealias LPLOOKUPSERVICE_COMPLETION_ROUTINE = LPLOOKUPSERVICE_COMPLETION_ROUTINEFn?

public fun interface LPNSPCLEANUPFn {
    public operator fun invoke(lpproviderid: Long): Int
}

public typealias LPNSPCLEANUP = LPNSPCLEANUPFn?

public fun interface LPNSPGETSERVICECLASSINFOFn {
    public operator fun invoke(lpproviderid: Long, lpdwbufsize: Long, lpserviceclassinfo: Long): Int
}

public typealias LPNSPGETSERVICECLASSINFO = LPNSPGETSERVICECLASSINFOFn?

public fun interface LPNSPINSTALLSERVICECLASSFn {
    public operator fun invoke(lpproviderid: Long, lpserviceclassinfo: Long): Int
}

public typealias LPNSPINSTALLSERVICECLASS = LPNSPINSTALLSERVICECLASSFn?

public fun interface LPNSPIOCTLFn {
    public operator fun invoke(hlookup: Foundation.HANDLE, dwcontrolcode: UInt, lpvinbuffer: Long, cbinbuffer: UInt, lpvoutbuffer: Long, cboutbuffer: UInt, lpcbbytesreturned: Long, lpcompletion: Long, lpthreadid: Long): Int
}

public typealias LPNSPIOCTL = LPNSPIOCTLFn?

public fun interface LPNSPLOOKUPSERVICEBEGINFn {
    public operator fun invoke(lpproviderid: Long, lpqsrestrictions: Long, lpserviceclassinfo: Long, dwcontrolflags: UInt, lphlookup: Long): Int
}

public typealias LPNSPLOOKUPSERVICEBEGIN = LPNSPLOOKUPSERVICEBEGINFn?

public fun interface LPNSPLOOKUPSERVICEENDFn {
    public operator fun invoke(hlookup: Foundation.HANDLE): Int
}

public typealias LPNSPLOOKUPSERVICEEND = LPNSPLOOKUPSERVICEENDFn?

public fun interface LPNSPLOOKUPSERVICENEXTFn {
    public operator fun invoke(hlookup: Foundation.HANDLE, dwcontrolflags: UInt, lpdwbufferlength: Long, lpqsresults: Long): Int
}

public typealias LPNSPLOOKUPSERVICENEXT = LPNSPLOOKUPSERVICENEXTFn?

public fun interface LPNSPREMOVESERVICECLASSFn {
    public operator fun invoke(lpproviderid: Long, lpserviceclassid: Long): Int
}

public typealias LPNSPREMOVESERVICECLASS = LPNSPREMOVESERVICECLASSFn?

public fun interface LPNSPSETSERVICEFn {
    public operator fun invoke(lpproviderid: Long, lpserviceclassinfo: Long, lpqsreginfo: Long, essoperation: WSAESETSERVICEOP, dwcontrolflags: UInt): Int
}

public typealias LPNSPSETSERVICE = LPNSPSETSERVICEFn?

public fun interface LPNSPSTARTUPFn {
    public operator fun invoke(lpproviderid: Long, lpnsproutines: Long): Int
}

public typealias LPNSPSTARTUP = LPNSPSTARTUPFn?

public fun interface LPNSPV2CLEANUPFn {
    public operator fun invoke(lpproviderid: Long, pvclientsessionarg: Long): Int
}

public typealias LPNSPV2CLEANUP = LPNSPV2CLEANUPFn?

public fun interface LPNSPV2CLIENTSESSIONRUNDOWNFn {
    public operator fun invoke(lpproviderid: Long, pvclientsessionarg: Long)
}

public typealias LPNSPV2CLIENTSESSIONRUNDOWN = LPNSPV2CLIENTSESSIONRUNDOWNFn?

public fun interface LPNSPV2LOOKUPSERVICEBEGINFn {
    public operator fun invoke(lpproviderid: Long, lpqsrestrictions: Long, dwcontrolflags: UInt, lpvclientsessionarg: Long, lphlookup: Long): Int
}

public typealias LPNSPV2LOOKUPSERVICEBEGIN = LPNSPV2LOOKUPSERVICEBEGINFn?

public fun interface LPNSPV2LOOKUPSERVICEENDFn {
    public operator fun invoke(hlookup: Foundation.HANDLE): Int
}

public typealias LPNSPV2LOOKUPSERVICEEND = LPNSPV2LOOKUPSERVICEENDFn?

public fun interface LPNSPV2LOOKUPSERVICENEXTEXFn {
    public operator fun invoke(hasynccall: Foundation.HANDLE, hlookup: Foundation.HANDLE, dwcontrolflags: UInt, lpdwbufferlength: Long, lpqsresults: Long)
}

public typealias LPNSPV2LOOKUPSERVICENEXTEX = LPNSPV2LOOKUPSERVICENEXTEXFn?

public fun interface LPNSPV2SETSERVICEEXFn {
    public operator fun invoke(hasynccall: Foundation.HANDLE, lpproviderid: Long, lpqsreginfo: Long, essoperation: WSAESETSERVICEOP, dwcontrolflags: UInt, lpvclientsessionarg: Long)
}

public typealias LPNSPV2SETSERVICEEX = LPNSPV2SETSERVICEEXFn?

public fun interface LPNSPV2STARTUPFn {
    public operator fun invoke(lpproviderid: Long, ppvclientsessionarg: Long): Int
}

public typealias LPNSPV2STARTUP = LPNSPV2STARTUPFn?

public fun interface LPSERVICE_CALLBACK_PROCFn {
    public operator fun invoke(lparam: Foundation.LPARAM, hasynctaskhandle: Foundation.HANDLE)
}

public typealias LPSERVICE_CALLBACK_PROC = LPSERVICE_CALLBACK_PROCFn?

public fun interface LPWPUCLOSEEVENTFn {
    public operator fun invoke(hevent: WSAEVENT, lperrno: Long): BOOL
}

public typealias LPWPUCLOSEEVENT = LPWPUCLOSEEVENTFn?

public fun interface LPWPUCLOSESOCKETHANDLEFn {
    public operator fun invoke(s: SOCKET, lperrno: Long): Int
}

public typealias LPWPUCLOSESOCKETHANDLE = LPWPUCLOSESOCKETHANDLEFn?

public fun interface LPWPUCLOSETHREADFn {
    public operator fun invoke(lpthreadid: Long, lperrno: Long): Int
}

public typealias LPWPUCLOSETHREAD = LPWPUCLOSETHREADFn?

public fun interface LPWPUCOMPLETEOVERLAPPEDREQUESTFn {
    public operator fun invoke(s: SOCKET, lpoverlapped: Long, dwerror: UInt, cbtransferred: UInt, lperrno: Long): Int
}

public typealias LPWPUCOMPLETEOVERLAPPEDREQUEST = LPWPUCOMPLETEOVERLAPPEDREQUESTFn?

public fun interface LPWPUCREATEEVENTFn {
    public operator fun invoke(lperrno: Long): WSAEVENT
}

public typealias LPWPUCREATEEVENT = LPWPUCREATEEVENTFn?

public fun interface LPWPUCREATESOCKETHANDLEFn {
    public operator fun invoke(dwcatalogentryid: UInt, dwcontext: ULong, lperrno: Long): SOCKET
}

public typealias LPWPUCREATESOCKETHANDLE = LPWPUCREATESOCKETHANDLEFn?

public fun interface LPWPUFDISSETFn {
    public operator fun invoke(s: SOCKET, fdset: Long): Int
}

public typealias LPWPUFDISSET = LPWPUFDISSETFn?

public fun interface LPWPUGETPROVIDERPATHFn {
    public operator fun invoke(lpproviderid: Long, lpszproviderdllpath: PWSTR, lpproviderdllpathlen: Long, lperrno: Long): Int
}

public typealias LPWPUGETPROVIDERPATH = LPWPUGETPROVIDERPATHFn?

public fun interface LPWPUMODIFYIFSHANDLEFn {
    public operator fun invoke(dwcatalogentryid: UInt, proposedhandle: SOCKET, lperrno: Long): SOCKET
}

public typealias LPWPUMODIFYIFSHANDLE = LPWPUMODIFYIFSHANDLEFn?

public fun interface LPWPUOPENCURRENTTHREADFn {
    public operator fun invoke(lpthreadid: Long, lperrno: Long): Int
}

public typealias LPWPUOPENCURRENTTHREAD = LPWPUOPENCURRENTTHREADFn?

public fun interface LPWPUPOSTMESSAGEFn {
    public operator fun invoke(hwnd: Foundation.HWND, msg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM): BOOL
}

public typealias LPWPUPOSTMESSAGE = LPWPUPOSTMESSAGEFn?

public fun interface LPWPUQUERYBLOCKINGCALLBACKFn {
    public operator fun invoke(dwcatalogentryid: UInt, lplpfncallback: Long, lpdwcontext: Long, lperrno: Long): Int
}

public typealias LPWPUQUERYBLOCKINGCALLBACK = LPWPUQUERYBLOCKINGCALLBACKFn?

public fun interface LPWPUQUERYSOCKETHANDLECONTEXTFn {
    public operator fun invoke(s: SOCKET, lpcontext: Long, lperrno: Long): Int
}

public typealias LPWPUQUERYSOCKETHANDLECONTEXT = LPWPUQUERYSOCKETHANDLECONTEXTFn?

public fun interface LPWPUQUEUEAPCFn {
    public operator fun invoke(lpthreadid: Long, lpfnuserapc: LPWSAUSERAPC, dwcontext: ULong, lperrno: Long): Int
}

public typealias LPWPUQUEUEAPC = LPWPUQUEUEAPCFn?

public fun interface LPWPURESETEVENTFn {
    public operator fun invoke(hevent: WSAEVENT, lperrno: Long): BOOL
}

public typealias LPWPURESETEVENT = LPWPURESETEVENTFn?

public fun interface LPWPUSETEVENTFn {
    public operator fun invoke(hevent: WSAEVENT, lperrno: Long): BOOL
}

public typealias LPWPUSETEVENT = LPWPUSETEVENTFn?

public fun interface LPWSAOVERLAPPED_COMPLETION_ROUTINEFn {
    public operator fun invoke(dwerror: UInt, cbtransferred: UInt, lpoverlapped: Long, dwflags: UInt)
}

public typealias LPWSAOVERLAPPED_COMPLETION_ROUTINE = LPWSAOVERLAPPED_COMPLETION_ROUTINEFn?

public fun interface LPWSAUSERAPCFn {
    public operator fun invoke(dwcontext: ULong)
}

public typealias LPWSAUSERAPC = LPWSAUSERAPCFn?

public fun interface LPWSCDEINSTALLPROVIDERFn {
    public operator fun invoke(lpproviderid: Long, lperrno: Long): Int
}

public typealias LPWSCDEINSTALLPROVIDER = LPWSCDEINSTALLPROVIDERFn?

public fun interface LPWSCENABLENSPROVIDERFn {
    public operator fun invoke(lpproviderid: Long, fenable: BOOL): Int
}

public typealias LPWSCENABLENSPROVIDER = LPWSCENABLENSPROVIDERFn?

public fun interface LPWSCENUMPROTOCOLSFn {
    public operator fun invoke(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long, lperrno: Long): Int
}

public typealias LPWSCENUMPROTOCOLS = LPWSCENUMPROTOCOLSFn?

public fun interface LPWSCGETPROVIDERPATHFn {
    public operator fun invoke(lpproviderid: Long, lpszproviderdllpath: PWSTR, lpproviderdllpathlen: Long, lperrno: Long): Int
}

public typealias LPWSCGETPROVIDERPATH = LPWSCGETPROVIDERPATHFn?

public fun interface LPWSCINSTALLNAMESPACEFn {
    public operator fun invoke(lpszidentifier: PCWSTR, lpszpathname: PCWSTR, dwnamespace: UInt, dwversion: UInt, lpproviderid: Long): Int
}

public typealias LPWSCINSTALLNAMESPACE = LPWSCINSTALLNAMESPACEFn?

public fun interface LPWSCINSTALLPROVIDERFn {
    public operator fun invoke(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpprotocolinfolist: Long, dwnumberofentries: UInt, lperrno: Long): Int
}

public typealias LPWSCINSTALLPROVIDER = LPWSCINSTALLPROVIDERFn?

public fun interface LPWSCUNINSTALLNAMESPACEFn {
    public operator fun invoke(lpproviderid: Long): Int
}

public typealias LPWSCUNINSTALLNAMESPACE = LPWSCUNINSTALLNAMESPACEFn?

public fun interface LPWSCUPDATEPROVIDERFn {
    public operator fun invoke(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpprotocolinfolist: Long, dwnumberofentries: UInt, lperrno: Long): Int
}

public typealias LPWSCUPDATEPROVIDER = LPWSCUPDATEPROVIDERFn?

public fun interface LPWSCWRITENAMESPACEORDERFn {
    public operator fun invoke(lpproviderid: Long, dwnumberofentries: UInt): Int
}

public typealias LPWSCWRITENAMESPACEORDER = LPWSCWRITENAMESPACEORDERFn?

public fun interface LPWSCWRITEPROVIDERORDERFn {
    public operator fun invoke(lpwdcatalogentryid: Long, dwnumberofentries: UInt): Int
}

public typealias LPWSCWRITEPROVIDERORDER = LPWSCWRITEPROVIDERORDERFn?

public fun interface LPWSPACCEPTFn {
    public operator fun invoke(s: SOCKET, addr: Long, addrlen: Long, lpfncondition: LPCONDITIONPROC, dwcallbackdata: ULong, lperrno: Long): SOCKET
}

public typealias LPWSPACCEPT = LPWSPACCEPTFn?

public fun interface LPWSPADDRESSTOSTRINGFn {
    public operator fun invoke(lpsaaddress: Long, dwaddresslength: UInt, lpprotocolinfo: Long, lpszaddressstring: PWSTR, lpdwaddressstringlength: Long, lperrno: Long): Int
}

public typealias LPWSPADDRESSTOSTRING = LPWSPADDRESSTOSTRINGFn?

public fun interface LPWSPASYNCSELECTFn {
    public operator fun invoke(s: SOCKET, hwnd: Foundation.HWND, wmsg: UInt, levent: Int, lperrno: Long): Int
}

public typealias LPWSPASYNCSELECT = LPWSPASYNCSELECTFn?

public fun interface LPWSPBINDFn {
    public operator fun invoke(s: SOCKET, name: Long, namelen: Int, lperrno: Long): Int
}

public typealias LPWSPBIND = LPWSPBINDFn?

public fun interface LPWSPCANCELBLOCKINGCALLFn {
    public operator fun invoke(lperrno: Long): Int
}

public typealias LPWSPCANCELBLOCKINGCALL = LPWSPCANCELBLOCKINGCALLFn?

public fun interface LPWSPCLEANUPFn {
    public operator fun invoke(lperrno: Long): Int
}

public typealias LPWSPCLEANUP = LPWSPCLEANUPFn?

public fun interface LPWSPCLOSESOCKETFn {
    public operator fun invoke(s: SOCKET, lperrno: Long): Int
}

public typealias LPWSPCLOSESOCKET = LPWSPCLOSESOCKETFn?

public fun interface LPWSPCONNECTFn {
    public operator fun invoke(s: SOCKET, name: Long, namelen: Int, lpcallerdata: Long, lpcalleedata: Long, lpsqos: Long, lpgqos: Long, lperrno: Long): Int
}

public typealias LPWSPCONNECT = LPWSPCONNECTFn?

public fun interface LPWSPDUPLICATESOCKETFn {
    public operator fun invoke(s: SOCKET, dwprocessid: UInt, lpprotocolinfo: Long, lperrno: Long): Int
}

public typealias LPWSPDUPLICATESOCKET = LPWSPDUPLICATESOCKETFn?

public fun interface LPWSPENUMNETWORKEVENTSFn {
    public operator fun invoke(s: SOCKET, heventobject: Foundation.HANDLE, lpnetworkevents: Long, lperrno: Long): Int
}

public typealias LPWSPENUMNETWORKEVENTS = LPWSPENUMNETWORKEVENTSFn?

public fun interface LPWSPEVENTSELECTFn {
    public operator fun invoke(s: SOCKET, heventobject: WSAEVENT, lnetworkevents: Int, lperrno: Long): Int
}

public typealias LPWSPEVENTSELECT = LPWSPEVENTSELECTFn?

public fun interface LPWSPGETOVERLAPPEDRESULTFn {
    public operator fun invoke(s: SOCKET, lpoverlapped: Long, lpcbtransfer: Long, fwait: BOOL, lpdwflags: Long, lperrno: Long): BOOL
}

public typealias LPWSPGETOVERLAPPEDRESULT = LPWSPGETOVERLAPPEDRESULTFn?

public fun interface LPWSPGETPEERNAMEFn {
    public operator fun invoke(s: SOCKET, name: Long, namelen: Long, lperrno: Long): Int
}

public typealias LPWSPGETPEERNAME = LPWSPGETPEERNAMEFn?

public fun interface LPWSPGETQOSBYNAMEFn {
    public operator fun invoke(s: SOCKET, lpqosname: Long, lpqos: Long, lperrno: Long): BOOL
}

public typealias LPWSPGETQOSBYNAME = LPWSPGETQOSBYNAMEFn?

public fun interface LPWSPGETSOCKNAMEFn {
    public operator fun invoke(s: SOCKET, name: Long, namelen: Long, lperrno: Long): Int
}

public typealias LPWSPGETSOCKNAME = LPWSPGETSOCKNAMEFn?

public fun interface LPWSPGETSOCKOPTFn {
    public operator fun invoke(s: SOCKET, level: Int, optname: Int, optval: PSTR, optlen: Long, lperrno: Long): Int
}

public typealias LPWSPGETSOCKOPT = LPWSPGETSOCKOPTFn?

public fun interface LPWSPIOCTLFn {
    public operator fun invoke(s: SOCKET, dwiocontrolcode: UInt, lpvinbuffer: Long, cbinbuffer: UInt, lpvoutbuffer: Long, cboutbuffer: UInt, lpcbbytesreturned: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE, lpthreadid: Long, lperrno: Long): Int
}

public typealias LPWSPIOCTL = LPWSPIOCTLFn?

public fun interface LPWSPJOINLEAFFn {
    public operator fun invoke(s: SOCKET, name: Long, namelen: Int, lpcallerdata: Long, lpcalleedata: Long, lpsqos: Long, lpgqos: Long, dwflags: UInt, lperrno: Long): SOCKET
}

public typealias LPWSPJOINLEAF = LPWSPJOINLEAFFn?

public fun interface LPWSPLISTENFn {
    public operator fun invoke(s: SOCKET, backlog: Int, lperrno: Long): Int
}

public typealias LPWSPLISTEN = LPWSPLISTENFn?

public fun interface LPWSPRECVFn {
    public operator fun invoke(s: SOCKET, lpbuffers: Long, dwbuffercount: UInt, lpnumberofbytesrecvd: Long, lpflags: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE, lpthreadid: Long, lperrno: Long): Int
}

public typealias LPWSPRECV = LPWSPRECVFn?

public fun interface LPWSPRECVDISCONNECTFn {
    public operator fun invoke(s: SOCKET, lpinbounddisconnectdata: Long, lperrno: Long): Int
}

public typealias LPWSPRECVDISCONNECT = LPWSPRECVDISCONNECTFn?

public fun interface LPWSPRECVFROMFn {
    public operator fun invoke(s: SOCKET, lpbuffers: Long, dwbuffercount: UInt, lpnumberofbytesrecvd: Long, lpflags: Long, lpfrom: Long, lpfromlen: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE, lpthreadid: Long, lperrno: Long): Int
}

public typealias LPWSPRECVFROM = LPWSPRECVFROMFn?

public fun interface LPWSPSELECTFn {
    public operator fun invoke(nfds: Int, readfds: Long, writefds: Long, exceptfds: Long, timeout: Long, lperrno: Long): Int
}

public typealias LPWSPSELECT = LPWSPSELECTFn?

public fun interface LPWSPSENDFn {
    public operator fun invoke(s: SOCKET, lpbuffers: Long, dwbuffercount: UInt, lpnumberofbytessent: Long, dwflags: UInt, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE, lpthreadid: Long, lperrno: Long): Int
}

public typealias LPWSPSEND = LPWSPSENDFn?

public fun interface LPWSPSENDDISCONNECTFn {
    public operator fun invoke(s: SOCKET, lpoutbounddisconnectdata: Long, lperrno: Long): Int
}

public typealias LPWSPSENDDISCONNECT = LPWSPSENDDISCONNECTFn?

public fun interface LPWSPSENDTOFn {
    public operator fun invoke(s: SOCKET, lpbuffers: Long, dwbuffercount: UInt, lpnumberofbytessent: Long, dwflags: UInt, lpto: Long, itolen: Int, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE, lpthreadid: Long, lperrno: Long): Int
}

public typealias LPWSPSENDTO = LPWSPSENDTOFn?

public fun interface LPWSPSETSOCKOPTFn {
    public operator fun invoke(s: SOCKET, level: Int, optname: Int, optval: PCSTR, optlen: Int, lperrno: Long): Int
}

public typealias LPWSPSETSOCKOPT = LPWSPSETSOCKOPTFn?

public fun interface LPWSPSHUTDOWNFn {
    public operator fun invoke(s: SOCKET, how: Int, lperrno: Long): Int
}

public typealias LPWSPSHUTDOWN = LPWSPSHUTDOWNFn?

public fun interface LPWSPSOCKETFn {
    public operator fun invoke(af: Int, type: Int, protocol: Int, lpprotocolinfo: Long, g: UInt, dwflags: UInt, lperrno: Long): SOCKET
}

public typealias LPWSPSOCKET = LPWSPSOCKETFn?

public fun interface LPWSPSTARTUPFn {
    public operator fun invoke(wversionrequested: UShort, lpwspdata: Long, lpprotocolinfo: Long, upcalltable: WSPUPCALLTABLE, lpproctable: Long): Int
}

public typealias LPWSPSTARTUP = LPWSPSTARTUPFn?

public fun interface LPWSPSTRINGTOADDRESSFn {
    public operator fun invoke(addressstring: PCWSTR, addressfamily: Int, lpprotocolinfo: Long, lpaddress: Long, lpaddresslength: Long, lperrno: Long): Int
}

public typealias LPWSPSTRINGTOADDRESS = LPWSPSTRINGTOADDRESSFn?

public typealias MLD_MAX_RESP_CODE_TYPE = Int

public typealias MULTICAST_MODE_TYPE = Int

public typealias NAPI_PROVIDER_LEVEL = Int

public typealias NAPI_PROVIDER_TYPE = Int

public typealias ND_OPTION_TYPE = Int

public typealias NLA_BLOB_DATA_TYPE = Int

public typealias NLA_CONNECTIVITY_TYPE = Int

public typealias NLA_INTERNET = Int

public typealias NL_ADDRESS_TYPE = Int

public typealias NL_BANDWIDTH_FLAG = Int

public typealias NL_DAD_STATE = Int

public typealias NL_INTERFACE_NETWORK_CATEGORY_STATE = Int

public typealias NL_LINK_LOCAL_ADDRESS_BEHAVIOR = Int

public typealias NL_NEIGHBOR_STATE = Int

public typealias NL_NETWORK_CATEGORY = Int

public typealias NL_NETWORK_CONNECTIVITY_COST_HINT = Int

public typealias NL_NETWORK_CONNECTIVITY_LEVEL_HINT = Int

public typealias NL_PREFIX_ORIGIN = Int

public typealias NL_ROUTER_DISCOVERY_BEHAVIOR = Int

public typealias NL_ROUTE_ORIGIN = Int

public typealias NL_ROUTE_PROTOCOL = Int

public typealias NL_SUFFIX_ORIGIN = Int

public typealias NPI_MODULEID_TYPE = Int

public typealias PMTUD_STATE = Int

public typealias Q2931_IE_TYPE = Int

public typealias RCVALL_VALUE = Int

public typealias RESOURCE_DISPLAY_TYPE = UInt

public typealias RIO_BUFFERID = Long

public typealias RIO_CQ = Long

public typealias RIO_NOTIFICATION_COMPLETION_TYPE = Int

public typealias RIO_RQ = Long

public typealias SCOPE_LEVEL = Int

public typealias SEND_RECV_FLAGS = Int

public typealias SET_SERVICE_OPERATION = UInt

public typealias SOCKET = ULong

public typealias SOCKET_PRIORITY_HINT = Int

public typealias SOCKET_SECURITY_PROTOCOL = Int

public typealias SOCKET_USAGE_TYPE = Int

public typealias TCPSTATE = Int

public typealias TCP_ICW_LEVEL = Int

public typealias TUNNEL_SUB_TYPE = Int

public typealias WINSOCK_SHUTDOWN_HOW = Int

public typealias WINSOCK_SOCKET_TYPE = Int

public typealias WSACOMPLETIONTYPE = Int

public typealias WSAECOMPARATOR = Int

public typealias WSAESETSERVICEOP = Int

public typealias WSAEVENT = Long

public typealias WSAPOLL_EVENT_FLAGS = Short

public typealias WSA_COMPATIBILITY_BEHAVIOR_ID = Int

public typealias WSA_ERROR = Int

public typealias WSC_PROVIDER_INFO_TYPE = Int

public typealias eWINDOW_ADVANCE_METHOD = Int

public typealias socklen_t = Int
