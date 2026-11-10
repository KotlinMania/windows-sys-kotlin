@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32SystemHostcomputenetworkJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnCloseEndpoint(endpoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnCloseGuestNetworkService(guestnetworkservice: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnCloseLoadBalancer(loadbalancer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnCloseNamespace(namespace: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnCloseNetwork(network: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnCreateEndpoint(network: Long, id: Long, settings: Long, endpoint: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnCreateGuestNetworkService(id: Long, settings: Long, guestnetworkservice: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnCreateLoadBalancer(id: Long, settings: Long, loadbalancer: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnCreateNamespace(id: Long, settings: Long, namespace: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnCreateNetwork(id: Long, settings: Long, network: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnDeleteEndpoint(id: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnDeleteGuestNetworkService(id: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnDeleteLoadBalancer(id: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnDeleteNamespace(id: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnDeleteNetwork(id: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnEnumerateEndpoints(query: Long, endpoints: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnEnumerateGuestNetworkPortReservations(returncount: Long, portentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnEnumerateLoadBalancers(query: Long, loadbalancer: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnEnumerateNamespaces(query: Long, namespaces: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnEnumerateNetworks(query: Long, networks: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnFreeGuestNetworkPortReservations(portentries: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnModifyEndpoint(endpoint: Long, settings: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnModifyGuestNetworkService(guestnetworkservice: Long, settings: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnModifyLoadBalancer(loadbalancer: Long, settings: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnModifyNamespace(namespace: Long, settings: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnModifyNetwork(network: Long, settings: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnOpenEndpoint(id: Long, endpoint: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnOpenLoadBalancer(id: Long, loadbalancer: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnOpenNamespace(id: Long, namespace: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnOpenNetwork(id: Long, network: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnQueryEndpointAddresses(endpoint: Long, query: Long, addresses: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnQueryEndpointProperties(endpoint: Long, query: Long, properties: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnQueryEndpointStats(endpoint: Long, query: Long, stats: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnQueryLoadBalancerProperties(loadbalancer: Long, query: Long, properties: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnQueryNamespaceProperties(namespace: Long, query: Long, properties: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnQueryNetworkProperties(network: Long, query: Long, properties: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnRegisterGuestNetworkServiceCallback(guestnetworkservice: Long, callback: Long, context: Long, callbackhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnRegisterServiceCallback(callback: Long, context: Long, callbackhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnReserveGuestNetworkServicePort(guestnetworkservice: Long, protocol: Int, access: Int, port: Short, portreservationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnReserveGuestNetworkServicePortRange(guestnetworkservice: Long, portcount: Short, portrangereservation: Long, portreservationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnUnregisterGuestNetworkServiceCallback(callbackhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_hcnUnregisterServiceCallback(callbackhandle: Long): Int
}

public actual fun hcnCloseEndpoint(endpoint: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnCloseEndpoint((endpoint?.value ?: 0L))

public actual fun hcnCloseGuestNetworkService(guestnetworkservice: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnCloseGuestNetworkService((guestnetworkservice?.value ?: 0L))

public actual fun hcnCloseLoadBalancer(loadbalancer: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnCloseLoadBalancer((loadbalancer?.value ?: 0L))

public actual fun hcnCloseNamespace(namespace: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnCloseNamespace((namespace?.value ?: 0L))

public actual fun hcnCloseNetwork(network: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnCloseNetwork((network?.value ?: 0L))

public actual fun hcnCreateEndpoint(network: COpaquePointer?, id: COpaquePointer?, settings: Pcwstr, endpoint: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnCreateEndpoint((network?.value ?: 0L), (id?.value ?: 0L), (settings?.value ?: 0L), (endpoint?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnCreateGuestNetworkService(id: COpaquePointer?, settings: Pcwstr, guestnetworkservice: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnCreateGuestNetworkService((id?.value ?: 0L), (settings?.value ?: 0L), (guestnetworkservice?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnCreateLoadBalancer(id: COpaquePointer?, settings: Pcwstr, loadbalancer: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnCreateLoadBalancer((id?.value ?: 0L), (settings?.value ?: 0L), (loadbalancer?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnCreateNamespace(id: COpaquePointer?, settings: Pcwstr, namespace: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnCreateNamespace((id?.value ?: 0L), (settings?.value ?: 0L), (namespace?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnCreateNetwork(id: COpaquePointer?, settings: Pcwstr, network: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnCreateNetwork((id?.value ?: 0L), (settings?.value ?: 0L), (network?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnDeleteEndpoint(id: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnDeleteEndpoint((id?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnDeleteGuestNetworkService(id: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnDeleteGuestNetworkService((id?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnDeleteLoadBalancer(id: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnDeleteLoadBalancer((id?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnDeleteNamespace(id: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnDeleteNamespace((id?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnDeleteNetwork(id: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnDeleteNetwork((id?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnEnumerateEndpoints(query: Pcwstr, endpoints: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnEnumerateEndpoints((query?.value ?: 0L), (endpoints?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnEnumerateGuestNetworkPortReservations(returncount: COpaquePointer?, portentries: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnEnumerateGuestNetworkPortReservations((returncount?.value ?: 0L), (portentries?.value ?: 0L))

public actual fun hcnEnumerateLoadBalancers(query: Pcwstr, loadbalancer: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnEnumerateLoadBalancers((query?.value ?: 0L), (loadbalancer?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnEnumerateNamespaces(query: Pcwstr, namespaces: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnEnumerateNamespaces((query?.value ?: 0L), (namespaces?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnEnumerateNetworks(query: Pcwstr, networks: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnEnumerateNetworks((query?.value ?: 0L), (networks?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnFreeGuestNetworkPortReservations(portentries: COpaquePointer?) {
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnFreeGuestNetworkPortReservations((portentries?.value ?: 0L))
}

public actual fun hcnModifyEndpoint(endpoint: COpaquePointer?, settings: Pcwstr, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnModifyEndpoint((endpoint?.value ?: 0L), (settings?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnModifyGuestNetworkService(guestnetworkservice: COpaquePointer?, settings: Pcwstr, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnModifyGuestNetworkService((guestnetworkservice?.value ?: 0L), (settings?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnModifyLoadBalancer(loadbalancer: COpaquePointer?, settings: Pcwstr, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnModifyLoadBalancer((loadbalancer?.value ?: 0L), (settings?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnModifyNamespace(namespace: COpaquePointer?, settings: Pcwstr, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnModifyNamespace((namespace?.value ?: 0L), (settings?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnModifyNetwork(network: COpaquePointer?, settings: Pcwstr, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnModifyNetwork((network?.value ?: 0L), (settings?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnOpenEndpoint(id: COpaquePointer?, endpoint: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnOpenEndpoint((id?.value ?: 0L), (endpoint?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnOpenLoadBalancer(id: COpaquePointer?, loadbalancer: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnOpenLoadBalancer((id?.value ?: 0L), (loadbalancer?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnOpenNamespace(id: COpaquePointer?, namespace: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnOpenNamespace((id?.value ?: 0L), (namespace?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnOpenNetwork(id: COpaquePointer?, network: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnOpenNetwork((id?.value ?: 0L), (network?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnQueryEndpointAddresses(endpoint: COpaquePointer?, query: Pcwstr, addresses: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnQueryEndpointAddresses((endpoint?.value ?: 0L), (query?.value ?: 0L), (addresses?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnQueryEndpointProperties(endpoint: COpaquePointer?, query: Pcwstr, properties: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnQueryEndpointProperties((endpoint?.value ?: 0L), (query?.value ?: 0L), (properties?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnQueryEndpointStats(endpoint: COpaquePointer?, query: Pcwstr, stats: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnQueryEndpointStats((endpoint?.value ?: 0L), (query?.value ?: 0L), (stats?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnQueryLoadBalancerProperties(loadbalancer: COpaquePointer?, query: Pcwstr, properties: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnQueryLoadBalancerProperties((loadbalancer?.value ?: 0L), (query?.value ?: 0L), (properties?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnQueryNamespaceProperties(namespace: COpaquePointer?, query: Pcwstr, properties: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnQueryNamespaceProperties((namespace?.value ?: 0L), (query?.value ?: 0L), (properties?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnQueryNetworkProperties(network: COpaquePointer?, query: Pcwstr, properties: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnQueryNetworkProperties((network?.value ?: 0L), (query?.value ?: 0L), (properties?.value ?: 0L), (errorrecord?.value ?: 0L))

public actual fun hcnRegisterGuestNetworkServiceCallback(guestnetworkservice: COpaquePointer?, callback: HcnNotificationCallback, context: COpaquePointer?, callbackhandle: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnRegisterGuestNetworkServiceCallback((guestnetworkservice?.value ?: 0L), 0L, (context?.value ?: 0L), (callbackhandle?.value ?: 0L))

public actual fun hcnRegisterServiceCallback(callback: HcnNotificationCallback, context: COpaquePointer?, callbackhandle: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnRegisterServiceCallback(0L, (context?.value ?: 0L), (callbackhandle?.value ?: 0L))

public actual fun hcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle: Handle): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnReleaseGuestNetworkServicePortReservationHandle((portreservationhandle?.value ?: 0L))

public actual fun hcnReserveGuestNetworkServicePort(guestnetworkservice: COpaquePointer?, protocol: HcnPortProtocol, access: HcnPortAccess, port: UShort, portreservationhandle: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnReserveGuestNetworkServicePort((guestnetworkservice?.value ?: 0L), protocol, access, port.toShort(), (portreservationhandle?.value ?: 0L))

public actual fun hcnReserveGuestNetworkServicePortRange(guestnetworkservice: COpaquePointer?, portcount: UShort, portrangereservation: COpaquePointer?, portreservationhandle: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnReserveGuestNetworkServicePortRange((guestnetworkservice?.value ?: 0L), portcount.toShort(), (portrangereservation?.value ?: 0L), (portreservationhandle?.value ?: 0L))

public actual fun hcnUnregisterGuestNetworkServiceCallback(callbackhandle: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnUnregisterGuestNetworkServiceCallback((callbackhandle?.value ?: 0L))

public actual fun hcnUnregisterServiceCallback(callbackhandle: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_hcnUnregisterServiceCallback((callbackhandle?.value ?: 0L))
