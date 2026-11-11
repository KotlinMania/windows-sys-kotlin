@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeAsyncRecvDone
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeDhcpAppendOption
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeDhcpAppendOptionRaw
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeDhcpGetOptionValue
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeDhcpGetVendorOptionValue
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeDhcpInitialize
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeDhcpIsValid
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeDhcpv6AppendOption
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeDhcpv6AppendOptionRaw
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeDhcpv6CreateRelayRepl
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeDhcpv6GetOptionValue
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeDhcpv6GetVendorOptionValue
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeDhcpv6Initialize
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeDhcpv6IsValid
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeDhcpv6ParseRelayForw
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeGetServerInfo
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeGetServerInfoEx
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxePacketAllocate
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxePacketFree
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeProviderEnumClose
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeProviderEnumFirst
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeProviderEnumNext
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeProviderFreeInfo
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeProviderQueryIndex
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeProviderRegister
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeProviderSetAttribute
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeProviderUnRegister
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeRegisterCallback
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeSendReply
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeTrace
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_pxeTraceV
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsBpAddOption
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsBpCloseHandle
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsBpGetOptionBuffer
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsBpInitialize
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsBpParseInitialize
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsBpParseInitializev6
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsBpQueryOption
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliAuthorizeSession
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliCancelTransfer
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliClose
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliCreateSession
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliFindFirstImage
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliFindNextImage
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliFreeStringArray
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliGetDriverQueryXml
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliGetEnumerationFlags
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageArchitecture
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageDescription
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageFiles
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageGroup
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageHalName
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageHandleFromFindHandle
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageHandleFromTransferHandle
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageIndex
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageLanguage
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageLanguages
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageLastModifiedTime
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageName
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageNamespace
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageParameter
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliGetImagePath
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageSize
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageType
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageVersion
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliGetTransferSize
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliInitializeLog
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliLog
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliObtainDriverPackages
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliObtainDriverPackagesEx
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliRegisterTrace
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliSetTransferBufferSize
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliTransferFile
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliTransferImage
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsCliWaitForTransfer
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsTransportClientAddRefBuffer
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsTransportClientCancelSession
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsTransportClientCancelSessionEx
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsTransportClientCloseSession
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsTransportClientCompleteReceive
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsTransportClientInitialize
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsTransportClientInitializeSession
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsTransportClientQueryStatus
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsTransportClientRegisterCallback
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsTransportClientReleaseBuffer
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsTransportClientShutdown
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsTransportClientStartSession
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsTransportClientWaitForCompletion
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsTransportServerAllocateBuffer
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsTransportServerCompleteRead
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsTransportServerFreeBuffer
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsTransportServerRegisterCallback
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsTransportServerTrace
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssys_windows_win32_system_deploymentservices_wdsTransportServerTraceV
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun pxeAsyncRecvDone(hclientrequest: Handle, action: UInt): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeAsyncRecvDone(hclientrequest?.value?.toCPointer<ByteVar>(), action)

public actual fun pxeDhcpAppendOption(preplypacket: COpaquePointer?, umaxreplypacketlen: UInt, pureplypacketlen: COpaquePointer?, boption: UByte, boptionlen: UByte, pvalue: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeDhcpAppendOption(preplypacket?.value?.toCPointer<ByteVar>(), umaxreplypacketlen, pureplypacketlen?.value?.toCPointer<ByteVar>(), boption, boptionlen, pvalue?.value?.toCPointer<ByteVar>())

public actual fun pxeDhcpAppendOptionRaw(preplypacket: COpaquePointer?, umaxreplypacketlen: UInt, pureplypacketlen: COpaquePointer?, ubufferlen: UShort, pbuffer: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeDhcpAppendOptionRaw(preplypacket?.value?.toCPointer<ByteVar>(), umaxreplypacketlen, pureplypacketlen?.value?.toCPointer<ByteVar>(), ubufferlen, pbuffer?.value?.toCPointer<ByteVar>())

public actual fun pxeDhcpGetOptionValue(ppacket: COpaquePointer?, upacketlen: UInt, uinstance: UInt, boption: UByte, pboptionlen: COpaquePointer?, ppoptionvalue: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeDhcpGetOptionValue(ppacket?.value?.toCPointer<ByteVar>(), upacketlen, uinstance, boption, pboptionlen?.value?.toCPointer<ByteVar>(), ppoptionvalue?.value?.toCPointer<ByteVar>())

public actual fun pxeDhcpGetVendorOptionValue(ppacket: COpaquePointer?, upacketlen: UInt, boption: UByte, uinstance: UInt, pboptionlen: COpaquePointer?, ppoptionvalue: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeDhcpGetVendorOptionValue(ppacket?.value?.toCPointer<ByteVar>(), upacketlen, boption, uinstance, pboptionlen?.value?.toCPointer<ByteVar>(), ppoptionvalue?.value?.toCPointer<ByteVar>())

public actual fun pxeDhcpInitialize(precvpacket: COpaquePointer?, urecvpacketlen: UInt, preplypacket: COpaquePointer?, umaxreplypacketlen: UInt, pureplypacketlen: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeDhcpInitialize(precvpacket?.value?.toCPointer<ByteVar>(), urecvpacketlen, preplypacket?.value?.toCPointer<ByteVar>(), umaxreplypacketlen, pureplypacketlen?.value?.toCPointer<ByteVar>())

public actual fun pxeDhcpIsValid(ppacket: COpaquePointer?, upacketlen: UInt, brequestpacket: Bool, pbpxeoptionpresent: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeDhcpIsValid(ppacket?.value?.toCPointer<ByteVar>(), upacketlen, brequestpacket, pbpxeoptionpresent?.value?.toCPointer<ByteVar>())

public actual fun pxeDhcpv6AppendOption(preply: COpaquePointer?, cbreply: UInt, pcbreplyused: COpaquePointer?, woptiontype: UShort, cboption: UShort, poption: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeDhcpv6AppendOption(preply?.value?.toCPointer<ByteVar>(), cbreply, pcbreplyused?.value?.toCPointer<ByteVar>(), woptiontype, cboption, poption?.value?.toCPointer<ByteVar>())

public actual fun pxeDhcpv6AppendOptionRaw(preply: COpaquePointer?, cbreply: UInt, pcbreplyused: COpaquePointer?, cbbuffer: UShort, pbuffer: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeDhcpv6AppendOptionRaw(preply?.value?.toCPointer<ByteVar>(), cbreply, pcbreplyused?.value?.toCPointer<ByteVar>(), cbbuffer, pbuffer?.value?.toCPointer<ByteVar>())

public actual fun pxeDhcpv6CreateRelayRepl(prelaymessages: COpaquePointer?, nrelaymessages: UInt, pinnerpacket: COpaquePointer?, cbinnerpacket: UInt, preplybuffer: COpaquePointer?, cbreplybuffer: UInt, pcbreplybuffer: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeDhcpv6CreateRelayRepl(prelaymessages?.value?.toCPointer<ByteVar>(), nrelaymessages, pinnerpacket?.value?.toCPointer<ByteVar>(), cbinnerpacket, preplybuffer?.value?.toCPointer<ByteVar>(), cbreplybuffer, pcbreplybuffer?.value?.toCPointer<ByteVar>())

public actual fun pxeDhcpv6GetOptionValue(ppacket: COpaquePointer?, upacketlen: UInt, uinstance: UInt, woption: UShort, pwoptionlen: COpaquePointer?, ppoptionvalue: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeDhcpv6GetOptionValue(ppacket?.value?.toCPointer<ByteVar>(), upacketlen, uinstance, woption, pwoptionlen?.value?.toCPointer<ByteVar>(), ppoptionvalue?.value?.toCPointer<ByteVar>())

public actual fun pxeDhcpv6GetVendorOptionValue(ppacket: COpaquePointer?, upacketlen: UInt, dwenterprisenumber: UInt, woption: UShort, uinstance: UInt, pwoptionlen: COpaquePointer?, ppoptionvalue: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeDhcpv6GetVendorOptionValue(ppacket?.value?.toCPointer<ByteVar>(), upacketlen, dwenterprisenumber, woption, uinstance, pwoptionlen?.value?.toCPointer<ByteVar>(), ppoptionvalue?.value?.toCPointer<ByteVar>())

public actual fun pxeDhcpv6Initialize(prequest: COpaquePointer?, cbrequest: UInt, preply: COpaquePointer?, cbreply: UInt, pcbreplyused: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeDhcpv6Initialize(prequest?.value?.toCPointer<ByteVar>(), cbrequest, preply?.value?.toCPointer<ByteVar>(), cbreply, pcbreplyused?.value?.toCPointer<ByteVar>())

public actual fun pxeDhcpv6IsValid(ppacket: COpaquePointer?, upacketlen: UInt, brequestpacket: Bool, pbpxeoptionpresent: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeDhcpv6IsValid(ppacket?.value?.toCPointer<ByteVar>(), upacketlen, brequestpacket, pbpxeoptionpresent?.value?.toCPointer<ByteVar>())

public actual fun pxeDhcpv6ParseRelayForw(prelayforwpacket: COpaquePointer?, urelayforwpacketlen: UInt, prelaymessages: COpaquePointer?, nrelaymessages: UInt, pnrelaymessages: COpaquePointer?, ppinnerpacket: COpaquePointer?, pcbinnerpacket: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeDhcpv6ParseRelayForw(prelayforwpacket?.value?.toCPointer<ByteVar>(), urelayforwpacketlen, prelaymessages?.value?.toCPointer<ByteVar>(), nrelaymessages, pnrelaymessages?.value?.toCPointer<ByteVar>(), ppinnerpacket?.value?.toCPointer<ByteVar>(), pcbinnerpacket?.value?.toCPointer<ByteVar>())

public actual fun pxeGetServerInfo(uinfotype: UInt, pbuffer: COpaquePointer?, ubufferlen: UInt): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeGetServerInfo(uinfotype, pbuffer?.value?.toCPointer<ByteVar>(), ubufferlen)

public actual fun pxeGetServerInfoEx(uinfotype: UInt, pbuffer: COpaquePointer?, ubufferlen: UInt, pubufferused: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeGetServerInfoEx(uinfotype, pbuffer?.value?.toCPointer<ByteVar>(), ubufferlen, pubufferused?.value?.toCPointer<ByteVar>())

public actual fun pxePacketAllocate(hprovider: Handle, hclientrequest: Handle, usize: UInt): COpaquePointer? =
    windowssys_windows_win32_system_deploymentservices_pxePacketAllocate(hprovider?.value?.toCPointer<ByteVar>(), hclientrequest?.value?.toCPointer<ByteVar>(), usize)?.let { COpaquePointer(it.toLong()) }

public actual fun pxePacketFree(hprovider: Handle, hclientrequest: Handle, ppacket: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_pxePacketFree(hprovider?.value?.toCPointer<ByteVar>(), hclientrequest?.value?.toCPointer<ByteVar>(), ppacket?.value?.toCPointer<ByteVar>())

public actual fun pxeProviderEnumClose(henum: Handle): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeProviderEnumClose(henum?.value?.toCPointer<ByteVar>())

public actual fun pxeProviderEnumFirst(phenum: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeProviderEnumFirst(phenum?.value?.toCPointer<ByteVar>())

public actual fun pxeProviderEnumNext(henum: Handle, ppprovider: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeProviderEnumNext(henum?.value?.toCPointer<ByteVar>(), ppprovider?.value?.toCPointer<ByteVar>())

public actual fun pxeProviderFreeInfo(pprovider: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeProviderFreeInfo(pprovider?.value?.toCPointer<ByteVar>())

public actual fun pxeProviderQueryIndex(pszprovidername: Pcwstr, puindex: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeProviderQueryIndex(pszprovidername?.value?.toCPointer<ByteVar>(), puindex?.value?.toCPointer<ByteVar>())

public actual fun pxeProviderRegister(pszprovidername: Pcwstr, pszmodulepath: Pcwstr, index: UInt, biscritical: Bool, phproviderkey: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeProviderRegister(pszprovidername?.value?.toCPointer<ByteVar>(), pszmodulepath?.value?.toCPointer<ByteVar>(), index, biscritical, phproviderkey?.value?.toCPointer<ByteVar>())

public actual fun pxeProviderSetAttribute(hprovider: Handle, attribute: UInt, pparameterbuffer: COpaquePointer?, uparamlen: UInt): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeProviderSetAttribute(hprovider?.value?.toCPointer<ByteVar>(), attribute, pparameterbuffer?.value?.toCPointer<ByteVar>(), uparamlen)

public actual fun pxeProviderUnRegister(pszprovidername: Pcwstr): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeProviderUnRegister(pszprovidername?.value?.toCPointer<ByteVar>())

public actual fun pxeRegisterCallback(hprovider: Handle, callbacktype: UInt, pcallbackfunction: COpaquePointer?, pcontext: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeRegisterCallback(hprovider?.value?.toCPointer<ByteVar>(), callbacktype, pcallbackfunction?.value?.toCPointer<ByteVar>(), pcontext?.value?.toCPointer<ByteVar>())

public actual fun pxeSendReply(hclientrequest: Handle, ppacket: COpaquePointer?, upacketlen: UInt, paddress: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeSendReply(hclientrequest?.value?.toCPointer<ByteVar>(), ppacket?.value?.toCPointer<ByteVar>(), upacketlen, paddress?.value?.toCPointer<ByteVar>())

public actual fun pxeTrace(hprovider: Handle, severity: UInt, pszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeTrace(hprovider?.value?.toCPointer<ByteVar>(), severity, pszformat?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun pxeTraceV(hprovider: Handle, severity: UInt, pszformat: Pcwstr, params: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_pxeTraceV(hprovider?.value?.toCPointer<ByteVar>(), severity, pszformat?.value?.toCPointer<ByteVar>(), params?.value?.toCPointer<ByteVar>())

public actual fun wdsBpAddOption(hhandle: Handle, uoption: UInt, uvaluelen: UInt, pvalue: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_wdsBpAddOption(hhandle?.value?.toCPointer<ByteVar>(), uoption, uvaluelen, pvalue?.value?.toCPointer<ByteVar>())

public actual fun wdsBpCloseHandle(hhandle: Handle): UInt =
    windowssys_windows_win32_system_deploymentservices_wdsBpCloseHandle(hhandle?.value?.toCPointer<ByteVar>())

public actual fun wdsBpGetOptionBuffer(hhandle: Handle, ubufferlen: UInt, pbuffer: COpaquePointer?, pubytes: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_wdsBpGetOptionBuffer(hhandle?.value?.toCPointer<ByteVar>(), ubufferlen, pbuffer?.value?.toCPointer<ByteVar>(), pubytes?.value?.toCPointer<ByteVar>())

public actual fun wdsBpInitialize(bpackettype: UByte, phhandle: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_wdsBpInitialize(bpackettype, phhandle?.value?.toCPointer<ByteVar>())

public actual fun wdsBpParseInitialize(ppacket: COpaquePointer?, upacketlen: UInt, pbpackettype: COpaquePointer?, phhandle: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_wdsBpParseInitialize(ppacket?.value?.toCPointer<ByteVar>(), upacketlen, pbpackettype?.value?.toCPointer<ByteVar>(), phhandle?.value?.toCPointer<ByteVar>())

public actual fun wdsBpParseInitializev6(ppacket: COpaquePointer?, upacketlen: UInt, pbpackettype: COpaquePointer?, phhandle: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_wdsBpParseInitializev6(ppacket?.value?.toCPointer<ByteVar>(), upacketlen, pbpackettype?.value?.toCPointer<ByteVar>(), phhandle?.value?.toCPointer<ByteVar>())

public actual fun wdsBpQueryOption(hhandle: Handle, uoption: UInt, uvaluelen: UInt, pvalue: COpaquePointer?, pubytes: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_wdsBpQueryOption(hhandle?.value?.toCPointer<ByteVar>(), uoption, uvaluelen, pvalue?.value?.toCPointer<ByteVar>(), pubytes?.value?.toCPointer<ByteVar>())

public actual fun wdsCliAuthorizeSession(hsession: Handle, pcred: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliAuthorizeSession(hsession?.value?.toCPointer<ByteVar>(), pcred?.value?.toCPointer<ByteVar>())

public actual fun wdsCliCancelTransfer(htransfer: Handle): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliCancelTransfer(htransfer?.value?.toCPointer<ByteVar>())

public actual fun wdsCliClose(handle: Handle): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliClose(handle?.value?.toCPointer<ByteVar>())

public actual fun wdsCliCreateSession(pwszserver: Pcwstr, pcred: COpaquePointer?, phsession: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliCreateSession(pwszserver?.value?.toCPointer<ByteVar>(), pcred?.value?.toCPointer<ByteVar>(), phsession?.value?.toCPointer<ByteVar>())

public actual fun wdsCliFindFirstImage(hsession: Handle, phfindhandle: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliFindFirstImage(hsession?.value?.toCPointer<ByteVar>(), phfindhandle?.value?.toCPointer<ByteVar>())

public actual fun wdsCliFindNextImage(handle: Handle): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliFindNextImage(handle?.value?.toCPointer<ByteVar>())

public actual fun wdsCliFreeStringArray(ppwszarray: COpaquePointer?, ulcount: UInt): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliFreeStringArray(ppwszarray?.value?.toCPointer<ByteVar>(), ulcount)

public actual fun wdsCliGetDriverQueryXml(pwszwindirpath: Pcwstr, ppwszdriverquery: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliGetDriverQueryXml(pwszwindirpath?.value?.toCPointer<ByteVar>(), ppwszdriverquery?.value?.toCPointer<ByteVar>())

public actual fun wdsCliGetEnumerationFlags(handle: Handle, pdwflags: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliGetEnumerationFlags(handle?.value?.toCPointer<ByteVar>(), pdwflags?.value?.toCPointer<ByteVar>())

public actual fun wdsCliGetImageArchitecture(hifh: Handle, pdwvalue: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliGetImageArchitecture(hifh?.value?.toCPointer<ByteVar>(), pdwvalue?.value?.toCPointer<ByteVar>())

public actual fun wdsCliGetImageDescription(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliGetImageDescription(hifh?.value?.toCPointer<ByteVar>(), ppwszvalue?.value?.toCPointer<ByteVar>())

public actual fun wdsCliGetImageFiles(hifh: Handle, pppwszfiles: COpaquePointer?, pdwcount: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliGetImageFiles(hifh?.value?.toCPointer<ByteVar>(), pppwszfiles?.value?.toCPointer<ByteVar>(), pdwcount?.value?.toCPointer<ByteVar>())

public actual fun wdsCliGetImageGroup(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliGetImageGroup(hifh?.value?.toCPointer<ByteVar>(), ppwszvalue?.value?.toCPointer<ByteVar>())

public actual fun wdsCliGetImageHalName(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliGetImageHalName(hifh?.value?.toCPointer<ByteVar>(), ppwszvalue?.value?.toCPointer<ByteVar>())

public actual fun wdsCliGetImageHandleFromFindHandle(findhandle: Handle, phimagehandle: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliGetImageHandleFromFindHandle(findhandle?.value?.toCPointer<ByteVar>(), phimagehandle?.value?.toCPointer<ByteVar>())

public actual fun wdsCliGetImageHandleFromTransferHandle(htransfer: Handle, phimagehandle: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliGetImageHandleFromTransferHandle(htransfer?.value?.toCPointer<ByteVar>(), phimagehandle?.value?.toCPointer<ByteVar>())

public actual fun wdsCliGetImageIndex(hifh: Handle, pdwvalue: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliGetImageIndex(hifh?.value?.toCPointer<ByteVar>(), pdwvalue?.value?.toCPointer<ByteVar>())

public actual fun wdsCliGetImageLanguage(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliGetImageLanguage(hifh?.value?.toCPointer<ByteVar>(), ppwszvalue?.value?.toCPointer<ByteVar>())

public actual fun wdsCliGetImageLanguages(hifh: Handle, pppszvalues: COpaquePointer?, pdwnumvalues: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliGetImageLanguages(hifh?.value?.toCPointer<ByteVar>(), pppszvalues?.value?.toCPointer<ByteVar>(), pdwnumvalues?.value?.toCPointer<ByteVar>())

public actual fun wdsCliGetImageLastModifiedTime(hifh: Handle, ppsystimevalue: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliGetImageLastModifiedTime(hifh?.value?.toCPointer<ByteVar>(), ppsystimevalue?.value?.toCPointer<ByteVar>())

public actual fun wdsCliGetImageName(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliGetImageName(hifh?.value?.toCPointer<ByteVar>(), ppwszvalue?.value?.toCPointer<ByteVar>())

public actual fun wdsCliGetImageNamespace(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliGetImageNamespace(hifh?.value?.toCPointer<ByteVar>(), ppwszvalue?.value?.toCPointer<ByteVar>())

public actual fun wdsCliGetImageParameter(hifh: Handle, paramtype: WdsCliImageParamType, presponse: COpaquePointer?, uresponselen: UInt): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliGetImageParameter(hifh?.value?.toCPointer<ByteVar>(), paramtype, presponse?.value?.toCPointer<ByteVar>(), uresponselen)

public actual fun wdsCliGetImagePath(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliGetImagePath(hifh?.value?.toCPointer<ByteVar>(), ppwszvalue?.value?.toCPointer<ByteVar>())

public actual fun wdsCliGetImageSize(hifh: Handle, pullvalue: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliGetImageSize(hifh?.value?.toCPointer<ByteVar>(), pullvalue?.value?.toCPointer<ByteVar>())

public actual fun wdsCliGetImageType(hifh: Handle, pimagetype: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliGetImageType(hifh?.value?.toCPointer<ByteVar>(), pimagetype?.value?.toCPointer<ByteVar>())

public actual fun wdsCliGetImageVersion(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliGetImageVersion(hifh?.value?.toCPointer<ByteVar>(), ppwszvalue?.value?.toCPointer<ByteVar>())

public actual fun wdsCliGetTransferSize(hifh: Handle, pullvalue: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliGetTransferSize(hifh?.value?.toCPointer<ByteVar>(), pullvalue?.value?.toCPointer<ByteVar>())

public actual fun wdsCliInitializeLog(hsession: Handle, ulclientarchitecture: CpuArchitecture, pwszclientid: Pcwstr, pwszclientaddress: Pcwstr): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliInitializeLog(hsession?.value?.toCPointer<ByteVar>(), ulclientarchitecture, pwszclientid?.value?.toCPointer<ByteVar>(), pwszclientaddress?.value?.toCPointer<ByteVar>())

public actual fun wdsCliLog(hsession: Handle, ulloglevel: UInt, ulmessagecode: UInt, vararg variadicArgs: Long): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliLog(hsession?.value?.toCPointer<ByteVar>(), ulloglevel, ulmessagecode, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wdsCliObtainDriverPackages(himage: Handle, ppwszservername: COpaquePointer?, pppwszdriverpackages: COpaquePointer?, pulcount: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliObtainDriverPackages(himage?.value?.toCPointer<ByteVar>(), ppwszservername?.value?.toCPointer<ByteVar>(), pppwszdriverpackages?.value?.toCPointer<ByteVar>(), pulcount?.value?.toCPointer<ByteVar>())

public actual fun wdsCliObtainDriverPackagesEx(hsession: Handle, pwszmachineinfo: Pcwstr, ppwszservername: COpaquePointer?, pppwszdriverpackages: COpaquePointer?, pulcount: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliObtainDriverPackagesEx(hsession?.value?.toCPointer<ByteVar>(), pwszmachineinfo?.value?.toCPointer<ByteVar>(), ppwszservername?.value?.toCPointer<ByteVar>(), pppwszdriverpackages?.value?.toCPointer<ByteVar>(), pulcount?.value?.toCPointer<ByteVar>())

public actual fun wdsCliRegisterTrace(pfn: PfnWdsCliTraceFunction): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliRegisterTrace(0L.toCPointer<ByteVar>())

public actual fun wdsCliSetTransferBufferSize(ulsizeinbytes: UInt) {
    windowssys_windows_win32_system_deploymentservices_wdsCliSetTransferBufferSize(ulsizeinbytes)
}

public actual fun wdsCliTransferFile(pwszserver: Pcwstr, pwsznamespace: Pcwstr, pwszremotefilepath: Pcwstr, pwszlocalfilepath: Pcwstr, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PfnWdsCliCallback, pvuserdata: COpaquePointer?, phtransfer: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliTransferFile(pwszserver?.value?.toCPointer<ByteVar>(), pwsznamespace?.value?.toCPointer<ByteVar>(), pwszremotefilepath?.value?.toCPointer<ByteVar>(), pwszlocalfilepath?.value?.toCPointer<ByteVar>(), dwflags, dwreserved, 0L.toCPointer<ByteVar>(), pvuserdata?.value?.toCPointer<ByteVar>(), phtransfer?.value?.toCPointer<ByteVar>())

public actual fun wdsCliTransferImage(himage: Handle, pwszlocalpath: Pcwstr, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PfnWdsCliCallback, pvuserdata: COpaquePointer?, phtransfer: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliTransferImage(himage?.value?.toCPointer<ByteVar>(), pwszlocalpath?.value?.toCPointer<ByteVar>(), dwflags, dwreserved, 0L.toCPointer<ByteVar>(), pvuserdata?.value?.toCPointer<ByteVar>(), phtransfer?.value?.toCPointer<ByteVar>())

public actual fun wdsCliWaitForTransfer(htransfer: Handle): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsCliWaitForTransfer(htransfer?.value?.toCPointer<ByteVar>())

public actual fun wdsTransportClientAddRefBuffer(pvbuffer: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_wdsTransportClientAddRefBuffer(pvbuffer?.value?.toCPointer<ByteVar>())

public actual fun wdsTransportClientCancelSession(hsessionkey: Handle): UInt =
    windowssys_windows_win32_system_deploymentservices_wdsTransportClientCancelSession(hsessionkey?.value?.toCPointer<ByteVar>())

public actual fun wdsTransportClientCancelSessionEx(hsessionkey: Handle, dwerrorcode: UInt): UInt =
    windowssys_windows_win32_system_deploymentservices_wdsTransportClientCancelSessionEx(hsessionkey?.value?.toCPointer<ByteVar>(), dwerrorcode)

public actual fun wdsTransportClientCloseSession(hsessionkey: Handle): UInt =
    windowssys_windows_win32_system_deploymentservices_wdsTransportClientCloseSession(hsessionkey?.value?.toCPointer<ByteVar>())

public actual fun wdsTransportClientCompleteReceive(hsessionkey: Handle, ulsize: UInt, pulloffset: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_wdsTransportClientCompleteReceive(hsessionkey?.value?.toCPointer<ByteVar>(), ulsize, pulloffset?.value?.toCPointer<ByteVar>())

public actual fun wdsTransportClientInitialize(): UInt =
    windowssys_windows_win32_system_deploymentservices_wdsTransportClientInitialize()

public actual fun wdsTransportClientInitializeSession(psessionrequest: COpaquePointer?, pcallerdata: COpaquePointer?, hsessionkey: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_wdsTransportClientInitializeSession(psessionrequest?.value?.toCPointer<ByteVar>(), pcallerdata?.value?.toCPointer<ByteVar>(), hsessionkey?.value?.toCPointer<ByteVar>())

public actual fun wdsTransportClientQueryStatus(hsessionkey: Handle, pustatus: COpaquePointer?, puerrorcode: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_wdsTransportClientQueryStatus(hsessionkey?.value?.toCPointer<ByteVar>(), pustatus?.value?.toCPointer<ByteVar>(), puerrorcode?.value?.toCPointer<ByteVar>())

public actual fun wdsTransportClientRegisterCallback(hsessionkey: Handle, callbackid: TransportclientCallbackId, pfncallback: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_wdsTransportClientRegisterCallback(hsessionkey?.value?.toCPointer<ByteVar>(), callbackid, pfncallback?.value?.toCPointer<ByteVar>())

public actual fun wdsTransportClientReleaseBuffer(pvbuffer: COpaquePointer?): UInt =
    windowssys_windows_win32_system_deploymentservices_wdsTransportClientReleaseBuffer(pvbuffer?.value?.toCPointer<ByteVar>())

public actual fun wdsTransportClientShutdown(): UInt =
    windowssys_windows_win32_system_deploymentservices_wdsTransportClientShutdown()

public actual fun wdsTransportClientStartSession(hsessionkey: Handle): UInt =
    windowssys_windows_win32_system_deploymentservices_wdsTransportClientStartSession(hsessionkey?.value?.toCPointer<ByteVar>())

public actual fun wdsTransportClientWaitForCompletion(hsessionkey: Handle, utimeout: UInt): UInt =
    windowssys_windows_win32_system_deploymentservices_wdsTransportClientWaitForCompletion(hsessionkey?.value?.toCPointer<ByteVar>(), utimeout)

public actual fun wdsTransportServerAllocateBuffer(hprovider: Handle, ulbuffersize: UInt): COpaquePointer? =
    windowssys_windows_win32_system_deploymentservices_wdsTransportServerAllocateBuffer(hprovider?.value?.toCPointer<ByteVar>(), ulbuffersize)?.let { COpaquePointer(it.toLong()) }

public actual fun wdsTransportServerCompleteRead(hprovider: Handle, ulbytesread: UInt, pvuserdata: COpaquePointer?, hreadresult: Hresult): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsTransportServerCompleteRead(hprovider?.value?.toCPointer<ByteVar>(), ulbytesread, pvuserdata?.value?.toCPointer<ByteVar>(), hreadresult)

public actual fun wdsTransportServerFreeBuffer(hprovider: Handle, pvbuffer: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsTransportServerFreeBuffer(hprovider?.value?.toCPointer<ByteVar>(), pvbuffer?.value?.toCPointer<ByteVar>())

public actual fun wdsTransportServerRegisterCallback(hprovider: Handle, callbackid: TransportproviderCallbackId, pfncallback: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsTransportServerRegisterCallback(hprovider?.value?.toCPointer<ByteVar>(), callbackid, pfncallback?.value?.toCPointer<ByteVar>())

public actual fun wdsTransportServerTrace(hprovider: Handle, severity: UInt, pwszformat: Pcwstr, vararg variadicArgs: Long): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsTransportServerTrace(hprovider?.value?.toCPointer<ByteVar>(), severity, pwszformat?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wdsTransportServerTraceV(hprovider: Handle, severity: UInt, pwszformat: Pcwstr, params: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_deploymentservices_wdsTransportServerTraceV(hprovider?.value?.toCPointer<ByteVar>(), severity, pwszformat?.value?.toCPointer<ByteVar>(), params?.value?.toCPointer<ByteVar>())
