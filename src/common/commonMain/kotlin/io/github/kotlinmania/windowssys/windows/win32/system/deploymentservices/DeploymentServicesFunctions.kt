package io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public expect fun PxeAsyncRecvDone(hclientrequest: HANDLE, action: UInt): UInt

public expect fun PxeDhcpAppendOption(preplypacket: Long, umaxreplypacketlen: UInt, pureplypacketlen: Long, boption: UByte, boptionlen: UByte, pvalue: Long): UInt

public expect fun PxeDhcpAppendOptionRaw(preplypacket: Long, umaxreplypacketlen: UInt, pureplypacketlen: Long, ubufferlen: UShort, pbuffer: Long): UInt

public expect fun PxeDhcpGetOptionValue(ppacket: Long, upacketlen: UInt, uinstance: UInt, boption: UByte, pboptionlen: Long, ppoptionvalue: Long): UInt

public expect fun PxeDhcpGetVendorOptionValue(ppacket: Long, upacketlen: UInt, boption: UByte, uinstance: UInt, pboptionlen: Long, ppoptionvalue: Long): UInt

public expect fun PxeDhcpInitialize(precvpacket: Long, urecvpacketlen: UInt, preplypacket: Long, umaxreplypacketlen: UInt, pureplypacketlen: Long): UInt

public expect fun PxeDhcpIsValid(ppacket: Long, upacketlen: UInt, brequestpacket: BOOL, pbpxeoptionpresent: Long): UInt

public expect fun PxeDhcpv6AppendOption(preply: Long, cbreply: UInt, pcbreplyused: Long, woptiontype: UShort, cboption: UShort, poption: Long): UInt

public expect fun PxeDhcpv6AppendOptionRaw(preply: Long, cbreply: UInt, pcbreplyused: Long, cbbuffer: UShort, pbuffer: Long): UInt

public expect fun PxeDhcpv6CreateRelayRepl(prelaymessages: Long, nrelaymessages: UInt, pinnerpacket: Long, cbinnerpacket: UInt, preplybuffer: Long, cbreplybuffer: UInt, pcbreplybuffer: Long): UInt

public expect fun PxeDhcpv6GetOptionValue(ppacket: Long, upacketlen: UInt, uinstance: UInt, woption: UShort, pwoptionlen: Long, ppoptionvalue: Long): UInt

public expect fun PxeDhcpv6GetVendorOptionValue(ppacket: Long, upacketlen: UInt, dwenterprisenumber: UInt, woption: UShort, uinstance: UInt, pwoptionlen: Long, ppoptionvalue: Long): UInt

public expect fun PxeDhcpv6Initialize(prequest: Long, cbrequest: UInt, preply: Long, cbreply: UInt, pcbreplyused: Long): UInt

public expect fun PxeDhcpv6IsValid(ppacket: Long, upacketlen: UInt, brequestpacket: BOOL, pbpxeoptionpresent: Long): UInt

public expect fun PxeDhcpv6ParseRelayForw(prelayforwpacket: Long, urelayforwpacketlen: UInt, prelaymessages: Long, nrelaymessages: UInt, pnrelaymessages: Long, ppinnerpacket: Long, pcbinnerpacket: Long): UInt

public expect fun PxeGetServerInfo(uinfotype: UInt, pbuffer: Long, ubufferlen: UInt): UInt

public expect fun PxeGetServerInfoEx(uinfotype: UInt, pbuffer: Long, ubufferlen: UInt, pubufferused: Long): UInt

public expect fun PxePacketAllocate(hprovider: HANDLE, hclientrequest: HANDLE, usize: UInt): Long

public expect fun PxePacketFree(hprovider: HANDLE, hclientrequest: HANDLE, ppacket: Long): UInt

public expect fun PxeProviderEnumClose(henum: HANDLE): UInt

public expect fun PxeProviderEnumFirst(phenum: Long): UInt

public expect fun PxeProviderEnumNext(henum: HANDLE, ppprovider: Long): UInt

public expect fun PxeProviderFreeInfo(pprovider: Long): UInt

public expect fun PxeProviderQueryIndex(pszprovidername: PCWSTR, puindex: Long): UInt

public expect fun PxeProviderRegister(pszprovidername: PCWSTR, pszmodulepath: PCWSTR, index: UInt, biscritical: BOOL, phproviderkey: Long): UInt

public expect fun PxeProviderSetAttribute(hprovider: HANDLE, attribute: UInt, pparameterbuffer: Long, uparamlen: UInt): UInt

public expect fun PxeProviderUnRegister(pszprovidername: PCWSTR): UInt

public expect fun PxeRegisterCallback(hprovider: HANDLE, callbacktype: UInt, pcallbackfunction: Long, pcontext: Long): UInt

public expect fun PxeSendReply(hclientrequest: HANDLE, ppacket: Long, upacketlen: UInt, paddress: Long): UInt

public expect fun PxeTrace(hprovider: HANDLE, severity: UInt, pszformat: PCWSTR, vararg variadicArgs: Long): UInt

public expect fun PxeTraceV(hprovider: HANDLE, severity: UInt, pszformat: PCWSTR, params: Long): UInt

public expect fun WdsBpAddOption(hhandle: HANDLE, uoption: UInt, uvaluelen: UInt, pvalue: Long): UInt

public expect fun WdsBpCloseHandle(hhandle: HANDLE): UInt

public expect fun WdsBpGetOptionBuffer(hhandle: HANDLE, ubufferlen: UInt, pbuffer: Long, pubytes: Long): UInt

public expect fun WdsBpInitialize(bpackettype: UByte, phhandle: Long): UInt

public expect fun WdsBpParseInitialize(ppacket: Long, upacketlen: UInt, pbpackettype: Long, phhandle: Long): UInt

public expect fun WdsBpParseInitializev6(ppacket: Long, upacketlen: UInt, pbpackettype: Long, phhandle: Long): UInt

public expect fun WdsBpQueryOption(hhandle: HANDLE, uoption: UInt, uvaluelen: UInt, pvalue: Long, pubytes: Long): UInt

public expect fun WdsCliAuthorizeSession(hsession: HANDLE, pcred: Long): HRESULT

public expect fun WdsCliCancelTransfer(htransfer: HANDLE): HRESULT

public expect fun WdsCliClose(handle: HANDLE): HRESULT

public expect fun WdsCliCreateSession(pwszserver: PCWSTR, pcred: Long, phsession: Long): HRESULT

public expect fun WdsCliFindFirstImage(hsession: HANDLE, phfindhandle: Long): HRESULT

public expect fun WdsCliFindNextImage(handle: HANDLE): HRESULT

public expect fun WdsCliFreeStringArray(ppwszarray: Long, ulcount: UInt): HRESULT

public expect fun WdsCliGetDriverQueryXml(pwszwindirpath: PCWSTR, ppwszdriverquery: Long): HRESULT

public expect fun WdsCliGetEnumerationFlags(handle: HANDLE, pdwflags: Long): HRESULT

public expect fun WdsCliGetImageArchitecture(hifh: HANDLE, pdwvalue: Long): HRESULT

public expect fun WdsCliGetImageDescription(hifh: HANDLE, ppwszvalue: Long): HRESULT

public expect fun WdsCliGetImageFiles(hifh: HANDLE, pppwszfiles: Long, pdwcount: Long): HRESULT

public expect fun WdsCliGetImageGroup(hifh: HANDLE, ppwszvalue: Long): HRESULT

public expect fun WdsCliGetImageHalName(hifh: HANDLE, ppwszvalue: Long): HRESULT

public expect fun WdsCliGetImageHandleFromFindHandle(findhandle: HANDLE, phimagehandle: Long): HRESULT

public expect fun WdsCliGetImageHandleFromTransferHandle(htransfer: HANDLE, phimagehandle: Long): HRESULT

public expect fun WdsCliGetImageIndex(hifh: HANDLE, pdwvalue: Long): HRESULT

public expect fun WdsCliGetImageLanguage(hifh: HANDLE, ppwszvalue: Long): HRESULT

public expect fun WdsCliGetImageLanguages(hifh: HANDLE, pppszvalues: Long, pdwnumvalues: Long): HRESULT

public expect fun WdsCliGetImageLastModifiedTime(hifh: HANDLE, ppsystimevalue: Long): HRESULT

public expect fun WdsCliGetImageName(hifh: HANDLE, ppwszvalue: Long): HRESULT

public expect fun WdsCliGetImageNamespace(hifh: HANDLE, ppwszvalue: Long): HRESULT

public expect fun WdsCliGetImageParameter(hifh: HANDLE, paramtype: WDS_CLI_IMAGE_PARAM_TYPE, presponse: Long, uresponselen: UInt): HRESULT

public expect fun WdsCliGetImagePath(hifh: HANDLE, ppwszvalue: Long): HRESULT

public expect fun WdsCliGetImageSize(hifh: HANDLE, pullvalue: Long): HRESULT

public expect fun WdsCliGetImageType(hifh: HANDLE, pimagetype: Long): HRESULT

public expect fun WdsCliGetImageVersion(hifh: HANDLE, ppwszvalue: Long): HRESULT

public expect fun WdsCliGetTransferSize(hifh: HANDLE, pullvalue: Long): HRESULT

public expect fun WdsCliInitializeLog(hsession: HANDLE, ulclientarchitecture: CPU_ARCHITECTURE, pwszclientid: PCWSTR, pwszclientaddress: PCWSTR): HRESULT

public expect fun WdsCliLog(hsession: HANDLE, ulloglevel: UInt, ulmessagecode: UInt, vararg variadicArgs: Long): HRESULT

public expect fun WdsCliObtainDriverPackages(himage: HANDLE, ppwszservername: Long, pppwszdriverpackages: Long, pulcount: Long): HRESULT

public expect fun WdsCliObtainDriverPackagesEx(hsession: HANDLE, pwszmachineinfo: PCWSTR, ppwszservername: Long, pppwszdriverpackages: Long, pulcount: Long): HRESULT

public expect fun WdsCliRegisterTrace(pfn: PFN_WdsCliTraceFunction): HRESULT

public expect fun WdsCliSetTransferBufferSize(ulsizeinbytes: UInt)

public expect fun WdsCliTransferFile(pwszserver: PCWSTR, pwsznamespace: PCWSTR, pwszremotefilepath: PCWSTR, pwszlocalfilepath: PCWSTR, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PFN_WdsCliCallback, pvuserdata: Long, phtransfer: Long): HRESULT

public expect fun WdsCliTransferImage(himage: HANDLE, pwszlocalpath: PCWSTR, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PFN_WdsCliCallback, pvuserdata: Long, phtransfer: Long): HRESULT

public expect fun WdsCliWaitForTransfer(htransfer: HANDLE): HRESULT

public expect fun WdsTransportClientAddRefBuffer(pvbuffer: Long): UInt

public expect fun WdsTransportClientCancelSession(hsessionkey: HANDLE): UInt

public expect fun WdsTransportClientCancelSessionEx(hsessionkey: HANDLE, dwerrorcode: UInt): UInt

public expect fun WdsTransportClientCloseSession(hsessionkey: HANDLE): UInt

public expect fun WdsTransportClientCompleteReceive(hsessionkey: HANDLE, ulsize: UInt, pulloffset: Long): UInt

public expect fun WdsTransportClientInitialize(): UInt

public expect fun WdsTransportClientInitializeSession(psessionrequest: Long, pcallerdata: Long, hsessionkey: Long): UInt

public expect fun WdsTransportClientQueryStatus(hsessionkey: HANDLE, pustatus: Long, puerrorcode: Long): UInt

public expect fun WdsTransportClientRegisterCallback(hsessionkey: HANDLE, callbackid: TRANSPORTCLIENT_CALLBACK_ID, pfncallback: Long): UInt

public expect fun WdsTransportClientReleaseBuffer(pvbuffer: Long): UInt

public expect fun WdsTransportClientShutdown(): UInt

public expect fun WdsTransportClientStartSession(hsessionkey: HANDLE): UInt

public expect fun WdsTransportClientWaitForCompletion(hsessionkey: HANDLE, utimeout: UInt): UInt

public expect fun WdsTransportServerAllocateBuffer(hprovider: HANDLE, ulbuffersize: UInt): Long

public expect fun WdsTransportServerCompleteRead(hprovider: HANDLE, ulbytesread: UInt, pvuserdata: Long, hreadresult: HRESULT): HRESULT

public expect fun WdsTransportServerFreeBuffer(hprovider: HANDLE, pvbuffer: Long): HRESULT

public expect fun WdsTransportServerRegisterCallback(hprovider: HANDLE, callbackid: TRANSPORTPROVIDER_CALLBACK_ID, pfncallback: Long): HRESULT

public expect fun WdsTransportServerTrace(hprovider: HANDLE, severity: UInt, pwszformat: PCWSTR, vararg variadicArgs: Long): HRESULT

public expect fun WdsTransportServerTraceV(hprovider: HANDLE, severity: UInt, pwszformat: PCWSTR, params: Long): HRESULT
