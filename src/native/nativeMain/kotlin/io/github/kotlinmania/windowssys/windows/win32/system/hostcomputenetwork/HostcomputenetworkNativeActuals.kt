@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun hcnCloseEndpoint(endpoint: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnCloseEndpoint(endpoint?.value?.toCPointer<ByteVar>())

public actual fun hcnCloseGuestNetworkService(guestnetworkservice: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnCloseGuestNetworkService(guestnetworkservice?.value?.toCPointer<ByteVar>())

public actual fun hcnCloseLoadBalancer(loadbalancer: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnCloseLoadBalancer(loadbalancer?.value?.toCPointer<ByteVar>())

public actual fun hcnCloseNamespace(namespace: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnCloseNamespace(namespace?.value?.toCPointer<ByteVar>())

public actual fun hcnCloseNetwork(network: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnCloseNetwork(network?.value?.toCPointer<ByteVar>())

public actual fun hcnCreateEndpoint(network: COpaquePointer?, id: COpaquePointer?, settings: Pcwstr, endpoint: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnCreateEndpoint(network?.value?.toCPointer<ByteVar>(), id?.value?.toCPointer<ByteVar>(), settings?.value?.toCPointer<ByteVar>(), endpoint?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnCreateGuestNetworkService(id: COpaquePointer?, settings: Pcwstr, guestnetworkservice: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnCreateGuestNetworkService(id?.value?.toCPointer<ByteVar>(), settings?.value?.toCPointer<ByteVar>(), guestnetworkservice?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnCreateLoadBalancer(id: COpaquePointer?, settings: Pcwstr, loadbalancer: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnCreateLoadBalancer(id?.value?.toCPointer<ByteVar>(), settings?.value?.toCPointer<ByteVar>(), loadbalancer?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnCreateNamespace(id: COpaquePointer?, settings: Pcwstr, namespace: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnCreateNamespace(id?.value?.toCPointer<ByteVar>(), settings?.value?.toCPointer<ByteVar>(), namespace?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnCreateNetwork(id: COpaquePointer?, settings: Pcwstr, network: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnCreateNetwork(id?.value?.toCPointer<ByteVar>(), settings?.value?.toCPointer<ByteVar>(), network?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnDeleteEndpoint(id: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnDeleteEndpoint(id?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnDeleteGuestNetworkService(id: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnDeleteGuestNetworkService(id?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnDeleteLoadBalancer(id: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnDeleteLoadBalancer(id?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnDeleteNamespace(id: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnDeleteNamespace(id?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnDeleteNetwork(id: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnDeleteNetwork(id?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnEnumerateEndpoints(query: Pcwstr, endpoints: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnEnumerateEndpoints(query?.value?.toCPointer<ByteVar>(), endpoints?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnEnumerateGuestNetworkPortReservations(returncount: COpaquePointer?, portentries: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnEnumerateGuestNetworkPortReservations(returncount?.value?.toCPointer<ByteVar>(), portentries?.value?.toCPointer<ByteVar>())

public actual fun hcnEnumerateLoadBalancers(query: Pcwstr, loadbalancer: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnEnumerateLoadBalancers(query?.value?.toCPointer<ByteVar>(), loadbalancer?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnEnumerateNamespaces(query: Pcwstr, namespaces: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnEnumerateNamespaces(query?.value?.toCPointer<ByteVar>(), namespaces?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnEnumerateNetworks(query: Pcwstr, networks: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnEnumerateNetworks(query?.value?.toCPointer<ByteVar>(), networks?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnFreeGuestNetworkPortReservations(portentries: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnFreeGuestNetworkPortReservations(portentries?.value?.toCPointer<ByteVar>())
}

public actual fun hcnModifyEndpoint(endpoint: COpaquePointer?, settings: Pcwstr, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnModifyEndpoint(endpoint?.value?.toCPointer<ByteVar>(), settings?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnModifyGuestNetworkService(guestnetworkservice: COpaquePointer?, settings: Pcwstr, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnModifyGuestNetworkService(guestnetworkservice?.value?.toCPointer<ByteVar>(), settings?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnModifyLoadBalancer(loadbalancer: COpaquePointer?, settings: Pcwstr, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnModifyLoadBalancer(loadbalancer?.value?.toCPointer<ByteVar>(), settings?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnModifyNamespace(namespace: COpaquePointer?, settings: Pcwstr, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnModifyNamespace(namespace?.value?.toCPointer<ByteVar>(), settings?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnModifyNetwork(network: COpaquePointer?, settings: Pcwstr, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnModifyNetwork(network?.value?.toCPointer<ByteVar>(), settings?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnOpenEndpoint(id: COpaquePointer?, endpoint: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnOpenEndpoint(id?.value?.toCPointer<ByteVar>(), endpoint?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnOpenLoadBalancer(id: COpaquePointer?, loadbalancer: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnOpenLoadBalancer(id?.value?.toCPointer<ByteVar>(), loadbalancer?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnOpenNamespace(id: COpaquePointer?, namespace: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnOpenNamespace(id?.value?.toCPointer<ByteVar>(), namespace?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnOpenNetwork(id: COpaquePointer?, network: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnOpenNetwork(id?.value?.toCPointer<ByteVar>(), network?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnQueryEndpointAddresses(endpoint: COpaquePointer?, query: Pcwstr, addresses: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnQueryEndpointAddresses(endpoint?.value?.toCPointer<ByteVar>(), query?.value?.toCPointer<ByteVar>(), addresses?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnQueryEndpointProperties(endpoint: COpaquePointer?, query: Pcwstr, properties: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnQueryEndpointProperties(endpoint?.value?.toCPointer<ByteVar>(), query?.value?.toCPointer<ByteVar>(), properties?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnQueryEndpointStats(endpoint: COpaquePointer?, query: Pcwstr, stats: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnQueryEndpointStats(endpoint?.value?.toCPointer<ByteVar>(), query?.value?.toCPointer<ByteVar>(), stats?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnQueryLoadBalancerProperties(loadbalancer: COpaquePointer?, query: Pcwstr, properties: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnQueryLoadBalancerProperties(loadbalancer?.value?.toCPointer<ByteVar>(), query?.value?.toCPointer<ByteVar>(), properties?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnQueryNamespaceProperties(namespace: COpaquePointer?, query: Pcwstr, properties: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnQueryNamespaceProperties(namespace?.value?.toCPointer<ByteVar>(), query?.value?.toCPointer<ByteVar>(), properties?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnQueryNetworkProperties(network: COpaquePointer?, query: Pcwstr, properties: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnQueryNetworkProperties(network?.value?.toCPointer<ByteVar>(), query?.value?.toCPointer<ByteVar>(), properties?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())

public actual fun hcnRegisterGuestNetworkServiceCallback(guestnetworkservice: COpaquePointer?, callback: HcnNotificationCallback, context: COpaquePointer?, callbackhandle: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnRegisterGuestNetworkServiceCallback(guestnetworkservice?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), callbackhandle?.value?.toCPointer<ByteVar>())

public actual fun hcnRegisterServiceCallback(callback: HcnNotificationCallback, context: COpaquePointer?, callbackhandle: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnRegisterServiceCallback(0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), callbackhandle?.value?.toCPointer<ByteVar>())

public actual fun hcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle: Handle): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle?.value?.toCPointer<ByteVar>())

public actual fun hcnReserveGuestNetworkServicePort(guestnetworkservice: COpaquePointer?, protocol: HcnPortProtocol, access: HcnPortAccess, port: UShort, portreservationhandle: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnReserveGuestNetworkServicePort(guestnetworkservice?.value?.toCPointer<ByteVar>(), protocol, access, port, portreservationhandle?.value?.toCPointer<ByteVar>())

public actual fun hcnReserveGuestNetworkServicePortRange(guestnetworkservice: COpaquePointer?, portcount: UShort, portrangereservation: COpaquePointer?, portreservationhandle: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnReserveGuestNetworkServicePortRange(guestnetworkservice?.value?.toCPointer<ByteVar>(), portcount, portrangereservation?.value?.toCPointer<ByteVar>(), portreservationhandle?.value?.toCPointer<ByteVar>())

public actual fun hcnUnregisterGuestNetworkServiceCallback(callbackhandle: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnUnregisterGuestNetworkServiceCallback(callbackhandle?.value?.toCPointer<ByteVar>())

public actual fun hcnUnregisterServiceCallback(callbackhandle: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssys_windows_win32_system_hostcomputenetwork_hcnUnregisterServiceCallback(callbackhandle?.value?.toCPointer<ByteVar>())
