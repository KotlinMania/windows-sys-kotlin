@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun HcnCloseEndpoint(endpoint: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnCloseEndpoint(endpoint.toCPointer<ByteVar>())

public actual fun HcnCloseGuestNetworkService(guestnetworkservice: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnCloseGuestNetworkService(guestnetworkservice.toCPointer<ByteVar>())

public actual fun HcnCloseLoadBalancer(loadbalancer: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnCloseLoadBalancer(loadbalancer.toCPointer<ByteVar>())

public actual fun HcnCloseNamespace(namespace: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnCloseNamespace(namespace.toCPointer<ByteVar>())

public actual fun HcnCloseNetwork(network: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnCloseNetwork(network.toCPointer<ByteVar>())

public actual fun HcnCreateEndpoint(network: Long, id: Long, settings: PCWSTR, endpoint: Long, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnCreateEndpoint(network.toCPointer<ByteVar>(), id.toCPointer<ByteVar>(), settings.toCPointer<ByteVar>(), endpoint.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnCreateGuestNetworkService(id: Long, settings: PCWSTR, guestnetworkservice: Long, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnCreateGuestNetworkService(id.toCPointer<ByteVar>(), settings.toCPointer<ByteVar>(), guestnetworkservice.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnCreateLoadBalancer(id: Long, settings: PCWSTR, loadbalancer: Long, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnCreateLoadBalancer(id.toCPointer<ByteVar>(), settings.toCPointer<ByteVar>(), loadbalancer.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnCreateNamespace(id: Long, settings: PCWSTR, namespace: Long, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnCreateNamespace(id.toCPointer<ByteVar>(), settings.toCPointer<ByteVar>(), namespace.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnCreateNetwork(id: Long, settings: PCWSTR, network: Long, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnCreateNetwork(id.toCPointer<ByteVar>(), settings.toCPointer<ByteVar>(), network.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnDeleteEndpoint(id: Long, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteEndpoint(id.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnDeleteGuestNetworkService(id: Long, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteGuestNetworkService(id.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnDeleteLoadBalancer(id: Long, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteLoadBalancer(id.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnDeleteNamespace(id: Long, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteNamespace(id.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnDeleteNetwork(id: Long, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteNetwork(id.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnEnumerateEndpoints(query: PCWSTR, endpoints: Long, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateEndpoints(query.toCPointer<ByteVar>(), endpoints.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnEnumerateGuestNetworkPortReservations(returncount: Long, portentries: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateGuestNetworkPortReservations(returncount.toCPointer<ByteVar>(), portentries.toCPointer<ByteVar>())

public actual fun HcnEnumerateLoadBalancers(query: PCWSTR, loadbalancer: Long, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateLoadBalancers(query.toCPointer<ByteVar>(), loadbalancer.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnEnumerateNamespaces(query: PCWSTR, namespaces: Long, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateNamespaces(query.toCPointer<ByteVar>(), namespaces.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnEnumerateNetworks(query: PCWSTR, networks: Long, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateNetworks(query.toCPointer<ByteVar>(), networks.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnFreeGuestNetworkPortReservations(portentries: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnFreeGuestNetworkPortReservations(portentries.toCPointer<ByteVar>())
}

public actual fun HcnModifyEndpoint(endpoint: Long, settings: PCWSTR, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnModifyEndpoint(endpoint.toCPointer<ByteVar>(), settings.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnModifyGuestNetworkService(guestnetworkservice: Long, settings: PCWSTR, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnModifyGuestNetworkService(guestnetworkservice.toCPointer<ByteVar>(), settings.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnModifyLoadBalancer(loadbalancer: Long, settings: PCWSTR, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnModifyLoadBalancer(loadbalancer.toCPointer<ByteVar>(), settings.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnModifyNamespace(namespace: Long, settings: PCWSTR, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnModifyNamespace(namespace.toCPointer<ByteVar>(), settings.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnModifyNetwork(network: Long, settings: PCWSTR, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnModifyNetwork(network.toCPointer<ByteVar>(), settings.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnOpenEndpoint(id: Long, endpoint: Long, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnOpenEndpoint(id.toCPointer<ByteVar>(), endpoint.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnOpenLoadBalancer(id: Long, loadbalancer: Long, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnOpenLoadBalancer(id.toCPointer<ByteVar>(), loadbalancer.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnOpenNamespace(id: Long, namespace: Long, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnOpenNamespace(id.toCPointer<ByteVar>(), namespace.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnOpenNetwork(id: Long, network: Long, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnOpenNetwork(id.toCPointer<ByteVar>(), network.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnQueryEndpointAddresses(endpoint: Long, query: PCWSTR, addresses: Long, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnQueryEndpointAddresses(endpoint.toCPointer<ByteVar>(), query.toCPointer<ByteVar>(), addresses.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnQueryEndpointProperties(endpoint: Long, query: PCWSTR, properties: Long, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnQueryEndpointProperties(endpoint.toCPointer<ByteVar>(), query.toCPointer<ByteVar>(), properties.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnQueryEndpointStats(endpoint: Long, query: PCWSTR, stats: Long, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnQueryEndpointStats(endpoint.toCPointer<ByteVar>(), query.toCPointer<ByteVar>(), stats.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnQueryLoadBalancerProperties(loadbalancer: Long, query: PCWSTR, properties: Long, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnQueryLoadBalancerProperties(loadbalancer.toCPointer<ByteVar>(), query.toCPointer<ByteVar>(), properties.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnQueryNamespaceProperties(namespace: Long, query: PCWSTR, properties: Long, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnQueryNamespaceProperties(namespace.toCPointer<ByteVar>(), query.toCPointer<ByteVar>(), properties.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnQueryNetworkProperties(network: Long, query: PCWSTR, properties: Long, errorrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnQueryNetworkProperties(network.toCPointer<ByteVar>(), query.toCPointer<ByteVar>(), properties.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())

public actual fun HcnRegisterGuestNetworkServiceCallback(guestnetworkservice: Long, callback: HCN_NOTIFICATION_CALLBACK, context: Long, callbackhandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnRegisterGuestNetworkServiceCallback(guestnetworkservice.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), callbackhandle.toCPointer<ByteVar>())

public actual fun HcnRegisterServiceCallback(callback: HCN_NOTIFICATION_CALLBACK, context: Long, callbackhandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnRegisterServiceCallback(callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), callbackhandle.toCPointer<ByteVar>())

public actual fun HcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle.toCPointer<ByteVar>())

public actual fun HcnReserveGuestNetworkServicePort(guestnetworkservice: Long, protocol: HCN_PORT_PROTOCOL, access: HCN_PORT_ACCESS, port: UShort, portreservationhandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnReserveGuestNetworkServicePort(guestnetworkservice.toCPointer<ByteVar>(), protocol, access, port, portreservationhandle.toCPointer<ByteVar>())

public actual fun HcnReserveGuestNetworkServicePortRange(guestnetworkservice: Long, portcount: UShort, portrangereservation: Long, portreservationhandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnReserveGuestNetworkServicePortRange(guestnetworkservice.toCPointer<ByteVar>(), portcount, portrangereservation.toCPointer<ByteVar>(), portreservationhandle.toCPointer<ByteVar>())

public actual fun HcnUnregisterGuestNetworkServiceCallback(callbackhandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnUnregisterGuestNetworkServiceCallback(callbackhandle.toCPointer<ByteVar>())

public actual fun HcnUnregisterServiceCallback(callbackhandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_HcnUnregisterServiceCallback(callbackhandle.toCPointer<ByteVar>())
