package io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn

import io.github.kotlinmania.windowssys.Win32DynamicFfi

public fun alljoyn_routerinitwithconfig(configxml: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_routerinitwithconfig", longArrayOf(configxml)).toInt()
}

public fun alljoyn_routershutdown(): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_routershutdown", longArrayOf()).toInt()
}

public fun alljoyn_securityapplicationproxy_claim(proxy: alljoyn_securityapplicationproxy, cakey: Long, identitycertificatechain: Long, groupid: Long, groupsize: ULong, groupauthority: Long, manifestsxmls: Long, manifestscount: ULong): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_securityapplicationproxy_claim", longArrayOf(proxy, cakey, identitycertificatechain, groupid, groupsize.toLong(), groupauthority, manifestsxmls, manifestscount.toLong())).toInt()
}

public fun alljoyn_securityapplicationproxy_computemanifestdigest(unsignedmanifestxml: Long, identitycertificatepem: Long, digest: Long, digestsize: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_securityapplicationproxy_computemanifestdigest", longArrayOf(unsignedmanifestxml, identitycertificatepem, digest, digestsize)).toInt()
}

public fun alljoyn_securityapplicationproxy_create(bus: alljoyn_busattachment, appbusname: Long, sessionid: UInt): alljoyn_securityapplicationproxy {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_securityapplicationproxy_create", longArrayOf(bus, appbusname, sessionid.toLong()))
}

public fun alljoyn_securityapplicationproxy_destroy(proxy: alljoyn_securityapplicationproxy) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_securityapplicationproxy_destroy", longArrayOf(proxy))
}

public fun alljoyn_securityapplicationproxy_digest_destroy(digest: Long) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_securityapplicationproxy_digest_destroy", longArrayOf(digest))
}

public fun alljoyn_securityapplicationproxy_eccpublickey_destroy(eccpublickey: Long) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_securityapplicationproxy_eccpublickey_destroy", longArrayOf(eccpublickey))
}

public fun alljoyn_securityapplicationproxy_endmanagement(proxy: alljoyn_securityapplicationproxy): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_securityapplicationproxy_endmanagement", longArrayOf(proxy)).toInt()
}

public fun alljoyn_securityapplicationproxy_getapplicationstate(proxy: alljoyn_securityapplicationproxy, applicationstate: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_securityapplicationproxy_getapplicationstate", longArrayOf(proxy, applicationstate)).toInt()
}

public fun alljoyn_securityapplicationproxy_getclaimcapabilities(proxy: alljoyn_securityapplicationproxy, capabilities: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_securityapplicationproxy_getclaimcapabilities", longArrayOf(proxy, capabilities)).toInt()
}

public fun alljoyn_securityapplicationproxy_getclaimcapabilitiesadditionalinfo(proxy: alljoyn_securityapplicationproxy, additionalinfo: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_securityapplicationproxy_getclaimcapabilitiesadditionalinfo", longArrayOf(proxy, additionalinfo)).toInt()
}

public fun alljoyn_securityapplicationproxy_getdefaultpolicy(proxy: alljoyn_securityapplicationproxy, policyxml: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_securityapplicationproxy_getdefaultpolicy", longArrayOf(proxy, policyxml)).toInt()
}

public fun alljoyn_securityapplicationproxy_geteccpublickey(proxy: alljoyn_securityapplicationproxy, eccpublickey: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_securityapplicationproxy_geteccpublickey", longArrayOf(proxy, eccpublickey)).toInt()
}

public fun alljoyn_securityapplicationproxy_getmanifesttemplate(proxy: alljoyn_securityapplicationproxy, manifesttemplatexml: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_securityapplicationproxy_getmanifesttemplate", longArrayOf(proxy, manifesttemplatexml)).toInt()
}

public fun alljoyn_securityapplicationproxy_getpermissionmanagementsessionport(): UShort {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_securityapplicationproxy_getpermissionmanagementsessionport", longArrayOf()).toUShort()
}

public fun alljoyn_securityapplicationproxy_getpolicy(proxy: alljoyn_securityapplicationproxy, policyxml: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_securityapplicationproxy_getpolicy", longArrayOf(proxy, policyxml)).toInt()
}

public fun alljoyn_securityapplicationproxy_installmembership(proxy: alljoyn_securityapplicationproxy, membershipcertificatechain: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_securityapplicationproxy_installmembership", longArrayOf(proxy, membershipcertificatechain)).toInt()
}

public fun alljoyn_securityapplicationproxy_manifest_destroy(signedmanifestxml: Long) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_securityapplicationproxy_manifest_destroy", longArrayOf(signedmanifestxml))
}

public fun alljoyn_securityapplicationproxy_manifesttemplate_destroy(manifesttemplatexml: Long) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_securityapplicationproxy_manifesttemplate_destroy", longArrayOf(manifesttemplatexml))
}

public fun alljoyn_securityapplicationproxy_policy_destroy(policyxml: Long) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_securityapplicationproxy_policy_destroy", longArrayOf(policyxml))
}

public fun alljoyn_securityapplicationproxy_reset(proxy: alljoyn_securityapplicationproxy): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_securityapplicationproxy_reset", longArrayOf(proxy)).toInt()
}

public fun alljoyn_securityapplicationproxy_resetpolicy(proxy: alljoyn_securityapplicationproxy): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_securityapplicationproxy_resetpolicy", longArrayOf(proxy)).toInt()
}

public fun alljoyn_securityapplicationproxy_setmanifestsignature(unsignedmanifestxml: Long, identitycertificatepem: Long, signature: Long, signaturesize: ULong, signedmanifestxml: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_securityapplicationproxy_setmanifestsignature", longArrayOf(unsignedmanifestxml, identitycertificatepem, signature, signaturesize.toLong(), signedmanifestxml)).toInt()
}

public fun alljoyn_securityapplicationproxy_signmanifest(unsignedmanifestxml: Long, identitycertificatepem: Long, signingprivatekeypem: Long, signedmanifestxml: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_securityapplicationproxy_signmanifest", longArrayOf(unsignedmanifestxml, identitycertificatepem, signingprivatekeypem, signedmanifestxml)).toInt()
}

public fun alljoyn_securityapplicationproxy_startmanagement(proxy: alljoyn_securityapplicationproxy): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_securityapplicationproxy_startmanagement", longArrayOf(proxy)).toInt()
}

public fun alljoyn_securityapplicationproxy_updateidentity(proxy: alljoyn_securityapplicationproxy, identitycertificatechain: Long, manifestsxmls: Long, manifestscount: ULong): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_securityapplicationproxy_updateidentity", longArrayOf(proxy, identitycertificatechain, manifestsxmls, manifestscount.toLong())).toInt()
}

public fun alljoyn_securityapplicationproxy_updatepolicy(proxy: alljoyn_securityapplicationproxy, policyxml: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_securityapplicationproxy_updatepolicy", longArrayOf(proxy, policyxml)).toInt()
}

public fun alljoyn_sessionlistener_create(callbacks: Long, context: Long): alljoyn_sessionlistener {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_sessionlistener_create", longArrayOf(callbacks, context))
}

public fun alljoyn_sessionlistener_destroy(listener: alljoyn_sessionlistener) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_sessionlistener_destroy", longArrayOf(listener))
}

public fun alljoyn_sessionopts_cmp(one: alljoyn_sessionopts, other: alljoyn_sessionopts): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_sessionopts_cmp", longArrayOf(one, other)).toInt()
}

public fun alljoyn_sessionopts_create(traffic: UByte, ismultipoint: Int, proximity: UByte, transports: UShort): alljoyn_sessionopts {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_sessionopts_create", longArrayOf(traffic.toLong(), ismultipoint.toLong(), proximity.toLong(), transports.toLong()))
}

public fun alljoyn_sessionopts_destroy(opts: alljoyn_sessionopts) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_sessionopts_destroy", longArrayOf(opts))
}

public fun alljoyn_sessionopts_get_multipoint(opts: alljoyn_sessionopts): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_sessionopts_get_multipoint", longArrayOf(opts)).toInt()
}

public fun alljoyn_sessionopts_get_proximity(opts: alljoyn_sessionopts): UByte {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_sessionopts_get_proximity", longArrayOf(opts)).toUByte()
}

public fun alljoyn_sessionopts_get_traffic(opts: alljoyn_sessionopts): UByte {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_sessionopts_get_traffic", longArrayOf(opts)).toUByte()
}

public fun alljoyn_sessionopts_get_transports(opts: alljoyn_sessionopts): UShort {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_sessionopts_get_transports", longArrayOf(opts)).toUShort()
}

public fun alljoyn_sessionopts_iscompatible(one: alljoyn_sessionopts, other: alljoyn_sessionopts): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_sessionopts_iscompatible", longArrayOf(one, other)).toInt()
}

public fun alljoyn_sessionopts_set_multipoint(opts: alljoyn_sessionopts, ismultipoint: Int) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_sessionopts_set_multipoint", longArrayOf(opts, ismultipoint.toLong()))
}

public fun alljoyn_sessionopts_set_proximity(opts: alljoyn_sessionopts, proximity: UByte) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_sessionopts_set_proximity", longArrayOf(opts, proximity.toLong()))
}

public fun alljoyn_sessionopts_set_traffic(opts: alljoyn_sessionopts, traffic: UByte) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_sessionopts_set_traffic", longArrayOf(opts, traffic.toLong()))
}

public fun alljoyn_sessionopts_set_transports(opts: alljoyn_sessionopts, transports: UShort) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_sessionopts_set_transports", longArrayOf(opts, transports.toLong()))
}

public fun alljoyn_sessionportlistener_create(callbacks: Long, context: Long): alljoyn_sessionportlistener {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_sessionportlistener_create", longArrayOf(callbacks, context))
}

public fun alljoyn_sessionportlistener_destroy(listener: alljoyn_sessionportlistener) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_sessionportlistener_destroy", longArrayOf(listener))
}

public fun alljoyn_shutdown(): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_shutdown", longArrayOf()).toInt()
}

public fun alljoyn_unity_deferred_callbacks_process(): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_unity_deferred_callbacks_process", longArrayOf()).toInt()
}

public fun alljoyn_unity_set_deferred_callback_mainthread_only(mainthread_only: Int) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_unity_set_deferred_callback_mainthread_only", longArrayOf(mainthread_only.toLong()))
}
