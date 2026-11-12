@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
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

public actual fun hcnCloseEndpoint(endpoint: ConstPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnCloseEndpoint(endpoint.rawAddress.toCPointer<ByteVar>())

public actual fun hcnCloseGuestNetworkService(guestnetworkservice: ConstPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnCloseGuestNetworkService(guestnetworkservice.rawAddress.toCPointer<ByteVar>())

public actual fun hcnCloseLoadBalancer(loadbalancer: ConstPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnCloseLoadBalancer(loadbalancer.rawAddress.toCPointer<ByteVar>())

public actual fun hcnCloseNamespace(namespace: ConstPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnCloseNamespace(namespace.rawAddress.toCPointer<ByteVar>())

public actual fun hcnCloseNetwork(network: ConstPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnCloseNetwork(network.rawAddress.toCPointer<ByteVar>())

public actual fun hcnCreateEndpoint(network: ConstPtr<CVoid>, id: ConstPtr<Guid>, settings: Pcwstr, endpoint: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnCreateEndpoint(network.rawAddress.toCPointer<ByteVar>(), id.rawAddress.toCPointer<ByteVar>(), settings.rawAddress.toCPointer<ByteVar>(), endpoint.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnCreateGuestNetworkService(id: ConstPtr<Guid>, settings: Pcwstr, guestnetworkservice: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnCreateGuestNetworkService(id.rawAddress.toCPointer<ByteVar>(), settings.rawAddress.toCPointer<ByteVar>(), guestnetworkservice.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnCreateLoadBalancer(id: ConstPtr<Guid>, settings: Pcwstr, loadbalancer: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnCreateLoadBalancer(id.rawAddress.toCPointer<ByteVar>(), settings.rawAddress.toCPointer<ByteVar>(), loadbalancer.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnCreateNamespace(id: ConstPtr<Guid>, settings: Pcwstr, namespace: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnCreateNamespace(id.rawAddress.toCPointer<ByteVar>(), settings.rawAddress.toCPointer<ByteVar>(), namespace.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnCreateNetwork(id: ConstPtr<Guid>, settings: Pcwstr, network: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnCreateNetwork(id.rawAddress.toCPointer<ByteVar>(), settings.rawAddress.toCPointer<ByteVar>(), network.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnDeleteEndpoint(id: ConstPtr<Guid>, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteEndpoint(id.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnDeleteGuestNetworkService(id: ConstPtr<Guid>, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteGuestNetworkService(id.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnDeleteLoadBalancer(id: ConstPtr<Guid>, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteLoadBalancer(id.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnDeleteNamespace(id: ConstPtr<Guid>, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteNamespace(id.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnDeleteNetwork(id: ConstPtr<Guid>, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteNetwork(id.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnEnumerateEndpoints(query: Pcwstr, endpoints: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateEndpoints(query.rawAddress.toCPointer<ByteVar>(), endpoints.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnEnumerateGuestNetworkPortReservations(returncount: MutPtr<UInt>, portentries: MutPtr<MutPtr<HcnPortRangeEntry>>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateGuestNetworkPortReservations(returncount.rawAddress.toCPointer<ByteVar>(), portentries.rawAddress.toCPointer<ByteVar>())

public actual fun hcnEnumerateLoadBalancers(query: Pcwstr, loadbalancer: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateLoadBalancers(query.rawAddress.toCPointer<ByteVar>(), loadbalancer.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnEnumerateNamespaces(query: Pcwstr, namespaces: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateNamespaces(query.rawAddress.toCPointer<ByteVar>(), namespaces.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnEnumerateNetworks(query: Pcwstr, networks: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateNetworks(query.rawAddress.toCPointer<ByteVar>(), networks.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnFreeGuestNetworkPortReservations(portentries: MutPtr<HcnPortRangeEntry>) {
    windowssysWindowsWin32SystemHostcomputenetworkHcnFreeGuestNetworkPortReservations(portentries.rawAddress.toCPointer<ByteVar>())
}

public actual fun hcnModifyEndpoint(endpoint: ConstPtr<CVoid>, settings: Pcwstr, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnModifyEndpoint(endpoint.rawAddress.toCPointer<ByteVar>(), settings.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnModifyGuestNetworkService(guestnetworkservice: ConstPtr<CVoid>, settings: Pcwstr, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnModifyGuestNetworkService(guestnetworkservice.rawAddress.toCPointer<ByteVar>(), settings.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnModifyLoadBalancer(loadbalancer: ConstPtr<CVoid>, settings: Pcwstr, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnModifyLoadBalancer(loadbalancer.rawAddress.toCPointer<ByteVar>(), settings.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnModifyNamespace(namespace: ConstPtr<CVoid>, settings: Pcwstr, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnModifyNamespace(namespace.rawAddress.toCPointer<ByteVar>(), settings.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnModifyNetwork(network: ConstPtr<CVoid>, settings: Pcwstr, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnModifyNetwork(network.rawAddress.toCPointer<ByteVar>(), settings.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnOpenEndpoint(id: ConstPtr<Guid>, endpoint: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnOpenEndpoint(id.rawAddress.toCPointer<ByteVar>(), endpoint.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnOpenLoadBalancer(id: ConstPtr<Guid>, loadbalancer: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnOpenLoadBalancer(id.rawAddress.toCPointer<ByteVar>(), loadbalancer.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnOpenNamespace(id: ConstPtr<Guid>, namespace: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnOpenNamespace(id.rawAddress.toCPointer<ByteVar>(), namespace.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnOpenNetwork(id: ConstPtr<Guid>, network: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnOpenNetwork(id.rawAddress.toCPointer<ByteVar>(), network.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnQueryEndpointAddresses(endpoint: ConstPtr<CVoid>, query: Pcwstr, addresses: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointAddresses(endpoint.rawAddress.toCPointer<ByteVar>(), query.rawAddress.toCPointer<ByteVar>(), addresses.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnQueryEndpointProperties(endpoint: ConstPtr<CVoid>, query: Pcwstr, properties: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointProperties(endpoint.rawAddress.toCPointer<ByteVar>(), query.rawAddress.toCPointer<ByteVar>(), properties.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnQueryEndpointStats(endpoint: ConstPtr<CVoid>, query: Pcwstr, stats: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointStats(endpoint.rawAddress.toCPointer<ByteVar>(), query.rawAddress.toCPointer<ByteVar>(), stats.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnQueryLoadBalancerProperties(loadbalancer: ConstPtr<CVoid>, query: Pcwstr, properties: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnQueryLoadBalancerProperties(loadbalancer.rawAddress.toCPointer<ByteVar>(), query.rawAddress.toCPointer<ByteVar>(), properties.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnQueryNamespaceProperties(namespace: ConstPtr<CVoid>, query: Pcwstr, properties: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnQueryNamespaceProperties(namespace.rawAddress.toCPointer<ByteVar>(), query.rawAddress.toCPointer<ByteVar>(), properties.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnQueryNetworkProperties(network: ConstPtr<CVoid>, query: Pcwstr, properties: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnQueryNetworkProperties(network.rawAddress.toCPointer<ByteVar>(), query.rawAddress.toCPointer<ByteVar>(), properties.rawAddress.toCPointer<ByteVar>(), errorrecord.rawAddress.toCPointer<ByteVar>())

public actual fun hcnRegisterGuestNetworkServiceCallback(guestnetworkservice: ConstPtr<CVoid>, callback: HcnNotificationCallback, context: ConstPtr<CVoid>, callbackhandle: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnRegisterGuestNetworkServiceCallback(guestnetworkservice.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>(), callbackhandle.rawAddress.toCPointer<ByteVar>())

public actual fun hcnRegisterServiceCallback(callback: HcnNotificationCallback, context: ConstPtr<CVoid>, callbackhandle: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnRegisterServiceCallback(0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>(), callbackhandle.rawAddress.toCPointer<ByteVar>())

public actual fun hcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle: Handle): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle.rawAddress.toCPointer<ByteVar>())

public actual fun hcnReserveGuestNetworkServicePort(guestnetworkservice: ConstPtr<CVoid>, protocol: HcnPortProtocol, access: HcnPortAccess, port: UShort, portreservationhandle: MutPtr<Handle>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnReserveGuestNetworkServicePort(guestnetworkservice.rawAddress.toCPointer<ByteVar>(), protocol, access, port, portreservationhandle.rawAddress.toCPointer<ByteVar>())

public actual fun hcnReserveGuestNetworkServicePortRange(guestnetworkservice: ConstPtr<CVoid>, portcount: UShort, portrangereservation: MutPtr<HcnPortRangeReservation>, portreservationhandle: MutPtr<Handle>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnReserveGuestNetworkServicePortRange(guestnetworkservice.rawAddress.toCPointer<ByteVar>(), portcount, portrangereservation.rawAddress.toCPointer<ByteVar>(), portreservationhandle.rawAddress.toCPointer<ByteVar>())

public actual fun hcnUnregisterGuestNetworkServiceCallback(callbackhandle: ConstPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnUnregisterGuestNetworkServiceCallback(callbackhandle.rawAddress.toCPointer<ByteVar>())

public actual fun hcnUnregisterServiceCallback(callbackhandle: ConstPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemHostcomputenetworkHcnUnregisterServiceCallback(callbackhandle.rawAddress.toCPointer<ByteVar>())
