package io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn

import io.github.kotlinmania.windowssys.COpaquePointer

public expect fun alljoynRouterinitwithconfig(configxml: COpaquePointer?): QStatus

public expect fun alljoynRoutershutdown(): QStatus

public expect fun alljoynSecurityapplicationproxyClaim(proxy: AlljoynSecurityapplicationproxy, cakey: COpaquePointer?, identitycertificatechain: COpaquePointer?, groupid: COpaquePointer?, groupsize: ULong, groupauthority: COpaquePointer?, manifestsxmls: COpaquePointer?, manifestscount: ULong): QStatus

public expect fun alljoynSecurityapplicationproxyComputemanifestdigest(unsignedmanifestxml: COpaquePointer?, identitycertificatepem: COpaquePointer?, digest: COpaquePointer?, digestsize: COpaquePointer?): QStatus

public expect fun alljoynSecurityapplicationproxyCreate(bus: AlljoynBusattachment, appbusname: COpaquePointer?, sessionid: UInt): AlljoynSecurityapplicationproxy

public expect fun alljoynSecurityapplicationproxyDestroy(proxy: AlljoynSecurityapplicationproxy)

public expect fun alljoynSecurityapplicationproxyDigestDestroy(digest: COpaquePointer?)

public expect fun alljoynSecurityapplicationproxyEccpublickeyDestroy(eccpublickey: COpaquePointer?)

public expect fun alljoynSecurityapplicationproxyEndmanagement(proxy: AlljoynSecurityapplicationproxy): QStatus

public expect fun alljoynSecurityapplicationproxyGetapplicationstate(proxy: AlljoynSecurityapplicationproxy, applicationstate: COpaquePointer?): QStatus

public expect fun alljoynSecurityapplicationproxyGetclaimcapabilities(proxy: AlljoynSecurityapplicationproxy, capabilities: COpaquePointer?): QStatus

public expect fun alljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo(proxy: AlljoynSecurityapplicationproxy, additionalinfo: COpaquePointer?): QStatus

public expect fun alljoynSecurityapplicationproxyGetdefaultpolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: COpaquePointer?): QStatus

public expect fun alljoynSecurityapplicationproxyGeteccpublickey(proxy: AlljoynSecurityapplicationproxy, eccpublickey: COpaquePointer?): QStatus

public expect fun alljoynSecurityapplicationproxyGetmanifesttemplate(proxy: AlljoynSecurityapplicationproxy, manifesttemplatexml: COpaquePointer?): QStatus

public expect fun alljoynSecurityapplicationproxyGetpermissionmanagementsessionport(): UShort

public expect fun alljoynSecurityapplicationproxyGetpolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: COpaquePointer?): QStatus

public expect fun alljoynSecurityapplicationproxyInstallmembership(proxy: AlljoynSecurityapplicationproxy, membershipcertificatechain: COpaquePointer?): QStatus

public expect fun alljoynSecurityapplicationproxyManifestDestroy(signedmanifestxml: COpaquePointer?)

public expect fun alljoynSecurityapplicationproxyManifesttemplateDestroy(manifesttemplatexml: COpaquePointer?)

public expect fun alljoynSecurityapplicationproxyPolicyDestroy(policyxml: COpaquePointer?)

public expect fun alljoynSecurityapplicationproxyReset(proxy: AlljoynSecurityapplicationproxy): QStatus

public expect fun alljoynSecurityapplicationproxyResetpolicy(proxy: AlljoynSecurityapplicationproxy): QStatus

public expect fun alljoynSecurityapplicationproxySetmanifestsignature(unsignedmanifestxml: COpaquePointer?, identitycertificatepem: COpaquePointer?, signature: COpaquePointer?, signaturesize: ULong, signedmanifestxml: COpaquePointer?): QStatus

public expect fun alljoynSecurityapplicationproxySignmanifest(unsignedmanifestxml: COpaquePointer?, identitycertificatepem: COpaquePointer?, signingprivatekeypem: COpaquePointer?, signedmanifestxml: COpaquePointer?): QStatus

public expect fun alljoynSecurityapplicationproxyStartmanagement(proxy: AlljoynSecurityapplicationproxy): QStatus

public expect fun alljoynSecurityapplicationproxyUpdateidentity(proxy: AlljoynSecurityapplicationproxy, identitycertificatechain: COpaquePointer?, manifestsxmls: COpaquePointer?, manifestscount: ULong): QStatus

public expect fun alljoynSecurityapplicationproxyUpdatepolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: COpaquePointer?): QStatus

public expect fun alljoynSessionlistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynSessionlistener

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

public expect fun alljoynSessionportlistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynSessionportlistener

public expect fun alljoynSessionportlistenerDestroy(listener: AlljoynSessionportlistener)

public expect fun alljoynShutdown(): QStatus

public expect fun alljoynUnityDeferredCallbacksProcess(): Int

public expect fun alljoynUnitySetDeferredCallbackMainthreadOnly(mainthreadOnly: Int)
