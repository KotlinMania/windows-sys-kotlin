package io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun interface FnCallback {
    public operator fun invoke(pwszformat: PCWSTR, params: Long)
}

public fun interface FnCallback1 {
    public operator fun invoke(dwmessageid: PFN_WDS_CLI_CALLBACK_MESSAGE_ID, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM, pvuserdata: Long)
}

public fun PxeAsyncRecvDone(hclientrequest: Foundation.HANDLE, action: UInt): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeAsyncRecvDone", longArrayOf(Win32DynamicFfi.objectSlot(hclientrequest), action.toLong())).toUInt()
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

public fun PxePacketAllocate(hprovider: Foundation.HANDLE, hclientrequest: Foundation.HANDLE, usize: UInt): Long {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxePacketAllocate", longArrayOf(Win32DynamicFfi.objectSlot(hprovider), Win32DynamicFfi.objectSlot(hclientrequest), usize.toLong()))
}

public fun PxePacketFree(hprovider: Foundation.HANDLE, hclientrequest: Foundation.HANDLE, ppacket: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxePacketFree", longArrayOf(Win32DynamicFfi.objectSlot(hprovider), Win32DynamicFfi.objectSlot(hclientrequest), ppacket)).toUInt()
}

public fun PxeProviderEnumClose(henum: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeProviderEnumClose", longArrayOf(Win32DynamicFfi.objectSlot(henum))).toUInt()
}

public fun PxeProviderEnumFirst(phenum: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeProviderEnumFirst", longArrayOf(phenum)).toUInt()
}

public fun PxeProviderEnumNext(henum: Foundation.HANDLE, ppprovider: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeProviderEnumNext", longArrayOf(Win32DynamicFfi.objectSlot(henum), ppprovider)).toUInt()
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

public fun PxeProviderSetAttribute(hprovider: Foundation.HANDLE, attribute: UInt, pparameterbuffer: Long, uparamlen: UInt): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeProviderSetAttribute", longArrayOf(Win32DynamicFfi.objectSlot(hprovider), attribute.toLong(), pparameterbuffer, uparamlen.toLong())).toUInt()
}

public fun PxeProviderUnRegister(pszprovidername: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeProviderUnRegister", longArrayOf(pszprovidername)).toUInt()
}

public fun PxeRegisterCallback(hprovider: Foundation.HANDLE, callbacktype: UInt, pcallbackfunction: Long, pcontext: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeRegisterCallback", longArrayOf(Win32DynamicFfi.objectSlot(hprovider), callbacktype.toLong(), pcallbackfunction, pcontext)).toUInt()
}

public fun PxeSendReply(hclientrequest: Foundation.HANDLE, ppacket: Long, upacketlen: UInt, paddress: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeSendReply", longArrayOf(Win32DynamicFfi.objectSlot(hclientrequest), ppacket, upacketlen.toLong(), paddress)).toUInt()
}

public fun PxeTrace(hprovider: Foundation.HANDLE, severity: UInt, pszformat: PCWSTR, vararg variadicArgs: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeTrace", longArrayOf(Win32DynamicFfi.objectSlot(hprovider), severity.toLong(), pszformat) + variadicArgs).toUInt()
}

public fun PxeTraceV(hprovider: Foundation.HANDLE, severity: UInt, pszformat: PCWSTR, params: Long): UInt {
    return Win32DynamicFfi.invoke("wdspxe.dll", "PxeTraceV", longArrayOf(Win32DynamicFfi.objectSlot(hprovider), severity.toLong(), pszformat, params)).toUInt()
}

public fun WdsBpAddOption(hhandle: Foundation.HANDLE, uoption: UInt, uvaluelen: UInt, pvalue: Long): UInt {
    return Win32DynamicFfi.invoke("wdsbp.dll", "WdsBpAddOption", longArrayOf(Win32DynamicFfi.objectSlot(hhandle), uoption.toLong(), uvaluelen.toLong(), pvalue)).toUInt()
}

public fun WdsBpCloseHandle(hhandle: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("wdsbp.dll", "WdsBpCloseHandle", longArrayOf(Win32DynamicFfi.objectSlot(hhandle))).toUInt()
}

public fun WdsBpGetOptionBuffer(hhandle: Foundation.HANDLE, ubufferlen: UInt, pbuffer: Long, pubytes: Long): UInt {
    return Win32DynamicFfi.invoke("wdsbp.dll", "WdsBpGetOptionBuffer", longArrayOf(Win32DynamicFfi.objectSlot(hhandle), ubufferlen.toLong(), pbuffer, pubytes)).toUInt()
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

public fun WdsBpQueryOption(hhandle: Foundation.HANDLE, uoption: UInt, uvaluelen: UInt, pvalue: Long, pubytes: Long): UInt {
    return Win32DynamicFfi.invoke("wdsbp.dll", "WdsBpQueryOption", longArrayOf(Win32DynamicFfi.objectSlot(hhandle), uoption.toLong(), uvaluelen.toLong(), pvalue, pubytes)).toUInt()
}

public fun WdsCliAuthorizeSession(hsession: Foundation.HANDLE, pcred: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliAuthorizeSession", longArrayOf(Win32DynamicFfi.objectSlot(hsession), pcred)).toInt()
}

public fun WdsCliCancelTransfer(htransfer: Foundation.HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliCancelTransfer", longArrayOf(Win32DynamicFfi.objectSlot(htransfer))).toInt()
}

public fun WdsCliClose(handle: Foundation.HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliClose", longArrayOf(Win32DynamicFfi.objectSlot(handle))).toInt()
}

public fun WdsCliCreateSession(pwszserver: PCWSTR, pcred: Long, phsession: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliCreateSession", longArrayOf(pwszserver, pcred, phsession)).toInt()
}

public fun WdsCliFindFirstImage(hsession: Foundation.HANDLE, phfindhandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliFindFirstImage", longArrayOf(Win32DynamicFfi.objectSlot(hsession), phfindhandle)).toInt()
}

public fun WdsCliFindNextImage(handle: Foundation.HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliFindNextImage", longArrayOf(Win32DynamicFfi.objectSlot(handle))).toInt()
}

public fun WdsCliFreeStringArray(ppwszarray: Long, ulcount: UInt): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliFreeStringArray", longArrayOf(ppwszarray, ulcount.toLong())).toInt()
}

public fun WdsCliGetDriverQueryXml(pwszwindirpath: PCWSTR, ppwszdriverquery: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetDriverQueryXml", longArrayOf(pwszwindirpath, ppwszdriverquery)).toInt()
}

public fun WdsCliGetEnumerationFlags(handle: Foundation.HANDLE, pdwflags: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetEnumerationFlags", longArrayOf(Win32DynamicFfi.objectSlot(handle), pdwflags)).toInt()
}

public fun WdsCliGetImageArchitecture(hifh: Foundation.HANDLE, pdwvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageArchitecture", longArrayOf(Win32DynamicFfi.objectSlot(hifh), pdwvalue)).toInt()
}

public fun WdsCliGetImageDescription(hifh: Foundation.HANDLE, ppwszvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageDescription", longArrayOf(Win32DynamicFfi.objectSlot(hifh), ppwszvalue)).toInt()
}

public fun WdsCliGetImageFiles(hifh: Foundation.HANDLE, pppwszfiles: Long, pdwcount: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageFiles", longArrayOf(Win32DynamicFfi.objectSlot(hifh), pppwszfiles, pdwcount)).toInt()
}

public fun WdsCliGetImageGroup(hifh: Foundation.HANDLE, ppwszvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageGroup", longArrayOf(Win32DynamicFfi.objectSlot(hifh), ppwszvalue)).toInt()
}

public fun WdsCliGetImageHalName(hifh: Foundation.HANDLE, ppwszvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageHalName", longArrayOf(Win32DynamicFfi.objectSlot(hifh), ppwszvalue)).toInt()
}

public fun WdsCliGetImageHandleFromFindHandle(findhandle: Foundation.HANDLE, phimagehandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageHandleFromFindHandle", longArrayOf(Win32DynamicFfi.objectSlot(findhandle), phimagehandle)).toInt()
}

public fun WdsCliGetImageHandleFromTransferHandle(htransfer: Foundation.HANDLE, phimagehandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageHandleFromTransferHandle", longArrayOf(Win32DynamicFfi.objectSlot(htransfer), phimagehandle)).toInt()
}

public fun WdsCliGetImageIndex(hifh: Foundation.HANDLE, pdwvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageIndex", longArrayOf(Win32DynamicFfi.objectSlot(hifh), pdwvalue)).toInt()
}

public fun WdsCliGetImageLanguage(hifh: Foundation.HANDLE, ppwszvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageLanguage", longArrayOf(Win32DynamicFfi.objectSlot(hifh), ppwszvalue)).toInt()
}

public fun WdsCliGetImageLanguages(hifh: Foundation.HANDLE, pppszvalues: Long, pdwnumvalues: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageLanguages", longArrayOf(Win32DynamicFfi.objectSlot(hifh), pppszvalues, pdwnumvalues)).toInt()
}

public fun WdsCliGetImageLastModifiedTime(hifh: Foundation.HANDLE, ppsystimevalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageLastModifiedTime", longArrayOf(Win32DynamicFfi.objectSlot(hifh), ppsystimevalue)).toInt()
}

public fun WdsCliGetImageName(hifh: Foundation.HANDLE, ppwszvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageName", longArrayOf(Win32DynamicFfi.objectSlot(hifh), ppwszvalue)).toInt()
}

public fun WdsCliGetImageNamespace(hifh: Foundation.HANDLE, ppwszvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageNamespace", longArrayOf(Win32DynamicFfi.objectSlot(hifh), ppwszvalue)).toInt()
}

public fun WdsCliGetImageParameter(hifh: Foundation.HANDLE, paramtype: WDS_CLI_IMAGE_PARAM_TYPE, presponse: Long, uresponselen: UInt): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageParameter", longArrayOf(Win32DynamicFfi.objectSlot(hifh), paramtype.toLong(), presponse, uresponselen.toLong())).toInt()
}

public fun WdsCliGetImagePath(hifh: Foundation.HANDLE, ppwszvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImagePath", longArrayOf(Win32DynamicFfi.objectSlot(hifh), ppwszvalue)).toInt()
}

public fun WdsCliGetImageSize(hifh: Foundation.HANDLE, pullvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageSize", longArrayOf(Win32DynamicFfi.objectSlot(hifh), pullvalue)).toInt()
}

public fun WdsCliGetImageType(hifh: Foundation.HANDLE, pimagetype: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageType", longArrayOf(Win32DynamicFfi.objectSlot(hifh), pimagetype)).toInt()
}

public fun WdsCliGetImageVersion(hifh: Foundation.HANDLE, ppwszvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetImageVersion", longArrayOf(Win32DynamicFfi.objectSlot(hifh), ppwszvalue)).toInt()
}

public fun WdsCliGetTransferSize(hifh: Foundation.HANDLE, pullvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliGetTransferSize", longArrayOf(Win32DynamicFfi.objectSlot(hifh), pullvalue)).toInt()
}

public fun WdsCliInitializeLog(hsession: Foundation.HANDLE, ulclientarchitecture: CPU_ARCHITECTURE, pwszclientid: PCWSTR, pwszclientaddress: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliInitializeLog", longArrayOf(Win32DynamicFfi.objectSlot(hsession), ulclientarchitecture.toLong(), pwszclientid, pwszclientaddress)).toInt()
}

public fun WdsCliLog(hsession: Foundation.HANDLE, ulloglevel: UInt, ulmessagecode: UInt, vararg variadicArgs: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliLog", longArrayOf(Win32DynamicFfi.objectSlot(hsession), ulloglevel.toLong(), ulmessagecode.toLong()) + variadicArgs).toInt()
}

public fun WdsCliObtainDriverPackages(himage: Foundation.HANDLE, ppwszservername: Long, pppwszdriverpackages: Long, pulcount: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliObtainDriverPackages", longArrayOf(Win32DynamicFfi.objectSlot(himage), ppwszservername, pppwszdriverpackages, pulcount)).toInt()
}

public fun WdsCliObtainDriverPackagesEx(hsession: Foundation.HANDLE, pwszmachineinfo: PCWSTR, ppwszservername: Long, pppwszdriverpackages: Long, pulcount: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliObtainDriverPackagesEx", longArrayOf(Win32DynamicFfi.objectSlot(hsession), pwszmachineinfo, ppwszservername, pppwszdriverpackages, pulcount)).toInt()
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

public fun WdsCliTransferImage(himage: Foundation.HANDLE, pwszlocalpath: PCWSTR, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PFN_WdsCliCallback, pvuserdata: Long, phtransfer: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliTransferImage", longArrayOf(Win32DynamicFfi.objectSlot(himage), pwszlocalpath, dwflags.toLong(), dwreserved.toLong(), Win32DynamicFfi.objectSlot(pfnwdsclicallback), pvuserdata, phtransfer)).toInt()
}

public fun WdsCliWaitForTransfer(htransfer: Foundation.HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("wdsclientapi.dll", "WdsCliWaitForTransfer", longArrayOf(Win32DynamicFfi.objectSlot(htransfer))).toInt()
}

public fun WdsTransportClientAddRefBuffer(pvbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("wdstptc.dll", "WdsTransportClientAddRefBuffer", longArrayOf(pvbuffer)).toUInt()
}

public fun WdsTransportClientCancelSession(hsessionkey: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("wdstptc.dll", "WdsTransportClientCancelSession", longArrayOf(Win32DynamicFfi.objectSlot(hsessionkey))).toUInt()
}

public fun WdsTransportClientCancelSessionEx(hsessionkey: Foundation.HANDLE, dwerrorcode: UInt): UInt {
    return Win32DynamicFfi.invoke("wdstptc.dll", "WdsTransportClientCancelSessionEx", longArrayOf(Win32DynamicFfi.objectSlot(hsessionkey), dwerrorcode.toLong())).toUInt()
}

public fun WdsTransportClientCloseSession(hsessionkey: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("wdstptc.dll", "WdsTransportClientCloseSession", longArrayOf(Win32DynamicFfi.objectSlot(hsessionkey))).toUInt()
}

public fun WdsTransportClientCompleteReceive(hsessionkey: Foundation.HANDLE, ulsize: UInt, pulloffset: Long): UInt {
    return Win32DynamicFfi.invoke("wdstptc.dll", "WdsTransportClientCompleteReceive", longArrayOf(Win32DynamicFfi.objectSlot(hsessionkey), ulsize.toLong(), pulloffset)).toUInt()
}

public fun WdsTransportClientInitialize(): UInt {
    return Win32DynamicFfi.invoke("wdstptc.dll", "WdsTransportClientInitialize", longArrayOf()).toUInt()
}

public fun WdsTransportClientInitializeSession(psessionrequest: Long, pcallerdata: Long, hsessionkey: Long): UInt {
    return Win32DynamicFfi.invoke("wdstptc.dll", "WdsTransportClientInitializeSession", longArrayOf(psessionrequest, pcallerdata, hsessionkey)).toUInt()
}

public fun WdsTransportClientQueryStatus(hsessionkey: Foundation.HANDLE, pustatus: Long, puerrorcode: Long): UInt {
    return Win32DynamicFfi.invoke("wdstptc.dll", "WdsTransportClientQueryStatus", longArrayOf(Win32DynamicFfi.objectSlot(hsessionkey), pustatus, puerrorcode)).toUInt()
}

public fun WdsTransportClientRegisterCallback(hsessionkey: Foundation.HANDLE, callbackid: TRANSPORTCLIENT_CALLBACK_ID, pfncallback: Long): UInt {
    return Win32DynamicFfi.invoke("wdstptc.dll", "WdsTransportClientRegisterCallback", longArrayOf(Win32DynamicFfi.objectSlot(hsessionkey), callbackid.toLong(), pfncallback)).toUInt()
}

public fun WdsTransportClientReleaseBuffer(pvbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("wdstptc.dll", "WdsTransportClientReleaseBuffer", longArrayOf(pvbuffer)).toUInt()
}

public fun WdsTransportClientShutdown(): UInt {
    return Win32DynamicFfi.invoke("wdstptc.dll", "WdsTransportClientShutdown", longArrayOf()).toUInt()
}

public fun WdsTransportClientStartSession(hsessionkey: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("wdstptc.dll", "WdsTransportClientStartSession", longArrayOf(Win32DynamicFfi.objectSlot(hsessionkey))).toUInt()
}

public fun WdsTransportClientWaitForCompletion(hsessionkey: Foundation.HANDLE, utimeout: UInt): UInt {
    return Win32DynamicFfi.invoke("wdstptc.dll", "WdsTransportClientWaitForCompletion", longArrayOf(Win32DynamicFfi.objectSlot(hsessionkey), utimeout.toLong())).toUInt()
}

public fun WdsTransportServerAllocateBuffer(hprovider: Foundation.HANDLE, ulbuffersize: UInt): Long {
    return Win32DynamicFfi.invoke("wdsmc.dll", "WdsTransportServerAllocateBuffer", longArrayOf(Win32DynamicFfi.objectSlot(hprovider), ulbuffersize.toLong()))
}

public fun WdsTransportServerCompleteRead(hprovider: Foundation.HANDLE, ulbytesread: UInt, pvuserdata: Long, hreadresult: HRESULT): HRESULT {
    return Win32DynamicFfi.invoke("wdsmc.dll", "WdsTransportServerCompleteRead", longArrayOf(Win32DynamicFfi.objectSlot(hprovider), ulbytesread.toLong(), pvuserdata, hreadresult.toLong())).toInt()
}

public fun WdsTransportServerFreeBuffer(hprovider: Foundation.HANDLE, pvbuffer: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsmc.dll", "WdsTransportServerFreeBuffer", longArrayOf(Win32DynamicFfi.objectSlot(hprovider), pvbuffer)).toInt()
}

public fun WdsTransportServerRegisterCallback(hprovider: Foundation.HANDLE, callbackid: TRANSPORTPROVIDER_CALLBACK_ID, pfncallback: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsmc.dll", "WdsTransportServerRegisterCallback", longArrayOf(Win32DynamicFfi.objectSlot(hprovider), callbackid.toLong(), pfncallback)).toInt()
}

public fun WdsTransportServerTrace(hprovider: Foundation.HANDLE, severity: UInt, pwszformat: PCWSTR, vararg variadicArgs: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsmc.dll", "WdsTransportServerTrace", longArrayOf(Win32DynamicFfi.objectSlot(hprovider), severity.toLong(), pwszformat) + variadicArgs).toInt()
}

public fun WdsTransportServerTraceV(hprovider: Foundation.HANDLE, severity: UInt, pwszformat: PCWSTR, params: Long): HRESULT {
    return Win32DynamicFfi.invoke("wdsmc.dll", "WdsTransportServerTraceV", longArrayOf(Win32DynamicFfi.objectSlot(hprovider), severity.toLong(), pwszformat, params)).toInt()
}
