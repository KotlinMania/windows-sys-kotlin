package io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public expect fun alljoynRouterinitwithconfig(configxml: MutPtr<Byte>): QStatus

public expect fun alljoynRoutershutdown(): QStatus

public expect fun alljoynSecurityapplicationproxyClaim(proxy: AlljoynSecurityapplicationproxy, cakey: MutPtr<Byte>, identitycertificatechain: MutPtr<Byte>, groupid: ConstPtr<UByte>, groupsize: ULong, groupauthority: MutPtr<Byte>, manifestsxmls: MutPtr<MutPtr<Byte>>, manifestscount: ULong): QStatus

public expect fun alljoynSecurityapplicationproxyComputemanifestdigest(unsignedmanifestxml: MutPtr<Byte>, identitycertificatepem: MutPtr<Byte>, digest: MutPtr<MutPtr<UByte>>, digestsize: MutPtr<ULong>): QStatus

public expect fun alljoynSecurityapplicationproxyCreate(bus: AlljoynBusattachment, appbusname: MutPtr<Byte>, sessionid: UInt): AlljoynSecurityapplicationproxy

public expect fun alljoynSecurityapplicationproxyDestroy(proxy: AlljoynSecurityapplicationproxy)

public expect fun alljoynSecurityapplicationproxyDigestDestroy(digest: MutPtr<UByte>)

public expect fun alljoynSecurityapplicationproxyEccpublickeyDestroy(eccpublickey: MutPtr<Byte>)

public expect fun alljoynSecurityapplicationproxyEndmanagement(proxy: AlljoynSecurityapplicationproxy): QStatus

public expect fun alljoynSecurityapplicationproxyGetapplicationstate(proxy: AlljoynSecurityapplicationproxy, applicationstate: MutPtr<AlljoynApplicationstate>): QStatus

public expect fun alljoynSecurityapplicationproxyGetclaimcapabilities(proxy: AlljoynSecurityapplicationproxy, capabilities: MutPtr<UShort>): QStatus

public expect fun alljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo(proxy: AlljoynSecurityapplicationproxy, additionalinfo: MutPtr<UShort>): QStatus

public expect fun alljoynSecurityapplicationproxyGetdefaultpolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: MutPtr<MutPtr<Byte>>): QStatus

public expect fun alljoynSecurityapplicationproxyGeteccpublickey(proxy: AlljoynSecurityapplicationproxy, eccpublickey: MutPtr<MutPtr<Byte>>): QStatus

public expect fun alljoynSecurityapplicationproxyGetmanifesttemplate(proxy: AlljoynSecurityapplicationproxy, manifesttemplatexml: MutPtr<MutPtr<Byte>>): QStatus

public expect fun alljoynSecurityapplicationproxyGetpermissionmanagementsessionport(): UShort

public expect fun alljoynSecurityapplicationproxyGetpolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: MutPtr<MutPtr<Byte>>): QStatus

public expect fun alljoynSecurityapplicationproxyInstallmembership(proxy: AlljoynSecurityapplicationproxy, membershipcertificatechain: MutPtr<Byte>): QStatus

public expect fun alljoynSecurityapplicationproxyManifestDestroy(signedmanifestxml: MutPtr<Byte>)

public expect fun alljoynSecurityapplicationproxyManifesttemplateDestroy(manifesttemplatexml: MutPtr<Byte>)

public expect fun alljoynSecurityapplicationproxyPolicyDestroy(policyxml: MutPtr<Byte>)

public expect fun alljoynSecurityapplicationproxyReset(proxy: AlljoynSecurityapplicationproxy): QStatus

public expect fun alljoynSecurityapplicationproxyResetpolicy(proxy: AlljoynSecurityapplicationproxy): QStatus

public expect fun alljoynSecurityapplicationproxySetmanifestsignature(unsignedmanifestxml: MutPtr<Byte>, identitycertificatepem: MutPtr<Byte>, signature: ConstPtr<UByte>, signaturesize: ULong, signedmanifestxml: MutPtr<MutPtr<Byte>>): QStatus

public expect fun alljoynSecurityapplicationproxySignmanifest(unsignedmanifestxml: MutPtr<Byte>, identitycertificatepem: MutPtr<Byte>, signingprivatekeypem: MutPtr<Byte>, signedmanifestxml: MutPtr<MutPtr<Byte>>): QStatus

public expect fun alljoynSecurityapplicationproxyStartmanagement(proxy: AlljoynSecurityapplicationproxy): QStatus

public expect fun alljoynSecurityapplicationproxyUpdateidentity(proxy: AlljoynSecurityapplicationproxy, identitycertificatechain: MutPtr<Byte>, manifestsxmls: MutPtr<MutPtr<Byte>>, manifestscount: ULong): QStatus

public expect fun alljoynSecurityapplicationproxyUpdatepolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: MutPtr<Byte>): QStatus

public expect fun alljoynSessionlistenerCreate(callbacks: ConstPtr<AlljoynSessionlistenerCallbacks>, context: ConstPtr<CVoid>): AlljoynSessionlistener

public expect fun alljoynSessionlistenerDestroy(listener: AlljoynSessionlistener)

public expect fun alljoynSessionoptsCmp(one: AlljoynSessionopts, other: AlljoynSessionopts): Int

public expect fun alljoynSessionoptsCreate(traffic: UByte, ismultipoint: Int, proximity: UByte, transports: UShort): AlljoynSessionopts

public expect fun alljoynSessionoptsDestroy(opts: AlljoynSessionopts)

public expect fun alljoynSessionoptsGetMultipoint(opts: AlljoynSessionopts): Int

public expect fun alljoynSessionoptsGetProximity(opts: AlljoynSessionopts): UByte

public expect fun alljoynSessionoptsGetTraffic(opts: AlljoynSessionopts): UByte

public expect fun alljoynSessionoptsGetTransports(opts: AlljoynSessionopts): UShort

public expect fun alljoynSessionoptsIscompatible(one: AlljoynSessionopts, other: AlljoynSessionopts): Int

public expect fun alljoynSessionoptsSetMultipoint(opts: AlljoynSessionopts, ismultipoint: Int)

public expect fun alljoynSessionoptsSetProximity(opts: AlljoynSessionopts, proximity: UByte)

public expect fun alljoynSessionoptsSetTraffic(opts: AlljoynSessionopts, traffic: UByte)

public expect fun alljoynSessionoptsSetTransports(opts: AlljoynSessionopts, transports: UShort)

public expect fun alljoynSessionportlistenerCreate(callbacks: ConstPtr<AlljoynSessionportlistenerCallbacks>, context: ConstPtr<CVoid>): AlljoynSessionportlistener

public expect fun alljoynSessionportlistenerDestroy(listener: AlljoynSessionportlistener)

public expect fun alljoynShutdown(): QStatus

public expect fun alljoynUnityDeferredCallbacksProcess(): Int

public expect fun alljoynUnitySetDeferredCallbackMainthreadOnly(mainthreadOnly: Int)
