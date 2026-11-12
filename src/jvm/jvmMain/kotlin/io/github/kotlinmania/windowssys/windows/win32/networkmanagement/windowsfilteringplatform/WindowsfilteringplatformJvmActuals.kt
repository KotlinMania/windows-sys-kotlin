@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Acl
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.Sid
import io.github.kotlinmania.windowssys.windows.win32.system.rpc.SecWinntAuthIdentityW

private object WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutAdd0(enginehandle: Long, callout: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteById0(enginehandle: Long, id: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutGetById0(enginehandle: Long, id: Int, callout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutGetByKey0(enginehandle: Long, key: Long, callout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutSubscribeChanges0(enginehandle: Long, subscription: Long, callback: Long, context: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutSubscriptionsGet0(enginehandle: Long, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutUnsubscribeChanges0(enginehandle: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionGetById0(enginehandle: Long, id: Long, connection: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionSubscribe0(enginehandle: Long, subscription: Long, callback: Long, context: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionUnsubscribe0(enginehandle: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmDynamicKeywordSubscribe0(flags: Int, callback: Long, context: Long, subscriptionhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmDynamicKeywordUnsubscribe0(subscriptionhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineClose0(enginehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineGetOption0(enginehandle: Long, option: Int, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineOpen0(servername: Long, authnservice: Int, authidentity: Long, session: Long, enginehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineSetOption0(enginehandle: Long, option: Int, newvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterAdd0(enginehandle: Long, filter: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterDeleteById0(enginehandle: Long, id: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterGetById0(enginehandle: Long, id: Long, filter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterGetByKey0(enginehandle: Long, key: Long, filter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterSubscribeChanges0(enginehandle: Long, subscription: Long, callback: Long, context: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterSubscriptionsGet0(enginehandle: Long, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterUnsubscribeChanges0(enginehandle: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFreeMemory0(p: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmGetAppIdFromFileName0(filename: Long, appid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd0(enginehandle: Long, flags: Int, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: Int, filterconditions: Long, sd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd1(enginehandle: Long, flags: Int, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: Int, filterconditions: Long, keymodkey: Long, sd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd2(enginehandle: Long, flags: Int, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: Int, filterconditions: Long, keymodkey: Long, sd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd3(enginehandle: Long, flags: Int, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: Int, filterconditions: Long, keymodkey: Long, sd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerGetById0(enginehandle: Long, id: Short, layer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerGetByKey0(enginehandle: Long, key: Long, layer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum1(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum2(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum3(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum4(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum5(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe0(enginehandle: Long, subscription: Long, callback: Long, context: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe1(enginehandle: Long, subscription: Long, callback: Long, context: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe2(enginehandle: Long, subscription: Long, callback: Long, context: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe3(enginehandle: Long, subscription: Long, callback: Long, context: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe4(enginehandle: Long, subscription: Long, callback: Long, context: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscriptionsGet0(enginehandle: Long, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventUnsubscribe0(enginehandle: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventsGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventsSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderAdd0(enginehandle: Long, provider: Long, sd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd0(enginehandle: Long, providercontext: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd1(enginehandle: Long, providercontext: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd2(enginehandle: Long, providercontext: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd3(enginehandle: Long, providercontext: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteById0(enginehandle: Long, id: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum1(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum2(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum3(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById0(enginehandle: Long, id: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById1(enginehandle: Long, id: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById2(enginehandle: Long, id: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById3(enginehandle: Long, id: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey0(enginehandle: Long, key: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey1(enginehandle: Long, key: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey2(enginehandle: Long, key: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey3(enginehandle: Long, key: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextSubscribeChanges0(enginehandle: Long, subscription: Long, callback: Long, context: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextSubscriptionsGet0(enginehandle: Long, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextUnsubscribeChanges0(enginehandle: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderGetByKey0(enginehandle: Long, key: Long, provider: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderSubscribeChanges0(enginehandle: Long, subscription: Long, callback: Long, context: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderSubscriptionsGet0(enginehandle: Long, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderUnsubscribeChanges0(enginehandle: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSessionCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSessionDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSessionEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerAdd0(enginehandle: Long, sublayer: Long, sd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerGetByKey0(enginehandle: Long, key: Long, sublayer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerSubscribeChanges0(enginehandle: Long, subscription: Long, callback: Long, context: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerSubscriptionsGet0(enginehandle: Long, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerUnsubscribeChanges0(enginehandle: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSystemPortsGet0(enginehandle: Long, sysports: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSystemPortsSubscribe0(enginehandle: Long, reserved: Long, callback: Long, context: Long, sysportshandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSystemPortsUnsubscribe0(enginehandle: Long, sysportshandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmTransactionAbort0(enginehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmTransactionBegin0(enginehandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmTransactionCommit0(enginehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventSubscribe0(enginehandle: Long, subscription: Long, callback: Long, context: Long, subscriptionhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventUnsubscribe0(enginehandle: Long, subscriptionhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospGetStatistics0(enginehandle: Long, idpstatistics: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospStateCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospStateDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospStateEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecGetStatistics0(enginehandle: Long, ipsecstatistics: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecGetStatistics1(enginehandle: Long, ipsecstatistics: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerAddAndRegister0(enginehandle: Long, keymanager: Long, keymanagercallbacks: Long, keymgmthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerGetSecurityInfoByKey0(enginehandle: Long, reserved: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerSetSecurityInfoByKey0(enginehandle: Long, reserved: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerUnregisterAndDelete0(enginehandle: Long, keymgmthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagersGet0(enginehandle: Long, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound0(enginehandle: Long, id: Long, inboundbundle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound1(enginehandle: Long, id: Long, inboundbundle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound0(enginehandle: Long, id: Long, outboundbundle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound1(enginehandle: Long, id: Long, outboundbundle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextCreate0(enginehandle: Long, outboundtraffic: Long, inboundfilterid: Long, id: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextCreate1(enginehandle: Long, outboundtraffic: Long, virtualiftunnelinfo: Long, inboundfilterid: Long, id: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextDeleteById0(enginehandle: Long, id: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextEnum1(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextExpire0(enginehandle: Long, id: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetById0(enginehandle: Long, id: Long, sacontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetById1(enginehandle: Long, id: Long, sacontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi0(enginehandle: Long, id: Long, getspi: Long, inboundspi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi1(enginehandle: Long, id: Long, getspi: Long, inboundspi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextSetSpi0(enginehandle: Long, id: Long, getspi: Long, inboundspi: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextSubscribe0(enginehandle: Long, subscription: Long, callback: Long, context: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextSubscriptionsGet0(enginehandle: Long, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextUnsubscribe0(enginehandle: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextUpdate0(enginehandle: Long, flags: Long, newvalues: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaDbGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaDbSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaEnum1(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextGetStatistics0(enginehandle: Long, ikeextstatistics: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextGetStatistics1(enginehandle: Long, ikeextstatistics: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDbGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDbSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDeleteById0(enginehandle: Long, id: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaEnum1(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaEnum2(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaGetById0(enginehandle: Long, id: Long, sa: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaGetById1(enginehandle: Long, id: Long, salookupcontext: Long, sa: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaGetById2(enginehandle: Long, id: Long, salookupcontext: Long, sa: Long): Int
}

public actual fun fwpmCalloutAdd0(enginehandle: Handle, callout: ConstPtr<FwpmCallout0>, sd: PsecurityDescriptor, id: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutAdd0(enginehandle.rawAddress, callout.rawAddress, sd.rawAddress, id.rawAddress).toUInt()

public actual fun fwpmCalloutCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmCalloutEnumTemplate0>, enumhandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutCreateEnumHandle0(enginehandle.rawAddress, enumtemplate.rawAddress, enumhandle.rawAddress).toUInt()

public actual fun fwpmCalloutDeleteById0(enginehandle: Handle, id: UInt): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteById0(enginehandle.rawAddress, id.toInt()).toUInt()

public actual fun fwpmCalloutDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteByKey0(enginehandle.rawAddress, key.rawAddress).toUInt()

public actual fun fwpmCalloutDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutDestroyEnumHandle0(enginehandle.rawAddress, enumhandle.rawAddress).toUInt()

public actual fun fwpmCalloutEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmCallout0>>>, numentriesreturned: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutEnum0(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress).toUInt()

public actual fun fwpmCalloutGetById0(enginehandle: Handle, id: UInt, callout: MutPtr<MutPtr<FwpmCallout0>>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutGetById0(enginehandle.rawAddress, id.toInt(), callout.rawAddress).toUInt()

public actual fun fwpmCalloutGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, callout: MutPtr<MutPtr<FwpmCallout0>>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutGetByKey0(enginehandle.rawAddress, key.rawAddress, callout.rawAddress).toUInt()

public actual fun fwpmCalloutGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutGetSecurityInfoByKey0(enginehandle.rawAddress, key.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress, securitydescriptor.rawAddress).toUInt()

public actual fun fwpmCalloutSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutSetSecurityInfoByKey0(enginehandle.rawAddress, key.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress).toUInt()

public actual fun fwpmCalloutSubscribeChanges0(enginehandle: Handle, subscription: ConstPtr<FwpmCalloutSubscription0>, callback: FwpmCalloutChangeCallback0, context: ConstPtr<CVoid>, changehandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutSubscribeChanges0(enginehandle.rawAddress, subscription.rawAddress, 0L, context.rawAddress, changehandle.rawAddress).toUInt()

public actual fun fwpmCalloutSubscriptionsGet0(enginehandle: Handle, entries: MutPtr<MutPtr<MutPtr<FwpmCalloutSubscription0>>>, numentries: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutSubscriptionsGet0(enginehandle.rawAddress, entries.rawAddress, numentries.rawAddress).toUInt()

public actual fun fwpmCalloutUnsubscribeChanges0(enginehandle: Handle, changehandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmCalloutUnsubscribeChanges0(enginehandle.rawAddress, changehandle.rawAddress).toUInt()

public actual fun fwpmConnectionCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmConnectionEnumTemplate0>, enumhandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionCreateEnumHandle0(enginehandle.rawAddress, enumtemplate.rawAddress, enumhandle.rawAddress).toUInt()

public actual fun fwpmConnectionDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionDestroyEnumHandle0(enginehandle.rawAddress, enumhandle.rawAddress).toUInt()

public actual fun fwpmConnectionEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmConnection0>>>, numentriesreturned: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionEnum0(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress).toUInt()

public actual fun fwpmConnectionGetById0(enginehandle: Handle, id: ULong, connection: MutPtr<MutPtr<FwpmConnection0>>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionGetById0(enginehandle.rawAddress, id.toLong(), connection.rawAddress).toUInt()

public actual fun fwpmConnectionGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionGetSecurityInfo0(enginehandle.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress, securitydescriptor.rawAddress).toUInt()

public actual fun fwpmConnectionSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionSetSecurityInfo0(enginehandle.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress).toUInt()

public actual fun fwpmConnectionSubscribe0(enginehandle: Handle, subscription: ConstPtr<FwpmConnectionSubscription0>, callback: FwpmConnectionCallback0, context: ConstPtr<CVoid>, eventshandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionSubscribe0(enginehandle.rawAddress, subscription.rawAddress, 0L, context.rawAddress, eventshandle.rawAddress).toUInt()

public actual fun fwpmConnectionUnsubscribe0(enginehandle: Handle, eventshandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmConnectionUnsubscribe0(enginehandle.rawAddress, eventshandle.rawAddress).toUInt()

public actual fun fwpmDynamicKeywordSubscribe0(flags: UInt, callback: FwpmDynamicKeywordCallback0, context: ConstPtr<CVoid>, subscriptionhandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmDynamicKeywordSubscribe0(flags.toInt(), 0L, context.rawAddress, subscriptionhandle.rawAddress).toUInt()

public actual fun fwpmDynamicKeywordUnsubscribe0(subscriptionhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmDynamicKeywordUnsubscribe0(subscriptionhandle.rawAddress).toUInt()

public actual fun fwpmEngineClose0(enginehandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineClose0(enginehandle.rawAddress).toUInt()

public actual fun fwpmEngineGetOption0(enginehandle: Handle, option: FwpmEngineOption, value: MutPtr<MutPtr<FwpValue0>>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineGetOption0(enginehandle.rawAddress, option, value.rawAddress).toUInt()

public actual fun fwpmEngineGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineGetSecurityInfo0(enginehandle.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress, securitydescriptor.rawAddress).toUInt()

public actual fun fwpmEngineOpen0(servername: Pcwstr, authnservice: UInt, authidentity: ConstPtr<SecWinntAuthIdentityW>, session: ConstPtr<FwpmSession0>, enginehandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineOpen0(servername.rawAddress, authnservice.toInt(), authidentity.rawAddress, session.rawAddress, enginehandle.rawAddress).toUInt()

public actual fun fwpmEngineSetOption0(enginehandle: Handle, option: FwpmEngineOption, newvalue: ConstPtr<FwpValue0>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineSetOption0(enginehandle.rawAddress, option, newvalue.rawAddress).toUInt()

public actual fun fwpmEngineSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmEngineSetSecurityInfo0(enginehandle.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress).toUInt()

public actual fun fwpmFilterAdd0(enginehandle: Handle, filter: ConstPtr<FwpmFilter0>, sd: PsecurityDescriptor, id: MutPtr<ULong>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterAdd0(enginehandle.rawAddress, filter.rawAddress, sd.rawAddress, id.rawAddress).toUInt()

public actual fun fwpmFilterCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmFilterEnumTemplate0>, enumhandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterCreateEnumHandle0(enginehandle.rawAddress, enumtemplate.rawAddress, enumhandle.rawAddress).toUInt()

public actual fun fwpmFilterDeleteById0(enginehandle: Handle, id: ULong): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterDeleteById0(enginehandle.rawAddress, id.toLong()).toUInt()

public actual fun fwpmFilterDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterDeleteByKey0(enginehandle.rawAddress, key.rawAddress).toUInt()

public actual fun fwpmFilterDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterDestroyEnumHandle0(enginehandle.rawAddress, enumhandle.rawAddress).toUInt()

public actual fun fwpmFilterEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmFilter0>>>, numentriesreturned: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterEnum0(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress).toUInt()

public actual fun fwpmFilterGetById0(enginehandle: Handle, id: ULong, filter: MutPtr<MutPtr<FwpmFilter0>>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterGetById0(enginehandle.rawAddress, id.toLong(), filter.rawAddress).toUInt()

public actual fun fwpmFilterGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, filter: MutPtr<MutPtr<FwpmFilter0>>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterGetByKey0(enginehandle.rawAddress, key.rawAddress, filter.rawAddress).toUInt()

public actual fun fwpmFilterGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterGetSecurityInfoByKey0(enginehandle.rawAddress, key.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress, securitydescriptor.rawAddress).toUInt()

public actual fun fwpmFilterSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterSetSecurityInfoByKey0(enginehandle.rawAddress, key.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress).toUInt()

public actual fun fwpmFilterSubscribeChanges0(enginehandle: Handle, subscription: ConstPtr<FwpmFilterSubscription0>, callback: FwpmFilterChangeCallback0, context: ConstPtr<CVoid>, changehandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterSubscribeChanges0(enginehandle.rawAddress, subscription.rawAddress, 0L, context.rawAddress, changehandle.rawAddress).toUInt()

public actual fun fwpmFilterSubscriptionsGet0(enginehandle: Handle, entries: MutPtr<MutPtr<MutPtr<FwpmFilterSubscription0>>>, numentries: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterSubscriptionsGet0(enginehandle.rawAddress, entries.rawAddress, numentries.rawAddress).toUInt()

public actual fun fwpmFilterUnsubscribeChanges0(enginehandle: Handle, changehandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFilterUnsubscribeChanges0(enginehandle.rawAddress, changehandle.rawAddress).toUInt()

public actual fun fwpmFreeMemory0(p: MutPtr<MutPtr<CVoid>>) {
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmFreeMemory0(p.rawAddress)
}

public actual fun fwpmGetAppIdFromFileName0(filename: Pcwstr, appid: MutPtr<MutPtr<FwpByteBlob>>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmGetAppIdFromFileName0(filename.rawAddress, appid.rawAddress).toUInt()

public actual fun fwpmIPsecTunnelAdd0(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr<FwpmProviderContext0>, tunnelpolicy: ConstPtr<FwpmProviderContext0>, numfilterconditions: UInt, filterconditions: ConstPtr<FwpmFilterCondition0>, sd: PsecurityDescriptor): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd0(enginehandle.rawAddress, flags.toInt(), mainmodepolicy.rawAddress, tunnelpolicy.rawAddress, numfilterconditions.toInt(), filterconditions.rawAddress, sd.rawAddress).toUInt()

public actual fun fwpmIPsecTunnelAdd1(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr<FwpmProviderContext1>, tunnelpolicy: ConstPtr<FwpmProviderContext1>, numfilterconditions: UInt, filterconditions: ConstPtr<FwpmFilterCondition0>, keymodkey: ConstPtr<Guid>, sd: PsecurityDescriptor): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd1(enginehandle.rawAddress, flags.toInt(), mainmodepolicy.rawAddress, tunnelpolicy.rawAddress, numfilterconditions.toInt(), filterconditions.rawAddress, keymodkey.rawAddress, sd.rawAddress).toUInt()

public actual fun fwpmIPsecTunnelAdd2(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr<FwpmProviderContext2>, tunnelpolicy: ConstPtr<FwpmProviderContext2>, numfilterconditions: UInt, filterconditions: ConstPtr<FwpmFilterCondition0>, keymodkey: ConstPtr<Guid>, sd: PsecurityDescriptor): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd2(enginehandle.rawAddress, flags.toInt(), mainmodepolicy.rawAddress, tunnelpolicy.rawAddress, numfilterconditions.toInt(), filterconditions.rawAddress, keymodkey.rawAddress, sd.rawAddress).toUInt()

public actual fun fwpmIPsecTunnelAdd3(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr<FwpmProviderContext3>, tunnelpolicy: ConstPtr<FwpmProviderContext3>, numfilterconditions: UInt, filterconditions: ConstPtr<FwpmFilterCondition0>, keymodkey: ConstPtr<Guid>, sd: PsecurityDescriptor): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd3(enginehandle.rawAddress, flags.toInt(), mainmodepolicy.rawAddress, tunnelpolicy.rawAddress, numfilterconditions.toInt(), filterconditions.rawAddress, keymodkey.rawAddress, sd.rawAddress).toUInt()

public actual fun fwpmIPsecTunnelDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelDeleteByKey0(enginehandle.rawAddress, key.rawAddress).toUInt()

public actual fun fwpmLayerCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmLayerEnumTemplate0>, enumhandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerCreateEnumHandle0(enginehandle.rawAddress, enumtemplate.rawAddress, enumhandle.rawAddress).toUInt()

public actual fun fwpmLayerDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerDestroyEnumHandle0(enginehandle.rawAddress, enumhandle.rawAddress).toUInt()

public actual fun fwpmLayerEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmLayer0>>>, numentriesreturned: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerEnum0(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress).toUInt()

public actual fun fwpmLayerGetById0(enginehandle: Handle, id: UShort, layer: MutPtr<MutPtr<FwpmLayer0>>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerGetById0(enginehandle.rawAddress, id.toShort(), layer.rawAddress).toUInt()

public actual fun fwpmLayerGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, layer: MutPtr<MutPtr<FwpmLayer0>>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerGetByKey0(enginehandle.rawAddress, key.rawAddress, layer.rawAddress).toUInt()

public actual fun fwpmLayerGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerGetSecurityInfoByKey0(enginehandle.rawAddress, key.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress, securitydescriptor.rawAddress).toUInt()

public actual fun fwpmLayerSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmLayerSetSecurityInfoByKey0(enginehandle.rawAddress, key.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress).toUInt()

public actual fun fwpmNetEventCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmNetEventEnumTemplate0>, enumhandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventCreateEnumHandle0(enginehandle.rawAddress, enumtemplate.rawAddress, enumhandle.rawAddress).toUInt()

public actual fun fwpmNetEventDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventDestroyEnumHandle0(enginehandle.rawAddress, enumhandle.rawAddress).toUInt()

public actual fun fwpmNetEventEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent0>>>, numentriesreturned: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum0(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress).toUInt()

public actual fun fwpmNetEventEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent1>>>, numentriesreturned: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum1(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress).toUInt()

public actual fun fwpmNetEventEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent2>>>, numentriesreturned: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum2(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress).toUInt()

public actual fun fwpmNetEventEnum3(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent3>>>, numentriesreturned: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum3(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress).toUInt()

public actual fun fwpmNetEventEnum4(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent4>>>, numentriesreturned: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum4(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress).toUInt()

public actual fun fwpmNetEventEnum5(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent5>>>, numentriesreturned: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventEnum5(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress).toUInt()

public actual fun fwpmNetEventSubscribe0(enginehandle: Handle, subscription: ConstPtr<FwpmNetEventSubscription0>, callback: FwpmNetEventCallback0, context: ConstPtr<CVoid>, eventshandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe0(enginehandle.rawAddress, subscription.rawAddress, 0L, context.rawAddress, eventshandle.rawAddress).toUInt()

public actual fun fwpmNetEventSubscribe1(enginehandle: Handle, subscription: ConstPtr<FwpmNetEventSubscription0>, callback: FwpmNetEventCallback1, context: ConstPtr<CVoid>, eventshandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe1(enginehandle.rawAddress, subscription.rawAddress, 0L, context.rawAddress, eventshandle.rawAddress).toUInt()

public actual fun fwpmNetEventSubscribe2(enginehandle: Handle, subscription: ConstPtr<FwpmNetEventSubscription0>, callback: FwpmNetEventCallback2, context: ConstPtr<CVoid>, eventshandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe2(enginehandle.rawAddress, subscription.rawAddress, 0L, context.rawAddress, eventshandle.rawAddress).toUInt()

public actual fun fwpmNetEventSubscribe3(enginehandle: Handle, subscription: ConstPtr<FwpmNetEventSubscription0>, callback: FwpmNetEventCallback3, context: ConstPtr<CVoid>, eventshandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe3(enginehandle.rawAddress, subscription.rawAddress, 0L, context.rawAddress, eventshandle.rawAddress).toUInt()

public actual fun fwpmNetEventSubscribe4(enginehandle: Handle, subscription: ConstPtr<FwpmNetEventSubscription0>, callback: FwpmNetEventCallback4, context: ConstPtr<CVoid>, eventshandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscribe4(enginehandle.rawAddress, subscription.rawAddress, 0L, context.rawAddress, eventshandle.rawAddress).toUInt()

public actual fun fwpmNetEventSubscriptionsGet0(enginehandle: Handle, entries: MutPtr<MutPtr<MutPtr<FwpmNetEventSubscription0>>>, numentries: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventSubscriptionsGet0(enginehandle.rawAddress, entries.rawAddress, numentries.rawAddress).toUInt()

public actual fun fwpmNetEventUnsubscribe0(enginehandle: Handle, eventshandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventUnsubscribe0(enginehandle.rawAddress, eventshandle.rawAddress).toUInt()

public actual fun fwpmNetEventsGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventsGetSecurityInfo0(enginehandle.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress, securitydescriptor.rawAddress).toUInt()

public actual fun fwpmNetEventsSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmNetEventsSetSecurityInfo0(enginehandle.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress).toUInt()

public actual fun fwpmProviderAdd0(enginehandle: Handle, provider: ConstPtr<FwpmProvider0>, sd: PsecurityDescriptor): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderAdd0(enginehandle.rawAddress, provider.rawAddress, sd.rawAddress).toUInt()

public actual fun fwpmProviderContextAdd0(enginehandle: Handle, providercontext: ConstPtr<FwpmProviderContext0>, sd: PsecurityDescriptor, id: MutPtr<ULong>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd0(enginehandle.rawAddress, providercontext.rawAddress, sd.rawAddress, id.rawAddress).toUInt()

public actual fun fwpmProviderContextAdd1(enginehandle: Handle, providercontext: ConstPtr<FwpmProviderContext1>, sd: PsecurityDescriptor, id: MutPtr<ULong>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd1(enginehandle.rawAddress, providercontext.rawAddress, sd.rawAddress, id.rawAddress).toUInt()

public actual fun fwpmProviderContextAdd2(enginehandle: Handle, providercontext: ConstPtr<FwpmProviderContext2>, sd: PsecurityDescriptor, id: MutPtr<ULong>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd2(enginehandle.rawAddress, providercontext.rawAddress, sd.rawAddress, id.rawAddress).toUInt()

public actual fun fwpmProviderContextAdd3(enginehandle: Handle, providercontext: ConstPtr<FwpmProviderContext3>, sd: PsecurityDescriptor, id: MutPtr<ULong>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd3(enginehandle.rawAddress, providercontext.rawAddress, sd.rawAddress, id.rawAddress).toUInt()

public actual fun fwpmProviderContextCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmProviderContextEnumTemplate0>, enumhandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextCreateEnumHandle0(enginehandle.rawAddress, enumtemplate.rawAddress, enumhandle.rawAddress).toUInt()

public actual fun fwpmProviderContextDeleteById0(enginehandle: Handle, id: ULong): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteById0(enginehandle.rawAddress, id.toLong()).toUInt()

public actual fun fwpmProviderContextDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteByKey0(enginehandle.rawAddress, key.rawAddress).toUInt()

public actual fun fwpmProviderContextDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextDestroyEnumHandle0(enginehandle.rawAddress, enumhandle.rawAddress).toUInt()

public actual fun fwpmProviderContextEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProviderContext0>>>, numentriesreturned: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum0(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress).toUInt()

public actual fun fwpmProviderContextEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProviderContext1>>>, numentriesreturned: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum1(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress).toUInt()

public actual fun fwpmProviderContextEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProviderContext2>>>, numentriesreturned: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum2(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress).toUInt()

public actual fun fwpmProviderContextEnum3(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProviderContext3>>>, numentriesreturned: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum3(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress).toUInt()

public actual fun fwpmProviderContextGetById0(enginehandle: Handle, id: ULong, providercontext: MutPtr<MutPtr<FwpmProviderContext0>>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById0(enginehandle.rawAddress, id.toLong(), providercontext.rawAddress).toUInt()

public actual fun fwpmProviderContextGetById1(enginehandle: Handle, id: ULong, providercontext: MutPtr<MutPtr<FwpmProviderContext1>>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById1(enginehandle.rawAddress, id.toLong(), providercontext.rawAddress).toUInt()

public actual fun fwpmProviderContextGetById2(enginehandle: Handle, id: ULong, providercontext: MutPtr<MutPtr<FwpmProviderContext2>>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById2(enginehandle.rawAddress, id.toLong(), providercontext.rawAddress).toUInt()

public actual fun fwpmProviderContextGetById3(enginehandle: Handle, id: ULong, providercontext: MutPtr<MutPtr<FwpmProviderContext3>>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById3(enginehandle.rawAddress, id.toLong(), providercontext.rawAddress).toUInt()

public actual fun fwpmProviderContextGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, providercontext: MutPtr<MutPtr<FwpmProviderContext0>>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey0(enginehandle.rawAddress, key.rawAddress, providercontext.rawAddress).toUInt()

public actual fun fwpmProviderContextGetByKey1(enginehandle: Handle, key: ConstPtr<Guid>, providercontext: MutPtr<MutPtr<FwpmProviderContext1>>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey1(enginehandle.rawAddress, key.rawAddress, providercontext.rawAddress).toUInt()

public actual fun fwpmProviderContextGetByKey2(enginehandle: Handle, key: ConstPtr<Guid>, providercontext: MutPtr<MutPtr<FwpmProviderContext2>>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey2(enginehandle.rawAddress, key.rawAddress, providercontext.rawAddress).toUInt()

public actual fun fwpmProviderContextGetByKey3(enginehandle: Handle, key: ConstPtr<Guid>, providercontext: MutPtr<MutPtr<FwpmProviderContext3>>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey3(enginehandle.rawAddress, key.rawAddress, providercontext.rawAddress).toUInt()

public actual fun fwpmProviderContextGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextGetSecurityInfoByKey0(enginehandle.rawAddress, key.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress, securitydescriptor.rawAddress).toUInt()

public actual fun fwpmProviderContextSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextSetSecurityInfoByKey0(enginehandle.rawAddress, key.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress).toUInt()

public actual fun fwpmProviderContextSubscribeChanges0(enginehandle: Handle, subscription: ConstPtr<FwpmProviderContextSubscription0>, callback: FwpmProviderContextChangeCallback0, context: ConstPtr<CVoid>, changehandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextSubscribeChanges0(enginehandle.rawAddress, subscription.rawAddress, 0L, context.rawAddress, changehandle.rawAddress).toUInt()

public actual fun fwpmProviderContextSubscriptionsGet0(enginehandle: Handle, entries: MutPtr<MutPtr<MutPtr<FwpmProviderContextSubscription0>>>, numentries: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextSubscriptionsGet0(enginehandle.rawAddress, entries.rawAddress, numentries.rawAddress).toUInt()

public actual fun fwpmProviderContextUnsubscribeChanges0(enginehandle: Handle, changehandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderContextUnsubscribeChanges0(enginehandle.rawAddress, changehandle.rawAddress).toUInt()

public actual fun fwpmProviderCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmProviderEnumTemplate0>, enumhandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderCreateEnumHandle0(enginehandle.rawAddress, enumtemplate.rawAddress, enumhandle.rawAddress).toUInt()

public actual fun fwpmProviderDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderDeleteByKey0(enginehandle.rawAddress, key.rawAddress).toUInt()

public actual fun fwpmProviderDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderDestroyEnumHandle0(enginehandle.rawAddress, enumhandle.rawAddress).toUInt()

public actual fun fwpmProviderEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProvider0>>>, numentriesreturned: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderEnum0(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress).toUInt()

public actual fun fwpmProviderGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, provider: MutPtr<MutPtr<FwpmProvider0>>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderGetByKey0(enginehandle.rawAddress, key.rawAddress, provider.rawAddress).toUInt()

public actual fun fwpmProviderGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderGetSecurityInfoByKey0(enginehandle.rawAddress, key.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress, securitydescriptor.rawAddress).toUInt()

public actual fun fwpmProviderSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderSetSecurityInfoByKey0(enginehandle.rawAddress, key.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress).toUInt()

public actual fun fwpmProviderSubscribeChanges0(enginehandle: Handle, subscription: ConstPtr<FwpmProviderSubscription0>, callback: FwpmProviderChangeCallback0, context: ConstPtr<CVoid>, changehandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderSubscribeChanges0(enginehandle.rawAddress, subscription.rawAddress, 0L, context.rawAddress, changehandle.rawAddress).toUInt()

public actual fun fwpmProviderSubscriptionsGet0(enginehandle: Handle, entries: MutPtr<MutPtr<MutPtr<FwpmProviderSubscription0>>>, numentries: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderSubscriptionsGet0(enginehandle.rawAddress, entries.rawAddress, numentries.rawAddress).toUInt()

public actual fun fwpmProviderUnsubscribeChanges0(enginehandle: Handle, changehandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmProviderUnsubscribeChanges0(enginehandle.rawAddress, changehandle.rawAddress).toUInt()

public actual fun fwpmSessionCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmSessionEnumTemplate0>, enumhandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSessionCreateEnumHandle0(enginehandle.rawAddress, enumtemplate.rawAddress, enumhandle.rawAddress).toUInt()

public actual fun fwpmSessionDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSessionDestroyEnumHandle0(enginehandle.rawAddress, enumhandle.rawAddress).toUInt()

public actual fun fwpmSessionEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmSession0>>>, numentriesreturned: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSessionEnum0(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress).toUInt()

public actual fun fwpmSubLayerAdd0(enginehandle: Handle, sublayer: ConstPtr<FwpmSublayer0>, sd: PsecurityDescriptor): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerAdd0(enginehandle.rawAddress, sublayer.rawAddress, sd.rawAddress).toUInt()

public actual fun fwpmSubLayerCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmSublayerEnumTemplate0>, enumhandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerCreateEnumHandle0(enginehandle.rawAddress, enumtemplate.rawAddress, enumhandle.rawAddress).toUInt()

public actual fun fwpmSubLayerDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerDeleteByKey0(enginehandle.rawAddress, key.rawAddress).toUInt()

public actual fun fwpmSubLayerDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerDestroyEnumHandle0(enginehandle.rawAddress, enumhandle.rawAddress).toUInt()

public actual fun fwpmSubLayerEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmSublayer0>>>, numentriesreturned: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerEnum0(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress).toUInt()

public actual fun fwpmSubLayerGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, sublayer: MutPtr<MutPtr<FwpmSublayer0>>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerGetByKey0(enginehandle.rawAddress, key.rawAddress, sublayer.rawAddress).toUInt()

public actual fun fwpmSubLayerGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerGetSecurityInfoByKey0(enginehandle.rawAddress, key.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress, securitydescriptor.rawAddress).toUInt()

public actual fun fwpmSubLayerSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerSetSecurityInfoByKey0(enginehandle.rawAddress, key.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress).toUInt()

public actual fun fwpmSubLayerSubscribeChanges0(enginehandle: Handle, subscription: ConstPtr<FwpmSublayerSubscription0>, callback: FwpmSublayerChangeCallback0, context: ConstPtr<CVoid>, changehandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerSubscribeChanges0(enginehandle.rawAddress, subscription.rawAddress, 0L, context.rawAddress, changehandle.rawAddress).toUInt()

public actual fun fwpmSubLayerSubscriptionsGet0(enginehandle: Handle, entries: MutPtr<MutPtr<MutPtr<FwpmSublayerSubscription0>>>, numentries: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerSubscriptionsGet0(enginehandle.rawAddress, entries.rawAddress, numentries.rawAddress).toUInt()

public actual fun fwpmSubLayerUnsubscribeChanges0(enginehandle: Handle, changehandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSubLayerUnsubscribeChanges0(enginehandle.rawAddress, changehandle.rawAddress).toUInt()

public actual fun fwpmSystemPortsGet0(enginehandle: Handle, sysports: MutPtr<MutPtr<FwpmSystemPorts0>>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSystemPortsGet0(enginehandle.rawAddress, sysports.rawAddress).toUInt()

public actual fun fwpmSystemPortsSubscribe0(enginehandle: Handle, reserved: ConstPtr<CVoid>, callback: FwpmSystemPortsCallback0, context: ConstPtr<CVoid>, sysportshandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSystemPortsSubscribe0(enginehandle.rawAddress, reserved.rawAddress, 0L, context.rawAddress, sysportshandle.rawAddress).toUInt()

public actual fun fwpmSystemPortsUnsubscribe0(enginehandle: Handle, sysportshandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmSystemPortsUnsubscribe0(enginehandle.rawAddress, sysportshandle.rawAddress).toUInt()

public actual fun fwpmTransactionAbort0(enginehandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmTransactionAbort0(enginehandle.rawAddress).toUInt()

public actual fun fwpmTransactionBegin0(enginehandle: Handle, flags: UInt): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmTransactionBegin0(enginehandle.rawAddress, flags.toInt()).toUInt()

public actual fun fwpmTransactionCommit0(enginehandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmTransactionCommit0(enginehandle.rawAddress).toUInt()

public actual fun fwpmvSwitchEventSubscribe0(enginehandle: Handle, subscription: ConstPtr<FwpmVswitchEventSubscription0>, callback: FwpmVswitchEventCallback0, context: ConstPtr<CVoid>, subscriptionhandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventSubscribe0(enginehandle.rawAddress, subscription.rawAddress, 0L, context.rawAddress, subscriptionhandle.rawAddress).toUInt()

public actual fun fwpmvSwitchEventUnsubscribe0(enginehandle: Handle, subscriptionhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventUnsubscribe0(enginehandle.rawAddress, subscriptionhandle.rawAddress).toUInt()

public actual fun fwpmvSwitchEventsGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsGetSecurityInfo0(enginehandle.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress, securitydescriptor.rawAddress).toUInt()

public actual fun fwpmvSwitchEventsSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsSetSecurityInfo0(enginehandle.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress).toUInt()

public actual fun iPsecDospGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospGetSecurityInfo0(enginehandle.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress, securitydescriptor.rawAddress).toUInt()

public actual fun iPsecDospGetStatistics0(enginehandle: Handle, idpstatistics: MutPtr<IpsecDospStatistics0>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospGetStatistics0(enginehandle.rawAddress, idpstatistics.rawAddress).toUInt()

public actual fun iPsecDospSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospSetSecurityInfo0(enginehandle.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress).toUInt()

public actual fun iPsecDospStateCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<IpsecDospStateEnumTemplate0>, enumhandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospStateCreateEnumHandle0(enginehandle.rawAddress, enumtemplate.rawAddress, enumhandle.rawAddress).toUInt()

public actual fun iPsecDospStateDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospStateDestroyEnumHandle0(enginehandle.rawAddress, enumhandle.rawAddress).toUInt()

public actual fun iPsecDospStateEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecDospState0>>>, numentries: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecDospStateEnum0(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentries.rawAddress).toUInt()

public actual fun iPsecGetStatistics0(enginehandle: Handle, ipsecstatistics: MutPtr<IpsecStatistics0>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecGetStatistics0(enginehandle.rawAddress, ipsecstatistics.rawAddress).toUInt()

public actual fun iPsecGetStatistics1(enginehandle: Handle, ipsecstatistics: MutPtr<IpsecStatistics1>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecGetStatistics1(enginehandle.rawAddress, ipsecstatistics.rawAddress).toUInt()

public actual fun iPsecKeyManagerAddAndRegister0(enginehandle: Handle, keymanager: ConstPtr<IpsecKeyManager0>, keymanagercallbacks: ConstPtr<IpsecKeyManagerCallbacks0>, keymgmthandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerAddAndRegister0(enginehandle.rawAddress, keymanager.rawAddress, keymanagercallbacks.rawAddress, keymgmthandle.rawAddress).toUInt()

public actual fun iPsecKeyManagerGetSecurityInfoByKey0(enginehandle: Handle, reserved: ConstPtr<CVoid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerGetSecurityInfoByKey0(enginehandle.rawAddress, reserved.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress, securitydescriptor.rawAddress).toUInt()

public actual fun iPsecKeyManagerSetSecurityInfoByKey0(enginehandle: Handle, reserved: ConstPtr<CVoid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerSetSecurityInfoByKey0(enginehandle.rawAddress, reserved.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress).toUInt()

public actual fun iPsecKeyManagerUnregisterAndDelete0(enginehandle: Handle, keymgmthandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagerUnregisterAndDelete0(enginehandle.rawAddress, keymgmthandle.rawAddress).toUInt()

public actual fun iPsecKeyManagersGet0(enginehandle: Handle, entries: MutPtr<MutPtr<MutPtr<IpsecKeyManager0>>>, numentries: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecKeyManagersGet0(enginehandle.rawAddress, entries.rawAddress, numentries.rawAddress).toUInt()

public actual fun iPsecSaContextAddInbound0(enginehandle: Handle, id: ULong, inboundbundle: ConstPtr<IpsecSaBundle0>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound0(enginehandle.rawAddress, id.toLong(), inboundbundle.rawAddress).toUInt()

public actual fun iPsecSaContextAddInbound1(enginehandle: Handle, id: ULong, inboundbundle: ConstPtr<IpsecSaBundle1>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound1(enginehandle.rawAddress, id.toLong(), inboundbundle.rawAddress).toUInt()

public actual fun iPsecSaContextAddOutbound0(enginehandle: Handle, id: ULong, outboundbundle: ConstPtr<IpsecSaBundle0>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound0(enginehandle.rawAddress, id.toLong(), outboundbundle.rawAddress).toUInt()

public actual fun iPsecSaContextAddOutbound1(enginehandle: Handle, id: ULong, outboundbundle: ConstPtr<IpsecSaBundle1>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound1(enginehandle.rawAddress, id.toLong(), outboundbundle.rawAddress).toUInt()

public actual fun iPsecSaContextCreate0(enginehandle: Handle, outboundtraffic: ConstPtr<IpsecTraffic0>, inboundfilterid: MutPtr<ULong>, id: MutPtr<ULong>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextCreate0(enginehandle.rawAddress, outboundtraffic.rawAddress, inboundfilterid.rawAddress, id.rawAddress).toUInt()

public actual fun iPsecSaContextCreate1(enginehandle: Handle, outboundtraffic: ConstPtr<IpsecTraffic1>, virtualiftunnelinfo: ConstPtr<IpsecVirtualIfTunnelInfo0>, inboundfilterid: MutPtr<ULong>, id: MutPtr<ULong>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextCreate1(enginehandle.rawAddress, outboundtraffic.rawAddress, virtualiftunnelinfo.rawAddress, inboundfilterid.rawAddress, id.rawAddress).toUInt()

public actual fun iPsecSaContextCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<IpsecSaContextEnumTemplate0>, enumhandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextCreateEnumHandle0(enginehandle.rawAddress, enumtemplate.rawAddress, enumhandle.rawAddress).toUInt()

public actual fun iPsecSaContextDeleteById0(enginehandle: Handle, id: ULong): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextDeleteById0(enginehandle.rawAddress, id.toLong()).toUInt()

public actual fun iPsecSaContextDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextDestroyEnumHandle0(enginehandle.rawAddress, enumhandle.rawAddress).toUInt()

public actual fun iPsecSaContextEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecSaContext0>>>, numentriesreturned: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextEnum0(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress).toUInt()

public actual fun iPsecSaContextEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecSaContext1>>>, numentriesreturned: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextEnum1(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress).toUInt()

public actual fun iPsecSaContextExpire0(enginehandle: Handle, id: ULong): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextExpire0(enginehandle.rawAddress, id.toLong()).toUInt()

public actual fun iPsecSaContextGetById0(enginehandle: Handle, id: ULong, sacontext: MutPtr<MutPtr<IpsecSaContext0>>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetById0(enginehandle.rawAddress, id.toLong(), sacontext.rawAddress).toUInt()

public actual fun iPsecSaContextGetById1(enginehandle: Handle, id: ULong, sacontext: MutPtr<MutPtr<IpsecSaContext1>>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetById1(enginehandle.rawAddress, id.toLong(), sacontext.rawAddress).toUInt()

public actual fun iPsecSaContextGetSpi0(enginehandle: Handle, id: ULong, getspi: ConstPtr<IpsecGetspi0>, inboundspi: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi0(enginehandle.rawAddress, id.toLong(), getspi.rawAddress, inboundspi.rawAddress).toUInt()

public actual fun iPsecSaContextGetSpi1(enginehandle: Handle, id: ULong, getspi: ConstPtr<IpsecGetspi1>, inboundspi: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi1(enginehandle.rawAddress, id.toLong(), getspi.rawAddress, inboundspi.rawAddress).toUInt()

public actual fun iPsecSaContextSetSpi0(enginehandle: Handle, id: ULong, getspi: ConstPtr<IpsecGetspi1>, inboundspi: UInt): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextSetSpi0(enginehandle.rawAddress, id.toLong(), getspi.rawAddress, inboundspi.toInt()).toUInt()

public actual fun iPsecSaContextSubscribe0(enginehandle: Handle, subscription: ConstPtr<IpsecSaContextSubscription0>, callback: IpsecSaContextCallback0, context: ConstPtr<CVoid>, eventshandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextSubscribe0(enginehandle.rawAddress, subscription.rawAddress, 0L, context.rawAddress, eventshandle.rawAddress).toUInt()

public actual fun iPsecSaContextSubscriptionsGet0(enginehandle: Handle, entries: MutPtr<MutPtr<MutPtr<IpsecSaContextSubscription0>>>, numentries: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextSubscriptionsGet0(enginehandle.rawAddress, entries.rawAddress, numentries.rawAddress).toUInt()

public actual fun iPsecSaContextUnsubscribe0(enginehandle: Handle, eventshandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextUnsubscribe0(enginehandle.rawAddress, eventshandle.rawAddress).toUInt()

public actual fun iPsecSaContextUpdate0(enginehandle: Handle, flags: ULong, newvalues: ConstPtr<IpsecSaContext1>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaContextUpdate0(enginehandle.rawAddress, flags.toLong(), newvalues.rawAddress).toUInt()

public actual fun iPsecSaCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<IpsecSaEnumTemplate0>, enumhandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaCreateEnumHandle0(enginehandle.rawAddress, enumtemplate.rawAddress, enumhandle.rawAddress).toUInt()

public actual fun iPsecSaDbGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaDbGetSecurityInfo0(enginehandle.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress, securitydescriptor.rawAddress).toUInt()

public actual fun iPsecSaDbSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaDbSetSecurityInfo0(enginehandle.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress).toUInt()

public actual fun iPsecSaDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaDestroyEnumHandle0(enginehandle.rawAddress, enumhandle.rawAddress).toUInt()

public actual fun iPsecSaEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecSaDetails0>>>, numentriesreturned: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaEnum0(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress).toUInt()

public actual fun iPsecSaEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecSaDetails1>>>, numentriesreturned: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIPsecSaEnum1(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress).toUInt()

public actual fun ikeextGetStatistics0(enginehandle: Handle, ikeextstatistics: MutPtr<IkeextStatistics0>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextGetStatistics0(enginehandle.rawAddress, ikeextstatistics.rawAddress).toUInt()

public actual fun ikeextGetStatistics1(enginehandle: Handle, ikeextstatistics: MutPtr<IkeextStatistics1>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextGetStatistics1(enginehandle.rawAddress, ikeextstatistics.rawAddress).toUInt()

public actual fun ikeextSaCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<IkeextSaEnumTemplate0>, enumhandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaCreateEnumHandle0(enginehandle.rawAddress, enumtemplate.rawAddress, enumhandle.rawAddress).toUInt()

public actual fun ikeextSaDbGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDbGetSecurityInfo0(enginehandle.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress, securitydescriptor.rawAddress).toUInt()

public actual fun ikeextSaDbSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDbSetSecurityInfo0(enginehandle.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress).toUInt()

public actual fun ikeextSaDeleteById0(enginehandle: Handle, id: ULong): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDeleteById0(enginehandle.rawAddress, id.toLong()).toUInt()

public actual fun ikeextSaDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaDestroyEnumHandle0(enginehandle.rawAddress, enumhandle.rawAddress).toUInt()

public actual fun ikeextSaEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IkeextSaDetails0>>>, numentriesreturned: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaEnum0(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress).toUInt()

public actual fun ikeextSaEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IkeextSaDetails1>>>, numentriesreturned: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaEnum1(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress).toUInt()

public actual fun ikeextSaEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IkeextSaDetails2>>>, numentriesreturned: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaEnum2(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress).toUInt()

public actual fun ikeextSaGetById0(enginehandle: Handle, id: ULong, sa: MutPtr<MutPtr<IkeextSaDetails0>>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaGetById0(enginehandle.rawAddress, id.toLong(), sa.rawAddress).toUInt()

public actual fun ikeextSaGetById1(enginehandle: Handle, id: ULong, salookupcontext: ConstPtr<Guid>, sa: MutPtr<MutPtr<IkeextSaDetails1>>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaGetById1(enginehandle.rawAddress, id.toLong(), salookupcontext.rawAddress, sa.rawAddress).toUInt()

public actual fun ikeextSaGetById2(enginehandle: Handle, id: ULong, salookupcontext: ConstPtr<Guid>, sa: MutPtr<MutPtr<IkeextSaDetails2>>): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfilteringplatformIkeextSaGetById2(enginehandle.rawAddress, id.toLong(), salookupcontext.rawAddress, sa.rawAddress).toUInt()
