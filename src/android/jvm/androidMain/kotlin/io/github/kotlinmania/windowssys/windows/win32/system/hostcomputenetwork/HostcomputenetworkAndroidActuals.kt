@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private object WindowsWin32SystemHostcomputenetworkJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnCloseEndpoint(endpoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnCloseGuestNetworkService(guestnetworkservice: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnCloseLoadBalancer(loadbalancer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnCloseNamespace(namespace: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnCloseNetwork(network: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnCreateEndpoint(network: Long, id: Long, settings: Long, endpoint: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnCreateGuestNetworkService(id: Long, settings: Long, guestnetworkservice: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnCreateLoadBalancer(id: Long, settings: Long, loadbalancer: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnCreateNamespace(id: Long, settings: Long, namespace: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnCreateNetwork(id: Long, settings: Long, network: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteEndpoint(id: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteGuestNetworkService(id: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteLoadBalancer(id: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteNamespace(id: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteNetwork(id: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateEndpoints(query: Long, endpoints: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateGuestNetworkPortReservations(returncount: Long, portentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateLoadBalancers(query: Long, loadbalancer: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateNamespaces(query: Long, namespaces: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateNetworks(query: Long, networks: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnFreeGuestNetworkPortReservations(portentries: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnModifyEndpoint(endpoint: Long, settings: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnModifyGuestNetworkService(guestnetworkservice: Long, settings: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnModifyLoadBalancer(loadbalancer: Long, settings: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnModifyNamespace(namespace: Long, settings: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnModifyNetwork(network: Long, settings: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnOpenEndpoint(id: Long, endpoint: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnOpenLoadBalancer(id: Long, loadbalancer: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnOpenNamespace(id: Long, namespace: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnOpenNetwork(id: Long, network: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnQueryEndpointAddresses(endpoint: Long, query: Long, addresses: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnQueryEndpointProperties(endpoint: Long, query: Long, properties: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnQueryEndpointStats(endpoint: Long, query: Long, stats: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnQueryLoadBalancerProperties(loadbalancer: Long, query: Long, properties: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnQueryNamespaceProperties(namespace: Long, query: Long, properties: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnQueryNetworkProperties(network: Long, query: Long, properties: Long, errorrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnRegisterGuestNetworkServiceCallback(guestnetworkservice: Long, callback: Long, context: Long, callbackhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnRegisterServiceCallback(callback: Long, context: Long, callbackhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnReserveGuestNetworkServicePort(guestnetworkservice: Long, protocol: Int, access: Int, port: Short, portreservationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnReserveGuestNetworkServicePortRange(guestnetworkservice: Long, portcount: Short, portrangereservation: Long, portreservationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnUnregisterGuestNetworkServiceCallback(callbackhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputenetwork_HcnUnregisterServiceCallback(callbackhandle: Long): Int
}

public actual fun HcnCloseEndpoint(endpoint: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnCloseEndpoint(endpoint)

public actual fun HcnCloseGuestNetworkService(guestnetworkservice: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnCloseGuestNetworkService(guestnetworkservice)

public actual fun HcnCloseLoadBalancer(loadbalancer: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnCloseLoadBalancer(loadbalancer)

public actual fun HcnCloseNamespace(namespace: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnCloseNamespace(namespace)

public actual fun HcnCloseNetwork(network: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnCloseNetwork(network)

public actual fun HcnCreateEndpoint(network: Long, id: Long, settings: PCWSTR, endpoint: Long, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnCreateEndpoint(network, id, settings, endpoint, errorrecord)

public actual fun HcnCreateGuestNetworkService(id: Long, settings: PCWSTR, guestnetworkservice: Long, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnCreateGuestNetworkService(id, settings, guestnetworkservice, errorrecord)

public actual fun HcnCreateLoadBalancer(id: Long, settings: PCWSTR, loadbalancer: Long, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnCreateLoadBalancer(id, settings, loadbalancer, errorrecord)

public actual fun HcnCreateNamespace(id: Long, settings: PCWSTR, namespace: Long, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnCreateNamespace(id, settings, namespace, errorrecord)

public actual fun HcnCreateNetwork(id: Long, settings: PCWSTR, network: Long, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnCreateNetwork(id, settings, network, errorrecord)

public actual fun HcnDeleteEndpoint(id: Long, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteEndpoint(id, errorrecord)

public actual fun HcnDeleteGuestNetworkService(id: Long, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteGuestNetworkService(id, errorrecord)

public actual fun HcnDeleteLoadBalancer(id: Long, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteLoadBalancer(id, errorrecord)

public actual fun HcnDeleteNamespace(id: Long, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteNamespace(id, errorrecord)

public actual fun HcnDeleteNetwork(id: Long, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteNetwork(id, errorrecord)

public actual fun HcnEnumerateEndpoints(query: PCWSTR, endpoints: Long, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateEndpoints(query, endpoints, errorrecord)

public actual fun HcnEnumerateGuestNetworkPortReservations(returncount: Long, portentries: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateGuestNetworkPortReservations(returncount, portentries)

public actual fun HcnEnumerateLoadBalancers(query: PCWSTR, loadbalancer: Long, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateLoadBalancers(query, loadbalancer, errorrecord)

public actual fun HcnEnumerateNamespaces(query: PCWSTR, namespaces: Long, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateNamespaces(query, namespaces, errorrecord)

public actual fun HcnEnumerateNetworks(query: PCWSTR, networks: Long, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateNetworks(query, networks, errorrecord)

public actual fun HcnFreeGuestNetworkPortReservations(portentries: Long) {
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnFreeGuestNetworkPortReservations(portentries)
}

public actual fun HcnModifyEndpoint(endpoint: Long, settings: PCWSTR, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnModifyEndpoint(endpoint, settings, errorrecord)

public actual fun HcnModifyGuestNetworkService(guestnetworkservice: Long, settings: PCWSTR, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnModifyGuestNetworkService(guestnetworkservice, settings, errorrecord)

public actual fun HcnModifyLoadBalancer(loadbalancer: Long, settings: PCWSTR, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnModifyLoadBalancer(loadbalancer, settings, errorrecord)

public actual fun HcnModifyNamespace(namespace: Long, settings: PCWSTR, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnModifyNamespace(namespace, settings, errorrecord)

public actual fun HcnModifyNetwork(network: Long, settings: PCWSTR, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnModifyNetwork(network, settings, errorrecord)

public actual fun HcnOpenEndpoint(id: Long, endpoint: Long, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnOpenEndpoint(id, endpoint, errorrecord)

public actual fun HcnOpenLoadBalancer(id: Long, loadbalancer: Long, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnOpenLoadBalancer(id, loadbalancer, errorrecord)

public actual fun HcnOpenNamespace(id: Long, namespace: Long, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnOpenNamespace(id, namespace, errorrecord)

public actual fun HcnOpenNetwork(id: Long, network: Long, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnOpenNetwork(id, network, errorrecord)

public actual fun HcnQueryEndpointAddresses(endpoint: Long, query: PCWSTR, addresses: Long, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnQueryEndpointAddresses(endpoint, query, addresses, errorrecord)

public actual fun HcnQueryEndpointProperties(endpoint: Long, query: PCWSTR, properties: Long, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnQueryEndpointProperties(endpoint, query, properties, errorrecord)

public actual fun HcnQueryEndpointStats(endpoint: Long, query: PCWSTR, stats: Long, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnQueryEndpointStats(endpoint, query, stats, errorrecord)

public actual fun HcnQueryLoadBalancerProperties(loadbalancer: Long, query: PCWSTR, properties: Long, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnQueryLoadBalancerProperties(loadbalancer, query, properties, errorrecord)

public actual fun HcnQueryNamespaceProperties(namespace: Long, query: PCWSTR, properties: Long, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnQueryNamespaceProperties(namespace, query, properties, errorrecord)

public actual fun HcnQueryNetworkProperties(network: Long, query: PCWSTR, properties: Long, errorrecord: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnQueryNetworkProperties(network, query, properties, errorrecord)

public actual fun HcnRegisterGuestNetworkServiceCallback(guestnetworkservice: Long, callback: HCN_NOTIFICATION_CALLBACK, context: Long, callbackhandle: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnRegisterGuestNetworkServiceCallback(guestnetworkservice, callback.toLong(), context, callbackhandle)

public actual fun HcnRegisterServiceCallback(callback: HCN_NOTIFICATION_CALLBACK, context: Long, callbackhandle: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnRegisterServiceCallback(callback.toLong(), context, callbackhandle)

public actual fun HcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle: HANDLE): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle)

public actual fun HcnReserveGuestNetworkServicePort(guestnetworkservice: Long, protocol: HCN_PORT_PROTOCOL, access: HCN_PORT_ACCESS, port: UShort, portreservationhandle: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnReserveGuestNetworkServicePort(guestnetworkservice, protocol, access, port.toShort(), portreservationhandle)

public actual fun HcnReserveGuestNetworkServicePortRange(guestnetworkservice: Long, portcount: UShort, portrangereservation: Long, portreservationhandle: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnReserveGuestNetworkServicePortRange(guestnetworkservice, portcount.toShort(), portrangereservation, portreservationhandle)

public actual fun HcnUnregisterGuestNetworkServiceCallback(callbackhandle: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnUnregisterGuestNetworkServiceCallback(callbackhandle)

public actual fun HcnUnregisterServiceCallback(callbackhandle: Long): HRESULT =
    WindowsWin32SystemHostcomputenetworkJniBridge.windowssys_windows_win32_system_hostcomputenetwork_HcnUnregisterServiceCallback(callbackhandle)
