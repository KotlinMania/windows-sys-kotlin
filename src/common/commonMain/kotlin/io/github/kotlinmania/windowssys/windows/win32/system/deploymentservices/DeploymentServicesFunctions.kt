package io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM

public fun interface FnCallback {
    public operator fun invoke(pwszformat: PCWSTR, params: Long)
}

public fun interface FnCallback1 {
    public operator fun invoke(dwmessageid: PFN_WDS_CLI_CALLBACK_MESSAGE_ID, wparam: WPARAM, lparam: LPARAM, pvuserdata: Long)
}

public fun PxeAsyncRecvDone(hclientrequest: HANDLE, action: UInt): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeAsyncRecvDone", longArrayOf(hclientrequest, action.toLong())).toUInt()
}

public fun PxeDhcpAppendOption(preplypacket: Long, umaxreplypacketlen: UInt, pureplypacketlen: Long, boption: UByte, boptionlen: UByte, pvalue: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeDhcpAppendOption", longArrayOf(preplypacket, umaxreplypacketlen.toLong(), pureplypacketlen, boption.toLong(), boptionlen.toLong(), pvalue)).toUInt()
}

public fun PxeDhcpAppendOptionRaw(preplypacket: Long, umaxreplypacketlen: UInt, pureplypacketlen: Long, ubufferlen: UShort, pbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeDhcpAppendOptionRaw", longArrayOf(preplypacket, umaxreplypacketlen.toLong(), pureplypacketlen, ubufferlen.toLong(), pbuffer)).toUInt()
}

public fun PxeDhcpGetOptionValue(ppacket: Long, upacketlen: UInt, uinstance: UInt, boption: UByte, pboptionlen: Long, ppoptionvalue: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeDhcpGetOptionValue", longArrayOf(ppacket, upacketlen.toLong(), uinstance.toLong(), boption.toLong(), pboptionlen, ppoptionvalue)).toUInt()
}

public fun PxeDhcpGetVendorOptionValue(ppacket: Long, upacketlen: UInt, boption: UByte, uinstance: UInt, pboptionlen: Long, ppoptionvalue: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeDhcpGetVendorOptionValue", longArrayOf(ppacket, upacketlen.toLong(), boption.toLong(), uinstance.toLong(), pboptionlen, ppoptionvalue)).toUInt()
}

public fun PxeDhcpInitialize(precvpacket: Long, urecvpacketlen: UInt, preplypacket: Long, umaxreplypacketlen: UInt, pureplypacketlen: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeDhcpInitialize", longArrayOf(precvpacket, urecvpacketlen.toLong(), preplypacket, umaxreplypacketlen.toLong(), pureplypacketlen)).toUInt()
}

public fun PxeDhcpIsValid(ppacket: Long, upacketlen: UInt, brequestpacket: BOOL, pbpxeoptionpresent: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeDhcpIsValid", longArrayOf(ppacket, upacketlen.toLong(), brequestpacket.toLong(), pbpxeoptionpresent)).toUInt()
}

public fun PxeDhcpv6AppendOption(preply: Long, cbreply: UInt, pcbreplyused: Long, woptiontype: UShort, cboption: UShort, poption: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeDhcpv6AppendOption", longArrayOf(preply, cbreply.toLong(), pcbreplyused, woptiontype.toLong(), cboption.toLong(), poption)).toUInt()
}

public fun PxeDhcpv6AppendOptionRaw(preply: Long, cbreply: UInt, pcbreplyused: Long, cbbuffer: UShort, pbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeDhcpv6AppendOptionRaw", longArrayOf(preply, cbreply.toLong(), pcbreplyused, cbbuffer.toLong(), pbuffer)).toUInt()
}

public fun PxeDhcpv6CreateRelayRepl(prelaymessages: Long, nrelaymessages: UInt, pinnerpacket: Long, cbinnerpacket: UInt, preplybuffer: Long, cbreplybuffer: UInt, pcbreplybuffer: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeDhcpv6CreateRelayRepl", longArrayOf(prelaymessages, nrelaymessages.toLong(), pinnerpacket, cbinnerpacket.toLong(), preplybuffer, cbreplybuffer.toLong(), pcbreplybuffer)).toUInt()
}

public fun PxeDhcpv6GetOptionValue(ppacket: Long, upacketlen: UInt, uinstance: UInt, woption: UShort, pwoptionlen: Long, ppoptionvalue: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeDhcpv6GetOptionValue", longArrayOf(ppacket, upacketlen.toLong(), uinstance.toLong(), woption.toLong(), pwoptionlen, ppoptionvalue)).toUInt()
}

public fun PxeDhcpv6GetVendorOptionValue(ppacket: Long, upacketlen: UInt, dwenterprisenumber: UInt, woption: UShort, uinstance: UInt, pwoptionlen: Long, ppoptionvalue: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeDhcpv6GetVendorOptionValue", longArrayOf(ppacket, upacketlen.toLong(), dwenterprisenumber.toLong(), woption.toLong(), uinstance.toLong(), pwoptionlen, ppoptionvalue)).toUInt()
}

public fun PxeDhcpv6Initialize(prequest: Long, cbrequest: UInt, preply: Long, cbreply: UInt, pcbreplyused: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeDhcpv6Initialize", longArrayOf(prequest, cbrequest.toLong(), preply, cbreply.toLong(), pcbreplyused)).toUInt()
}

public fun PxeDhcpv6IsValid(ppacket: Long, upacketlen: UInt, brequestpacket: BOOL, pbpxeoptionpresent: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeDhcpv6IsValid", longArrayOf(ppacket, upacketlen.toLong(), brequestpacket.toLong(), pbpxeoptionpresent)).toUInt()
}

public fun PxeDhcpv6ParseRelayForw(prelayforwpacket: Long, urelayforwpacketlen: UInt, prelaymessages: Long, nrelaymessages: UInt, pnrelaymessages: Long, ppinnerpacket: Long, pcbinnerpacket: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeDhcpv6ParseRelayForw", longArrayOf(prelayforwpacket, urelayforwpacketlen.toLong(), prelaymessages, nrelaymessages.toLong(), pnrelaymessages, ppinnerpacket, pcbinnerpacket)).toUInt()
}

public fun PxeGetServerInfo(uinfotype: UInt, pbuffer: Long, ubufferlen: UInt): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeGetServerInfo", longArrayOf(uinfotype.toLong(), pbuffer, ubufferlen.toLong())).toUInt()
}

public fun PxeGetServerInfoEx(uinfotype: UInt, pbuffer: Long, ubufferlen: UInt, pubufferused: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeGetServerInfoEx", longArrayOf(uinfotype.toLong(), pbuffer, ubufferlen.toLong(), pubufferused)).toUInt()
}

public fun PxePacketAllocate(hprovider: HANDLE, hclientrequest: HANDLE, usize: UInt): Long {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxePacketAllocate", longArrayOf(hprovider, hclientrequest, usize.toLong()))
}

public fun PxePacketFree(hprovider: HANDLE, hclientrequest: HANDLE, ppacket: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxePacketFree", longArrayOf(hprovider, hclientrequest, ppacket)).toUInt()
}

public fun PxeProviderEnumClose(henum: HANDLE): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeProviderEnumClose", longArrayOf(henum)).toUInt()
}

public fun PxeProviderEnumFirst(phenum: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeProviderEnumFirst", longArrayOf(phenum)).toUInt()
}

public fun PxeProviderEnumNext(henum: HANDLE, ppprovider: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeProviderEnumNext", longArrayOf(henum, ppprovider)).toUInt()
}

public fun PxeProviderFreeInfo(pprovider: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeProviderFreeInfo", longArrayOf(pprovider)).toUInt()
}

public fun PxeProviderQueryIndex(pszprovidername: PCWSTR, puindex: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeProviderQueryIndex", longArrayOf(pszprovidername, puindex)).toUInt()
}

public fun PxeProviderRegister(pszprovidername: PCWSTR, pszmodulepath: PCWSTR, index: UInt, biscritical: BOOL, phproviderkey: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeProviderRegister", longArrayOf(pszprovidername, pszmodulepath, index.toLong(), biscritical.toLong(), phproviderkey)).toUInt()
}

public fun PxeProviderSetAttribute(hprovider: HANDLE, attribute: UInt, pparameterbuffer: Long, uparamlen: UInt): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeProviderSetAttribute", longArrayOf(hprovider, attribute.toLong(), pparameterbuffer, uparamlen.toLong())).toUInt()
}

public fun PxeProviderUnRegister(pszprovidername: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeProviderUnRegister", longArrayOf(pszprovidername)).toUInt()
}

public fun PxeRegisterCallback(hprovider: HANDLE, callbacktype: UInt, pcallbackfunction: Long, pcontext: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeRegisterCallback", longArrayOf(hprovider, callbacktype.toLong(), pcallbackfunction, pcontext)).toUInt()
}

public fun PxeSendReply(hclientrequest: HANDLE, ppacket: Long, upacketlen: UInt, paddress: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeSendReply", longArrayOf(hclientrequest, ppacket, upacketlen.toLong(), paddress)).toUInt()
}

public fun PxeTrace(hprovider: HANDLE, severity: UInt, pszformat: PCWSTR, vararg variadicArgs: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeTrace", longArrayOf(hprovider, severity.toLong(), pszformat) + variadicArgs).toUInt()
}

public fun PxeTraceV(hprovider: HANDLE, severity: UInt, pszformat: PCWSTR, params: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeTraceV", longArrayOf(hprovider, severity.toLong(), pszformat, params)).toUInt()
}

public fun WdsBpAddOption(hhandle: HANDLE, uoption: UInt, uvaluelen: UInt, pvalue: Long): UInt {
    return Win32DynamicFfi.invoke("wdsbp.dll", "WdsBpAddOption", longArrayOf(hhandle, uoption.toLong(), uvaluelen.toLong(), pvalue)).toUInt()
}

public fun WdsBpCloseHandle(hhandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("wdsbp.dll", "WdsBpCloseHandle", longArrayOf(hhandle)).toUInt()
}

public fun WdsBpGetOptionBuffer(hhandle: HANDLE, ubufferlen: UInt, pbuffer: Long, pubytes: Long): UInt {
    return Win32DynamicFfi.invoke("wdsbp.dll", "WdsBpGetOptionBuffer", longArrayOf(hhandle, ubufferlen.toLong(), pbuffer, pubytes)).toUInt()
}

public fun WdsBpInitialize(bpackettype: UByte, phhandle: Long): UInt {
    return Win32DynamicFfi.invoke("wdsbp.dll", "WdsBpInitialize", longArrayOf(bpackettype.toLong(), phhandle)).toUInt()
}

public fun WdsBpParseInitialize(ppacket: Long, upacketlen: UInt, pbpackettype: Long, phhandle: Long): UInt {
    return Win32DynamicFfi.invoke("wdsbp.dll", "WdsBpParseInitialize", longArrayOf(ppacket, upacketlen.toLong(), pbpackettype, phhandle)).toUInt()
}

public fun WdsBpParseInitializev6(ppacket: Long, upacketlen: UInt, pbpackettype: Long, phhandle: Long): UInt {
    return Win32DynamicFfi.invoke("wdsbp.dll", "WdsBpParseInitializev6", longArrayOf(ppacket, upacketlen.toLong(), pbpackettype, phhandle)).toUInt()
}

public fun WdsBpQueryOption(hhandle: HANDLE, uoption: UInt, uvaluelen: UInt, pvalue: Long, pubytes: Long): UInt {
    return Win32DynamicFfi.invoke("wdsbp.dll", "WdsBpQueryOption", longArrayOf(hhandle, uoption.toLong(), uvaluelen.toLong(), pvalue, pubytes)).toUInt()
}

public fun WdsCliAuthorizeSession(hsession: HANDLE, pcred: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliAuthorizeSession", longArrayOf(hsession, pcred)).toInt()
}

public fun WdsCliCancelTransfer(htransfer: HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliCancelTransfer", longArrayOf(htransfer)).toInt()
}

public fun WdsCliClose(handle: HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliClose", longArrayOf(handle)).toInt()
}

public fun WdsCliCreateSession(pwszserver: PCWSTR, pcred: Long, phsession: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliCreateSession", longArrayOf(pwszserver, pcred, phsession)).toInt()
}

public fun WdsCliFindFirstImage(hsession: HANDLE, phfindhandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliFindFirstImage", longArrayOf(hsession, phfindhandle)).toInt()
}

public fun WdsCliFindNextImage(handle: HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliFindNextImage", longArrayOf(handle)).toInt()
}

public fun WdsCliFreeStringArray(ppwszarray: Long, ulcount: UInt): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliFreeStringArray", longArrayOf(ppwszarray, ulcount.toLong())).toInt()
}

public fun WdsCliGetDriverQueryXml(pwszwindirpath: PCWSTR, ppwszdriverquery: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetDriverQueryXml", longArrayOf(pwszwindirpath, ppwszdriverquery)).toInt()
}

public fun WdsCliGetEnumerationFlags(handle: HANDLE, pdwflags: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetEnumerationFlags", longArrayOf(handle, pdwflags)).toInt()
}

public fun WdsCliGetImageArchitecture(hifh: HANDLE, pdwvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageArchitecture", longArrayOf(hifh, pdwvalue)).toInt()
}

public fun WdsCliGetImageDescription(hifh: HANDLE, ppwszvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageDescription", longArrayOf(hifh, ppwszvalue)).toInt()
}

public fun WdsCliGetImageFiles(hifh: HANDLE, pppwszfiles: Long, pdwcount: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageFiles", longArrayOf(hifh, pppwszfiles, pdwcount)).toInt()
}

public fun WdsCliGetImageGroup(hifh: HANDLE, ppwszvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageGroup", longArrayOf(hifh, ppwszvalue)).toInt()
}

public fun WdsCliGetImageHalName(hifh: HANDLE, ppwszvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageHalName", longArrayOf(hifh, ppwszvalue)).toInt()
}

public fun WdsCliGetImageHandleFromFindHandle(findhandle: HANDLE, phimagehandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageHandleFromFindHandle", longArrayOf(findhandle, phimagehandle)).toInt()
}

public fun WdsCliGetImageHandleFromTransferHandle(htransfer: HANDLE, phimagehandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageHandleFromTransferHandle", longArrayOf(htransfer, phimagehandle)).toInt()
}

public fun WdsCliGetImageIndex(hifh: HANDLE, pdwvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageIndex", longArrayOf(hifh, pdwvalue)).toInt()
}

public fun WdsCliGetImageLanguage(hifh: HANDLE, ppwszvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageLanguage", longArrayOf(hifh, ppwszvalue)).toInt()
}

public fun WdsCliGetImageLanguages(hifh: HANDLE, pppszvalues: Long, pdwnumvalues: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageLanguages", longArrayOf(hifh, pppszvalues, pdwnumvalues)).toInt()
}

public fun WdsCliGetImageLastModifiedTime(hifh: HANDLE, ppsystimevalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageLastModifiedTime", longArrayOf(hifh, ppsystimevalue)).toInt()
}

public fun WdsCliGetImageName(hifh: HANDLE, ppwszvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageName", longArrayOf(hifh, ppwszvalue)).toInt()
}

public fun WdsCliGetImageNamespace(hifh: HANDLE, ppwszvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageNamespace", longArrayOf(hifh, ppwszvalue)).toInt()
}

public fun WdsCliGetImageParameter(hifh: HANDLE, paramtype: WDS_CLI_IMAGE_PARAM_TYPE, presponse: Long, uresponselen: UInt): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageParameter", longArrayOf(hifh, paramtype.toLong(), presponse, uresponselen.toLong())).toInt()
}

public fun WdsCliGetImagePath(hifh: HANDLE, ppwszvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImagePath", longArrayOf(hifh, ppwszvalue)).toInt()
}

public fun WdsCliGetImageSize(hifh: HANDLE, pullvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageSize", longArrayOf(hifh, pullvalue)).toInt()
}

public fun WdsCliGetImageType(hifh: HANDLE, pimagetype: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageType", longArrayOf(hifh, pimagetype)).toInt()
}

public fun WdsCliGetImageVersion(hifh: HANDLE, ppwszvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageVersion", longArrayOf(hifh, ppwszvalue)).toInt()
}

public fun WdsCliGetTransferSize(hifh: HANDLE, pullvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetTransferSize", longArrayOf(hifh, pullvalue)).toInt()
}

public fun WdsCliInitializeLog(hsession: HANDLE, ulclientarchitecture: CPU_ARCHITECTURE, pwszclientid: PCWSTR, pwszclientaddress: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliInitializeLog", longArrayOf(hsession, ulclientarchitecture.toLong(), pwszclientid, pwszclientaddress)).toInt()
}

public fun WdsCliLog(hsession: HANDLE, ulloglevel: UInt, ulmessagecode: UInt, vararg variadicArgs: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliLog", longArrayOf(hsession, ulloglevel.toLong(), ulmessagecode.toLong()) + variadicArgs).toInt()
}

public fun WdsCliObtainDriverPackages(himage: HANDLE, ppwszservername: Long, pppwszdriverpackages: Long, pulcount: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliObtainDriverPackages", longArrayOf(himage, ppwszservername, pppwszdriverpackages, pulcount)).toInt()
}

public fun WdsCliObtainDriverPackagesEx(hsession: HANDLE, pwszmachineinfo: PCWSTR, ppwszservername: Long, pppwszdriverpackages: Long, pulcount: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliObtainDriverPackagesEx", longArrayOf(hsession, pwszmachineinfo, ppwszservername, pppwszdriverpackages, pulcount)).toInt()
}

public fun WdsCliRegisterTrace(pfn: PFN_WdsCliTraceFunction): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliRegisterTrace", longArrayOf(Win32DynamicFfi.objectSlot(pfn))).toInt()
}

public fun WdsCliSetTransferBufferSize(ulsizeinbytes: UInt) {
    Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliSetTransferBufferSize", longArrayOf(ulsizeinbytes.toLong()))
}

public fun WdsCliTransferFile(pwszserver: PCWSTR, pwsznamespace: PCWSTR, pwszremotefilepath: PCWSTR, pwszlocalfilepath: PCWSTR, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PFN_WdsCliCallback, pvuserdata: Long, phtransfer: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliTransferFile", longArrayOf(pwszserver, pwsznamespace, pwszremotefilepath, pwszlocalfilepath, dwflags.toLong(), dwreserved.toLong(), Win32DynamicFfi.objectSlot(pfnwdsclicallback), pvuserdata, phtransfer)).toInt()
}

public fun WdsCliTransferImage(himage: HANDLE, pwszlocalpath: PCWSTR, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PFN_WdsCliCallback, pvuserdata: Long, phtransfer: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliTransferImage", longArrayOf(himage, pwszlocalpath, dwflags.toLong(), dwreserved.toLong(), Win32DynamicFfi.objectSlot(pfnwdsclicallback), pvuserdata, phtransfer)).toInt()
}

public fun WdsCliWaitForTransfer(htransfer: HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliWaitForTransfer", longArrayOf(htransfer)).toInt()
}

public fun WdsTransportClientAddRefBuffer(pvbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("wdstptc.dll", "WdsTransportClientAddRefBuffer", longArrayOf(pvbuffer)).toUInt()
}

public fun WdsTransportClientCancelSession(hsessionkey: HANDLE): UInt {
    return Win32DynamicFfi.invoke("wdstptc.dll", "WdsTransportClientCancelSession", longArrayOf(hsessionkey)).toUInt()
}

public fun WdsTransportClientCancelSessionEx(hsessionkey: HANDLE, dwerrorcode: UInt): UInt {
    return Win32DynamicFfi.invoke("wdstptc.dll", "WdsTransportClientCancelSessionEx", longArrayOf(hsessionkey, dwerrorcode.toLong())).toUInt()
}

public fun WdsTransportClientCloseSession(hsessionkey: HANDLE): UInt {
    return Win32DynamicFfi.invoke("wdstptc.dll", "WdsTransportClientCloseSession", longArrayOf(hsessionkey)).toUInt()
}

public fun WdsTransportClientCompleteReceive(hsessionkey: HANDLE, ulsize: UInt, pulloffset: Long): UInt {
    return Win32DynamicFfi.invoke("wdstptc.dll", "WdsTransportClientCompleteReceive", longArrayOf(hsessionkey, ulsize.toLong(), pulloffset)).toUInt()
}

public fun WdsTransportClientInitialize(): UInt {
    return Win32DynamicFfi.invoke("wdstptc.dll", "WdsTransportClientInitialize", longArrayOf()).toUInt()
}

public fun WdsTransportClientInitializeSession(psessionrequest: Long, pcallerdata: Long, hsessionkey: Long): UInt {
    return Win32DynamicFfi.invoke("wdstptc.dll", "WdsTransportClientInitializeSession", longArrayOf(psessionrequest, pcallerdata, hsessionkey)).toUInt()
}

public fun WdsTransportClientQueryStatus(hsessionkey: HANDLE, pustatus: Long, puerrorcode: Long): UInt {
    return Win32DynamicFfi.invoke("wdstptc.dll", "WdsTransportClientQueryStatus", longArrayOf(hsessionkey, pustatus, puerrorcode)).toUInt()
}

public fun WdsTransportClientRegisterCallback(hsessionkey: HANDLE, callbackid: TRANSPORTCLIENT_CALLBACK_ID, pfncallback: Long): UInt {
    return Win32DynamicFfi.invoke("wdstptc.dll", "WdsTransportClientRegisterCallback", longArrayOf(hsessionkey, callbackid.toLong(), pfncallback)).toUInt()
}

public fun WdsTransportClientReleaseBuffer(pvbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("wdstptc.dll", "WdsTransportClientReleaseBuffer", longArrayOf(pvbuffer)).toUInt()
}

public fun WdsTransportClientShutdown(): UInt {
    return Win32DynamicFfi.invoke("wdstptc.dll", "WdsTransportClientShutdown", longArrayOf()).toUInt()
}

public fun WdsTransportClientStartSession(hsessionkey: HANDLE): UInt {
    return Win32DynamicFfi.invoke("wdstptc.dll", "WdsTransportClientStartSession", longArrayOf(hsessionkey)).toUInt()
}

public fun WdsTransportClientWaitForCompletion(hsessionkey: HANDLE, utimeout: UInt): UInt {
    return Win32DynamicFfi.invoke("wdstptc.dll", "WdsTransportClientWaitForCompletion", longArrayOf(hsessionkey, utimeout.toLong())).toUInt()
}

public fun WdsTransportServerAllocateBuffer(hprovider: HANDLE, ulbuffersize: UInt): Long {
    return Win32DynamicFfi.invoke("wdsmc.dll", "WdsTransportServerAllocateBuffer", longArrayOf(hprovider, ulbuffersize.toLong()))
}

public fun WdsTransportServerCompleteRead(hprovider: HANDLE, ulbytesread: UInt, pvuserdata: Long, hreadresult: HRESULT): HRESULT {
    return Win32DynamicFfi.invoke("wdsmc.dll", "WdsTransportServerCompleteRead", longArrayOf(hprovider, ulbytesread.toLong(), pvuserdata, hreadresult.toLong())).toInt()
}

public fun WdsTransportServerFreeBuffer(hprovider: HANDLE, pvbuffer: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsmc.dll", "WdsTransportServerFreeBuffer", longArrayOf(hprovider, pvbuffer)).toInt()
}

public fun WdsTransportServerRegisterCallback(hprovider: HANDLE, callbackid: TRANSPORTPROVIDER_CALLBACK_ID, pfncallback: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsmc.dll", "WdsTransportServerRegisterCallback", longArrayOf(hprovider, callbackid.toLong(), pfncallback)).toInt()
}

public fun WdsTransportServerTrace(hprovider: HANDLE, severity: UInt, pwszformat: PCWSTR, vararg variadicArgs: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsmc.dll", "WdsTransportServerTrace", longArrayOf(hprovider, severity.toLong(), pwszformat) + variadicArgs).toInt()
}

public fun WdsTransportServerTraceV(hprovider: HANDLE, severity: UInt, pwszformat: PCWSTR, params: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsmc.dll", "WdsTransportServerTraceV", longArrayOf(hprovider, severity.toLong(), pwszformat, params)).toInt()
}
