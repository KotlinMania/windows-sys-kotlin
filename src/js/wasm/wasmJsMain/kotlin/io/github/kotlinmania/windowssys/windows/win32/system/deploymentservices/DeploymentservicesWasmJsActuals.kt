@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public actual fun PxeAsyncRecvDone(hclientrequest: HANDLE, action: UInt): UInt =
    0u

public actual fun PxeDhcpAppendOption(preplypacket: Long, umaxreplypacketlen: UInt, pureplypacketlen: Long, boption: UByte, boptionlen: UByte, pvalue: Long): UInt =
    0u

public actual fun PxeDhcpAppendOptionRaw(preplypacket: Long, umaxreplypacketlen: UInt, pureplypacketlen: Long, ubufferlen: UShort, pbuffer: Long): UInt =
    0u

public actual fun PxeDhcpGetOptionValue(ppacket: Long, upacketlen: UInt, uinstance: UInt, boption: UByte, pboptionlen: Long, ppoptionvalue: Long): UInt =
    0u

public actual fun PxeDhcpGetVendorOptionValue(ppacket: Long, upacketlen: UInt, boption: UByte, uinstance: UInt, pboptionlen: Long, ppoptionvalue: Long): UInt =
    0u

public actual fun PxeDhcpInitialize(precvpacket: Long, urecvpacketlen: UInt, preplypacket: Long, umaxreplypacketlen: UInt, pureplypacketlen: Long): UInt =
    0u

public actual fun PxeDhcpIsValid(ppacket: Long, upacketlen: UInt, brequestpacket: BOOL, pbpxeoptionpresent: Long): UInt =
    0u

public actual fun PxeDhcpv6AppendOption(preply: Long, cbreply: UInt, pcbreplyused: Long, woptiontype: UShort, cboption: UShort, poption: Long): UInt =
    0u

public actual fun PxeDhcpv6AppendOptionRaw(preply: Long, cbreply: UInt, pcbreplyused: Long, cbbuffer: UShort, pbuffer: Long): UInt =
    0u

public actual fun PxeDhcpv6CreateRelayRepl(prelaymessages: Long, nrelaymessages: UInt, pinnerpacket: Long, cbinnerpacket: UInt, preplybuffer: Long, cbreplybuffer: UInt, pcbreplybuffer: Long): UInt =
    0u

public actual fun PxeDhcpv6GetOptionValue(ppacket: Long, upacketlen: UInt, uinstance: UInt, woption: UShort, pwoptionlen: Long, ppoptionvalue: Long): UInt =
    0u

public actual fun PxeDhcpv6GetVendorOptionValue(ppacket: Long, upacketlen: UInt, dwenterprisenumber: UInt, woption: UShort, uinstance: UInt, pwoptionlen: Long, ppoptionvalue: Long): UInt =
    0u

public actual fun PxeDhcpv6Initialize(prequest: Long, cbrequest: UInt, preply: Long, cbreply: UInt, pcbreplyused: Long): UInt =
    0u

public actual fun PxeDhcpv6IsValid(ppacket: Long, upacketlen: UInt, brequestpacket: BOOL, pbpxeoptionpresent: Long): UInt =
    0u

public actual fun PxeDhcpv6ParseRelayForw(prelayforwpacket: Long, urelayforwpacketlen: UInt, prelaymessages: Long, nrelaymessages: UInt, pnrelaymessages: Long, ppinnerpacket: Long, pcbinnerpacket: Long): UInt =
    0u

public actual fun PxeGetServerInfo(uinfotype: UInt, pbuffer: Long, ubufferlen: UInt): UInt =
    0u

public actual fun PxeGetServerInfoEx(uinfotype: UInt, pbuffer: Long, ubufferlen: UInt, pubufferused: Long): UInt =
    0u

public actual fun PxePacketAllocate(hprovider: HANDLE, hclientrequest: HANDLE, usize: UInt): Long =
    0L

public actual fun PxePacketFree(hprovider: HANDLE, hclientrequest: HANDLE, ppacket: Long): UInt =
    0u

public actual fun PxeProviderEnumClose(henum: HANDLE): UInt =
    0u

public actual fun PxeProviderEnumFirst(phenum: Long): UInt =
    0u

public actual fun PxeProviderEnumNext(henum: HANDLE, ppprovider: Long): UInt =
    0u

public actual fun PxeProviderFreeInfo(pprovider: Long): UInt =
    0u

public actual fun PxeProviderQueryIndex(pszprovidername: PCWSTR, puindex: Long): UInt =
    0u

public actual fun PxeProviderRegister(pszprovidername: PCWSTR, pszmodulepath: PCWSTR, index: UInt, biscritical: BOOL, phproviderkey: Long): UInt =
    0u

public actual fun PxeProviderSetAttribute(hprovider: HANDLE, attribute: UInt, pparameterbuffer: Long, uparamlen: UInt): UInt =
    0u

public actual fun PxeProviderUnRegister(pszprovidername: PCWSTR): UInt =
    0u

public actual fun PxeRegisterCallback(hprovider: HANDLE, callbacktype: UInt, pcallbackfunction: Long, pcontext: Long): UInt =
    0u

public actual fun PxeSendReply(hclientrequest: HANDLE, ppacket: Long, upacketlen: UInt, paddress: Long): UInt =
    0u

public actual fun PxeTrace(hprovider: HANDLE, severity: UInt, pszformat: PCWSTR): UInt =
    0u

public actual fun PxeTraceV(hprovider: HANDLE, severity: UInt, pszformat: PCWSTR, params: Long): UInt =
    0u

public actual fun WdsBpAddOption(hhandle: HANDLE, uoption: UInt, uvaluelen: UInt, pvalue: Long): UInt =
    0u

public actual fun WdsBpCloseHandle(hhandle: HANDLE): UInt =
    0u

public actual fun WdsBpGetOptionBuffer(hhandle: HANDLE, ubufferlen: UInt, pbuffer: Long, pubytes: Long): UInt =
    0u

public actual fun WdsBpInitialize(bpackettype: UByte, phhandle: Long): UInt =
    0u

public actual fun WdsBpParseInitialize(ppacket: Long, upacketlen: UInt, pbpackettype: Long, phhandle: Long): UInt =
    0u

public actual fun WdsBpParseInitializev6(ppacket: Long, upacketlen: UInt, pbpackettype: Long, phhandle: Long): UInt =
    0u

public actual fun WdsBpQueryOption(hhandle: HANDLE, uoption: UInt, uvaluelen: UInt, pvalue: Long, pubytes: Long): UInt =
    0u

public actual fun WdsCliAuthorizeSession(hsession: HANDLE, pcred: Long): HRESULT =
    0

public actual fun WdsCliCancelTransfer(htransfer: HANDLE): HRESULT =
    0

public actual fun WdsCliClose(handle: HANDLE): HRESULT =
    0

public actual fun WdsCliCreateSession(pwszserver: PCWSTR, pcred: Long, phsession: Long): HRESULT =
    0

public actual fun WdsCliFindFirstImage(hsession: HANDLE, phfindhandle: Long): HRESULT =
    0

public actual fun WdsCliFindNextImage(handle: HANDLE): HRESULT =
    0

public actual fun WdsCliFreeStringArray(ppwszarray: Long, ulcount: UInt): HRESULT =
    0

public actual fun WdsCliGetDriverQueryXml(pwszwindirpath: PCWSTR, ppwszdriverquery: Long): HRESULT =
    0

public actual fun WdsCliGetEnumerationFlags(handle: HANDLE, pdwflags: Long): HRESULT =
    0

public actual fun WdsCliGetImageArchitecture(hifh: HANDLE, pdwvalue: Long): HRESULT =
    0

public actual fun WdsCliGetImageDescription(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    0

public actual fun WdsCliGetImageFiles(hifh: HANDLE, pppwszfiles: Long, pdwcount: Long): HRESULT =
    0

public actual fun WdsCliGetImageGroup(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    0

public actual fun WdsCliGetImageHalName(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    0

public actual fun WdsCliGetImageHandleFromFindHandle(findhandle: HANDLE, phimagehandle: Long): HRESULT =
    0

public actual fun WdsCliGetImageHandleFromTransferHandle(htransfer: HANDLE, phimagehandle: Long): HRESULT =
    0

public actual fun WdsCliGetImageIndex(hifh: HANDLE, pdwvalue: Long): HRESULT =
    0

public actual fun WdsCliGetImageLanguage(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    0

public actual fun WdsCliGetImageLanguages(hifh: HANDLE, pppszvalues: Long, pdwnumvalues: Long): HRESULT =
    0

public actual fun WdsCliGetImageLastModifiedTime(hifh: HANDLE, ppsystimevalue: Long): HRESULT =
    0

public actual fun WdsCliGetImageName(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    0

public actual fun WdsCliGetImageNamespace(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    0

public actual fun WdsCliGetImageParameter(hifh: HANDLE, paramtype: WDS_CLI_IMAGE_PARAM_TYPE, presponse: Long, uresponselen: UInt): HRESULT =
    0

public actual fun WdsCliGetImagePath(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    0

public actual fun WdsCliGetImageSize(hifh: HANDLE, pullvalue: Long): HRESULT =
    0

public actual fun WdsCliGetImageType(hifh: HANDLE, pimagetype: Long): HRESULT =
    0

public actual fun WdsCliGetImageVersion(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    0

public actual fun WdsCliGetTransferSize(hifh: HANDLE, pullvalue: Long): HRESULT =
    0

public actual fun WdsCliInitializeLog(hsession: HANDLE, ulclientarchitecture: CPU_ARCHITECTURE, pwszclientid: PCWSTR, pwszclientaddress: PCWSTR): HRESULT =
    0

public actual fun WdsCliLog(hsession: HANDLE, ulloglevel: UInt, ulmessagecode: UInt): HRESULT =
    0

public actual fun WdsCliObtainDriverPackages(himage: HANDLE, ppwszservername: Long, pppwszdriverpackages: Long, pulcount: Long): HRESULT =
    0

public actual fun WdsCliObtainDriverPackagesEx(hsession: HANDLE, pwszmachineinfo: PCWSTR, ppwszservername: Long, pppwszdriverpackages: Long, pulcount: Long): HRESULT =
    0

public actual fun WdsCliRegisterTrace(pfn: PFN_WdsCliTraceFunction): HRESULT =
    0

public actual fun WdsCliSetTransferBufferSize(ulsizeinbytes: UInt) {
}

public actual fun WdsCliTransferFile(pwszserver: PCWSTR, pwsznamespace: PCWSTR, pwszremotefilepath: PCWSTR, pwszlocalfilepath: PCWSTR, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PFN_WdsCliCallback, pvuserdata: Long, phtransfer: Long): HRESULT =
    0

public actual fun WdsCliTransferImage(himage: HANDLE, pwszlocalpath: PCWSTR, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PFN_WdsCliCallback, pvuserdata: Long, phtransfer: Long): HRESULT =
    0

public actual fun WdsCliWaitForTransfer(htransfer: HANDLE): HRESULT =
    0

public actual fun WdsTransportClientAddRefBuffer(pvbuffer: Long): UInt =
    0u

public actual fun WdsTransportClientCancelSession(hsessionkey: HANDLE): UInt =
    0u

public actual fun WdsTransportClientCancelSessionEx(hsessionkey: HANDLE, dwerrorcode: UInt): UInt =
    0u

public actual fun WdsTransportClientCloseSession(hsessionkey: HANDLE): UInt =
    0u

public actual fun WdsTransportClientCompleteReceive(hsessionkey: HANDLE, ulsize: UInt, pulloffset: Long): UInt =
    0u

public actual fun WdsTransportClientInitialize(): UInt =
    0u

public actual fun WdsTransportClientInitializeSession(psessionrequest: Long, pcallerdata: Long, hsessionkey: Long): UInt =
    0u

public actual fun WdsTransportClientQueryStatus(hsessionkey: HANDLE, pustatus: Long, puerrorcode: Long): UInt =
    0u

public actual fun WdsTransportClientRegisterCallback(hsessionkey: HANDLE, callbackid: TRANSPORTCLIENT_CALLBACK_ID, pfncallback: Long): UInt =
    0u

public actual fun WdsTransportClientReleaseBuffer(pvbuffer: Long): UInt =
    0u

public actual fun WdsTransportClientShutdown(): UInt =
    0u

public actual fun WdsTransportClientStartSession(hsessionkey: HANDLE): UInt =
    0u

public actual fun WdsTransportClientWaitForCompletion(hsessionkey: HANDLE, utimeout: UInt): UInt =
    0u

public actual fun WdsTransportServerAllocateBuffer(hprovider: HANDLE, ulbuffersize: UInt): Long =
    0L

public actual fun WdsTransportServerCompleteRead(hprovider: HANDLE, ulbytesread: UInt, pvuserdata: Long, hreadresult: HRESULT): HRESULT =
    0

public actual fun WdsTransportServerFreeBuffer(hprovider: HANDLE, pvbuffer: Long): HRESULT =
    0

public actual fun WdsTransportServerRegisterCallback(hprovider: HANDLE, callbackid: TRANSPORTPROVIDER_CALLBACK_ID, pfncallback: Long): HRESULT =
    0

public actual fun WdsTransportServerTrace(hprovider: HANDLE, severity: UInt, pwszformat: PCWSTR): HRESULT =
    0

public actual fun WdsTransportServerTraceV(hprovider: HANDLE, severity: UInt, pwszformat: PCWSTR, params: Long): HRESULT =
    0
