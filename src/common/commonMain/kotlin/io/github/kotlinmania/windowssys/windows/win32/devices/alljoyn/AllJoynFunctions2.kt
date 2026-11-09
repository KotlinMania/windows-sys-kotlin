package io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn

public expect fun alljoyn_routerinitwithconfig(configxml: Long): QStatus

public expect fun alljoyn_routershutdown(): QStatus

public expect fun alljoyn_securityapplicationproxy_claim(proxy: alljoyn_securityapplicationproxy, cakey: Long, identitycertificatechain: Long, groupid: Long, groupsize: ULong, groupauthority: Long, manifestsxmls: Long, manifestscount: ULong): QStatus

public expect fun alljoyn_securityapplicationproxy_computemanifestdigest(unsignedmanifestxml: Long, identitycertificatepem: Long, digest: Long, digestsize: Long): QStatus

public expect fun alljoyn_securityapplicationproxy_create(bus: alljoyn_busattachment, appbusname: Long, sessionid: UInt): alljoyn_securityapplicationproxy

public expect fun alljoyn_securityapplicationproxy_destroy(proxy: alljoyn_securityapplicationproxy)

public expect fun alljoyn_securityapplicationproxy_digest_destroy(digest: Long)

public expect fun alljoyn_securityapplicationproxy_eccpublickey_destroy(eccpublickey: Long)

public expect fun alljoyn_securityapplicationproxy_endmanagement(proxy: alljoyn_securityapplicationproxy): QStatus

public expect fun alljoyn_securityapplicationproxy_getapplicationstate(proxy: alljoyn_securityapplicationproxy, applicationstate: Long): QStatus

public expect fun alljoyn_securityapplicationproxy_getclaimcapabilities(proxy: alljoyn_securityapplicationproxy, capabilities: Long): QStatus

public expect fun alljoyn_securityapplicationproxy_getclaimcapabilitiesadditionalinfo(proxy: alljoyn_securityapplicationproxy, additionalinfo: Long): QStatus

public expect fun alljoyn_securityapplicationproxy_getdefaultpolicy(proxy: alljoyn_securityapplicationproxy, policyxml: Long): QStatus

public expect fun alljoyn_securityapplicationproxy_geteccpublickey(proxy: alljoyn_securityapplicationproxy, eccpublickey: Long): QStatus

public expect fun alljoyn_securityapplicationproxy_getmanifesttemplate(proxy: alljoyn_securityapplicationproxy, manifesttemplatexml: Long): QStatus

public expect fun alljoyn_securityapplicationproxy_getpermissionmanagementsessionport(): UShort

public expect fun alljoyn_securityapplicationproxy_getpolicy(proxy: alljoyn_securityapplicationproxy, policyxml: Long): QStatus

public expect fun alljoyn_securityapplicationproxy_installmembership(proxy: alljoyn_securityapplicationproxy, membershipcertificatechain: Long): QStatus

public expect fun alljoyn_securityapplicationproxy_manifest_destroy(signedmanifestxml: Long)

public expect fun alljoyn_securityapplicationproxy_manifesttemplate_destroy(manifesttemplatexml: Long)

public expect fun alljoyn_securityapplicationproxy_policy_destroy(policyxml: Long)

public expect fun alljoyn_securityapplicationproxy_reset(proxy: alljoyn_securityapplicationproxy): QStatus

public expect fun alljoyn_securityapplicationproxy_resetpolicy(proxy: alljoyn_securityapplicationproxy): QStatus

public expect fun alljoyn_securityapplicationproxy_setmanifestsignature(unsignedmanifestxml: Long, identitycertificatepem: Long, signature: Long, signaturesize: ULong, signedmanifestxml: Long): QStatus

public expect fun alljoyn_securityapplicationproxy_signmanifest(unsignedmanifestxml: Long, identitycertificatepem: Long, signingprivatekeypem: Long, signedmanifestxml: Long): QStatus

public expect fun alljoyn_securityapplicationproxy_startmanagement(proxy: alljoyn_securityapplicationproxy): QStatus

public expect fun alljoyn_securityapplicationproxy_updateidentity(proxy: alljoyn_securityapplicationproxy, identitycertificatechain: Long, manifestsxmls: Long, manifestscount: ULong): QStatus

public expect fun alljoyn_securityapplicationproxy_updatepolicy(proxy: alljoyn_securityapplicationproxy, policyxml: Long): QStatus

public expect fun alljoyn_sessionlistener_create(callbacks: Long, context: Long): alljoyn_sessionlistener

public expect fun alljoyn_sessionlistener_destroy(listener: alljoyn_sessionlistener)

public expect fun alljoyn_sessionopts_cmp(one: alljoyn_sessionopts, other: alljoyn_sessionopts): Int

public expect fun alljoyn_sessionopts_create(traffic: UByte, ismultipoint: Int, proximity: UByte, transports: UShort): alljoyn_sessionopts

public expect fun alljoyn_sessionopts_destroy(opts: alljoyn_sessionopts)

public expect fun alljoyn_sessionopts_get_multipoint(opts: alljoyn_sessionopts): Int

public expect fun alljoyn_sessionopts_get_proximity(opts: alljoyn_sessionopts): UByte

public expect fun alljoyn_sessionopts_get_traffic(opts: alljoyn_sessionopts): UByte

public expect fun alljoyn_sessionopts_get_transports(opts: alljoyn_sessionopts): UShort

public expect fun alljoyn_sessionopts_iscompatible(one: alljoyn_sessionopts, other: alljoyn_sessionopts): Int

public expect fun alljoyn_sessionopts_set_multipoint(opts: alljoyn_sessionopts, ismultipoint: Int)

public expect fun alljoyn_sessionopts_set_proximity(opts: alljoyn_sessionopts, proximity: UByte)

public expect fun alljoyn_sessionopts_set_traffic(opts: alljoyn_sessionopts, traffic: UByte)

public expect fun alljoyn_sessionopts_set_transports(opts: alljoyn_sessionopts, transports: UShort)

public expect fun alljoyn_sessionportlistener_create(callbacks: Long, context: Long): alljoyn_sessionportlistener

public expect fun alljoyn_sessionportlistener_destroy(listener: alljoyn_sessionportlistener)

public expect fun alljoyn_shutdown(): QStatus

public expect fun alljoyn_unity_deferred_callbacks_process(): Int

public expect fun alljoyn_unity_set_deferred_callback_mainthread_only(mainthread_only: Int)
