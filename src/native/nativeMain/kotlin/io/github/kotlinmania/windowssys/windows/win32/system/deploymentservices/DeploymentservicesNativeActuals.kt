@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeAsyncRecvDone
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpAppendOption
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpAppendOptionRaw
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpGetOptionValue
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpGetVendorOptionValue
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpInitialize
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpIsValid
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6AppendOption
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6AppendOptionRaw
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6CreateRelayRepl
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6GetOptionValue
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6GetVendorOptionValue
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6Initialize
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6IsValid
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6ParseRelayForw
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeGetServerInfo
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeGetServerInfoEx
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxePacketAllocate
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxePacketFree
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumClose
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumFirst
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumNext
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeProviderFreeInfo
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeProviderQueryIndex
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeProviderRegister
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeProviderSetAttribute
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeProviderUnRegister
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeRegisterCallback
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeSendReply
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeTrace
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesPxeTraceV
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsBpAddOption
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsBpCloseHandle
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsBpGetOptionBuffer
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsBpInitialize
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsBpParseInitialize
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsBpParseInitializev6
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsBpQueryOption
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliAuthorizeSession
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliCancelTransfer
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliClose
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliCreateSession
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliFindFirstImage
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliFindNextImage
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliFreeStringArray
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetDriverQueryXml
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetEnumerationFlags
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageArchitecture
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageDescription
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageFiles
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageGroup
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHalName
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHandleFromFindHandle
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHandleFromTransferHandle
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageIndex
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLanguage
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLanguages
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLastModifiedTime
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageName
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageNamespace
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageParameter
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImagePath
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageSize
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageType
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageVersion
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetTransferSize
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliInitializeLog
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliLog
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliObtainDriverPackages
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliObtainDriverPackagesEx
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliRegisterTrace
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliSetTransferBufferSize
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliTransferFile
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliTransferImage
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsCliWaitForTransfer
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientAddRefBuffer
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCancelSession
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCancelSessionEx
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCloseSession
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCompleteReceive
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientInitialize
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientInitializeSession
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientQueryStatus
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientRegisterCallback
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientReleaseBuffer
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientShutdown
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientStartSession
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientWaitForCompletion
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerAllocateBuffer
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerCompleteRead
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerFreeBuffer
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerRegisterCallback
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerTrace
import io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices.cinterop.windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerTraceV
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun pxeAsyncRecvDone(hclientrequest: Handle, action: UInt): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeAsyncRecvDone(hclientrequest.rawAddress.toCPointer<ByteVar>(), action)

public actual fun pxeDhcpAppendOption(preplypacket: MutPtr<CVoid>, umaxreplypacketlen: UInt, pureplypacketlen: MutPtr<UInt>, boption: UByte, boptionlen: UByte, pvalue: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeDhcpAppendOption(preplypacket.rawAddress.toCPointer<ByteVar>(), umaxreplypacketlen, pureplypacketlen.rawAddress.toCPointer<ByteVar>(), boption, boptionlen, pvalue.rawAddress.toCPointer<ByteVar>())

public actual fun pxeDhcpAppendOptionRaw(preplypacket: MutPtr<CVoid>, umaxreplypacketlen: UInt, pureplypacketlen: MutPtr<UInt>, ubufferlen: UShort, pbuffer: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeDhcpAppendOptionRaw(preplypacket.rawAddress.toCPointer<ByteVar>(), umaxreplypacketlen, pureplypacketlen.rawAddress.toCPointer<ByteVar>(), ubufferlen, pbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun pxeDhcpGetOptionValue(ppacket: ConstPtr<CVoid>, upacketlen: UInt, uinstance: UInt, boption: UByte, pboptionlen: MutPtr<UByte>, ppoptionvalue: MutPtr<MutPtr<CVoid>>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeDhcpGetOptionValue(ppacket.rawAddress.toCPointer<ByteVar>(), upacketlen, uinstance, boption, pboptionlen.rawAddress.toCPointer<ByteVar>(), ppoptionvalue.rawAddress.toCPointer<ByteVar>())

public actual fun pxeDhcpGetVendorOptionValue(ppacket: ConstPtr<CVoid>, upacketlen: UInt, boption: UByte, uinstance: UInt, pboptionlen: MutPtr<UByte>, ppoptionvalue: MutPtr<MutPtr<CVoid>>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeDhcpGetVendorOptionValue(ppacket.rawAddress.toCPointer<ByteVar>(), upacketlen, boption, uinstance, pboptionlen.rawAddress.toCPointer<ByteVar>(), ppoptionvalue.rawAddress.toCPointer<ByteVar>())

public actual fun pxeDhcpInitialize(precvpacket: ConstPtr<CVoid>, urecvpacketlen: UInt, preplypacket: MutPtr<CVoid>, umaxreplypacketlen: UInt, pureplypacketlen: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeDhcpInitialize(precvpacket.rawAddress.toCPointer<ByteVar>(), urecvpacketlen, preplypacket.rawAddress.toCPointer<ByteVar>(), umaxreplypacketlen, pureplypacketlen.rawAddress.toCPointer<ByteVar>())

public actual fun pxeDhcpIsValid(ppacket: ConstPtr<CVoid>, upacketlen: UInt, brequestpacket: Bool, pbpxeoptionpresent: MutPtr<Bool>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeDhcpIsValid(ppacket.rawAddress.toCPointer<ByteVar>(), upacketlen, brequestpacket, pbpxeoptionpresent.rawAddress.toCPointer<ByteVar>())

public actual fun pxeDhcpv6AppendOption(preply: MutPtr<CVoid>, cbreply: UInt, pcbreplyused: MutPtr<UInt>, woptiontype: UShort, cboption: UShort, poption: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6AppendOption(preply.rawAddress.toCPointer<ByteVar>(), cbreply, pcbreplyused.rawAddress.toCPointer<ByteVar>(), woptiontype, cboption, poption.rawAddress.toCPointer<ByteVar>())

public actual fun pxeDhcpv6AppendOptionRaw(preply: MutPtr<CVoid>, cbreply: UInt, pcbreplyused: MutPtr<UInt>, cbbuffer: UShort, pbuffer: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6AppendOptionRaw(preply.rawAddress.toCPointer<ByteVar>(), cbreply, pcbreplyused.rawAddress.toCPointer<ByteVar>(), cbbuffer, pbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun pxeDhcpv6CreateRelayRepl(prelaymessages: ConstPtr<PxeDhcpv6NestedRelayMessage>, nrelaymessages: UInt, pinnerpacket: ConstPtr<UByte>, cbinnerpacket: UInt, preplybuffer: MutPtr<CVoid>, cbreplybuffer: UInt, pcbreplybuffer: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6CreateRelayRepl(prelaymessages.rawAddress.toCPointer<ByteVar>(), nrelaymessages, pinnerpacket.rawAddress.toCPointer<ByteVar>(), cbinnerpacket, preplybuffer.rawAddress.toCPointer<ByteVar>(), cbreplybuffer, pcbreplybuffer.rawAddress.toCPointer<ByteVar>())

public actual fun pxeDhcpv6GetOptionValue(ppacket: ConstPtr<CVoid>, upacketlen: UInt, uinstance: UInt, woption: UShort, pwoptionlen: MutPtr<UShort>, ppoptionvalue: MutPtr<MutPtr<CVoid>>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6GetOptionValue(ppacket.rawAddress.toCPointer<ByteVar>(), upacketlen, uinstance, woption, pwoptionlen.rawAddress.toCPointer<ByteVar>(), ppoptionvalue.rawAddress.toCPointer<ByteVar>())

public actual fun pxeDhcpv6GetVendorOptionValue(ppacket: ConstPtr<CVoid>, upacketlen: UInt, dwenterprisenumber: UInt, woption: UShort, uinstance: UInt, pwoptionlen: MutPtr<UShort>, ppoptionvalue: MutPtr<MutPtr<CVoid>>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6GetVendorOptionValue(ppacket.rawAddress.toCPointer<ByteVar>(), upacketlen, dwenterprisenumber, woption, uinstance, pwoptionlen.rawAddress.toCPointer<ByteVar>(), ppoptionvalue.rawAddress.toCPointer<ByteVar>())

public actual fun pxeDhcpv6Initialize(prequest: ConstPtr<CVoid>, cbrequest: UInt, preply: MutPtr<CVoid>, cbreply: UInt, pcbreplyused: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6Initialize(prequest.rawAddress.toCPointer<ByteVar>(), cbrequest, preply.rawAddress.toCPointer<ByteVar>(), cbreply, pcbreplyused.rawAddress.toCPointer<ByteVar>())

public actual fun pxeDhcpv6IsValid(ppacket: ConstPtr<CVoid>, upacketlen: UInt, brequestpacket: Bool, pbpxeoptionpresent: MutPtr<Bool>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6IsValid(ppacket.rawAddress.toCPointer<ByteVar>(), upacketlen, brequestpacket, pbpxeoptionpresent.rawAddress.toCPointer<ByteVar>())

public actual fun pxeDhcpv6ParseRelayForw(prelayforwpacket: ConstPtr<CVoid>, urelayforwpacketlen: UInt, prelaymessages: MutPtr<PxeDhcpv6NestedRelayMessage>, nrelaymessages: UInt, pnrelaymessages: MutPtr<UInt>, ppinnerpacket: MutPtr<MutPtr<UByte>>, pcbinnerpacket: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6ParseRelayForw(prelayforwpacket.rawAddress.toCPointer<ByteVar>(), urelayforwpacketlen, prelaymessages.rawAddress.toCPointer<ByteVar>(), nrelaymessages, pnrelaymessages.rawAddress.toCPointer<ByteVar>(), ppinnerpacket.rawAddress.toCPointer<ByteVar>(), pcbinnerpacket.rawAddress.toCPointer<ByteVar>())

public actual fun pxeGetServerInfo(uinfotype: UInt, pbuffer: MutPtr<CVoid>, ubufferlen: UInt): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeGetServerInfo(uinfotype, pbuffer.rawAddress.toCPointer<ByteVar>(), ubufferlen)

public actual fun pxeGetServerInfoEx(uinfotype: UInt, pbuffer: MutPtr<CVoid>, ubufferlen: UInt, pubufferused: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeGetServerInfoEx(uinfotype, pbuffer.rawAddress.toCPointer<ByteVar>(), ubufferlen, pubufferused.rawAddress.toCPointer<ByteVar>())

public actual fun pxePacketAllocate(hprovider: Handle, hclientrequest: Handle, usize: UInt): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32SystemDeploymentservicesPxePacketAllocate(hprovider.rawAddress.toCPointer<ByteVar>(), hclientrequest.rawAddress.toCPointer<ByteVar>(), usize)?.toLong() ?: 0L)

public actual fun pxePacketFree(hprovider: Handle, hclientrequest: Handle, ppacket: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxePacketFree(hprovider.rawAddress.toCPointer<ByteVar>(), hclientrequest.rawAddress.toCPointer<ByteVar>(), ppacket.rawAddress.toCPointer<ByteVar>())

public actual fun pxeProviderEnumClose(henum: Handle): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumClose(henum.rawAddress.toCPointer<ByteVar>())

public actual fun pxeProviderEnumFirst(phenum: MutPtr<Handle>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumFirst(phenum.rawAddress.toCPointer<ByteVar>())

public actual fun pxeProviderEnumNext(henum: Handle, ppprovider: MutPtr<MutPtr<PxeProvider>>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumNext(henum.rawAddress.toCPointer<ByteVar>(), ppprovider.rawAddress.toCPointer<ByteVar>())

public actual fun pxeProviderFreeInfo(pprovider: ConstPtr<PxeProvider>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeProviderFreeInfo(pprovider.rawAddress.toCPointer<ByteVar>())

public actual fun pxeProviderQueryIndex(pszprovidername: Pcwstr, puindex: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeProviderQueryIndex(pszprovidername.rawAddress.toCPointer<ByteVar>(), puindex.rawAddress.toCPointer<ByteVar>())

public actual fun pxeProviderRegister(pszprovidername: Pcwstr, pszmodulepath: Pcwstr, index: UInt, biscritical: Bool, phproviderkey: MutPtr<Hkey>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeProviderRegister(pszprovidername.rawAddress.toCPointer<ByteVar>(), pszmodulepath.rawAddress.toCPointer<ByteVar>(), index, biscritical, phproviderkey.rawAddress.toCPointer<ByteVar>())

public actual fun pxeProviderSetAttribute(hprovider: Handle, attribute: UInt, pparameterbuffer: ConstPtr<CVoid>, uparamlen: UInt): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeProviderSetAttribute(hprovider.rawAddress.toCPointer<ByteVar>(), attribute, pparameterbuffer.rawAddress.toCPointer<ByteVar>(), uparamlen)

public actual fun pxeProviderUnRegister(pszprovidername: Pcwstr): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeProviderUnRegister(pszprovidername.rawAddress.toCPointer<ByteVar>())

public actual fun pxeRegisterCallback(hprovider: Handle, callbacktype: UInt, pcallbackfunction: ConstPtr<CVoid>, pcontext: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeRegisterCallback(hprovider.rawAddress.toCPointer<ByteVar>(), callbacktype, pcallbackfunction.rawAddress.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>())

public actual fun pxeSendReply(hclientrequest: Handle, ppacket: ConstPtr<CVoid>, upacketlen: UInt, paddress: ConstPtr<PxeAddress>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeSendReply(hclientrequest.rawAddress.toCPointer<ByteVar>(), ppacket.rawAddress.toCPointer<ByteVar>(), upacketlen, paddress.rawAddress.toCPointer<ByteVar>())

public actual fun pxeTrace(hprovider: Handle, severity: UInt, pszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeTrace(hprovider.rawAddress.toCPointer<ByteVar>(), severity, pszformat.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun pxeTraceV(hprovider: Handle, severity: UInt, pszformat: Pcwstr, params: ConstPtr<Byte>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesPxeTraceV(hprovider.rawAddress.toCPointer<ByteVar>(), severity, pszformat.rawAddress.toCPointer<ByteVar>(), params.rawAddress.toCPointer<ByteVar>())

public actual fun wdsBpAddOption(hhandle: Handle, uoption: UInt, uvaluelen: UInt, pvalue: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesWdsBpAddOption(hhandle.rawAddress.toCPointer<ByteVar>(), uoption, uvaluelen, pvalue.rawAddress.toCPointer<ByteVar>())

public actual fun wdsBpCloseHandle(hhandle: Handle): UInt =
    windowssysWindowsWin32SystemDeploymentservicesWdsBpCloseHandle(hhandle.rawAddress.toCPointer<ByteVar>())

public actual fun wdsBpGetOptionBuffer(hhandle: Handle, ubufferlen: UInt, pbuffer: MutPtr<CVoid>, pubytes: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesWdsBpGetOptionBuffer(hhandle.rawAddress.toCPointer<ByteVar>(), ubufferlen, pbuffer.rawAddress.toCPointer<ByteVar>(), pubytes.rawAddress.toCPointer<ByteVar>())

public actual fun wdsBpInitialize(bpackettype: UByte, phhandle: MutPtr<Handle>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesWdsBpInitialize(bpackettype, phhandle.rawAddress.toCPointer<ByteVar>())

public actual fun wdsBpParseInitialize(ppacket: ConstPtr<CVoid>, upacketlen: UInt, pbpackettype: MutPtr<UByte>, phhandle: MutPtr<Handle>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesWdsBpParseInitialize(ppacket.rawAddress.toCPointer<ByteVar>(), upacketlen, pbpackettype.rawAddress.toCPointer<ByteVar>(), phhandle.rawAddress.toCPointer<ByteVar>())

public actual fun wdsBpParseInitializev6(ppacket: ConstPtr<CVoid>, upacketlen: UInt, pbpackettype: MutPtr<UByte>, phhandle: MutPtr<Handle>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesWdsBpParseInitializev6(ppacket.rawAddress.toCPointer<ByteVar>(), upacketlen, pbpackettype.rawAddress.toCPointer<ByteVar>(), phhandle.rawAddress.toCPointer<ByteVar>())

public actual fun wdsBpQueryOption(hhandle: Handle, uoption: UInt, uvaluelen: UInt, pvalue: MutPtr<CVoid>, pubytes: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesWdsBpQueryOption(hhandle.rawAddress.toCPointer<ByteVar>(), uoption, uvaluelen, pvalue.rawAddress.toCPointer<ByteVar>(), pubytes.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliAuthorizeSession(hsession: Handle, pcred: ConstPtr<WdsCliCred>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliAuthorizeSession(hsession.rawAddress.toCPointer<ByteVar>(), pcred.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliCancelTransfer(htransfer: Handle): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliCancelTransfer(htransfer.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliClose(handle: Handle): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliClose(handle.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliCreateSession(pwszserver: Pcwstr, pcred: ConstPtr<WdsCliCred>, phsession: MutPtr<Handle>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliCreateSession(pwszserver.rawAddress.toCPointer<ByteVar>(), pcred.rawAddress.toCPointer<ByteVar>(), phsession.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliFindFirstImage(hsession: Handle, phfindhandle: MutPtr<Handle>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliFindFirstImage(hsession.rawAddress.toCPointer<ByteVar>(), phfindhandle.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliFindNextImage(handle: Handle): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliFindNextImage(handle.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliFreeStringArray(ppwszarray: MutPtr<Pwstr>, ulcount: UInt): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliFreeStringArray(ppwszarray.rawAddress.toCPointer<ByteVar>(), ulcount)

public actual fun wdsCliGetDriverQueryXml(pwszwindirpath: Pcwstr, ppwszdriverquery: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliGetDriverQueryXml(pwszwindirpath.rawAddress.toCPointer<ByteVar>(), ppwszdriverquery.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliGetEnumerationFlags(handle: Handle, pdwflags: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliGetEnumerationFlags(handle.rawAddress.toCPointer<ByteVar>(), pdwflags.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliGetImageArchitecture(hifh: Handle, pdwvalue: MutPtr<CpuArchitecture>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageArchitecture(hifh.rawAddress.toCPointer<ByteVar>(), pdwvalue.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliGetImageDescription(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageDescription(hifh.rawAddress.toCPointer<ByteVar>(), ppwszvalue.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliGetImageFiles(hifh: Handle, pppwszfiles: MutPtr<MutPtr<Pwstr>>, pdwcount: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageFiles(hifh.rawAddress.toCPointer<ByteVar>(), pppwszfiles.rawAddress.toCPointer<ByteVar>(), pdwcount.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliGetImageGroup(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageGroup(hifh.rawAddress.toCPointer<ByteVar>(), ppwszvalue.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliGetImageHalName(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHalName(hifh.rawAddress.toCPointer<ByteVar>(), ppwszvalue.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliGetImageHandleFromFindHandle(findhandle: Handle, phimagehandle: MutPtr<Handle>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHandleFromFindHandle(findhandle.rawAddress.toCPointer<ByteVar>(), phimagehandle.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliGetImageHandleFromTransferHandle(htransfer: Handle, phimagehandle: MutPtr<Handle>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHandleFromTransferHandle(htransfer.rawAddress.toCPointer<ByteVar>(), phimagehandle.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliGetImageIndex(hifh: Handle, pdwvalue: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageIndex(hifh.rawAddress.toCPointer<ByteVar>(), pdwvalue.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliGetImageLanguage(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLanguage(hifh.rawAddress.toCPointer<ByteVar>(), ppwszvalue.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliGetImageLanguages(hifh: Handle, pppszvalues: MutPtr<MutPtr<MutPtr<Byte>>>, pdwnumvalues: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLanguages(hifh.rawAddress.toCPointer<ByteVar>(), pppszvalues.rawAddress.toCPointer<ByteVar>(), pdwnumvalues.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliGetImageLastModifiedTime(hifh: Handle, ppsystimevalue: MutPtr<MutPtr<Systemtime>>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLastModifiedTime(hifh.rawAddress.toCPointer<ByteVar>(), ppsystimevalue.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliGetImageName(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageName(hifh.rawAddress.toCPointer<ByteVar>(), ppwszvalue.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliGetImageNamespace(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageNamespace(hifh.rawAddress.toCPointer<ByteVar>(), ppwszvalue.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliGetImageParameter(hifh: Handle, paramtype: WdsCliImageParamType, presponse: MutPtr<CVoid>, uresponselen: UInt): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageParameter(hifh.rawAddress.toCPointer<ByteVar>(), paramtype, presponse.rawAddress.toCPointer<ByteVar>(), uresponselen)

public actual fun wdsCliGetImagePath(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImagePath(hifh.rawAddress.toCPointer<ByteVar>(), ppwszvalue.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliGetImageSize(hifh: Handle, pullvalue: MutPtr<ULong>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageSize(hifh.rawAddress.toCPointer<ByteVar>(), pullvalue.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliGetImageType(hifh: Handle, pimagetype: MutPtr<WdsCliImageType>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageType(hifh.rawAddress.toCPointer<ByteVar>(), pimagetype.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliGetImageVersion(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageVersion(hifh.rawAddress.toCPointer<ByteVar>(), ppwszvalue.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliGetTransferSize(hifh: Handle, pullvalue: MutPtr<ULong>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliGetTransferSize(hifh.rawAddress.toCPointer<ByteVar>(), pullvalue.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliInitializeLog(hsession: Handle, ulclientarchitecture: CpuArchitecture, pwszclientid: Pcwstr, pwszclientaddress: Pcwstr): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliInitializeLog(hsession.rawAddress.toCPointer<ByteVar>(), ulclientarchitecture, pwszclientid.rawAddress.toCPointer<ByteVar>(), pwszclientaddress.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliLog(hsession: Handle, ulloglevel: UInt, ulmessagecode: UInt, vararg variadicArgs: Long): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliLog(hsession.rawAddress.toCPointer<ByteVar>(), ulloglevel, ulmessagecode, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wdsCliObtainDriverPackages(himage: Handle, ppwszservername: MutPtr<Pwstr>, pppwszdriverpackages: MutPtr<MutPtr<Pwstr>>, pulcount: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliObtainDriverPackages(himage.rawAddress.toCPointer<ByteVar>(), ppwszservername.rawAddress.toCPointer<ByteVar>(), pppwszdriverpackages.rawAddress.toCPointer<ByteVar>(), pulcount.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliObtainDriverPackagesEx(hsession: Handle, pwszmachineinfo: Pcwstr, ppwszservername: MutPtr<Pwstr>, pppwszdriverpackages: MutPtr<MutPtr<Pwstr>>, pulcount: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliObtainDriverPackagesEx(hsession.rawAddress.toCPointer<ByteVar>(), pwszmachineinfo.rawAddress.toCPointer<ByteVar>(), ppwszservername.rawAddress.toCPointer<ByteVar>(), pppwszdriverpackages.rawAddress.toCPointer<ByteVar>(), pulcount.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliRegisterTrace(pfn: PfnWdsCliTraceFunction): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliRegisterTrace(0L.toCPointer<ByteVar>())

public actual fun wdsCliSetTransferBufferSize(ulsizeinbytes: UInt) {
    windowssysWindowsWin32SystemDeploymentservicesWdsCliSetTransferBufferSize(ulsizeinbytes)
}

public actual fun wdsCliTransferFile(pwszserver: Pcwstr, pwsznamespace: Pcwstr, pwszremotefilepath: Pcwstr, pwszlocalfilepath: Pcwstr, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PfnWdsCliCallback, pvuserdata: ConstPtr<CVoid>, phtransfer: MutPtr<Handle>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliTransferFile(pwszserver.rawAddress.toCPointer<ByteVar>(), pwsznamespace.rawAddress.toCPointer<ByteVar>(), pwszremotefilepath.rawAddress.toCPointer<ByteVar>(), pwszlocalfilepath.rawAddress.toCPointer<ByteVar>(), dwflags, dwreserved, 0L.toCPointer<ByteVar>(), pvuserdata.rawAddress.toCPointer<ByteVar>(), phtransfer.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliTransferImage(himage: Handle, pwszlocalpath: Pcwstr, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PfnWdsCliCallback, pvuserdata: ConstPtr<CVoid>, phtransfer: MutPtr<Handle>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliTransferImage(himage.rawAddress.toCPointer<ByteVar>(), pwszlocalpath.rawAddress.toCPointer<ByteVar>(), dwflags, dwreserved, 0L.toCPointer<ByteVar>(), pvuserdata.rawAddress.toCPointer<ByteVar>(), phtransfer.rawAddress.toCPointer<ByteVar>())

public actual fun wdsCliWaitForTransfer(htransfer: Handle): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsCliWaitForTransfer(htransfer.rawAddress.toCPointer<ByteVar>())

public actual fun wdsTransportClientAddRefBuffer(pvbuffer: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientAddRefBuffer(pvbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun wdsTransportClientCancelSession(hsessionkey: Handle): UInt =
    windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCancelSession(hsessionkey.rawAddress.toCPointer<ByteVar>())

public actual fun wdsTransportClientCancelSessionEx(hsessionkey: Handle, dwerrorcode: UInt): UInt =
    windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCancelSessionEx(hsessionkey.rawAddress.toCPointer<ByteVar>(), dwerrorcode)

public actual fun wdsTransportClientCloseSession(hsessionkey: Handle): UInt =
    windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCloseSession(hsessionkey.rawAddress.toCPointer<ByteVar>())

public actual fun wdsTransportClientCompleteReceive(hsessionkey: Handle, ulsize: UInt, pulloffset: ConstPtr<ULong>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCompleteReceive(hsessionkey.rawAddress.toCPointer<ByteVar>(), ulsize, pulloffset.rawAddress.toCPointer<ByteVar>())

public actual fun wdsTransportClientInitialize(): UInt =
    windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientInitialize()

public actual fun wdsTransportClientInitializeSession(psessionrequest: ConstPtr<WdsTransportclientRequest>, pcallerdata: ConstPtr<CVoid>, hsessionkey: MutPtr<Handle>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientInitializeSession(psessionrequest.rawAddress.toCPointer<ByteVar>(), pcallerdata.rawAddress.toCPointer<ByteVar>(), hsessionkey.rawAddress.toCPointer<ByteVar>())

public actual fun wdsTransportClientQueryStatus(hsessionkey: Handle, pustatus: MutPtr<UInt>, puerrorcode: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientQueryStatus(hsessionkey.rawAddress.toCPointer<ByteVar>(), pustatus.rawAddress.toCPointer<ByteVar>(), puerrorcode.rawAddress.toCPointer<ByteVar>())

public actual fun wdsTransportClientRegisterCallback(hsessionkey: Handle, callbackid: TransportclientCallbackId, pfncallback: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientRegisterCallback(hsessionkey.rawAddress.toCPointer<ByteVar>(), callbackid, pfncallback.rawAddress.toCPointer<ByteVar>())

public actual fun wdsTransportClientReleaseBuffer(pvbuffer: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientReleaseBuffer(pvbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun wdsTransportClientShutdown(): UInt =
    windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientShutdown()

public actual fun wdsTransportClientStartSession(hsessionkey: Handle): UInt =
    windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientStartSession(hsessionkey.rawAddress.toCPointer<ByteVar>())

public actual fun wdsTransportClientWaitForCompletion(hsessionkey: Handle, utimeout: UInt): UInt =
    windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientWaitForCompletion(hsessionkey.rawAddress.toCPointer<ByteVar>(), utimeout)

public actual fun wdsTransportServerAllocateBuffer(hprovider: Handle, ulbuffersize: UInt): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerAllocateBuffer(hprovider.rawAddress.toCPointer<ByteVar>(), ulbuffersize)?.toLong() ?: 0L)

public actual fun wdsTransportServerCompleteRead(hprovider: Handle, ulbytesread: UInt, pvuserdata: ConstPtr<CVoid>, hreadresult: Hresult): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerCompleteRead(hprovider.rawAddress.toCPointer<ByteVar>(), ulbytesread, pvuserdata.rawAddress.toCPointer<ByteVar>(), hreadresult)

public actual fun wdsTransportServerFreeBuffer(hprovider: Handle, pvbuffer: ConstPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerFreeBuffer(hprovider.rawAddress.toCPointer<ByteVar>(), pvbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun wdsTransportServerRegisterCallback(hprovider: Handle, callbackid: TransportproviderCallbackId, pfncallback: ConstPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerRegisterCallback(hprovider.rawAddress.toCPointer<ByteVar>(), callbackid, pfncallback.rawAddress.toCPointer<ByteVar>())

public actual fun wdsTransportServerTrace(hprovider: Handle, severity: UInt, pwszformat: Pcwstr, vararg variadicArgs: Long): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerTrace(hprovider.rawAddress.toCPointer<ByteVar>(), severity, pwszformat.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wdsTransportServerTraceV(hprovider: Handle, severity: UInt, pwszformat: Pcwstr, params: ConstPtr<Byte>): Hresult =
    windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerTraceV(hprovider.rawAddress.toCPointer<ByteVar>(), severity, pwszformat.rawAddress.toCPointer<ByteVar>(), params.rawAddress.toCPointer<ByteVar>())
