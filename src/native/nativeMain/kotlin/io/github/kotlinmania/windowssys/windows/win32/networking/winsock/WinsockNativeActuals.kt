@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.winsock

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.windows.win32.foundation.Farproc
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.WaitEvent
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_accept
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_acceptEx
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_bind
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_closesocket
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_connect
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_enumProtocolsA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_enumProtocolsW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_freeAddrInfoEx
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_freeAddrInfoExW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_freeAddrInfoW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_freeaddrinfo
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getAcceptExSockaddrs
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getAddrInfoExA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getAddrInfoExCancel
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getAddrInfoExOverlappedResult
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getAddrInfoExW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getAddrInfoW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getAddressByNameA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getAddressByNameW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getHostNameW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getNameByTypeA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getNameByTypeW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getNameInfoW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getServiceA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getServiceW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getTypeByNameA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getTypeByNameW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getaddrinfo
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_gethostbyaddr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_gethostbyname
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_gethostname
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getnameinfo
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getpeername
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getprotobyname
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getprotobynumber
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getservbyname
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getservbyport
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getsockname
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getsockopt
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_htonl
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_htons
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_inetAddr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_inetNtop
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_inetNtopW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_inetPton
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_inetPtonW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_ioctlsocket
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_listen
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_ntohl
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_ntohs
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_processSocketNotifications
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_recv
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_recvfrom
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_rtlEthernetAddressToStringA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_rtlEthernetAddressToStringW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_rtlEthernetStringToAddressA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_rtlEthernetStringToAddressW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_rtlIpv4AddressToStringA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_rtlIpv4AddressToStringExA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_rtlIpv4AddressToStringExW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_rtlIpv4AddressToStringW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_rtlIpv4StringToAddressA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_rtlIpv4StringToAddressExA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_rtlIpv4StringToAddressExW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_rtlIpv4StringToAddressW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_rtlIpv6AddressToStringA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_rtlIpv6AddressToStringExA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_rtlIpv6AddressToStringExW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_rtlIpv6AddressToStringW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_rtlIpv6StringToAddressA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_rtlIpv6StringToAddressExA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_rtlIpv6StringToAddressExW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_rtlIpv6StringToAddressW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_select
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_send
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_sendto
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_setAddrInfoExA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_setAddrInfoExW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_setServiceA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_setServiceW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_setSocketMediaStreamingMode
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_setsockopt
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_shutdown
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_socket
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_transmitFile
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wPUCompleteOverlappedRequest
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAAccept
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAAddressToStringA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAAddressToStringW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAAdvertiseProvider
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAAsyncGetHostByAddr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAAsyncGetHostByName
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAAsyncGetProtoByName
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAAsyncGetProtoByNumber
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAAsyncGetServByName
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAAsyncGetServByPort
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAAsyncSelect
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSACancelAsyncRequest
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSACancelBlockingCall
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSACleanup
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSACloseEvent
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAConnect
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAConnectByList
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAConnectByNameA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAConnectByNameW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSACreateEvent
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSADeleteSocketPeerTargetName
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSADuplicateSocketA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSADuplicateSocketW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAEnumNameSpaceProvidersA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAEnumNameSpaceProvidersExA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAEnumNameSpaceProvidersExW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAEnumNameSpaceProvidersW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAEnumNetworkEvents
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAEnumProtocolsA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAEnumProtocolsW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAEventSelect
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAGetLastError
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAGetOverlappedResult
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAGetQOSByName
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAGetServiceClassInfoA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAGetServiceClassInfoW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAGetServiceClassNameByClassIdA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAGetServiceClassNameByClassIdW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAHtonl
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAHtons
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAImpersonateSocketPeer
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAInstallServiceClassA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAInstallServiceClassW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAIoctl
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAIsBlocking
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAJoinLeaf
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSALookupServiceBeginA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSALookupServiceBeginW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSALookupServiceEnd
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSALookupServiceNextA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSALookupServiceNextW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSANSPIoctl
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSANtohl
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSANtohs
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAPoll
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAProviderCompleteAsyncCall
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAProviderConfigChange
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAQuerySocketSecurity
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSARecv
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSARecvDisconnect
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSARecvEx
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSARecvFrom
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSARemoveServiceClass
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAResetEvent
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSARevertImpersonation
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSASend
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSASendDisconnect
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSASendMsg
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSASendTo
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSASetEvent
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSASetLastError
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSASetServiceA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSASetServiceW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSASetSocketPeerTargetName
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSASetSocketSecurity
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSASocketA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSASocketW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAStartup
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAStringToAddressA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAStringToAddressW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAUnadvertiseProvider
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAUnhookBlockingHook
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSAWaitForMultipleEvents
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCDeinstallProvider
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCDeinstallProvider32
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCEnableNSProvider
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCEnableNSProvider32
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCEnumNameSpaceProviders32
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCEnumNameSpaceProvidersEx32
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCEnumProtocols
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCEnumProtocols32
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCGetApplicationCategory
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCGetProviderInfo
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCGetProviderInfo32
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCGetProviderPath
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCGetProviderPath32
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCInstallNameSpace
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCInstallNameSpace32
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCInstallNameSpaceEx
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCInstallNameSpaceEx32
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCInstallProvider
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCSetApplicationCategory
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCSetProviderInfo
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCSetProviderInfo32
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCUnInstallNameSpace
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCUnInstallNameSpace32
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCUpdateProvider
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCUpdateProvider32
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCWriteNameSpaceOrder
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCWriteNameSpaceOrder32
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCWriteProviderOrder
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wSCWriteProviderOrder32
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wsafdisSet
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wscinstallProvider6432
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_wscinstallProviderAndChains6432
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun acceptEx(slistensocket: Socket, sacceptsocket: Socket, lpoutputbuffer: COpaquePointer?, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, lpdwbytesreceived: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    windowssys_windows_win32_networking_winsock_acceptEx(slistensocket, sacceptsocket, lpoutputbuffer?.value?.toCPointer<ByteVar>(), dwreceivedatalength, dwlocaladdresslength, dwremoteaddresslength, lpdwbytesreceived?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>())

public actual fun enumProtocolsA(lpiprotocols: COpaquePointer?, lpprotocolbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_enumProtocolsA(lpiprotocols?.value?.toCPointer<ByteVar>(), lpprotocolbuffer?.value?.toCPointer<ByteVar>(), lpdwbufferlength?.value?.toCPointer<ByteVar>())

public actual fun enumProtocolsW(lpiprotocols: COpaquePointer?, lpprotocolbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_enumProtocolsW(lpiprotocols?.value?.toCPointer<ByteVar>(), lpprotocolbuffer?.value?.toCPointer<ByteVar>(), lpdwbufferlength?.value?.toCPointer<ByteVar>())

public actual fun freeAddrInfoEx(paddrinfoex: COpaquePointer?) {
    windowssys_windows_win32_networking_winsock_freeAddrInfoEx(paddrinfoex?.value?.toCPointer<ByteVar>())
}

public actual fun freeAddrInfoExW(paddrinfoex: COpaquePointer?) {
    windowssys_windows_win32_networking_winsock_freeAddrInfoExW(paddrinfoex?.value?.toCPointer<ByteVar>())
}

public actual fun freeAddrInfoW(paddrinfo: COpaquePointer?) {
    windowssys_windows_win32_networking_winsock_freeAddrInfoW(paddrinfo?.value?.toCPointer<ByteVar>())
}

public actual fun getAcceptExSockaddrs(lpoutputbuffer: COpaquePointer?, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, localsockaddr: COpaquePointer?, localsockaddrlength: COpaquePointer?, remotesockaddr: COpaquePointer?, remotesockaddrlength: COpaquePointer?) {
    windowssys_windows_win32_networking_winsock_getAcceptExSockaddrs(lpoutputbuffer?.value?.toCPointer<ByteVar>(), dwreceivedatalength, dwlocaladdresslength, dwremoteaddresslength, localsockaddr?.value?.toCPointer<ByteVar>(), localsockaddrlength?.value?.toCPointer<ByteVar>(), remotesockaddr?.value?.toCPointer<ByteVar>(), remotesockaddrlength?.value?.toCPointer<ByteVar>())
}

public actual fun getAddrInfoExA(pname: Pcstr, pservicename: Pcstr, dwnamespace: UInt, lpnspid: COpaquePointer?, hints: COpaquePointer?, ppresult: COpaquePointer?, timeout: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_getAddrInfoExA(pname?.value?.toCPointer<ByteVar>(), pservicename?.value?.toCPointer<ByteVar>(), dwnamespace, lpnspid?.value?.toCPointer<ByteVar>(), hints?.value?.toCPointer<ByteVar>(), ppresult?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpnamehandle?.value?.toCPointer<ByteVar>())

public actual fun getAddrInfoExCancel(lphandle: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_getAddrInfoExCancel(lphandle?.value?.toCPointer<ByteVar>())

public actual fun getAddrInfoExOverlappedResult(lpoverlapped: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_getAddrInfoExOverlappedResult(lpoverlapped?.value?.toCPointer<ByteVar>())

public actual fun getAddrInfoExW(pname: Pcwstr, pservicename: Pcwstr, dwnamespace: UInt, lpnspid: COpaquePointer?, hints: COpaquePointer?, ppresult: COpaquePointer?, timeout: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LplookupserviceCompletionRoutine, lphandle: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_getAddrInfoExW(pname?.value?.toCPointer<ByteVar>(), pservicename?.value?.toCPointer<ByteVar>(), dwnamespace, lpnspid?.value?.toCPointer<ByteVar>(), hints?.value?.toCPointer<ByteVar>(), ppresult?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lphandle?.value?.toCPointer<ByteVar>())

public actual fun getAddrInfoW(pnodename: Pcwstr, pservicename: Pcwstr, phints: COpaquePointer?, ppresult: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_getAddrInfoW(pnodename?.value?.toCPointer<ByteVar>(), pservicename?.value?.toCPointer<ByteVar>(), phints?.value?.toCPointer<ByteVar>(), ppresult?.value?.toCPointer<ByteVar>())

public actual fun getAddressByNameA(dwnamespace: UInt, lpservicetype: COpaquePointer?, lpservicename: Pcstr, lpiprotocols: COpaquePointer?, dwresolution: UInt, lpserviceasyncinfo: COpaquePointer?, lpcsaddrbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lpaliasbuffer: Pstr, lpdwaliasbufferlength: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_getAddressByNameA(dwnamespace, lpservicetype?.value?.toCPointer<ByteVar>(), lpservicename?.value?.toCPointer<ByteVar>(), lpiprotocols?.value?.toCPointer<ByteVar>(), dwresolution, lpserviceasyncinfo?.value?.toCPointer<ByteVar>(), lpcsaddrbuffer?.value?.toCPointer<ByteVar>(), lpdwbufferlength?.value?.toCPointer<ByteVar>(), lpaliasbuffer?.value?.toCPointer<ByteVar>(), lpdwaliasbufferlength?.value?.toCPointer<ByteVar>())

public actual fun getAddressByNameW(dwnamespace: UInt, lpservicetype: COpaquePointer?, lpservicename: Pcwstr, lpiprotocols: COpaquePointer?, dwresolution: UInt, lpserviceasyncinfo: COpaquePointer?, lpcsaddrbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lpaliasbuffer: Pwstr, lpdwaliasbufferlength: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_getAddressByNameW(dwnamespace, lpservicetype?.value?.toCPointer<ByteVar>(), lpservicename?.value?.toCPointer<ByteVar>(), lpiprotocols?.value?.toCPointer<ByteVar>(), dwresolution, lpserviceasyncinfo?.value?.toCPointer<ByteVar>(), lpcsaddrbuffer?.value?.toCPointer<ByteVar>(), lpdwbufferlength?.value?.toCPointer<ByteVar>(), lpaliasbuffer?.value?.toCPointer<ByteVar>(), lpdwaliasbufferlength?.value?.toCPointer<ByteVar>())

public actual fun getHostNameW(name: Pwstr, namelen: Int): Int =
    windowssys_windows_win32_networking_winsock_getHostNameW(name?.value?.toCPointer<ByteVar>(), namelen)

public actual fun getNameByTypeA(lpservicetype: COpaquePointer?, lpservicename: Pstr, dwnamelength: UInt): Int =
    windowssys_windows_win32_networking_winsock_getNameByTypeA(lpservicetype?.value?.toCPointer<ByteVar>(), lpservicename?.value?.toCPointer<ByteVar>(), dwnamelength)

public actual fun getNameByTypeW(lpservicetype: COpaquePointer?, lpservicename: Pwstr, dwnamelength: UInt): Int =
    windowssys_windows_win32_networking_winsock_getNameByTypeW(lpservicetype?.value?.toCPointer<ByteVar>(), lpservicename?.value?.toCPointer<ByteVar>(), dwnamelength)

public actual fun getNameInfoW(psockaddr: COpaquePointer?, sockaddrlength: SocklenT, pnodebuffer: Pwstr, nodebuffersize: UInt, pservicebuffer: Pwstr, servicebuffersize: UInt, flags: Int): Int =
    windowssys_windows_win32_networking_winsock_getNameInfoW(psockaddr?.value?.toCPointer<ByteVar>(), sockaddrlength, pnodebuffer?.value?.toCPointer<ByteVar>(), nodebuffersize, pservicebuffer?.value?.toCPointer<ByteVar>(), servicebuffersize, flags)

public actual fun getServiceA(dwnamespace: UInt, lpguid: COpaquePointer?, lpservicename: Pcstr, dwproperties: UInt, lpbuffer: COpaquePointer?, lpdwbuffersize: COpaquePointer?, lpserviceasyncinfo: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_getServiceA(dwnamespace, lpguid?.value?.toCPointer<ByteVar>(), lpservicename?.value?.toCPointer<ByteVar>(), dwproperties, lpbuffer?.value?.toCPointer<ByteVar>(), lpdwbuffersize?.value?.toCPointer<ByteVar>(), lpserviceasyncinfo?.value?.toCPointer<ByteVar>())

public actual fun getServiceW(dwnamespace: UInt, lpguid: COpaquePointer?, lpservicename: Pcwstr, dwproperties: UInt, lpbuffer: COpaquePointer?, lpdwbuffersize: COpaquePointer?, lpserviceasyncinfo: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_getServiceW(dwnamespace, lpguid?.value?.toCPointer<ByteVar>(), lpservicename?.value?.toCPointer<ByteVar>(), dwproperties, lpbuffer?.value?.toCPointer<ByteVar>(), lpdwbuffersize?.value?.toCPointer<ByteVar>(), lpserviceasyncinfo?.value?.toCPointer<ByteVar>())

public actual fun getTypeByNameA(lpservicename: Pcstr, lpservicetype: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_getTypeByNameA(lpservicename?.value?.toCPointer<ByteVar>(), lpservicetype?.value?.toCPointer<ByteVar>())

public actual fun getTypeByNameW(lpservicename: Pcwstr, lpservicetype: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_getTypeByNameW(lpservicename?.value?.toCPointer<ByteVar>(), lpservicetype?.value?.toCPointer<ByteVar>())

public actual fun inetNtopW(family: Int, paddr: COpaquePointer?, pstringbuf: Pwstr, stringbufsize: ULong): Pcwstr =
    windowssys_windows_win32_networking_winsock_inetNtopW(family, paddr?.value?.toCPointer<ByteVar>(), pstringbuf?.value?.toCPointer<ByteVar>(), stringbufsize)?.let { COpaquePointer(it.toLong()) }

public actual fun inetPtonW(family: Int, pszaddrstring: Pcwstr, paddrbuf: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_inetPtonW(family, pszaddrstring?.value?.toCPointer<ByteVar>(), paddrbuf?.value?.toCPointer<ByteVar>())

public actual fun processSocketNotifications(completionport: Handle, registrationcount: UInt, registrationinfos: COpaquePointer?, timeoutms: UInt, completioncount: UInt, completionportentries: COpaquePointer?, receivedentrycount: COpaquePointer?): UInt =
    windowssys_windows_win32_networking_winsock_processSocketNotifications(completionport?.value?.toCPointer<ByteVar>(), registrationcount, registrationinfos?.value?.toCPointer<ByteVar>(), timeoutms, completioncount, completionportentries?.value?.toCPointer<ByteVar>(), receivedentrycount?.value?.toCPointer<ByteVar>())

public actual fun rtlEthernetAddressToStringA(addr: COpaquePointer?, s: Pstr): Pstr =
    windowssys_windows_win32_networking_winsock_rtlEthernetAddressToStringA(addr?.value?.toCPointer<ByteVar>(), s?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlEthernetAddressToStringW(addr: COpaquePointer?, s: Pwstr): Pwstr =
    windowssys_windows_win32_networking_winsock_rtlEthernetAddressToStringW(addr?.value?.toCPointer<ByteVar>(), s?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlEthernetStringToAddressA(s: Pcstr, terminator: COpaquePointer?, addr: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_rtlEthernetStringToAddressA(s?.value?.toCPointer<ByteVar>(), terminator?.value?.toCPointer<ByteVar>(), addr?.value?.toCPointer<ByteVar>())

public actual fun rtlEthernetStringToAddressW(s: Pcwstr, terminator: COpaquePointer?, addr: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_rtlEthernetStringToAddressW(s?.value?.toCPointer<ByteVar>(), terminator?.value?.toCPointer<ByteVar>(), addr?.value?.toCPointer<ByteVar>())

public actual fun rtlIpv4AddressToStringA(addr: COpaquePointer?, s: Pstr): Pstr =
    windowssys_windows_win32_networking_winsock_rtlIpv4AddressToStringA(addr?.value?.toCPointer<ByteVar>(), s?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlIpv4AddressToStringExA(address: COpaquePointer?, port: UShort, addressstring: Pstr, addressstringlength: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_rtlIpv4AddressToStringExA(address?.value?.toCPointer<ByteVar>(), port, addressstring?.value?.toCPointer<ByteVar>(), addressstringlength?.value?.toCPointer<ByteVar>())

public actual fun rtlIpv4AddressToStringExW(address: COpaquePointer?, port: UShort, addressstring: Pwstr, addressstringlength: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_rtlIpv4AddressToStringExW(address?.value?.toCPointer<ByteVar>(), port, addressstring?.value?.toCPointer<ByteVar>(), addressstringlength?.value?.toCPointer<ByteVar>())

public actual fun rtlIpv4AddressToStringW(addr: COpaquePointer?, s: Pwstr): Pwstr =
    windowssys_windows_win32_networking_winsock_rtlIpv4AddressToStringW(addr?.value?.toCPointer<ByteVar>(), s?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlIpv4StringToAddressA(s: Pcstr, strict: Boolean, terminator: COpaquePointer?, addr: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_rtlIpv4StringToAddressA(s?.value?.toCPointer<ByteVar>(), strict, terminator?.value?.toCPointer<ByteVar>(), addr?.value?.toCPointer<ByteVar>())

public actual fun rtlIpv4StringToAddressExA(addressstring: Pcstr, strict: Boolean, address: COpaquePointer?, port: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_rtlIpv4StringToAddressExA(addressstring?.value?.toCPointer<ByteVar>(), strict, address?.value?.toCPointer<ByteVar>(), port?.value?.toCPointer<ByteVar>())

public actual fun rtlIpv4StringToAddressExW(addressstring: Pcwstr, strict: Boolean, address: COpaquePointer?, port: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_rtlIpv4StringToAddressExW(addressstring?.value?.toCPointer<ByteVar>(), strict, address?.value?.toCPointer<ByteVar>(), port?.value?.toCPointer<ByteVar>())

public actual fun rtlIpv4StringToAddressW(s: Pcwstr, strict: Boolean, terminator: COpaquePointer?, addr: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_rtlIpv4StringToAddressW(s?.value?.toCPointer<ByteVar>(), strict, terminator?.value?.toCPointer<ByteVar>(), addr?.value?.toCPointer<ByteVar>())

public actual fun rtlIpv6AddressToStringA(addr: COpaquePointer?, s: Pstr): Pstr =
    windowssys_windows_win32_networking_winsock_rtlIpv6AddressToStringA(addr?.value?.toCPointer<ByteVar>(), s?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlIpv6AddressToStringExA(address: COpaquePointer?, scopeid: UInt, port: UShort, addressstring: Pstr, addressstringlength: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_rtlIpv6AddressToStringExA(address?.value?.toCPointer<ByteVar>(), scopeid, port, addressstring?.value?.toCPointer<ByteVar>(), addressstringlength?.value?.toCPointer<ByteVar>())

public actual fun rtlIpv6AddressToStringExW(address: COpaquePointer?, scopeid: UInt, port: UShort, addressstring: Pwstr, addressstringlength: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_rtlIpv6AddressToStringExW(address?.value?.toCPointer<ByteVar>(), scopeid, port, addressstring?.value?.toCPointer<ByteVar>(), addressstringlength?.value?.toCPointer<ByteVar>())

public actual fun rtlIpv6AddressToStringW(addr: COpaquePointer?, s: Pwstr): Pwstr =
    windowssys_windows_win32_networking_winsock_rtlIpv6AddressToStringW(addr?.value?.toCPointer<ByteVar>(), s?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlIpv6StringToAddressA(s: Pcstr, terminator: COpaquePointer?, addr: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_rtlIpv6StringToAddressA(s?.value?.toCPointer<ByteVar>(), terminator?.value?.toCPointer<ByteVar>(), addr?.value?.toCPointer<ByteVar>())

public actual fun rtlIpv6StringToAddressExA(addressstring: Pcstr, address: COpaquePointer?, scopeid: COpaquePointer?, port: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_rtlIpv6StringToAddressExA(addressstring?.value?.toCPointer<ByteVar>(), address?.value?.toCPointer<ByteVar>(), scopeid?.value?.toCPointer<ByteVar>(), port?.value?.toCPointer<ByteVar>())

public actual fun rtlIpv6StringToAddressExW(addressstring: Pcwstr, address: COpaquePointer?, scopeid: COpaquePointer?, port: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_rtlIpv6StringToAddressExW(addressstring?.value?.toCPointer<ByteVar>(), address?.value?.toCPointer<ByteVar>(), scopeid?.value?.toCPointer<ByteVar>(), port?.value?.toCPointer<ByteVar>())

public actual fun rtlIpv6StringToAddressW(s: Pcwstr, terminator: COpaquePointer?, addr: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_rtlIpv6StringToAddressW(s?.value?.toCPointer<ByteVar>(), terminator?.value?.toCPointer<ByteVar>(), addr?.value?.toCPointer<ByteVar>())

public actual fun setAddrInfoExA(pname: Pcstr, pservicename: Pcstr, paddresses: COpaquePointer?, dwaddresscount: UInt, lpblob: COpaquePointer?, dwflags: UInt, dwnamespace: UInt, lpnspid: COpaquePointer?, timeout: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_setAddrInfoExA(pname?.value?.toCPointer<ByteVar>(), pservicename?.value?.toCPointer<ByteVar>(), paddresses?.value?.toCPointer<ByteVar>(), dwaddresscount, lpblob?.value?.toCPointer<ByteVar>(), dwflags, dwnamespace, lpnspid?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpnamehandle?.value?.toCPointer<ByteVar>())

public actual fun setAddrInfoExW(pname: Pcwstr, pservicename: Pcwstr, paddresses: COpaquePointer?, dwaddresscount: UInt, lpblob: COpaquePointer?, dwflags: UInt, dwnamespace: UInt, lpnspid: COpaquePointer?, timeout: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_setAddrInfoExW(pname?.value?.toCPointer<ByteVar>(), pservicename?.value?.toCPointer<ByteVar>(), paddresses?.value?.toCPointer<ByteVar>(), dwaddresscount, lpblob?.value?.toCPointer<ByteVar>(), dwflags, dwnamespace, lpnspid?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpnamehandle?.value?.toCPointer<ByteVar>())

public actual fun setServiceA(dwnamespace: UInt, dwoperation: SetServiceOperation, dwflags: UInt, lpserviceinfo: COpaquePointer?, lpserviceasyncinfo: COpaquePointer?, lpdwstatusflags: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_setServiceA(dwnamespace, dwoperation, dwflags, lpserviceinfo?.value?.toCPointer<ByteVar>(), lpserviceasyncinfo?.value?.toCPointer<ByteVar>(), lpdwstatusflags?.value?.toCPointer<ByteVar>())

public actual fun setServiceW(dwnamespace: UInt, dwoperation: SetServiceOperation, dwflags: UInt, lpserviceinfo: COpaquePointer?, lpserviceasyncinfo: COpaquePointer?, lpdwstatusflags: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_setServiceW(dwnamespace, dwoperation, dwflags, lpserviceinfo?.value?.toCPointer<ByteVar>(), lpserviceasyncinfo?.value?.toCPointer<ByteVar>(), lpdwstatusflags?.value?.toCPointer<ByteVar>())

public actual fun setSocketMediaStreamingMode(value: Bool): Hresult =
    windowssys_windows_win32_networking_winsock_setSocketMediaStreamingMode(value)

public actual fun transmitFile(hsocket: Socket, hfile: Handle, nnumberofbytestowrite: UInt, nnumberofbytespersend: UInt, lpoverlapped: COpaquePointer?, lptransmitbuffers: COpaquePointer?, dwreserved: UInt): Bool =
    windowssys_windows_win32_networking_winsock_transmitFile(hsocket, hfile?.value?.toCPointer<ByteVar>(), nnumberofbytestowrite, nnumberofbytespersend, lpoverlapped?.value?.toCPointer<ByteVar>(), lptransmitbuffers?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun wPUCompleteOverlappedRequest(s: Socket, lpoverlapped: COpaquePointer?, dwerror: UInt, cbtransferred: UInt, lperrno: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wPUCompleteOverlappedRequest(s, lpoverlapped?.value?.toCPointer<ByteVar>(), dwerror, cbtransferred, lperrno?.value?.toCPointer<ByteVar>())

public actual fun wSAAccept(s: Socket, addr: COpaquePointer?, addrlen: COpaquePointer?, lpfncondition: Lpconditionproc, dwcallbackdata: ULong): Socket =
    windowssys_windows_win32_networking_winsock_wSAAccept(s, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwcallbackdata)

public actual fun wSAAddressToStringA(lpsaaddress: COpaquePointer?, dwaddresslength: UInt, lpprotocolinfo: COpaquePointer?, lpszaddressstring: Pstr, lpdwaddressstringlength: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSAAddressToStringA(lpsaaddress?.value?.toCPointer<ByteVar>(), dwaddresslength, lpprotocolinfo?.value?.toCPointer<ByteVar>(), lpszaddressstring?.value?.toCPointer<ByteVar>(), lpdwaddressstringlength?.value?.toCPointer<ByteVar>())

public actual fun wSAAddressToStringW(lpsaaddress: COpaquePointer?, dwaddresslength: UInt, lpprotocolinfo: COpaquePointer?, lpszaddressstring: Pwstr, lpdwaddressstringlength: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSAAddressToStringW(lpsaaddress?.value?.toCPointer<ByteVar>(), dwaddresslength, lpprotocolinfo?.value?.toCPointer<ByteVar>(), lpszaddressstring?.value?.toCPointer<ByteVar>(), lpdwaddressstringlength?.value?.toCPointer<ByteVar>())

public actual fun wSAAdvertiseProvider(puuidproviderid: COpaquePointer?, pnspv2routine: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSAAdvertiseProvider(puuidproviderid?.value?.toCPointer<ByteVar>(), pnspv2routine?.value?.toCPointer<ByteVar>())

public actual fun wSAAsyncGetHostByAddr(hwnd: Hwnd, wmsg: UInt, addr: Pcstr, len: Int, type: Int, buf: Pstr, buflen: Int): Handle =
    windowssys_windows_win32_networking_winsock_wSAAsyncGetHostByAddr(hwnd?.value?.toCPointer<ByteVar>(), wmsg, addr?.value?.toCPointer<ByteVar>(), len, type, buf?.value?.toCPointer<ByteVar>(), buflen)?.let { COpaquePointer(it.toLong()) }

public actual fun wSAAsyncGetHostByName(hwnd: Hwnd, wmsg: UInt, name: Pcstr, buf: Pstr, buflen: Int): Handle =
    windowssys_windows_win32_networking_winsock_wSAAsyncGetHostByName(hwnd?.value?.toCPointer<ByteVar>(), wmsg, name?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen)?.let { COpaquePointer(it.toLong()) }

public actual fun wSAAsyncGetProtoByName(hwnd: Hwnd, wmsg: UInt, name: Pcstr, buf: Pstr, buflen: Int): Handle =
    windowssys_windows_win32_networking_winsock_wSAAsyncGetProtoByName(hwnd?.value?.toCPointer<ByteVar>(), wmsg, name?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen)?.let { COpaquePointer(it.toLong()) }

public actual fun wSAAsyncGetProtoByNumber(hwnd: Hwnd, wmsg: UInt, number: Int, buf: Pstr, buflen: Int): Handle =
    windowssys_windows_win32_networking_winsock_wSAAsyncGetProtoByNumber(hwnd?.value?.toCPointer<ByteVar>(), wmsg, number, buf?.value?.toCPointer<ByteVar>(), buflen)?.let { COpaquePointer(it.toLong()) }

public actual fun wSAAsyncGetServByName(hwnd: Hwnd, wmsg: UInt, name: Pcstr, proto: Pcstr, buf: Pstr, buflen: Int): Handle =
    windowssys_windows_win32_networking_winsock_wSAAsyncGetServByName(hwnd?.value?.toCPointer<ByteVar>(), wmsg, name?.value?.toCPointer<ByteVar>(), proto?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen)?.let { COpaquePointer(it.toLong()) }

public actual fun wSAAsyncGetServByPort(hwnd: Hwnd, wmsg: UInt, port: Int, proto: Pcstr, buf: Pstr, buflen: Int): Handle =
    windowssys_windows_win32_networking_winsock_wSAAsyncGetServByPort(hwnd?.value?.toCPointer<ByteVar>(), wmsg, port, proto?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen)?.let { COpaquePointer(it.toLong()) }

public actual fun wSAAsyncSelect(s: Socket, hwnd: Hwnd, wmsg: UInt, levent: Int): Int =
    windowssys_windows_win32_networking_winsock_wSAAsyncSelect(s, hwnd?.value?.toCPointer<ByteVar>(), wmsg, levent)

public actual fun wSACancelAsyncRequest(hasynctaskhandle: Handle): Int =
    windowssys_windows_win32_networking_winsock_wSACancelAsyncRequest(hasynctaskhandle?.value?.toCPointer<ByteVar>())

public actual fun wSACancelBlockingCall(): Int =
    windowssys_windows_win32_networking_winsock_wSACancelBlockingCall()

public actual fun wSACleanup(): Int =
    windowssys_windows_win32_networking_winsock_wSACleanup()

public actual fun wSACloseEvent(hevent: Wsaevent): Bool =
    windowssys_windows_win32_networking_winsock_wSACloseEvent(hevent)

public actual fun wSAConnect(s: Socket, name: COpaquePointer?, namelen: Int, lpcallerdata: COpaquePointer?, lpcalleedata: COpaquePointer?, lpsqos: COpaquePointer?, lpgqos: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSAConnect(s, name?.value?.toCPointer<ByteVar>(), namelen, lpcallerdata?.value?.toCPointer<ByteVar>(), lpcalleedata?.value?.toCPointer<ByteVar>(), lpsqos?.value?.toCPointer<ByteVar>(), lpgqos?.value?.toCPointer<ByteVar>())

public actual fun wSAConnectByList(s: Socket, socketaddress: COpaquePointer?, localaddresslength: COpaquePointer?, localaddress: COpaquePointer?, remoteaddresslength: COpaquePointer?, remoteaddress: COpaquePointer?, timeout: COpaquePointer?, reserved: COpaquePointer?): Bool =
    windowssys_windows_win32_networking_winsock_wSAConnectByList(s, socketaddress?.value?.toCPointer<ByteVar>(), localaddresslength?.value?.toCPointer<ByteVar>(), localaddress?.value?.toCPointer<ByteVar>(), remoteaddresslength?.value?.toCPointer<ByteVar>(), remoteaddress?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>(), reserved?.value?.toCPointer<ByteVar>())

public actual fun wSAConnectByNameA(s: Socket, nodename: Pcstr, servicename: Pcstr, localaddresslength: COpaquePointer?, localaddress: COpaquePointer?, remoteaddresslength: COpaquePointer?, remoteaddress: COpaquePointer?, timeout: COpaquePointer?, reserved: COpaquePointer?): Bool =
    windowssys_windows_win32_networking_winsock_wSAConnectByNameA(s, nodename?.value?.toCPointer<ByteVar>(), servicename?.value?.toCPointer<ByteVar>(), localaddresslength?.value?.toCPointer<ByteVar>(), localaddress?.value?.toCPointer<ByteVar>(), remoteaddresslength?.value?.toCPointer<ByteVar>(), remoteaddress?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>(), reserved?.value?.toCPointer<ByteVar>())

public actual fun wSAConnectByNameW(s: Socket, nodename: Pcwstr, servicename: Pcwstr, localaddresslength: COpaquePointer?, localaddress: COpaquePointer?, remoteaddresslength: COpaquePointer?, remoteaddress: COpaquePointer?, timeout: COpaquePointer?, reserved: COpaquePointer?): Bool =
    windowssys_windows_win32_networking_winsock_wSAConnectByNameW(s, nodename?.value?.toCPointer<ByteVar>(), servicename?.value?.toCPointer<ByteVar>(), localaddresslength?.value?.toCPointer<ByteVar>(), localaddress?.value?.toCPointer<ByteVar>(), remoteaddresslength?.value?.toCPointer<ByteVar>(), remoteaddress?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>(), reserved?.value?.toCPointer<ByteVar>())

public actual fun wSACreateEvent(): Wsaevent =
    windowssys_windows_win32_networking_winsock_wSACreateEvent()

public actual fun wSADeleteSocketPeerTargetName(socket: Socket, peeraddr: COpaquePointer?, peeraddrlen: UInt, overlapped: COpaquePointer?, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    windowssys_windows_win32_networking_winsock_wSADeleteSocketPeerTargetName(socket, peeraddr?.value?.toCPointer<ByteVar>(), peeraddrlen, overlapped?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun wSADuplicateSocketA(s: Socket, dwprocessid: UInt, lpprotocolinfo: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSADuplicateSocketA(s, dwprocessid, lpprotocolinfo?.value?.toCPointer<ByteVar>())

public actual fun wSADuplicateSocketW(s: Socket, dwprocessid: UInt, lpprotocolinfo: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSADuplicateSocketW(s, dwprocessid, lpprotocolinfo?.value?.toCPointer<ByteVar>())

public actual fun wSAEnumNameSpaceProvidersA(lpdwbufferlength: COpaquePointer?, lpnspbuffer: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSAEnumNameSpaceProvidersA(lpdwbufferlength?.value?.toCPointer<ByteVar>(), lpnspbuffer?.value?.toCPointer<ByteVar>())

public actual fun wSAEnumNameSpaceProvidersExA(lpdwbufferlength: COpaquePointer?, lpnspbuffer: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSAEnumNameSpaceProvidersExA(lpdwbufferlength?.value?.toCPointer<ByteVar>(), lpnspbuffer?.value?.toCPointer<ByteVar>())

public actual fun wSAEnumNameSpaceProvidersExW(lpdwbufferlength: COpaquePointer?, lpnspbuffer: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSAEnumNameSpaceProvidersExW(lpdwbufferlength?.value?.toCPointer<ByteVar>(), lpnspbuffer?.value?.toCPointer<ByteVar>())

public actual fun wSAEnumNameSpaceProvidersW(lpdwbufferlength: COpaquePointer?, lpnspbuffer: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSAEnumNameSpaceProvidersW(lpdwbufferlength?.value?.toCPointer<ByteVar>(), lpnspbuffer?.value?.toCPointer<ByteVar>())

public actual fun wSAEnumNetworkEvents(s: Socket, heventobject: Wsaevent, lpnetworkevents: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSAEnumNetworkEvents(s, heventobject, lpnetworkevents?.value?.toCPointer<ByteVar>())

public actual fun wSAEnumProtocolsA(lpiprotocols: COpaquePointer?, lpprotocolbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSAEnumProtocolsA(lpiprotocols?.value?.toCPointer<ByteVar>(), lpprotocolbuffer?.value?.toCPointer<ByteVar>(), lpdwbufferlength?.value?.toCPointer<ByteVar>())

public actual fun wSAEnumProtocolsW(lpiprotocols: COpaquePointer?, lpprotocolbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSAEnumProtocolsW(lpiprotocols?.value?.toCPointer<ByteVar>(), lpprotocolbuffer?.value?.toCPointer<ByteVar>(), lpdwbufferlength?.value?.toCPointer<ByteVar>())

public actual fun wSAEventSelect(s: Socket, heventobject: Wsaevent, lnetworkevents: Int): Int =
    windowssys_windows_win32_networking_winsock_wSAEventSelect(s, heventobject, lnetworkevents)

public actual fun wSAGetLastError(): WsaError =
    windowssys_windows_win32_networking_winsock_wSAGetLastError()

public actual fun wSAGetOverlappedResult(s: Socket, lpoverlapped: COpaquePointer?, lpcbtransfer: COpaquePointer?, fwait: Bool, lpdwflags: COpaquePointer?): Bool =
    windowssys_windows_win32_networking_winsock_wSAGetOverlappedResult(s, lpoverlapped?.value?.toCPointer<ByteVar>(), lpcbtransfer?.value?.toCPointer<ByteVar>(), fwait, lpdwflags?.value?.toCPointer<ByteVar>())

public actual fun wSAGetQOSByName(s: Socket, lpqosname: COpaquePointer?, lpqos: COpaquePointer?): Bool =
    windowssys_windows_win32_networking_winsock_wSAGetQOSByName(s, lpqosname?.value?.toCPointer<ByteVar>(), lpqos?.value?.toCPointer<ByteVar>())

public actual fun wSAGetServiceClassInfoA(lpproviderid: COpaquePointer?, lpserviceclassid: COpaquePointer?, lpdwbufsize: COpaquePointer?, lpserviceclassinfo: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSAGetServiceClassInfoA(lpproviderid?.value?.toCPointer<ByteVar>(), lpserviceclassid?.value?.toCPointer<ByteVar>(), lpdwbufsize?.value?.toCPointer<ByteVar>(), lpserviceclassinfo?.value?.toCPointer<ByteVar>())

public actual fun wSAGetServiceClassInfoW(lpproviderid: COpaquePointer?, lpserviceclassid: COpaquePointer?, lpdwbufsize: COpaquePointer?, lpserviceclassinfo: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSAGetServiceClassInfoW(lpproviderid?.value?.toCPointer<ByteVar>(), lpserviceclassid?.value?.toCPointer<ByteVar>(), lpdwbufsize?.value?.toCPointer<ByteVar>(), lpserviceclassinfo?.value?.toCPointer<ByteVar>())

public actual fun wSAGetServiceClassNameByClassIdA(lpserviceclassid: COpaquePointer?, lpszserviceclassname: Pstr, lpdwbufferlength: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSAGetServiceClassNameByClassIdA(lpserviceclassid?.value?.toCPointer<ByteVar>(), lpszserviceclassname?.value?.toCPointer<ByteVar>(), lpdwbufferlength?.value?.toCPointer<ByteVar>())

public actual fun wSAGetServiceClassNameByClassIdW(lpserviceclassid: COpaquePointer?, lpszserviceclassname: Pwstr, lpdwbufferlength: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSAGetServiceClassNameByClassIdW(lpserviceclassid?.value?.toCPointer<ByteVar>(), lpszserviceclassname?.value?.toCPointer<ByteVar>(), lpdwbufferlength?.value?.toCPointer<ByteVar>())

public actual fun wSAHtonl(s: Socket, hostlong: UInt, lpnetlong: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSAHtonl(s, hostlong, lpnetlong?.value?.toCPointer<ByteVar>())

public actual fun wSAHtons(s: Socket, hostshort: UShort, lpnetshort: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSAHtons(s, hostshort, lpnetshort?.value?.toCPointer<ByteVar>())

public actual fun wSAImpersonateSocketPeer(socket: Socket, peeraddr: COpaquePointer?, peeraddrlen: UInt): Int =
    windowssys_windows_win32_networking_winsock_wSAImpersonateSocketPeer(socket, peeraddr?.value?.toCPointer<ByteVar>(), peeraddrlen)

public actual fun wSAInstallServiceClassA(lpserviceclassinfo: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSAInstallServiceClassA(lpserviceclassinfo?.value?.toCPointer<ByteVar>())

public actual fun wSAInstallServiceClassW(lpserviceclassinfo: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSAInstallServiceClassW(lpserviceclassinfo?.value?.toCPointer<ByteVar>())

public actual fun wSAIoctl(s: Socket, dwiocontrolcode: UInt, lpvinbuffer: COpaquePointer?, cbinbuffer: UInt, lpvoutbuffer: COpaquePointer?, cboutbuffer: UInt, lpcbbytesreturned: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    windowssys_windows_win32_networking_winsock_wSAIoctl(s, dwiocontrolcode, lpvinbuffer?.value?.toCPointer<ByteVar>(), cbinbuffer, lpvoutbuffer?.value?.toCPointer<ByteVar>(), cboutbuffer, lpcbbytesreturned?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun wSAIsBlocking(): Bool =
    windowssys_windows_win32_networking_winsock_wSAIsBlocking()

public actual fun wSAJoinLeaf(s: Socket, name: COpaquePointer?, namelen: Int, lpcallerdata: COpaquePointer?, lpcalleedata: COpaquePointer?, lpsqos: COpaquePointer?, lpgqos: COpaquePointer?, dwflags: UInt): Socket =
    windowssys_windows_win32_networking_winsock_wSAJoinLeaf(s, name?.value?.toCPointer<ByteVar>(), namelen, lpcallerdata?.value?.toCPointer<ByteVar>(), lpcalleedata?.value?.toCPointer<ByteVar>(), lpsqos?.value?.toCPointer<ByteVar>(), lpgqos?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun wSALookupServiceBeginA(lpqsrestrictions: COpaquePointer?, dwcontrolflags: UInt, lphlookup: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSALookupServiceBeginA(lpqsrestrictions?.value?.toCPointer<ByteVar>(), dwcontrolflags, lphlookup?.value?.toCPointer<ByteVar>())

public actual fun wSALookupServiceBeginW(lpqsrestrictions: COpaquePointer?, dwcontrolflags: UInt, lphlookup: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSALookupServiceBeginW(lpqsrestrictions?.value?.toCPointer<ByteVar>(), dwcontrolflags, lphlookup?.value?.toCPointer<ByteVar>())

public actual fun wSALookupServiceEnd(hlookup: Handle): Int =
    windowssys_windows_win32_networking_winsock_wSALookupServiceEnd(hlookup?.value?.toCPointer<ByteVar>())

public actual fun wSALookupServiceNextA(hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: COpaquePointer?, lpqsresults: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSALookupServiceNextA(hlookup?.value?.toCPointer<ByteVar>(), dwcontrolflags, lpdwbufferlength?.value?.toCPointer<ByteVar>(), lpqsresults?.value?.toCPointer<ByteVar>())

public actual fun wSALookupServiceNextW(hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: COpaquePointer?, lpqsresults: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSALookupServiceNextW(hlookup?.value?.toCPointer<ByteVar>(), dwcontrolflags, lpdwbufferlength?.value?.toCPointer<ByteVar>(), lpqsresults?.value?.toCPointer<ByteVar>())

public actual fun wSANSPIoctl(hlookup: Handle, dwcontrolcode: UInt, lpvinbuffer: COpaquePointer?, cbinbuffer: UInt, lpvoutbuffer: COpaquePointer?, cboutbuffer: UInt, lpcbbytesreturned: COpaquePointer?, lpcompletion: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSANSPIoctl(hlookup?.value?.toCPointer<ByteVar>(), dwcontrolcode, lpvinbuffer?.value?.toCPointer<ByteVar>(), cbinbuffer, lpvoutbuffer?.value?.toCPointer<ByteVar>(), cboutbuffer, lpcbbytesreturned?.value?.toCPointer<ByteVar>(), lpcompletion?.value?.toCPointer<ByteVar>())

public actual fun wSANtohl(s: Socket, netlong: UInt, lphostlong: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSANtohl(s, netlong, lphostlong?.value?.toCPointer<ByteVar>())

public actual fun wSANtohs(s: Socket, netshort: UShort, lphostshort: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSANtohs(s, netshort, lphostshort?.value?.toCPointer<ByteVar>())

public actual fun wSAPoll(fdarray: COpaquePointer?, fds: UInt, timeout: Int): Int =
    windowssys_windows_win32_networking_winsock_wSAPoll(fdarray?.value?.toCPointer<ByteVar>(), fds, timeout)

public actual fun wSAProviderCompleteAsyncCall(hasynccall: Handle, iretcode: Int): Int =
    windowssys_windows_win32_networking_winsock_wSAProviderCompleteAsyncCall(hasynccall?.value?.toCPointer<ByteVar>(), iretcode)

public actual fun wSAProviderConfigChange(lpnotificationhandle: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    windowssys_windows_win32_networking_winsock_wSAProviderConfigChange(lpnotificationhandle?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun wSAQuerySocketSecurity(socket: Socket, securityquerytemplate: COpaquePointer?, securityquerytemplatelen: UInt, securityqueryinfo: COpaquePointer?, securityqueryinfolen: COpaquePointer?, overlapped: COpaquePointer?, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    windowssys_windows_win32_networking_winsock_wSAQuerySocketSecurity(socket, securityquerytemplate?.value?.toCPointer<ByteVar>(), securityquerytemplatelen, securityqueryinfo?.value?.toCPointer<ByteVar>(), securityqueryinfolen?.value?.toCPointer<ByteVar>(), overlapped?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun wSARecv(s: Socket, lpbuffers: COpaquePointer?, dwbuffercount: UInt, lpnumberofbytesrecvd: COpaquePointer?, lpflags: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    windowssys_windows_win32_networking_winsock_wSARecv(s, lpbuffers?.value?.toCPointer<ByteVar>(), dwbuffercount, lpnumberofbytesrecvd?.value?.toCPointer<ByteVar>(), lpflags?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun wSARecvDisconnect(s: Socket, lpinbounddisconnectdata: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSARecvDisconnect(s, lpinbounddisconnectdata?.value?.toCPointer<ByteVar>())

public actual fun wSARecvEx(s: Socket, buf: Pstr, len: Int, flags: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSARecvEx(s, buf?.value?.toCPointer<ByteVar>(), len, flags?.value?.toCPointer<ByteVar>())

public actual fun wSARecvFrom(s: Socket, lpbuffers: COpaquePointer?, dwbuffercount: UInt, lpnumberofbytesrecvd: COpaquePointer?, lpflags: COpaquePointer?, lpfrom: COpaquePointer?, lpfromlen: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    windowssys_windows_win32_networking_winsock_wSARecvFrom(s, lpbuffers?.value?.toCPointer<ByteVar>(), dwbuffercount, lpnumberofbytesrecvd?.value?.toCPointer<ByteVar>(), lpflags?.value?.toCPointer<ByteVar>(), lpfrom?.value?.toCPointer<ByteVar>(), lpfromlen?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun wSARemoveServiceClass(lpserviceclassid: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSARemoveServiceClass(lpserviceclassid?.value?.toCPointer<ByteVar>())

public actual fun wSAResetEvent(hevent: Wsaevent): Bool =
    windowssys_windows_win32_networking_winsock_wSAResetEvent(hevent)

public actual fun wSARevertImpersonation(): Int =
    windowssys_windows_win32_networking_winsock_wSARevertImpersonation()

public actual fun wSASend(s: Socket, lpbuffers: COpaquePointer?, dwbuffercount: UInt, lpnumberofbytessent: COpaquePointer?, dwflags: UInt, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    windowssys_windows_win32_networking_winsock_wSASend(s, lpbuffers?.value?.toCPointer<ByteVar>(), dwbuffercount, lpnumberofbytessent?.value?.toCPointer<ByteVar>(), dwflags, lpoverlapped?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun wSASendDisconnect(s: Socket, lpoutbounddisconnectdata: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSASendDisconnect(s, lpoutbounddisconnectdata?.value?.toCPointer<ByteVar>())

public actual fun wSASendMsg(handle: Socket, lpmsg: COpaquePointer?, dwflags: UInt, lpnumberofbytessent: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    windowssys_windows_win32_networking_winsock_wSASendMsg(handle, lpmsg?.value?.toCPointer<ByteVar>(), dwflags, lpnumberofbytessent?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun wSASendTo(s: Socket, lpbuffers: COpaquePointer?, dwbuffercount: UInt, lpnumberofbytessent: COpaquePointer?, dwflags: UInt, lpto: COpaquePointer?, itolen: Int, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    windowssys_windows_win32_networking_winsock_wSASendTo(s, lpbuffers?.value?.toCPointer<ByteVar>(), dwbuffercount, lpnumberofbytessent?.value?.toCPointer<ByteVar>(), dwflags, lpto?.value?.toCPointer<ByteVar>(), itolen, lpoverlapped?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun wSASetBlockingHook(lpblockfunc: Farproc): Farproc =
    null

public actual fun wSASetEvent(hevent: Wsaevent): Bool =
    windowssys_windows_win32_networking_winsock_wSASetEvent(hevent)

public actual fun wSASetLastError(ierror: Int) {
    windowssys_windows_win32_networking_winsock_wSASetLastError(ierror)
}

public actual fun wSASetServiceA(lpqsreginfo: COpaquePointer?, essoperation: Wsaesetserviceop, dwcontrolflags: UInt): Int =
    windowssys_windows_win32_networking_winsock_wSASetServiceA(lpqsreginfo?.value?.toCPointer<ByteVar>(), essoperation, dwcontrolflags)

public actual fun wSASetServiceW(lpqsreginfo: COpaquePointer?, essoperation: Wsaesetserviceop, dwcontrolflags: UInt): Int =
    windowssys_windows_win32_networking_winsock_wSASetServiceW(lpqsreginfo?.value?.toCPointer<ByteVar>(), essoperation, dwcontrolflags)

public actual fun wSASetSocketPeerTargetName(socket: Socket, peertargetname: COpaquePointer?, peertargetnamelen: UInt, overlapped: COpaquePointer?, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    windowssys_windows_win32_networking_winsock_wSASetSocketPeerTargetName(socket, peertargetname?.value?.toCPointer<ByteVar>(), peertargetnamelen, overlapped?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun wSASetSocketSecurity(socket: Socket, securitysettings: COpaquePointer?, securitysettingslen: UInt, overlapped: COpaquePointer?, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    windowssys_windows_win32_networking_winsock_wSASetSocketSecurity(socket, securitysettings?.value?.toCPointer<ByteVar>(), securitysettingslen, overlapped?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun wSASocketA(af: Int, type: Int, protocol: Int, lpprotocolinfo: COpaquePointer?, g: UInt, dwflags: UInt): Socket =
    windowssys_windows_win32_networking_winsock_wSASocketA(af, type, protocol, lpprotocolinfo?.value?.toCPointer<ByteVar>(), g, dwflags)

public actual fun wSASocketW(af: Int, type: Int, protocol: Int, lpprotocolinfo: COpaquePointer?, g: UInt, dwflags: UInt): Socket =
    windowssys_windows_win32_networking_winsock_wSASocketW(af, type, protocol, lpprotocolinfo?.value?.toCPointer<ByteVar>(), g, dwflags)

public actual fun wSAStartup(wversionrequested: UShort, lpwsadata: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSAStartup(wversionrequested, lpwsadata?.value?.toCPointer<ByteVar>())

public actual fun wSAStringToAddressA(addressstring: Pcstr, addressfamily: Int, lpprotocolinfo: COpaquePointer?, lpaddress: COpaquePointer?, lpaddresslength: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSAStringToAddressA(addressstring?.value?.toCPointer<ByteVar>(), addressfamily, lpprotocolinfo?.value?.toCPointer<ByteVar>(), lpaddress?.value?.toCPointer<ByteVar>(), lpaddresslength?.value?.toCPointer<ByteVar>())

public actual fun wSAStringToAddressW(addressstring: Pcwstr, addressfamily: Int, lpprotocolinfo: COpaquePointer?, lpaddress: COpaquePointer?, lpaddresslength: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSAStringToAddressW(addressstring?.value?.toCPointer<ByteVar>(), addressfamily, lpprotocolinfo?.value?.toCPointer<ByteVar>(), lpaddress?.value?.toCPointer<ByteVar>(), lpaddresslength?.value?.toCPointer<ByteVar>())

public actual fun wSAUnadvertiseProvider(puuidproviderid: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSAUnadvertiseProvider(puuidproviderid?.value?.toCPointer<ByteVar>())

public actual fun wSAUnhookBlockingHook(): Int =
    windowssys_windows_win32_networking_winsock_wSAUnhookBlockingHook()

public actual fun wSAWaitForMultipleEvents(cevents: UInt, lphevents: COpaquePointer?, fwaitall: Bool, dwtimeout: UInt, falertable: Bool): WaitEvent =
    windowssys_windows_win32_networking_winsock_wSAWaitForMultipleEvents(cevents, lphevents?.value?.toCPointer<ByteVar>(), fwaitall, dwtimeout, falertable)

public actual fun wSCDeinstallProvider(lpproviderid: COpaquePointer?, lperrno: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSCDeinstallProvider(lpproviderid?.value?.toCPointer<ByteVar>(), lperrno?.value?.toCPointer<ByteVar>())

public actual fun wSCDeinstallProvider32(lpproviderid: COpaquePointer?, lperrno: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSCDeinstallProvider32(lpproviderid?.value?.toCPointer<ByteVar>(), lperrno?.value?.toCPointer<ByteVar>())

public actual fun wSCEnableNSProvider(lpproviderid: COpaquePointer?, fenable: Bool): Int =
    windowssys_windows_win32_networking_winsock_wSCEnableNSProvider(lpproviderid?.value?.toCPointer<ByteVar>(), fenable)

public actual fun wSCEnableNSProvider32(lpproviderid: COpaquePointer?, fenable: Bool): Int =
    windowssys_windows_win32_networking_winsock_wSCEnableNSProvider32(lpproviderid?.value?.toCPointer<ByteVar>(), fenable)

public actual fun wSCEnumNameSpaceProviders32(lpdwbufferlength: COpaquePointer?, lpnspbuffer: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSCEnumNameSpaceProviders32(lpdwbufferlength?.value?.toCPointer<ByteVar>(), lpnspbuffer?.value?.toCPointer<ByteVar>())

public actual fun wSCEnumNameSpaceProvidersEx32(lpdwbufferlength: COpaquePointer?, lpnspbuffer: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSCEnumNameSpaceProvidersEx32(lpdwbufferlength?.value?.toCPointer<ByteVar>(), lpnspbuffer?.value?.toCPointer<ByteVar>())

public actual fun wSCEnumProtocols(lpiprotocols: COpaquePointer?, lpprotocolbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lperrno: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSCEnumProtocols(lpiprotocols?.value?.toCPointer<ByteVar>(), lpprotocolbuffer?.value?.toCPointer<ByteVar>(), lpdwbufferlength?.value?.toCPointer<ByteVar>(), lperrno?.value?.toCPointer<ByteVar>())

public actual fun wSCEnumProtocols32(lpiprotocols: COpaquePointer?, lpprotocolbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lperrno: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSCEnumProtocols32(lpiprotocols?.value?.toCPointer<ByteVar>(), lpprotocolbuffer?.value?.toCPointer<ByteVar>(), lpdwbufferlength?.value?.toCPointer<ByteVar>(), lperrno?.value?.toCPointer<ByteVar>())

public actual fun wSCGetApplicationCategory(path: Pcwstr, pathlength: UInt, extra: Pcwstr, extralength: UInt, ppermittedlspcategories: COpaquePointer?, lperrno: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSCGetApplicationCategory(path?.value?.toCPointer<ByteVar>(), pathlength, extra?.value?.toCPointer<ByteVar>(), extralength, ppermittedlspcategories?.value?.toCPointer<ByteVar>(), lperrno?.value?.toCPointer<ByteVar>())

public actual fun wSCGetProviderInfo(lpproviderid: COpaquePointer?, infotype: WscProviderInfoType, info: COpaquePointer?, infosize: COpaquePointer?, flags: UInt, lperrno: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSCGetProviderInfo(lpproviderid?.value?.toCPointer<ByteVar>(), infotype, info?.value?.toCPointer<ByteVar>(), infosize?.value?.toCPointer<ByteVar>(), flags, lperrno?.value?.toCPointer<ByteVar>())

public actual fun wSCGetProviderInfo32(lpproviderid: COpaquePointer?, infotype: WscProviderInfoType, info: COpaquePointer?, infosize: COpaquePointer?, flags: UInt, lperrno: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSCGetProviderInfo32(lpproviderid?.value?.toCPointer<ByteVar>(), infotype, info?.value?.toCPointer<ByteVar>(), infosize?.value?.toCPointer<ByteVar>(), flags, lperrno?.value?.toCPointer<ByteVar>())

public actual fun wSCGetProviderPath(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: COpaquePointer?, lperrno: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSCGetProviderPath(lpproviderid?.value?.toCPointer<ByteVar>(), lpszproviderdllpath?.value?.toCPointer<ByteVar>(), lpproviderdllpathlen?.value?.toCPointer<ByteVar>(), lperrno?.value?.toCPointer<ByteVar>())

public actual fun wSCGetProviderPath32(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: COpaquePointer?, lperrno: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSCGetProviderPath32(lpproviderid?.value?.toCPointer<ByteVar>(), lpszproviderdllpath?.value?.toCPointer<ByteVar>(), lpproviderdllpathlen?.value?.toCPointer<ByteVar>(), lperrno?.value?.toCPointer<ByteVar>())

public actual fun wSCInstallNameSpace(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSCInstallNameSpace(lpszidentifier?.value?.toCPointer<ByteVar>(), lpszpathname?.value?.toCPointer<ByteVar>(), dwnamespace, dwversion, lpproviderid?.value?.toCPointer<ByteVar>())

public actual fun wSCInstallNameSpace32(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSCInstallNameSpace32(lpszidentifier?.value?.toCPointer<ByteVar>(), lpszpathname?.value?.toCPointer<ByteVar>(), dwnamespace, dwversion, lpproviderid?.value?.toCPointer<ByteVar>())

public actual fun wSCInstallNameSpaceEx(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: COpaquePointer?, lpproviderspecific: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSCInstallNameSpaceEx(lpszidentifier?.value?.toCPointer<ByteVar>(), lpszpathname?.value?.toCPointer<ByteVar>(), dwnamespace, dwversion, lpproviderid?.value?.toCPointer<ByteVar>(), lpproviderspecific?.value?.toCPointer<ByteVar>())

public actual fun wSCInstallNameSpaceEx32(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: COpaquePointer?, lpproviderspecific: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSCInstallNameSpaceEx32(lpszidentifier?.value?.toCPointer<ByteVar>(), lpszpathname?.value?.toCPointer<ByteVar>(), dwnamespace, dwversion, lpproviderid?.value?.toCPointer<ByteVar>(), lpproviderspecific?.value?.toCPointer<ByteVar>())

public actual fun wSCInstallProvider(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: COpaquePointer?, dwnumberofentries: UInt, lperrno: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSCInstallProvider(lpproviderid?.value?.toCPointer<ByteVar>(), lpszproviderdllpath?.value?.toCPointer<ByteVar>(), lpprotocolinfolist?.value?.toCPointer<ByteVar>(), dwnumberofentries, lperrno?.value?.toCPointer<ByteVar>())

public actual fun wscinstallProvider6432(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: COpaquePointer?, dwnumberofentries: UInt, lperrno: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wscinstallProvider6432(lpproviderid?.value?.toCPointer<ByteVar>(), lpszproviderdllpath?.value?.toCPointer<ByteVar>(), lpprotocolinfolist?.value?.toCPointer<ByteVar>(), dwnumberofentries, lperrno?.value?.toCPointer<ByteVar>())

public actual fun wscinstallProviderAndChains6432(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pcwstr, lpszproviderdllpath32: Pcwstr, lpszlspname: Pcwstr, dwserviceflags: UInt, lpprotocolinfolist: COpaquePointer?, dwnumberofentries: UInt, lpdwcatalogentryid: COpaquePointer?, lperrno: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wscinstallProviderAndChains6432(lpproviderid?.value?.toCPointer<ByteVar>(), lpszproviderdllpath?.value?.toCPointer<ByteVar>(), lpszproviderdllpath32?.value?.toCPointer<ByteVar>(), lpszlspname?.value?.toCPointer<ByteVar>(), dwserviceflags, lpprotocolinfolist?.value?.toCPointer<ByteVar>(), dwnumberofentries, lpdwcatalogentryid?.value?.toCPointer<ByteVar>(), lperrno?.value?.toCPointer<ByteVar>())

public actual fun wSCSetApplicationCategory(path: Pcwstr, pathlength: UInt, extra: Pcwstr, extralength: UInt, permittedlspcategories: UInt, pprevpermlspcat: COpaquePointer?, lperrno: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSCSetApplicationCategory(path?.value?.toCPointer<ByteVar>(), pathlength, extra?.value?.toCPointer<ByteVar>(), extralength, permittedlspcategories, pprevpermlspcat?.value?.toCPointer<ByteVar>(), lperrno?.value?.toCPointer<ByteVar>())

public actual fun wSCSetProviderInfo(lpproviderid: COpaquePointer?, infotype: WscProviderInfoType, info: COpaquePointer?, infosize: ULong, flags: UInt, lperrno: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSCSetProviderInfo(lpproviderid?.value?.toCPointer<ByteVar>(), infotype, info?.value?.toCPointer<ByteVar>(), infosize, flags, lperrno?.value?.toCPointer<ByteVar>())

public actual fun wSCSetProviderInfo32(lpproviderid: COpaquePointer?, infotype: WscProviderInfoType, info: COpaquePointer?, infosize: ULong, flags: UInt, lperrno: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSCSetProviderInfo32(lpproviderid?.value?.toCPointer<ByteVar>(), infotype, info?.value?.toCPointer<ByteVar>(), infosize, flags, lperrno?.value?.toCPointer<ByteVar>())

public actual fun wSCUnInstallNameSpace(lpproviderid: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSCUnInstallNameSpace(lpproviderid?.value?.toCPointer<ByteVar>())

public actual fun wSCUnInstallNameSpace32(lpproviderid: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSCUnInstallNameSpace32(lpproviderid?.value?.toCPointer<ByteVar>())

public actual fun wSCUpdateProvider(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: COpaquePointer?, dwnumberofentries: UInt, lperrno: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSCUpdateProvider(lpproviderid?.value?.toCPointer<ByteVar>(), lpszproviderdllpath?.value?.toCPointer<ByteVar>(), lpprotocolinfolist?.value?.toCPointer<ByteVar>(), dwnumberofentries, lperrno?.value?.toCPointer<ByteVar>())

public actual fun wSCUpdateProvider32(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: COpaquePointer?, dwnumberofentries: UInt, lperrno: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wSCUpdateProvider32(lpproviderid?.value?.toCPointer<ByteVar>(), lpszproviderdllpath?.value?.toCPointer<ByteVar>(), lpprotocolinfolist?.value?.toCPointer<ByteVar>(), dwnumberofentries, lperrno?.value?.toCPointer<ByteVar>())

public actual fun wSCWriteNameSpaceOrder(lpproviderid: COpaquePointer?, dwnumberofentries: UInt): Int =
    windowssys_windows_win32_networking_winsock_wSCWriteNameSpaceOrder(lpproviderid?.value?.toCPointer<ByteVar>(), dwnumberofentries)

public actual fun wSCWriteNameSpaceOrder32(lpproviderid: COpaquePointer?, dwnumberofentries: UInt): Int =
    windowssys_windows_win32_networking_winsock_wSCWriteNameSpaceOrder32(lpproviderid?.value?.toCPointer<ByteVar>(), dwnumberofentries)

public actual fun wSCWriteProviderOrder(lpwdcatalogentryid: COpaquePointer?, dwnumberofentries: UInt): Int =
    windowssys_windows_win32_networking_winsock_wSCWriteProviderOrder(lpwdcatalogentryid?.value?.toCPointer<ByteVar>(), dwnumberofentries)

public actual fun wSCWriteProviderOrder32(lpwdcatalogentryid: COpaquePointer?, dwnumberofentries: UInt): Int =
    windowssys_windows_win32_networking_winsock_wSCWriteProviderOrder32(lpwdcatalogentryid?.value?.toCPointer<ByteVar>(), dwnumberofentries)

public actual fun wsafdisSet(fd: Socket, param1: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_wsafdisSet(fd, param1?.value?.toCPointer<ByteVar>())

public actual fun accept(s: Socket, addr: COpaquePointer?, addrlen: COpaquePointer?): Socket =
    windowssys_windows_win32_networking_winsock_accept(s, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun bind(s: Socket, name: COpaquePointer?, namelen: Int): Int =
    windowssys_windows_win32_networking_winsock_bind(s, name?.value?.toCPointer<ByteVar>(), namelen)

public actual fun closesocket(s: Socket): Int =
    windowssys_windows_win32_networking_winsock_closesocket(s)

public actual fun connect(s: Socket, name: COpaquePointer?, namelen: Int): Int =
    windowssys_windows_win32_networking_winsock_connect(s, name?.value?.toCPointer<ByteVar>(), namelen)

public actual fun freeaddrinfo(paddrinfo: COpaquePointer?) {
    windowssys_windows_win32_networking_winsock_freeaddrinfo(paddrinfo?.value?.toCPointer<ByteVar>())
}

public actual fun getaddrinfo(pnodename: Pcstr, pservicename: Pcstr, phints: COpaquePointer?, ppresult: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_getaddrinfo(pnodename?.value?.toCPointer<ByteVar>(), pservicename?.value?.toCPointer<ByteVar>(), phints?.value?.toCPointer<ByteVar>(), ppresult?.value?.toCPointer<ByteVar>())

public actual fun gethostbyaddr(addr: Pcstr, len: Int, type: Int): COpaquePointer? =
    windowssys_windows_win32_networking_winsock_gethostbyaddr(addr?.value?.toCPointer<ByteVar>(), len, type)?.let { COpaquePointer(it.toLong()) }

public actual fun gethostbyname(name: Pcstr): COpaquePointer? =
    windowssys_windows_win32_networking_winsock_gethostbyname(name?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun gethostname(name: Pstr, namelen: Int): Int =
    windowssys_windows_win32_networking_winsock_gethostname(name?.value?.toCPointer<ByteVar>(), namelen)

public actual fun getnameinfo(psockaddr: COpaquePointer?, sockaddrlength: SocklenT, pnodebuffer: Pstr, nodebuffersize: UInt, pservicebuffer: Pstr, servicebuffersize: UInt, flags: Int): Int =
    windowssys_windows_win32_networking_winsock_getnameinfo(psockaddr?.value?.toCPointer<ByteVar>(), sockaddrlength, pnodebuffer?.value?.toCPointer<ByteVar>(), nodebuffersize, pservicebuffer?.value?.toCPointer<ByteVar>(), servicebuffersize, flags)

public actual fun getpeername(s: Socket, name: COpaquePointer?, namelen: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_getpeername(s, name?.value?.toCPointer<ByteVar>(), namelen?.value?.toCPointer<ByteVar>())

public actual fun getprotobyname(name: Pcstr): COpaquePointer? =
    windowssys_windows_win32_networking_winsock_getprotobyname(name?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getprotobynumber(number: Int): COpaquePointer? =
    windowssys_windows_win32_networking_winsock_getprotobynumber(number)?.let { COpaquePointer(it.toLong()) }

public actual fun getservbyname(name: Pcstr, proto: Pcstr): COpaquePointer? =
    windowssys_windows_win32_networking_winsock_getservbyname(name?.value?.toCPointer<ByteVar>(), proto?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getservbyport(port: Int, proto: Pcstr): COpaquePointer? =
    windowssys_windows_win32_networking_winsock_getservbyport(port, proto?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getsockname(s: Socket, name: COpaquePointer?, namelen: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_getsockname(s, name?.value?.toCPointer<ByteVar>(), namelen?.value?.toCPointer<ByteVar>())

public actual fun getsockopt(s: Socket, level: Int, optname: Int, optval: Pstr, optlen: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_getsockopt(s, level, optname, optval?.value?.toCPointer<ByteVar>(), optlen?.value?.toCPointer<ByteVar>())

public actual fun htonl(hostlong: UInt): UInt =
    windowssys_windows_win32_networking_winsock_htonl(hostlong)

public actual fun htons(hostshort: UShort): UShort =
    windowssys_windows_win32_networking_winsock_htons(hostshort)

public actual fun inetAddr(cp: Pcstr): UInt =
    windowssys_windows_win32_networking_winsock_inetAddr(cp?.value?.toCPointer<ByteVar>())

public actual fun inetNtoa(input: InAddr): Pstr =
    null

public actual fun inetNtop(family: Int, paddr: COpaquePointer?, pstringbuf: Pstr, stringbufsize: ULong): Pcstr =
    windowssys_windows_win32_networking_winsock_inetNtop(family, paddr?.value?.toCPointer<ByteVar>(), pstringbuf?.value?.toCPointer<ByteVar>(), stringbufsize)?.let { COpaquePointer(it.toLong()) }

public actual fun inetPton(family: Int, pszaddrstring: Pcstr, paddrbuf: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_inetPton(family, pszaddrstring?.value?.toCPointer<ByteVar>(), paddrbuf?.value?.toCPointer<ByteVar>())

public actual fun ioctlsocket(s: Socket, cmd: Int, argp: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_ioctlsocket(s, cmd, argp?.value?.toCPointer<ByteVar>())

public actual fun listen(s: Socket, backlog: Int): Int =
    windowssys_windows_win32_networking_winsock_listen(s, backlog)

public actual fun ntohl(netlong: UInt): UInt =
    windowssys_windows_win32_networking_winsock_ntohl(netlong)

public actual fun ntohs(netshort: UShort): UShort =
    windowssys_windows_win32_networking_winsock_ntohs(netshort)

public actual fun recv(s: Socket, buf: Pstr, len: Int, flags: SendRecvFlags): Int =
    windowssys_windows_win32_networking_winsock_recv(s, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun recvfrom(s: Socket, buf: Pstr, len: Int, flags: Int, from: COpaquePointer?, fromlen: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_recvfrom(s, buf?.value?.toCPointer<ByteVar>(), len, flags, from?.value?.toCPointer<ByteVar>(), fromlen?.value?.toCPointer<ByteVar>())

public actual fun select(nfds: Int, readfds: COpaquePointer?, writefds: COpaquePointer?, exceptfds: COpaquePointer?, timeout: COpaquePointer?): Int =
    windowssys_windows_win32_networking_winsock_select(nfds, readfds?.value?.toCPointer<ByteVar>(), writefds?.value?.toCPointer<ByteVar>(), exceptfds?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun send(s: Socket, buf: Pcstr, len: Int, flags: SendRecvFlags): Int =
    windowssys_windows_win32_networking_winsock_send(s, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun sendto(s: Socket, buf: Pcstr, len: Int, flags: Int, to: COpaquePointer?, tolen: Int): Int =
    windowssys_windows_win32_networking_winsock_sendto(s, buf?.value?.toCPointer<ByteVar>(), len, flags, to?.value?.toCPointer<ByteVar>(), tolen)

public actual fun setsockopt(s: Socket, level: Int, optname: Int, optval: Pcstr, optlen: Int): Int =
    windowssys_windows_win32_networking_winsock_setsockopt(s, level, optname, optval?.value?.toCPointer<ByteVar>(), optlen)

public actual fun shutdown(s: Socket, how: WinsockShutdownHow): Int =
    windowssys_windows_win32_networking_winsock_shutdown(s, how)

public actual fun socket(af: Int, type: WinsockSocketType, protocol: Int): Socket =
    windowssys_windows_win32_networking_winsock_socket(af, type, protocol)
