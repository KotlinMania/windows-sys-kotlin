@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private val _windowsWin32SystemDeploymentservicesNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun PxeAsyncRecvDone(hclientrequest: HANDLE, action: UInt): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxeAsyncRecvDone(hclientrequest.toString(), action.toInt()) as Int).toUInt() else 0u

public actual fun PxeDhcpAppendOption(preplypacket: Long, umaxreplypacketlen: UInt, pureplypacketlen: Long, boption: UByte, boptionlen: UByte, pvalue: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxeDhcpAppendOption(preplypacket.toString(), umaxreplypacketlen.toInt(), pureplypacketlen.toString(), boption.toInt(), boptionlen.toInt(), pvalue.toString()) as Int).toUInt() else 0u

public actual fun PxeDhcpAppendOptionRaw(preplypacket: Long, umaxreplypacketlen: UInt, pureplypacketlen: Long, ubufferlen: UShort, pbuffer: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxeDhcpAppendOptionRaw(preplypacket.toString(), umaxreplypacketlen.toInt(), pureplypacketlen.toString(), ubufferlen.toInt(), pbuffer.toString()) as Int).toUInt() else 0u

public actual fun PxeDhcpGetOptionValue(ppacket: Long, upacketlen: UInt, uinstance: UInt, boption: UByte, pboptionlen: Long, ppoptionvalue: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxeDhcpGetOptionValue(ppacket.toString(), upacketlen.toInt(), uinstance.toInt(), boption.toInt(), pboptionlen.toString(), ppoptionvalue.toString()) as Int).toUInt() else 0u

public actual fun PxeDhcpGetVendorOptionValue(ppacket: Long, upacketlen: UInt, boption: UByte, uinstance: UInt, pboptionlen: Long, ppoptionvalue: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxeDhcpGetVendorOptionValue(ppacket.toString(), upacketlen.toInt(), boption.toInt(), uinstance.toInt(), pboptionlen.toString(), ppoptionvalue.toString()) as Int).toUInt() else 0u

public actual fun PxeDhcpInitialize(precvpacket: Long, urecvpacketlen: UInt, preplypacket: Long, umaxreplypacketlen: UInt, pureplypacketlen: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxeDhcpInitialize(precvpacket.toString(), urecvpacketlen.toInt(), preplypacket.toString(), umaxreplypacketlen.toInt(), pureplypacketlen.toString()) as Int).toUInt() else 0u

public actual fun PxeDhcpIsValid(ppacket: Long, upacketlen: UInt, brequestpacket: BOOL, pbpxeoptionpresent: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxeDhcpIsValid(ppacket.toString(), upacketlen.toInt(), brequestpacket, pbpxeoptionpresent.toString()) as Int).toUInt() else 0u

public actual fun PxeDhcpv6AppendOption(preply: Long, cbreply: UInt, pcbreplyused: Long, woptiontype: UShort, cboption: UShort, poption: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxeDhcpv6AppendOption(preply.toString(), cbreply.toInt(), pcbreplyused.toString(), woptiontype.toInt(), cboption.toInt(), poption.toString()) as Int).toUInt() else 0u

public actual fun PxeDhcpv6AppendOptionRaw(preply: Long, cbreply: UInt, pcbreplyused: Long, cbbuffer: UShort, pbuffer: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxeDhcpv6AppendOptionRaw(preply.toString(), cbreply.toInt(), pcbreplyused.toString(), cbbuffer.toInt(), pbuffer.toString()) as Int).toUInt() else 0u

public actual fun PxeDhcpv6CreateRelayRepl(prelaymessages: Long, nrelaymessages: UInt, pinnerpacket: Long, cbinnerpacket: UInt, preplybuffer: Long, cbreplybuffer: UInt, pcbreplybuffer: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxeDhcpv6CreateRelayRepl(prelaymessages.toString(), nrelaymessages.toInt(), pinnerpacket.toString(), cbinnerpacket.toInt(), preplybuffer.toString(), cbreplybuffer.toInt(), pcbreplybuffer.toString()) as Int).toUInt() else 0u

public actual fun PxeDhcpv6GetOptionValue(ppacket: Long, upacketlen: UInt, uinstance: UInt, woption: UShort, pwoptionlen: Long, ppoptionvalue: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxeDhcpv6GetOptionValue(ppacket.toString(), upacketlen.toInt(), uinstance.toInt(), woption.toInt(), pwoptionlen.toString(), ppoptionvalue.toString()) as Int).toUInt() else 0u

public actual fun PxeDhcpv6GetVendorOptionValue(ppacket: Long, upacketlen: UInt, dwenterprisenumber: UInt, woption: UShort, uinstance: UInt, pwoptionlen: Long, ppoptionvalue: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxeDhcpv6GetVendorOptionValue(ppacket.toString(), upacketlen.toInt(), dwenterprisenumber.toInt(), woption.toInt(), uinstance.toInt(), pwoptionlen.toString(), ppoptionvalue.toString()) as Int).toUInt() else 0u

public actual fun PxeDhcpv6Initialize(prequest: Long, cbrequest: UInt, preply: Long, cbreply: UInt, pcbreplyused: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxeDhcpv6Initialize(prequest.toString(), cbrequest.toInt(), preply.toString(), cbreply.toInt(), pcbreplyused.toString()) as Int).toUInt() else 0u

public actual fun PxeDhcpv6IsValid(ppacket: Long, upacketlen: UInt, brequestpacket: BOOL, pbpxeoptionpresent: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxeDhcpv6IsValid(ppacket.toString(), upacketlen.toInt(), brequestpacket, pbpxeoptionpresent.toString()) as Int).toUInt() else 0u

public actual fun PxeDhcpv6ParseRelayForw(prelayforwpacket: Long, urelayforwpacketlen: UInt, prelaymessages: Long, nrelaymessages: UInt, pnrelaymessages: Long, ppinnerpacket: Long, pcbinnerpacket: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxeDhcpv6ParseRelayForw(prelayforwpacket.toString(), urelayforwpacketlen.toInt(), prelaymessages.toString(), nrelaymessages.toInt(), pnrelaymessages.toString(), ppinnerpacket.toString(), pcbinnerpacket.toString()) as Int).toUInt() else 0u

public actual fun PxeGetServerInfo(uinfotype: UInt, pbuffer: Long, ubufferlen: UInt): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxeGetServerInfo(uinfotype.toInt(), pbuffer.toString(), ubufferlen.toInt()) as Int).toUInt() else 0u

public actual fun PxeGetServerInfoEx(uinfotype: UInt, pbuffer: Long, ubufferlen: UInt, pubufferused: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxeGetServerInfoEx(uinfotype.toInt(), pbuffer.toString(), ubufferlen.toInt(), pubufferused.toString()) as Int).toUInt() else 0u

public actual fun PxePacketAllocate(hprovider: HANDLE, hclientrequest: HANDLE, usize: UInt): Long =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxePacketAllocate(hprovider.toString(), hclientrequest.toString(), usize.toInt()) as String).toLong() else 0L

public actual fun PxePacketFree(hprovider: HANDLE, hclientrequest: HANDLE, ppacket: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxePacketFree(hprovider.toString(), hclientrequest.toString(), ppacket.toString()) as Int).toUInt() else 0u

public actual fun PxeProviderEnumClose(henum: HANDLE): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxeProviderEnumClose(henum.toString()) as Int).toUInt() else 0u

public actual fun PxeProviderEnumFirst(phenum: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxeProviderEnumFirst(phenum.toString()) as Int).toUInt() else 0u

public actual fun PxeProviderEnumNext(henum: HANDLE, ppprovider: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxeProviderEnumNext(henum.toString(), ppprovider.toString()) as Int).toUInt() else 0u

public actual fun PxeProviderFreeInfo(pprovider: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxeProviderFreeInfo(pprovider.toString()) as Int).toUInt() else 0u

public actual fun PxeProviderQueryIndex(pszprovidername: PCWSTR, puindex: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxeProviderQueryIndex(pszprovidername.toString(), puindex.toString()) as Int).toUInt() else 0u

public actual fun PxeProviderRegister(pszprovidername: PCWSTR, pszmodulepath: PCWSTR, index: UInt, biscritical: BOOL, phproviderkey: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxeProviderRegister(pszprovidername.toString(), pszmodulepath.toString(), index.toInt(), biscritical, phproviderkey.toString()) as Int).toUInt() else 0u

public actual fun PxeProviderSetAttribute(hprovider: HANDLE, attribute: UInt, pparameterbuffer: Long, uparamlen: UInt): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxeProviderSetAttribute(hprovider.toString(), attribute.toInt(), pparameterbuffer.toString(), uparamlen.toInt()) as Int).toUInt() else 0u

public actual fun PxeProviderUnRegister(pszprovidername: PCWSTR): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxeProviderUnRegister(pszprovidername.toString()) as Int).toUInt() else 0u

public actual fun PxeRegisterCallback(hprovider: HANDLE, callbacktype: UInt, pcallbackfunction: Long, pcontext: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxeRegisterCallback(hprovider.toString(), callbacktype.toInt(), pcallbackfunction.toString(), pcontext.toString()) as Int).toUInt() else 0u

public actual fun PxeSendReply(hclientrequest: HANDLE, ppacket: Long, upacketlen: UInt, paddress: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxeSendReply(hclientrequest.toString(), ppacket.toString(), upacketlen.toInt(), paddress.toString()) as Int).toUInt() else 0u

public actual fun PxeTrace(hprovider: HANDLE, severity: UInt, pszformat: PCWSTR): UInt =
    0u

public actual fun PxeTraceV(hprovider: HANDLE, severity: UInt, pszformat: PCWSTR, params: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_PxeTraceV(hprovider.toString(), severity.toInt(), pszformat.toString(), params.toString()) as Int).toUInt() else 0u

public actual fun WdsBpAddOption(hhandle: HANDLE, uoption: UInt, uvaluelen: UInt, pvalue: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsBpAddOption(hhandle.toString(), uoption.toInt(), uvaluelen.toInt(), pvalue.toString()) as Int).toUInt() else 0u

public actual fun WdsBpCloseHandle(hhandle: HANDLE): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsBpCloseHandle(hhandle.toString()) as Int).toUInt() else 0u

public actual fun WdsBpGetOptionBuffer(hhandle: HANDLE, ubufferlen: UInt, pbuffer: Long, pubytes: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsBpGetOptionBuffer(hhandle.toString(), ubufferlen.toInt(), pbuffer.toString(), pubytes.toString()) as Int).toUInt() else 0u

public actual fun WdsBpInitialize(bpackettype: UByte, phhandle: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsBpInitialize(bpackettype.toInt(), phhandle.toString()) as Int).toUInt() else 0u

public actual fun WdsBpParseInitialize(ppacket: Long, upacketlen: UInt, pbpackettype: Long, phhandle: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsBpParseInitialize(ppacket.toString(), upacketlen.toInt(), pbpackettype.toString(), phhandle.toString()) as Int).toUInt() else 0u

public actual fun WdsBpParseInitializev6(ppacket: Long, upacketlen: UInt, pbpackettype: Long, phhandle: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsBpParseInitializev6(ppacket.toString(), upacketlen.toInt(), pbpackettype.toString(), phhandle.toString()) as Int).toUInt() else 0u

public actual fun WdsBpQueryOption(hhandle: HANDLE, uoption: UInt, uvaluelen: UInt, pvalue: Long, pubytes: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsBpQueryOption(hhandle.toString(), uoption.toInt(), uvaluelen.toInt(), pvalue.toString(), pubytes.toString()) as Int).toUInt() else 0u

public actual fun WdsCliAuthorizeSession(hsession: HANDLE, pcred: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliAuthorizeSession(hsession.toString(), pcred.toString()) as Int) else 0

public actual fun WdsCliCancelTransfer(htransfer: HANDLE): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliCancelTransfer(htransfer.toString()) as Int) else 0

public actual fun WdsCliClose(handle: HANDLE): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliClose(handle.toString()) as Int) else 0

public actual fun WdsCliCreateSession(pwszserver: PCWSTR, pcred: Long, phsession: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliCreateSession(pwszserver.toString(), pcred.toString(), phsession.toString()) as Int) else 0

public actual fun WdsCliFindFirstImage(hsession: HANDLE, phfindhandle: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliFindFirstImage(hsession.toString(), phfindhandle.toString()) as Int) else 0

public actual fun WdsCliFindNextImage(handle: HANDLE): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliFindNextImage(handle.toString()) as Int) else 0

public actual fun WdsCliFreeStringArray(ppwszarray: Long, ulcount: UInt): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliFreeStringArray(ppwszarray.toString(), ulcount.toInt()) as Int) else 0

public actual fun WdsCliGetDriverQueryXml(pwszwindirpath: PCWSTR, ppwszdriverquery: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliGetDriverQueryXml(pwszwindirpath.toString(), ppwszdriverquery.toString()) as Int) else 0

public actual fun WdsCliGetEnumerationFlags(handle: HANDLE, pdwflags: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliGetEnumerationFlags(handle.toString(), pdwflags.toString()) as Int) else 0

public actual fun WdsCliGetImageArchitecture(hifh: HANDLE, pdwvalue: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageArchitecture(hifh.toString(), pdwvalue.toString()) as Int) else 0

public actual fun WdsCliGetImageDescription(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageDescription(hifh.toString(), ppwszvalue.toString()) as Int) else 0

public actual fun WdsCliGetImageFiles(hifh: HANDLE, pppwszfiles: Long, pdwcount: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageFiles(hifh.toString(), pppwszfiles.toString(), pdwcount.toString()) as Int) else 0

public actual fun WdsCliGetImageGroup(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageGroup(hifh.toString(), ppwszvalue.toString()) as Int) else 0

public actual fun WdsCliGetImageHalName(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageHalName(hifh.toString(), ppwszvalue.toString()) as Int) else 0

public actual fun WdsCliGetImageHandleFromFindHandle(findhandle: HANDLE, phimagehandle: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageHandleFromFindHandle(findhandle.toString(), phimagehandle.toString()) as Int) else 0

public actual fun WdsCliGetImageHandleFromTransferHandle(htransfer: HANDLE, phimagehandle: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageHandleFromTransferHandle(htransfer.toString(), phimagehandle.toString()) as Int) else 0

public actual fun WdsCliGetImageIndex(hifh: HANDLE, pdwvalue: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageIndex(hifh.toString(), pdwvalue.toString()) as Int) else 0

public actual fun WdsCliGetImageLanguage(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageLanguage(hifh.toString(), ppwszvalue.toString()) as Int) else 0

public actual fun WdsCliGetImageLanguages(hifh: HANDLE, pppszvalues: Long, pdwnumvalues: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageLanguages(hifh.toString(), pppszvalues.toString(), pdwnumvalues.toString()) as Int) else 0

public actual fun WdsCliGetImageLastModifiedTime(hifh: HANDLE, ppsystimevalue: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageLastModifiedTime(hifh.toString(), ppsystimevalue.toString()) as Int) else 0

public actual fun WdsCliGetImageName(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageName(hifh.toString(), ppwszvalue.toString()) as Int) else 0

public actual fun WdsCliGetImageNamespace(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageNamespace(hifh.toString(), ppwszvalue.toString()) as Int) else 0

public actual fun WdsCliGetImageParameter(hifh: HANDLE, paramtype: WDS_CLI_IMAGE_PARAM_TYPE, presponse: Long, uresponselen: UInt): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageParameter(hifh.toString(), paramtype, presponse.toString(), uresponselen.toInt()) as Int) else 0

public actual fun WdsCliGetImagePath(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliGetImagePath(hifh.toString(), ppwszvalue.toString()) as Int) else 0

public actual fun WdsCliGetImageSize(hifh: HANDLE, pullvalue: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageSize(hifh.toString(), pullvalue.toString()) as Int) else 0

public actual fun WdsCliGetImageType(hifh: HANDLE, pimagetype: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageType(hifh.toString(), pimagetype.toString()) as Int) else 0

public actual fun WdsCliGetImageVersion(hifh: HANDLE, ppwszvalue: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliGetImageVersion(hifh.toString(), ppwszvalue.toString()) as Int) else 0

public actual fun WdsCliGetTransferSize(hifh: HANDLE, pullvalue: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliGetTransferSize(hifh.toString(), pullvalue.toString()) as Int) else 0

public actual fun WdsCliInitializeLog(hsession: HANDLE, ulclientarchitecture: CPU_ARCHITECTURE, pwszclientid: PCWSTR, pwszclientaddress: PCWSTR): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliInitializeLog(hsession.toString(), ulclientarchitecture.toInt(), pwszclientid.toString(), pwszclientaddress.toString()) as Int) else 0

public actual fun WdsCliLog(hsession: HANDLE, ulloglevel: UInt, ulmessagecode: UInt): HRESULT =
    0

public actual fun WdsCliObtainDriverPackages(himage: HANDLE, ppwszservername: Long, pppwszdriverpackages: Long, pulcount: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliObtainDriverPackages(himage.toString(), ppwszservername.toString(), pppwszdriverpackages.toString(), pulcount.toString()) as Int) else 0

public actual fun WdsCliObtainDriverPackagesEx(hsession: HANDLE, pwszmachineinfo: PCWSTR, ppwszservername: Long, pppwszdriverpackages: Long, pulcount: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliObtainDriverPackagesEx(hsession.toString(), pwszmachineinfo.toString(), ppwszservername.toString(), pppwszdriverpackages.toString(), pulcount.toString()) as Int) else 0

public actual fun WdsCliRegisterTrace(pfn: PFN_WdsCliTraceFunction): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliRegisterTrace(pfn.toLong().toString()) as Int) else 0

public actual fun WdsCliSetTransferBufferSize(ulsizeinbytes: UInt) {
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) {
        _windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliSetTransferBufferSize(ulsizeinbytes.toInt())
    }
}

public actual fun WdsCliTransferFile(pwszserver: PCWSTR, pwsznamespace: PCWSTR, pwszremotefilepath: PCWSTR, pwszlocalfilepath: PCWSTR, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PFN_WdsCliCallback, pvuserdata: Long, phtransfer: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliTransferFile(pwszserver.toString(), pwsznamespace.toString(), pwszremotefilepath.toString(), pwszlocalfilepath.toString(), dwflags.toInt(), dwreserved.toInt(), pfnwdsclicallback.toLong().toString(), pvuserdata.toString(), phtransfer.toString()) as Int) else 0

public actual fun WdsCliTransferImage(himage: HANDLE, pwszlocalpath: PCWSTR, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PFN_WdsCliCallback, pvuserdata: Long, phtransfer: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliTransferImage(himage.toString(), pwszlocalpath.toString(), dwflags.toInt(), dwreserved.toInt(), pfnwdsclicallback.toLong().toString(), pvuserdata.toString(), phtransfer.toString()) as Int) else 0

public actual fun WdsCliWaitForTransfer(htransfer: HANDLE): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsCliWaitForTransfer(htransfer.toString()) as Int) else 0

public actual fun WdsTransportClientAddRefBuffer(pvbuffer: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsTransportClientAddRefBuffer(pvbuffer.toString()) as Int).toUInt() else 0u

public actual fun WdsTransportClientCancelSession(hsessionkey: HANDLE): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsTransportClientCancelSession(hsessionkey.toString()) as Int).toUInt() else 0u

public actual fun WdsTransportClientCancelSessionEx(hsessionkey: HANDLE, dwerrorcode: UInt): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsTransportClientCancelSessionEx(hsessionkey.toString(), dwerrorcode.toInt()) as Int).toUInt() else 0u

public actual fun WdsTransportClientCloseSession(hsessionkey: HANDLE): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsTransportClientCloseSession(hsessionkey.toString()) as Int).toUInt() else 0u

public actual fun WdsTransportClientCompleteReceive(hsessionkey: HANDLE, ulsize: UInt, pulloffset: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsTransportClientCompleteReceive(hsessionkey.toString(), ulsize.toInt(), pulloffset.toString()) as Int).toUInt() else 0u

public actual fun WdsTransportClientInitialize(): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsTransportClientInitialize() as Int).toUInt() else 0u

public actual fun WdsTransportClientInitializeSession(psessionrequest: Long, pcallerdata: Long, hsessionkey: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsTransportClientInitializeSession(psessionrequest.toString(), pcallerdata.toString(), hsessionkey.toString()) as Int).toUInt() else 0u

public actual fun WdsTransportClientQueryStatus(hsessionkey: HANDLE, pustatus: Long, puerrorcode: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsTransportClientQueryStatus(hsessionkey.toString(), pustatus.toString(), puerrorcode.toString()) as Int).toUInt() else 0u

public actual fun WdsTransportClientRegisterCallback(hsessionkey: HANDLE, callbackid: TRANSPORTCLIENT_CALLBACK_ID, pfncallback: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsTransportClientRegisterCallback(hsessionkey.toString(), callbackid, pfncallback.toString()) as Int).toUInt() else 0u

public actual fun WdsTransportClientReleaseBuffer(pvbuffer: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsTransportClientReleaseBuffer(pvbuffer.toString()) as Int).toUInt() else 0u

public actual fun WdsTransportClientShutdown(): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsTransportClientShutdown() as Int).toUInt() else 0u

public actual fun WdsTransportClientStartSession(hsessionkey: HANDLE): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsTransportClientStartSession(hsessionkey.toString()) as Int).toUInt() else 0u

public actual fun WdsTransportClientWaitForCompletion(hsessionkey: HANDLE, utimeout: UInt): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsTransportClientWaitForCompletion(hsessionkey.toString(), utimeout.toInt()) as Int).toUInt() else 0u

public actual fun WdsTransportServerAllocateBuffer(hprovider: HANDLE, ulbuffersize: UInt): Long =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsTransportServerAllocateBuffer(hprovider.toString(), ulbuffersize.toInt()) as String).toLong() else 0L

public actual fun WdsTransportServerCompleteRead(hprovider: HANDLE, ulbytesread: UInt, pvuserdata: Long, hreadresult: HRESULT): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsTransportServerCompleteRead(hprovider.toString(), ulbytesread.toInt(), pvuserdata.toString(), hreadresult) as Int) else 0

public actual fun WdsTransportServerFreeBuffer(hprovider: HANDLE, pvbuffer: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsTransportServerFreeBuffer(hprovider.toString(), pvbuffer.toString()) as Int) else 0

public actual fun WdsTransportServerRegisterCallback(hprovider: HANDLE, callbackid: TRANSPORTPROVIDER_CALLBACK_ID, pfncallback: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsTransportServerRegisterCallback(hprovider.toString(), callbackid, pfncallback.toString()) as Int) else 0

public actual fun WdsTransportServerTrace(hprovider: HANDLE, severity: UInt, pwszformat: PCWSTR): HRESULT =
    0

public actual fun WdsTransportServerTraceV(hprovider: HANDLE, severity: UInt, pwszformat: PCWSTR, params: Long): HRESULT =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_WdsTransportServerTraceV(hprovider.toString(), severity.toInt(), pwszformat.toString(), params.toString()) as Int) else 0
