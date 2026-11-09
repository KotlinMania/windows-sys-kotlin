@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun PxeAsyncRecvDone(hclientrequest: HANDLE, action: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxeAsyncRecvDone(hclientrequest.toCPointer<ByteVar>(), action)

public actual fun PxeDhcpAppendOption(preplypacket: Long, umaxreplypacketlen: UInt, pureplypacketlen: Long, boption: UByte, boptionlen: UByte, pvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxeDhcpAppendOption(preplypacket.toCPointer<ByteVar>(), umaxreplypacketlen, pureplypacketlen.toCPointer<ByteVar>(), boption, boptionlen, pvalue.toCPointer<ByteVar>())

public actual fun PxeDhcpAppendOptionRaw(preplypacket: Long, umaxreplypacketlen: UInt, pureplypacketlen: Long, ubufferlen: UShort, pbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxeDhcpAppendOptionRaw(preplypacket.toCPointer<ByteVar>(), umaxreplypacketlen, pureplypacketlen.toCPointer<ByteVar>(), ubufferlen, pbuffer.toCPointer<ByteVar>())

public actual fun PxeDhcpGetOptionValue(ppacket: Long, upacketlen: UInt, uinstance: UInt, boption: UByte, pboptionlen: Long, ppoptionvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxeDhcpGetOptionValue(ppacket.toCPointer<ByteVar>(), upacketlen, uinstance, boption, pboptionlen.toCPointer<ByteVar>(), ppoptionvalue.toCPointer<ByteVar>())

public actual fun PxeDhcpGetVendorOptionValue(ppacket: Long, upacketlen: UInt, boption: UByte, uinstance: UInt, pboptionlen: Long, ppoptionvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxeDhcpGetVendorOptionValue(ppacket.toCPointer<ByteVar>(), upacketlen, boption, uinstance, pboptionlen.toCPointer<ByteVar>(), ppoptionvalue.toCPointer<ByteVar>())

public actual fun PxeDhcpInitialize(precvpacket: Long, urecvpacketlen: UInt, preplypacket: Long, umaxreplypacketlen: UInt, pureplypacketlen: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxeDhcpInitialize(precvpacket.toCPointer<ByteVar>(), urecvpacketlen, preplypacket.toCPointer<ByteVar>(), umaxreplypacketlen, pureplypacketlen.toCPointer<ByteVar>())

public actual fun PxeDhcpIsValid(ppacket: Long, upacketlen: UInt, brequestpacket: BOOL, pbpxeoptionpresent: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxeDhcpIsValid(ppacket.toCPointer<ByteVar>(), upacketlen, brequestpacket, pbpxeoptionpresent.toCPointer<ByteVar>())

public actual fun PxeDhcpv6AppendOption(preply: Long, cbreply: UInt, pcbreplyused: Long, woptiontype: UShort, cboption: UShort, poption: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxeDhcpv6AppendOption(preply.toCPointer<ByteVar>(), cbreply, pcbreplyused.toCPointer<ByteVar>(), woptiontype, cboption, poption.toCPointer<ByteVar>())

public actual fun PxeDhcpv6AppendOptionRaw(preply: Long, cbreply: UInt, pcbreplyused: Long, cbbuffer: UShort, pbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxeDhcpv6AppendOptionRaw(preply.toCPointer<ByteVar>(), cbreply, pcbreplyused.toCPointer<ByteVar>(), cbbuffer, pbuffer.toCPointer<ByteVar>())

public actual fun PxeDhcpv6CreateRelayRepl(prelaymessages: Long, nrelaymessages: UInt, pinnerpacket: Long, cbinnerpacket: UInt, preplybuffer: Long, cbreplybuffer: UInt, pcbreplybuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxeDhcpv6CreateRelayRepl(prelaymessages.toCPointer<ByteVar>(), nrelaymessages, pinnerpacket.toCPointer<ByteVar>(), cbinnerpacket, preplybuffer.toCPointer<ByteVar>(), cbreplybuffer, pcbreplybuffer.toCPointer<ByteVar>())

public actual fun PxeDhcpv6GetOptionValue(ppacket: Long, upacketlen: UInt, uinstance: UInt, woption: UShort, pwoptionlen: Long, ppoptionvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxeDhcpv6GetOptionValue(ppacket.toCPointer<ByteVar>(), upacketlen, uinstance, woption, pwoptionlen.toCPointer<ByteVar>(), ppoptionvalue.toCPointer<ByteVar>())

public actual fun PxeDhcpv6GetVendorOptionValue(ppacket: Long, upacketlen: UInt, dwenterprisenumber: UInt, woption: UShort, uinstance: UInt, pwoptionlen: Long, ppoptionvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxeDhcpv6GetVendorOptionValue(ppacket.toCPointer<ByteVar>(), upacketlen, dwenterprisenumber, woption, uinstance, pwoptionlen.toCPointer<ByteVar>(), ppoptionvalue.toCPointer<ByteVar>())

public actual fun PxeDhcpv6Initialize(prequest: Long, cbrequest: UInt, preply: Long, cbreply: UInt, pcbreplyused: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxeDhcpv6Initialize(prequest.toCPointer<ByteVar>(), cbrequest, preply.toCPointer<ByteVar>(), cbreply, pcbreplyused.toCPointer<ByteVar>())

public actual fun PxeDhcpv6IsValid(ppacket: Long, upacketlen: UInt, brequestpacket: BOOL, pbpxeoptionpresent: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxeDhcpv6IsValid(ppacket.toCPointer<ByteVar>(), upacketlen, brequestpacket, pbpxeoptionpresent.toCPointer<ByteVar>())

public actual fun PxeDhcpv6ParseRelayForw(prelayforwpacket: Long, urelayforwpacketlen: UInt, prelaymessages: Long, nrelaymessages: UInt, pnrelaymessages: Long, ppinnerpacket: Long, pcbinnerpacket: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxeDhcpv6ParseRelayForw(prelayforwpacket.toCPointer<ByteVar>(), urelayforwpacketlen, prelaymessages.toCPointer<ByteVar>(), nrelaymessages, pnrelaymessages.toCPointer<ByteVar>(), ppinnerpacket.toCPointer<ByteVar>(), pcbinnerpacket.toCPointer<ByteVar>())

public actual fun PxeGetServerInfo(uinfotype: UInt, pbuffer: Long, ubufferlen: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxeGetServerInfo(uinfotype, pbuffer.toCPointer<ByteVar>(), ubufferlen)

public actual fun PxeGetServerInfoEx(uinfotype: UInt, pbuffer: Long, ubufferlen: UInt, pubufferused: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxeGetServerInfoEx(uinfotype, pbuffer.toCPointer<ByteVar>(), ubufferlen, pubufferused.toCPointer<ByteVar>())

public actual fun PxePacketAllocate(hprovider: HANDLE, hclientrequest: HANDLE, usize: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxePacketAllocate(hprovider.toCPointer<ByteVar>(), hclientrequest.toCPointer<ByteVar>(), usize)?.toLong() ?: 0L

public actual fun PxePacketFree(hprovider: HANDLE, hclientrequest: HANDLE, ppacket: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxePacketFree(hprovider.toCPointer<ByteVar>(), hclientrequest.toCPointer<ByteVar>(), ppacket.toCPointer<ByteVar>())

public actual fun PxeProviderEnumClose(henum: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxeProviderEnumClose(henum.toCPointer<ByteVar>())

public actual fun PxeProviderEnumFirst(phenum: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxeProviderEnumFirst(phenum.toCPointer<ByteVar>())

public actual fun PxeProviderEnumNext(henum: HANDLE, ppprovider: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxeProviderEnumNext(henum.toCPointer<ByteVar>(), ppprovider.toCPointer<ByteVar>())

public actual fun PxeProviderFreeInfo(pprovider: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxeProviderFreeInfo(pprovider.toCPointer<ByteVar>())

public actual fun PxeProviderQueryIndex(pszprovidername: PCWSTR, puindex: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxeProviderQueryIndex(pszprovidername.toCPointer<ByteVar>(), puindex.toCPointer<ByteVar>())

public actual fun PxeProviderRegister(pszprovidername: PCWSTR, pszmodulepath: PCWSTR, index: UInt, biscritical: BOOL, phproviderkey: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxeProviderRegister(pszprovidername.toCPointer<ByteVar>(), pszmodulepath.toCPointer<ByteVar>(), index, biscritical, phproviderkey.toCPointer<ByteVar>())

public actual fun PxeProviderSetAttribute(hprovider: HANDLE, attribute: UInt, pparameterbuffer: Long, uparamlen: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxeProviderSetAttribute(hprovider.toCPointer<ByteVar>(), attribute, pparameterbuffer.toCPointer<ByteVar>(), uparamlen)

public actual fun PxeProviderUnRegister(pszprovidername: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxeProviderUnRegister(pszprovidername.toCPointer<ByteVar>())

public actual fun PxeRegisterCallback(hprovider: HANDLE, callbacktype: UInt, pcallbackfunction: Long, pcontext: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxeRegisterCallback(hprovider.toCPointer<ByteVar>(), callbacktype, pcallbackfunction.toCPointer<ByteVar>(), pcontext.toCPointer<ByteVar>())

public actual fun PxeSendReply(hclientrequest: HANDLE, ppacket: Long, upacketlen: UInt, paddress: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxeSendReply(hclientrequest.toCPointer<ByteVar>(), ppacket.toCPointer<ByteVar>(), upacketlen, paddress.toCPointer<ByteVar>())

public actual fun PxeTrace(hprovider: HANDLE, severity: UInt, pszformat: PCWSTR): UInt =
    0u

public actual fun PxeTraceV(hprovider: HANDLE, severity: UInt, pszformat: PCWSTR, params: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_PxeTraceV(hprovider.toCPointer<ByteVar>(), severity, pszformat.toCPointer<ByteVar>(), params.toCPointer<ByteVar>())

public actual fun WdsBpAddOption(hhandle: HANDLE, uoption: UInt, uvaluelen: UInt, pvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsBpAddOption(hhandle.toCPointer<ByteVar>(), uoption, uvaluelen, pvalue.toCPointer<ByteVar>())

public actual fun WdsBpCloseHandle(hhandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsBpCloseHandle(hhandle.toCPointer<ByteVar>())

public actual fun WdsBpGetOptionBuffer(hhandle: HANDLE, ubufferlen: UInt, pbuffer: Long, pubytes: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsBpGetOptionBuffer(hhandle.toCPointer<ByteVar>(), ubufferlen, pbuffer.toCPointer<ByteVar>(), pubytes.toCPointer<ByteVar>())

public actual fun WdsBpInitialize(bpackettype: UByte, phhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsBpInitialize(bpackettype, phhandle.toCPointer<ByteVar>())

public actual fun WdsBpParseInitialize(ppacket: Long, upacketlen: UInt, pbpackettype: Long, phhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsBpParseInitialize(ppacket.toCPointer<ByteVar>(), upacketlen, pbpackettype.toCPointer<ByteVar>(), phhandle.toCPointer<ByteVar>())

public actual fun WdsBpParseInitializev6(ppacket: Long, upacketlen: UInt, pbpackettype: Long, phhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsBpParseInitializev6(ppacket.toCPointer<ByteVar>(), upacketlen, pbpackettype.toCPointer<ByteVar>(), phhandle.toCPointer<ByteVar>())

public actual fun WdsBpQueryOption(hhandle: HANDLE, uoption: UInt, uvaluelen: UInt, pvalue: Long, pubytes: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsBpQueryOption(hhandle.toCPointer<ByteVar>(), uoption, uvaluelen, pvalue.toCPointer<ByteVar>(), pubytes.toCPointer<ByteVar>())

public actual fun WdsCliAuthorizeSession(hsession: HANDLE, pcred: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliAuthorizeSession(hsession.toCPointer<ByteVar>(), pcred.toCPointer<ByteVar>())

public actual fun WdsCliCancelTransfer(htransfer: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliCancelTransfer(htransfer.toCPointer<ByteVar>())

public actual fun WdsCliClose(handle: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliClose(handle.toCPointer<ByteVar>())

public actual fun WdsCliCreateSession(pwszserver: PCWSTR, pcred: Long, phsession: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliCreateSession(pwszserver.toCPointer<ByteVar>(), pcred.toCPointer<ByteVar>(), phsession.toCPointer<ByteVar>())

public actual fun WdsCliFindFirstImage(hsession: HANDLE, phfindhandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliFindFirstImage(hsession.toCPointer<ByteVar>(), phfindhandle.toCPointer<ByteVar>())

public actual fun WdsCliFindNextImage(handle: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliFindNextImage(handle.toCPointer<ByteVar>())

public actual fun WdsCliFreeStringArray(ppwszarray: Long, ulcount: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliFreeStringArray(ppwszarray.toCPointer<ByteVar>(), ulcount)

public actual fun WdsCliGetDriverQueryXml(pwszwindirpath: PCWSTR, ppwszdriverquery: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliGetDriverQueryXml(pwszwindirpath.toCPointer<ByteVar>(), ppwszdriverquery.toCPointer<ByteVar>())

public actual fun WdsCliGetEnumerationFlags(handle: HANDLE, pdwflags: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliGetEnumerationFlags(handle.toCPointer<ByteVar>(), pdwflags.toCPointer<ByteVar>())

public actual fun WdsCliGetImageArchitecture(hifh: HANDLE, pdwvalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageArchitecture(hifh.toCPointer<ByteVar>(), pdwvalue.toCPointer<ByteVar>())

public actual fun WdsCliGetImageDescription(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageDescription(hifh.toCPointer<ByteVar>(), ppwszvalue.toCPointer<ByteVar>())

public actual fun WdsCliGetImageFiles(hifh: HANDLE, pppwszfiles: Long, pdwcount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageFiles(hifh.toCPointer<ByteVar>(), pppwszfiles.toCPointer<ByteVar>(), pdwcount.toCPointer<ByteVar>())

public actual fun WdsCliGetImageGroup(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageGroup(hifh.toCPointer<ByteVar>(), ppwszvalue.toCPointer<ByteVar>())

public actual fun WdsCliGetImageHalName(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageHalName(hifh.toCPointer<ByteVar>(), ppwszvalue.toCPointer<ByteVar>())

public actual fun WdsCliGetImageHandleFromFindHandle(findhandle: HANDLE, phimagehandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageHandleFromFindHandle(findhandle.toCPointer<ByteVar>(), phimagehandle.toCPointer<ByteVar>())

public actual fun WdsCliGetImageHandleFromTransferHandle(htransfer: HANDLE, phimagehandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageHandleFromTransferHandle(htransfer.toCPointer<ByteVar>(), phimagehandle.toCPointer<ByteVar>())

public actual fun WdsCliGetImageIndex(hifh: HANDLE, pdwvalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageIndex(hifh.toCPointer<ByteVar>(), pdwvalue.toCPointer<ByteVar>())

public actual fun WdsCliGetImageLanguage(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageLanguage(hifh.toCPointer<ByteVar>(), ppwszvalue.toCPointer<ByteVar>())

public actual fun WdsCliGetImageLanguages(hifh: HANDLE, pppszvalues: Long, pdwnumvalues: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageLanguages(hifh.toCPointer<ByteVar>(), pppszvalues.toCPointer<ByteVar>(), pdwnumvalues.toCPointer<ByteVar>())

public actual fun WdsCliGetImageLastModifiedTime(hifh: HANDLE, ppsystimevalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageLastModifiedTime(hifh.toCPointer<ByteVar>(), ppsystimevalue.toCPointer<ByteVar>())

public actual fun WdsCliGetImageName(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageName(hifh.toCPointer<ByteVar>(), ppwszvalue.toCPointer<ByteVar>())

public actual fun WdsCliGetImageNamespace(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageNamespace(hifh.toCPointer<ByteVar>(), ppwszvalue.toCPointer<ByteVar>())

public actual fun WdsCliGetImageParameter(hifh: HANDLE, paramtype: WDS_CLI_IMAGE_PARAM_TYPE, presponse: Long, uresponselen: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageParameter(hifh.toCPointer<ByteVar>(), paramtype, presponse.toCPointer<ByteVar>(), uresponselen)

public actual fun WdsCliGetImagePath(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliGetImagePath(hifh.toCPointer<ByteVar>(), ppwszvalue.toCPointer<ByteVar>())

public actual fun WdsCliGetImageSize(hifh: HANDLE, pullvalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageSize(hifh.toCPointer<ByteVar>(), pullvalue.toCPointer<ByteVar>())

public actual fun WdsCliGetImageType(hifh: HANDLE, pimagetype: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageType(hifh.toCPointer<ByteVar>(), pimagetype.toCPointer<ByteVar>())

public actual fun WdsCliGetImageVersion(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageVersion(hifh.toCPointer<ByteVar>(), ppwszvalue.toCPointer<ByteVar>())

public actual fun WdsCliGetTransferSize(hifh: HANDLE, pullvalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliGetTransferSize(hifh.toCPointer<ByteVar>(), pullvalue.toCPointer<ByteVar>())

public actual fun WdsCliInitializeLog(hsession: HANDLE, ulclientarchitecture: CPU_ARCHITECTURE, pwszclientid: PCWSTR, pwszclientaddress: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliInitializeLog(hsession.toCPointer<ByteVar>(), ulclientarchitecture, pwszclientid.toCPointer<ByteVar>(), pwszclientaddress.toCPointer<ByteVar>())

public actual fun WdsCliLog(hsession: HANDLE, ulloglevel: UInt, ulmessagecode: UInt): HRESULT =
    0

public actual fun WdsCliObtainDriverPackages(himage: HANDLE, ppwszservername: Long, pppwszdriverpackages: Long, pulcount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliObtainDriverPackages(himage.toCPointer<ByteVar>(), ppwszservername.toCPointer<ByteVar>(), pppwszdriverpackages.toCPointer<ByteVar>(), pulcount.toCPointer<ByteVar>())

public actual fun WdsCliObtainDriverPackagesEx(hsession: HANDLE, pwszmachineinfo: PCWSTR, ppwszservername: Long, pppwszdriverpackages: Long, pulcount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliObtainDriverPackagesEx(hsession.toCPointer<ByteVar>(), pwszmachineinfo.toCPointer<ByteVar>(), ppwszservername.toCPointer<ByteVar>(), pppwszdriverpackages.toCPointer<ByteVar>(), pulcount.toCPointer<ByteVar>())

public actual fun WdsCliRegisterTrace(pfn: PFN_WdsCliTraceFunction): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliRegisterTrace(pfn.toLong().toCPointer<ByteVar>())

public actual fun WdsCliSetTransferBufferSize(ulsizeinbytes: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliSetTransferBufferSize(ulsizeinbytes)
}

public actual fun WdsCliTransferFile(pwszserver: PCWSTR, pwsznamespace: PCWSTR, pwszremotefilepath: PCWSTR, pwszlocalfilepath: PCWSTR, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PFN_WdsCliCallback, pvuserdata: Long, phtransfer: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliTransferFile(pwszserver.toCPointer<ByteVar>(), pwsznamespace.toCPointer<ByteVar>(), pwszremotefilepath.toCPointer<ByteVar>(), pwszlocalfilepath.toCPointer<ByteVar>(), dwflags, dwreserved, pfnwdsclicallback.toLong().toCPointer<ByteVar>(), pvuserdata.toCPointer<ByteVar>(), phtransfer.toCPointer<ByteVar>())

public actual fun WdsCliTransferImage(himage: HANDLE, pwszlocalpath: PCWSTR, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PFN_WdsCliCallback, pvuserdata: Long, phtransfer: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliTransferImage(himage.toCPointer<ByteVar>(), pwszlocalpath.toCPointer<ByteVar>(), dwflags, dwreserved, pfnwdsclicallback.toLong().toCPointer<ByteVar>(), pvuserdata.toCPointer<ByteVar>(), phtransfer.toCPointer<ByteVar>())

public actual fun WdsCliWaitForTransfer(htransfer: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsCliWaitForTransfer(htransfer.toCPointer<ByteVar>())

public actual fun WdsTransportClientAddRefBuffer(pvbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsTransportClientAddRefBuffer(pvbuffer.toCPointer<ByteVar>())

public actual fun WdsTransportClientCancelSession(hsessionkey: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsTransportClientCancelSession(hsessionkey.toCPointer<ByteVar>())

public actual fun WdsTransportClientCancelSessionEx(hsessionkey: HANDLE, dwerrorcode: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsTransportClientCancelSessionEx(hsessionkey.toCPointer<ByteVar>(), dwerrorcode)

public actual fun WdsTransportClientCloseSession(hsessionkey: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsTransportClientCloseSession(hsessionkey.toCPointer<ByteVar>())

public actual fun WdsTransportClientCompleteReceive(hsessionkey: HANDLE, ulsize: UInt, pulloffset: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsTransportClientCompleteReceive(hsessionkey.toCPointer<ByteVar>(), ulsize, pulloffset.toCPointer<ByteVar>())

public actual fun WdsTransportClientInitialize(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsTransportClientInitialize()

public actual fun WdsTransportClientInitializeSession(psessionrequest: Long, pcallerdata: Long, hsessionkey: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsTransportClientInitializeSession(psessionrequest.toCPointer<ByteVar>(), pcallerdata.toCPointer<ByteVar>(), hsessionkey.toCPointer<ByteVar>())

public actual fun WdsTransportClientQueryStatus(hsessionkey: HANDLE, pustatus: Long, puerrorcode: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsTransportClientQueryStatus(hsessionkey.toCPointer<ByteVar>(), pustatus.toCPointer<ByteVar>(), puerrorcode.toCPointer<ByteVar>())

public actual fun WdsTransportClientRegisterCallback(hsessionkey: HANDLE, callbackid: TRANSPORTCLIENT_CALLBACK_ID, pfncallback: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsTransportClientRegisterCallback(hsessionkey.toCPointer<ByteVar>(), callbackid, pfncallback.toCPointer<ByteVar>())

public actual fun WdsTransportClientReleaseBuffer(pvbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsTransportClientReleaseBuffer(pvbuffer.toCPointer<ByteVar>())

public actual fun WdsTransportClientShutdown(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsTransportClientShutdown()

public actual fun WdsTransportClientStartSession(hsessionkey: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsTransportClientStartSession(hsessionkey.toCPointer<ByteVar>())

public actual fun WdsTransportClientWaitForCompletion(hsessionkey: HANDLE, utimeout: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsTransportClientWaitForCompletion(hsessionkey.toCPointer<ByteVar>(), utimeout)

public actual fun WdsTransportServerAllocateBuffer(hprovider: HANDLE, ulbuffersize: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsTransportServerAllocateBuffer(hprovider.toCPointer<ByteVar>(), ulbuffersize)?.toLong() ?: 0L

public actual fun WdsTransportServerCompleteRead(hprovider: HANDLE, ulbytesread: UInt, pvuserdata: Long, hreadresult: HRESULT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsTransportServerCompleteRead(hprovider.toCPointer<ByteVar>(), ulbytesread, pvuserdata.toCPointer<ByteVar>(), hreadresult)

public actual fun WdsTransportServerFreeBuffer(hprovider: HANDLE, pvbuffer: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsTransportServerFreeBuffer(hprovider.toCPointer<ByteVar>(), pvbuffer.toCPointer<ByteVar>())

public actual fun WdsTransportServerRegisterCallback(hprovider: HANDLE, callbackid: TRANSPORTPROVIDER_CALLBACK_ID, pfncallback: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsTransportServerRegisterCallback(hprovider.toCPointer<ByteVar>(), callbackid, pfncallback.toCPointer<ByteVar>())

public actual fun WdsTransportServerTrace(hprovider: HANDLE, severity: UInt, pwszformat: PCWSTR): HRESULT =
    0

public actual fun WdsTransportServerTraceV(hprovider: HANDLE, severity: UInt, pwszformat: PCWSTR, params: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_WdsTransportServerTraceV(hprovider.toCPointer<ByteVar>(), severity, pwszformat.toCPointer<ByteVar>(), params.toCPointer<ByteVar>())
