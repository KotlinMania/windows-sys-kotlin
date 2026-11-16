package io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public expect fun alljoynRouterinitwithconfig(configxml: MutPtr): QStatus

public expect fun alljoynRoutershutdown(): QStatus

public expect fun alljoynSecurityapplicationproxyClaim(proxy: AlljoynSecurityapplicationproxy, cakey: MutPtr, identitycertificatechain: MutPtr, groupid: ConstPtr, groupsize: ULong, groupauthority: MutPtr, manifestsxmls: MutPtr, manifestscount: ULong): QStatus

public expect fun alljoynSecurityapplicationproxyComputemanifestdigest(unsignedmanifestxml: MutPtr, identitycertificatepem: MutPtr, digest: MutPtr, digestsize: MutPtr): QStatus

public expect fun alljoynSecurityapplicationproxyCreate(bus: AlljoynBusattachment, appbusname: MutPtr, sessionid: UInt): AlljoynSecurityapplicationproxy

public expect fun alljoynSecurityapplicationproxyDestroy(proxy: AlljoynSecurityapplicationproxy)

public expect fun alljoynSecurityapplicationproxyDigestDestroy(digest: MutPtr)

public expect fun alljoynSecurityapplicationproxyEccpublickeyDestroy(eccpublickey: MutPtr)

public expect fun alljoynSecurityapplicationproxyEndmanagement(proxy: AlljoynSecurityapplicationproxy): QStatus

public expect fun alljoynSecurityapplicationproxyGetapplicationstate(proxy: AlljoynSecurityapplicationproxy, applicationstate: MutPtr): QStatus

public expect fun alljoynSecurityapplicationproxyGetclaimcapabilities(proxy: AlljoynSecurityapplicationproxy, capabilities: MutPtr): QStatus

public expect fun alljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo(proxy: AlljoynSecurityapplicationproxy, additionalinfo: MutPtr): QStatus

public expect fun alljoynSecurityapplicationproxyGetdefaultpolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: MutPtr): QStatus

public expect fun alljoynSecurityapplicationproxyGeteccpublickey(proxy: AlljoynSecurityapplicationproxy, eccpublickey: MutPtr): QStatus

public expect fun alljoynSecurityapplicationproxyGetmanifesttemplate(proxy: AlljoynSecurityapplicationproxy, manifesttemplatexml: MutPtr): QStatus

public expect fun alljoynSecurityapplicationproxyGetpermissionmanagementsessionport(): UShort

public expect fun alljoynSecurityapplicationproxyGetpolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: MutPtr): QStatus

public expect fun alljoynSecurityapplicationproxyInstallmembership(proxy: AlljoynSecurityapplicationproxy, membershipcertificatechain: MutPtr): QStatus

public expect fun alljoynSecurityapplicationproxyManifestDestroy(signedmanifestxml: MutPtr)

public expect fun alljoynSecurityapplicationproxyManifesttemplateDestroy(manifesttemplatexml: MutPtr)

public expect fun alljoynSecurityapplicationproxyPolicyDestroy(policyxml: MutPtr)

public expect fun alljoynSecurityapplicationproxyReset(proxy: AlljoynSecurityapplicationproxy): QStatus

public expect fun alljoynSecurityapplicationproxyResetpolicy(proxy: AlljoynSecurityapplicationproxy): QStatus

public expect fun alljoynSecurityapplicationproxySetmanifestsignature(unsignedmanifestxml: MutPtr, identitycertificatepem: MutPtr, signature: ConstPtr, signaturesize: ULong, signedmanifestxml: MutPtr): QStatus

public expect fun alljoynSecurityapplicationproxySignmanifest(unsignedmanifestxml: MutPtr, identitycertificatepem: MutPtr, signingprivatekeypem: MutPtr, signedmanifestxml: MutPtr): QStatus

public expect fun alljoynSecurityapplicationproxyStartmanagement(proxy: AlljoynSecurityapplicationproxy): QStatus

public expect fun alljoynSecurityapplicationproxyUpdateidentity(proxy: AlljoynSecurityapplicationproxy, identitycertificatechain: MutPtr, manifestsxmls: MutPtr, manifestscount: ULong): QStatus

public expect fun alljoynSecurityapplicationproxyUpdatepolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: MutPtr): QStatus

public expect fun alljoynSessionlistenerCreate(callbacks: ConstPtr, context: ConstPtr): AlljoynSessionlistener

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

public expect fun alljoynSessionportlistenerCreate(callbacks: ConstPtr, context: ConstPtr): AlljoynSessionportlistener

public expect fun alljoynSessionportlistenerDestroy(listener: AlljoynSessionportlistener)

public expect fun alljoynShutdown(): QStatus

public expect fun alljoynUnityDeferredCallbacksProcess(): Int

public expect fun alljoynUnitySetDeferredCallbackMainthreadOnly(mainthreadOnly: Int)
