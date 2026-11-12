@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnCloseEndpoint
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnCloseGuestNetworkService
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnCloseLoadBalancer
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnCloseNamespace
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnCloseNetwork
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnCreateEndpoint
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnCreateGuestNetworkService
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnCreateLoadBalancer
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnCreateNamespace
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnCreateNetwork
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteEndpoint
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteGuestNetworkService
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteLoadBalancer
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteNamespace
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteNetwork
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateEndpoints
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateGuestNetworkPortReservations
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateLoadBalancers
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateNamespaces
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateNetworks
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnFreeGuestNetworkPortReservations
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnModifyEndpoint
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnModifyGuestNetworkService
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnModifyLoadBalancer
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnModifyNamespace
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnModifyNetwork
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnOpenEndpoint
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnOpenLoadBalancer
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnOpenNamespace
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnOpenNetwork
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointAddresses
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointProperties
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointStats
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnQueryLoadBalancerProperties
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnQueryNamespaceProperties
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnQueryNetworkProperties
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnRegisterGuestNetworkServiceCallback
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnRegisterServiceCallback
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnReleaseGuestNetworkServicePortReservationHandle
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnReserveGuestNetworkServicePort
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnReserveGuestNetworkServicePortRange
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnUnregisterGuestNetworkServiceCallback
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork.cinterop.windowssysWindowsWin32SystemHostcomputenetworkHcnUnregisterServiceCallback
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun hcnCloseEndpoint(endpoint: ConstPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnCloseEndpoint(endpoint.rawAddress.toCPointer<ByteVar>())

public actual fun hcnCloseGuestNetworkService(guestnetworkservice: ConstPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnCloseGuestNetworkService(guestnetworkservice.rawAddress.toCPointer<ByteVar>())

public actual fun hcnCloseLoadBalancer(loadbalancer: ConstPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnCloseLoadBalancer(loadbalancer.rawAddress.toCPointer<ByteVar>())

public actual fun hcnCloseNamespace(namespace: ConstPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnCloseNamespace(namespace.rawAddress.toCPointer<ByteVar>())

public actual fun hcnCloseNetwork(network: ConstPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnCloseNetwork(network.rawAddress.toCPointer<ByteVar>())

public actual fun hcnCreateEndpoint(network: ConstPtr, id: ConstPtr, settings: Pcwstr, endpoint: MutPtr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnCreateEndpoint(network.rawAddress.toCPointer<ByteVar>(), id.rawAddress.toCPointer<ByteVar>(), settings.rawAddress.toCPointer<ByteVar>(), endpoint.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnCreateGuestNetworkService(id: ConstPtr, settings: Pcwstr, guestnetworkservice: MutPtr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnCreateGuestNetworkService(id.rawAddress.toCPointer<ByteVar>(), settings.rawAddress.toCPointer<ByteVar>(), guestnetworkservice.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnCreateLoadBalancer(id: ConstPtr, settings: Pcwstr, loadbalancer: MutPtr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnCreateLoadBalancer(id.rawAddress.toCPointer<ByteVar>(), settings.rawAddress.toCPointer<ByteVar>(), loadbalancer.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnCreateNamespace(id: ConstPtr, settings: Pcwstr, namespace: MutPtr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnCreateNamespace(id.rawAddress.toCPointer<ByteVar>(), settings.rawAddress.toCPointer<ByteVar>(), namespace.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnCreateNetwork(id: ConstPtr, settings: Pcwstr, network: MutPtr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnCreateNetwork(id.rawAddress.toCPointer<ByteVar>(), settings.rawAddress.toCPointer<ByteVar>(), network.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnDeleteEndpoint(id: ConstPtr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteEndpoint(id.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnDeleteGuestNetworkService(id: ConstPtr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteGuestNetworkService(id.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnDeleteLoadBalancer(id: ConstPtr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteLoadBalancer(id.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnDeleteNamespace(id: ConstPtr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteNamespace(id.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnDeleteNetwork(id: ConstPtr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteNetwork(id.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnEnumerateEndpoints(query: Pcwstr, endpoints: MutPtr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateEndpoints(query.rawAddress.toCPointer<ByteVar>(), endpoints.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnEnumerateGuestNetworkPortReservations(returncount: MutPtr, portentries: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateGuestNetworkPortReservations(returncount.rawAddress.toCPointer<ByteVar>(), portentries.rawAddress.toCPointer<ByteVar>())

public actual fun hcnEnumerateLoadBalancers(query: Pcwstr, loadbalancer: MutPtr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateLoadBalancers(query.rawAddress.toCPointer<ByteVar>(), loadbalancer.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnEnumerateNamespaces(query: Pcwstr, namespaces: MutPtr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateNamespaces(query.rawAddress.toCPointer<ByteVar>(), namespaces.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnEnumerateNetworks(query: Pcwstr, networks: MutPtr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateNetworks(query.rawAddress.toCPointer<ByteVar>(), networks.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnFreeGuestNetworkPortReservations(portentries: MutPtr) {
    windowssysWindowsWin32SystemHostcomputenetworkHcnFreeGuestNetworkPortReservations(portentries.rawAddress.toCPointer<ByteVar>())
}

public actual fun hcnModifyEndpoint(endpoint: ConstPtr, settings: Pcwstr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnModifyEndpoint(endpoint.rawAddress.toCPointer<ByteVar>(), settings.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnModifyGuestNetworkService(guestnetworkservice: ConstPtr, settings: Pcwstr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnModifyGuestNetworkService(guestnetworkservice.rawAddress.toCPointer<ByteVar>(), settings.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnModifyLoadBalancer(loadbalancer: ConstPtr, settings: Pcwstr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnModifyLoadBalancer(loadbalancer.rawAddress.toCPointer<ByteVar>(), settings.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnModifyNamespace(namespace: ConstPtr, settings: Pcwstr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnModifyNamespace(namespace.rawAddress.toCPointer<ByteVar>(), settings.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnModifyNetwork(network: ConstPtr, settings: Pcwstr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnModifyNetwork(network.rawAddress.toCPointer<ByteVar>(), settings.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnOpenEndpoint(id: ConstPtr, endpoint: MutPtr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnOpenEndpoint(id.rawAddress.toCPointer<ByteVar>(), endpoint.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnOpenLoadBalancer(id: ConstPtr, loadbalancer: MutPtr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnOpenLoadBalancer(id.rawAddress.toCPointer<ByteVar>(), loadbalancer.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnOpenNamespace(id: ConstPtr, namespace: MutPtr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnOpenNamespace(id.rawAddress.toCPointer<ByteVar>(), namespace.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnOpenNetwork(id: ConstPtr, network: MutPtr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnOpenNetwork(id.rawAddress.toCPointer<ByteVar>(), network.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnQueryEndpointAddresses(endpoint: ConstPtr, query: Pcwstr, addresses: MutPtr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointAddresses(endpoint.rawAddress.toCPointer<ByteVar>(), query.rawAddress.toCPointer<ByteVar>(), addresses.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnQueryEndpointProperties(endpoint: ConstPtr, query: Pcwstr, properties: MutPtr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointProperties(endpoint.rawAddress.toCPointer<ByteVar>(), query.rawAddress.toCPointer<ByteVar>(), properties.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnQueryEndpointStats(endpoint: ConstPtr, query: Pcwstr, stats: MutPtr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointStats(endpoint.rawAddress.toCPointer<ByteVar>(), query.rawAddress.toCPointer<ByteVar>(), stats.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnQueryLoadBalancerProperties(loadbalancer: ConstPtr, query: Pcwstr, properties: MutPtr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnQueryLoadBalancerProperties(loadbalancer.rawAddress.toCPointer<ByteVar>(), query.rawAddress.toCPointer<ByteVar>(), properties.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnQueryNamespaceProperties(namespace: ConstPtr, query: Pcwstr, properties: MutPtr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnQueryNamespaceProperties(namespace.rawAddress.toCPointer<ByteVar>(), query.rawAddress.toCPointer<ByteVar>(), properties.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnQueryNetworkProperties(network: ConstPtr, query: Pcwstr, properties: MutPtr, errorrecord: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnQueryNetworkProperties(network.rawAddress.toCPointer<ByteVar>(), query.rawAddress.toCPointer<ByteVar>(), properties.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnRegisterGuestNetworkServiceCallback(guestnetworkservice: ConstPtr, callback: HcnNotificationCallback, context: ConstPtr, callbackhandle: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnRegisterGuestNetworkServiceCallback(guestnetworkservice.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>(), callbackhandle.rawAddress.toCPointer<ByteVar>())

public actual fun hcnRegisterServiceCallback(callback: HcnNotificationCallback, context: ConstPtr, callbackhandle: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnRegisterServiceCallback(0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>(), callbackhandle.rawAddress.toCPointer<ByteVar>())

public actual fun hcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle: Handle): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle.rawAddress.toCPointer<ByteVar>())

public actual fun hcnReserveGuestNetworkServicePort(guestnetworkservice: ConstPtr, protocol: HcnPortProtocol, access: HcnPortAccess, port: UShort, portreservationhandle: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnReserveGuestNetworkServicePort(guestnetworkservice.rawAddress.toCPointer<ByteVar>(), protocol, access, port, portreservationhandle.rawAddress.toCPointer<ByteVar>())

public actual fun hcnReserveGuestNetworkServicePortRange(guestnetworkservice: ConstPtr, portcount: UShort, portrangereservation: MutPtr, portreservationhandle: MutPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnReserveGuestNetworkServicePortRange(guestnetworkservice.rawAddress.toCPointer<ByteVar>(), portcount, portrangereservation.rawAddress.toCPointer<ByteVar>(), portreservationhandle.rawAddress.toCPointer<ByteVar>())

public actual fun hcnUnregisterGuestNetworkServiceCallback(callbackhandle: ConstPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnUnregisterGuestNetworkServiceCallback(callbackhandle.rawAddress.toCPointer<ByteVar>())

public actual fun hcnUnregisterServiceCallback(callbackhandle: ConstPtr): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnUnregisterServiceCallback(callbackhandle.rawAddress.toCPointer<ByteVar>())
