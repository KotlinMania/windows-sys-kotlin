@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32SystemHostcomputenetworkJniBridge {
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
        val stream = WindowsWin32SystemHostcomputenetworkJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnCloseEndpoint(endpoint: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnCloseGuestNetworkService(guestnetworkservice: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnCloseLoadBalancer(loadbalancer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnCloseNamespace(namespace: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnCloseNetwork(network: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnCreateEndpoint(network: Long, id: Long, settings: Long, endpoint: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnCreateGuestNetworkService(id: Long, settings: Long, guestnetworkservice: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnCreateLoadBalancer(id: Long, settings: Long, loadbalancer: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnCreateNamespace(id: Long, settings: Long, namespace: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnCreateNetwork(id: Long, settings: Long, network: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteEndpoint(id: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteGuestNetworkService(id: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteLoadBalancer(id: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteNamespace(id: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteNetwork(id: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateEndpoints(query: Long, endpoints: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateGuestNetworkPortReservations(returncount: Long, portentries: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateLoadBalancers(query: Long, loadbalancer: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateNamespaces(query: Long, namespaces: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateNetworks(query: Long, networks: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnFreeGuestNetworkPortReservations(portentries: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnModifyEndpoint(endpoint: Long, settings: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnModifyGuestNetworkService(guestnetworkservice: Long, settings: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnModifyLoadBalancer(loadbalancer: Long, settings: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnModifyNamespace(namespace: Long, settings: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnModifyNetwork(network: Long, settings: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnOpenEndpoint(id: Long, endpoint: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnOpenLoadBalancer(id: Long, loadbalancer: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnOpenNamespace(id: Long, namespace: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnOpenNetwork(id: Long, network: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointAddresses(endpoint: Long, query: Long, addresses: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointProperties(endpoint: Long, query: Long, properties: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointStats(endpoint: Long, query: Long, stats: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnQueryLoadBalancerProperties(loadbalancer: Long, query: Long, properties: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnQueryNamespaceProperties(namespace: Long, query: Long, properties: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnQueryNetworkProperties(network: Long, query: Long, properties: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnRegisterGuestNetworkServiceCallback(guestnetworkservice: Long, callback: Long, context: Long, callbackhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnRegisterServiceCallback(callback: Long, context: Long, callbackhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnReserveGuestNetworkServicePort(guestnetworkservice: Long, protocol: Int, access: Int, port: Short, portreservationhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnReserveGuestNetworkServicePortRange(guestnetworkservice: Long, portcount: Short, portrangereservation: Long, portreservationhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnUnregisterGuestNetworkServiceCallback(callbackhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputenetworkHcnUnregisterServiceCallback(callbackhandle: Long): Int
}

public actual fun hcnCloseEndpoint(endpoint: ConstPtr<CVoid>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnCloseEndpoint(endpoint.rawAddress)

public actual fun hcnCloseGuestNetworkService(guestnetworkservice: ConstPtr<CVoid>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnCloseGuestNetworkService(guestnetworkservice.rawAddress)

public actual fun hcnCloseLoadBalancer(loadbalancer: ConstPtr<CVoid>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnCloseLoadBalancer(loadbalancer.rawAddress)

public actual fun hcnCloseNamespace(namespace: ConstPtr<CVoid>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnCloseNamespace(namespace.rawAddress)

public actual fun hcnCloseNetwork(network: ConstPtr<CVoid>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnCloseNetwork(network.rawAddress)

public actual fun hcnCreateEndpoint(network: ConstPtr<CVoid>, id: ConstPtr<Guid>, settings: Pcwstr, endpoint: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnCreateEndpoint(network.rawAddress, id.rawAddress, settings.rawAddress, endpoint.rawAddress, errorrecord.rawAddress)

public actual fun hcnCreateGuestNetworkService(id: ConstPtr<Guid>, settings: Pcwstr, guestnetworkservice: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnCreateGuestNetworkService(id.rawAddress, settings.rawAddress, guestnetworkservice.rawAddress, errorrecord.rawAddress)

public actual fun hcnCreateLoadBalancer(id: ConstPtr<Guid>, settings: Pcwstr, loadbalancer: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnCreateLoadBalancer(id.rawAddress, settings.rawAddress, loadbalancer.rawAddress, errorrecord.rawAddress)

public actual fun hcnCreateNamespace(id: ConstPtr<Guid>, settings: Pcwstr, namespace: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnCreateNamespace(id.rawAddress, settings.rawAddress, namespace.rawAddress, errorrecord.rawAddress)

public actual fun hcnCreateNetwork(id: ConstPtr<Guid>, settings: Pcwstr, network: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnCreateNetwork(id.rawAddress, settings.rawAddress, network.rawAddress, errorrecord.rawAddress)

public actual fun hcnDeleteEndpoint(id: ConstPtr<Guid>, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteEndpoint(id.rawAddress, errorrecord.rawAddress)

public actual fun hcnDeleteGuestNetworkService(id: ConstPtr<Guid>, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteGuestNetworkService(id.rawAddress, errorrecord.rawAddress)

public actual fun hcnDeleteLoadBalancer(id: ConstPtr<Guid>, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteLoadBalancer(id.rawAddress, errorrecord.rawAddress)

public actual fun hcnDeleteNamespace(id: ConstPtr<Guid>, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteNamespace(id.rawAddress, errorrecord.rawAddress)

public actual fun hcnDeleteNetwork(id: ConstPtr<Guid>, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteNetwork(id.rawAddress, errorrecord.rawAddress)

public actual fun hcnEnumerateEndpoints(query: Pcwstr, endpoints: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateEndpoints(query.rawAddress, endpoints.rawAddress, errorrecord.rawAddress)

public actual fun hcnEnumerateGuestNetworkPortReservations(returncount: MutPtr<UInt>, portentries: MutPtr<MutPtr<HcnPortRangeEntry>>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateGuestNetworkPortReservations(returncount.rawAddress, portentries.rawAddress)

public actual fun hcnEnumerateLoadBalancers(query: Pcwstr, loadbalancer: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateLoadBalancers(query.rawAddress, loadbalancer.rawAddress, errorrecord.rawAddress)

public actual fun hcnEnumerateNamespaces(query: Pcwstr, namespaces: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateNamespaces(query.rawAddress, namespaces.rawAddress, errorrecord.rawAddress)

public actual fun hcnEnumerateNetworks(query: Pcwstr, networks: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateNetworks(query.rawAddress, networks.rawAddress, errorrecord.rawAddress)

public actual fun hcnFreeGuestNetworkPortReservations(portentries: MutPtr<HcnPortRangeEntry>) {
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnFreeGuestNetworkPortReservations(portentries.rawAddress)
}

public actual fun hcnModifyEndpoint(endpoint: ConstPtr<CVoid>, settings: Pcwstr, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnModifyEndpoint(endpoint.rawAddress, settings.rawAddress, errorrecord.rawAddress)

public actual fun hcnModifyGuestNetworkService(guestnetworkservice: ConstPtr<CVoid>, settings: Pcwstr, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnModifyGuestNetworkService(guestnetworkservice.rawAddress, settings.rawAddress, errorrecord.rawAddress)

public actual fun hcnModifyLoadBalancer(loadbalancer: ConstPtr<CVoid>, settings: Pcwstr, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnModifyLoadBalancer(loadbalancer.rawAddress, settings.rawAddress, errorrecord.rawAddress)

public actual fun hcnModifyNamespace(namespace: ConstPtr<CVoid>, settings: Pcwstr, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnModifyNamespace(namespace.rawAddress, settings.rawAddress, errorrecord.rawAddress)

public actual fun hcnModifyNetwork(network: ConstPtr<CVoid>, settings: Pcwstr, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnModifyNetwork(network.rawAddress, settings.rawAddress, errorrecord.rawAddress)

public actual fun hcnOpenEndpoint(id: ConstPtr<Guid>, endpoint: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnOpenEndpoint(id.rawAddress, endpoint.rawAddress, errorrecord.rawAddress)

public actual fun hcnOpenLoadBalancer(id: ConstPtr<Guid>, loadbalancer: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnOpenLoadBalancer(id.rawAddress, loadbalancer.rawAddress, errorrecord.rawAddress)

public actual fun hcnOpenNamespace(id: ConstPtr<Guid>, namespace: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnOpenNamespace(id.rawAddress, namespace.rawAddress, errorrecord.rawAddress)

public actual fun hcnOpenNetwork(id: ConstPtr<Guid>, network: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnOpenNetwork(id.rawAddress, network.rawAddress, errorrecord.rawAddress)

public actual fun hcnQueryEndpointAddresses(endpoint: ConstPtr<CVoid>, query: Pcwstr, addresses: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointAddresses(endpoint.rawAddress, query.rawAddress, addresses.rawAddress, errorrecord.rawAddress)

public actual fun hcnQueryEndpointProperties(endpoint: ConstPtr<CVoid>, query: Pcwstr, properties: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointProperties(endpoint.rawAddress, query.rawAddress, properties.rawAddress, errorrecord.rawAddress)

public actual fun hcnQueryEndpointStats(endpoint: ConstPtr<CVoid>, query: Pcwstr, stats: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointStats(endpoint.rawAddress, query.rawAddress, stats.rawAddress, errorrecord.rawAddress)

public actual fun hcnQueryLoadBalancerProperties(loadbalancer: ConstPtr<CVoid>, query: Pcwstr, properties: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnQueryLoadBalancerProperties(loadbalancer.rawAddress, query.rawAddress, properties.rawAddress, errorrecord.rawAddress)

public actual fun hcnQueryNamespaceProperties(namespace: ConstPtr<CVoid>, query: Pcwstr, properties: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnQueryNamespaceProperties(namespace.rawAddress, query.rawAddress, properties.rawAddress, errorrecord.rawAddress)

public actual fun hcnQueryNetworkProperties(network: ConstPtr<CVoid>, query: Pcwstr, properties: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnQueryNetworkProperties(network.rawAddress, query.rawAddress, properties.rawAddress, errorrecord.rawAddress)

public actual fun hcnRegisterGuestNetworkServiceCallback(guestnetworkservice: ConstPtr<CVoid>, callback: HcnNotificationCallback, context: ConstPtr<CVoid>, callbackhandle: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnRegisterGuestNetworkServiceCallback(guestnetworkservice.rawAddress, 0L, context.rawAddress, callbackhandle.rawAddress)

public actual fun hcnRegisterServiceCallback(callback: HcnNotificationCallback, context: ConstPtr<CVoid>, callbackhandle: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnRegisterServiceCallback(0L, context.rawAddress, callbackhandle.rawAddress)

public actual fun hcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle: Handle): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle.rawAddress)

public actual fun hcnReserveGuestNetworkServicePort(guestnetworkservice: ConstPtr<CVoid>, protocol: HcnPortProtocol, access: HcnPortAccess, port: UShort, portreservationhandle: MutPtr<Handle>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnReserveGuestNetworkServicePort(guestnetworkservice.rawAddress, protocol, access, port.toShort(), portreservationhandle.rawAddress)

public actual fun hcnReserveGuestNetworkServicePortRange(guestnetworkservice: ConstPtr<CVoid>, portcount: UShort, portrangereservation: MutPtr<HcnPortRangeReservation>, portreservationhandle: MutPtr<Handle>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnReserveGuestNetworkServicePortRange(guestnetworkservice.rawAddress, portcount.toShort(), portrangereservation.rawAddress, portreservationhandle.rawAddress)

public actual fun hcnUnregisterGuestNetworkServiceCallback(callbackhandle: ConstPtr<CVoid>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnUnregisterGuestNetworkServiceCallback(callbackhandle.rawAddress)

public actual fun hcnUnregisterServiceCallback(callbackhandle: ConstPtr<CVoid>): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssysWindowsWin32SystemHostcomputenetworkHcnUnregisterServiceCallback(callbackhandle.rawAddress)
