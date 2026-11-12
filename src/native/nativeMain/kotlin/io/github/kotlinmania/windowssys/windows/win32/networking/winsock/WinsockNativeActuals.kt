@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.winsock

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockAccept
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockAcceptEx
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockBind
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockClosesocket
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockConnect
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockEnumProtocolsA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockEnumProtocolsW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockFreeAddrInfoEx
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockFreeAddrInfoExW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockFreeAddrInfoW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockFreeaddrinfo
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockGetAcceptExSockaddrs
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockGetAddrInfoExA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockGetAddrInfoExCancel
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockGetAddrInfoExOverlappedResult
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockGetAddrInfoExW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockGetAddrInfoW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockGetAddressByNameA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockGetAddressByNameW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockGetHostNameW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockGetNameByTypeA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockGetNameByTypeW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockGetNameInfoW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockGetServiceA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockGetServiceW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockGetTypeByNameA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockGetTypeByNameW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockGetaddrinfo
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockGethostbyaddr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockGethostbyname
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockGethostname
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockGetnameinfo
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockGetpeername
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockGetprotobyname
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockGetprotobynumber
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockGetservbyname
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockGetservbyport
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockGetsockname
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockGetsockopt
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockHtonl
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockHtons
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockInetAddr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockInetNtop
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockInetNtopW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockInetPton
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockInetPtonW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockIoctlsocket
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockListen
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockNtohl
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockNtohs
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockProcessSocketNotifications
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockRecv
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockRecvfrom
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockRtlEthernetAddressToStringA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockRtlEthernetAddressToStringW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockRtlEthernetStringToAddressA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockRtlEthernetStringToAddressW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringExA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringExW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressExA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressExW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringExA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringExW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressExA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressExW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockSelect
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockSend
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockSendto
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockSetAddrInfoExA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockSetAddrInfoExW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockSetServiceA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockSetServiceW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockSetSocketMediaStreamingMode
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockSetsockopt
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockShutdown
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockSocket
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockTransmitFile
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWPUCompleteOverlappedRequest
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAAccept
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAAddressToStringA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAAddressToStringW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAAdvertiseProvider
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAAsyncGetHostByAddr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAAsyncGetHostByName
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAAsyncGetProtoByName
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAAsyncGetProtoByNumber
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAAsyncGetServByName
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAAsyncGetServByPort
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAAsyncSelect
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSACancelAsyncRequest
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSACancelBlockingCall
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSACleanup
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSACloseEvent
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAConnect
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAConnectByList
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAConnectByNameA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAConnectByNameW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSACreateEvent
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSADeleteSocketPeerTargetName
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSADuplicateSocketA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSADuplicateSocketW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersExA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersExW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAEnumNetworkEvents
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAEnumProtocolsA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAEnumProtocolsW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAEventSelect
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAGetLastError
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAGetOverlappedResult
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAGetQOSByName
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassInfoA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassInfoW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassNameByClassIdA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassNameByClassIdW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAHtonl
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAHtons
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAImpersonateSocketPeer
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAInstallServiceClassA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAInstallServiceClassW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAIoctl
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAIsBlocking
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAJoinLeaf
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSALookupServiceBeginA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSALookupServiceBeginW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSALookupServiceEnd
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSALookupServiceNextA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSALookupServiceNextW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSANSPIoctl
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSANtohl
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSANtohs
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAPoll
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAProviderCompleteAsyncCall
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAProviderConfigChange
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAQuerySocketSecurity
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSARecv
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSARecvDisconnect
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSARecvEx
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSARecvFrom
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSARemoveServiceClass
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAResetEvent
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSARevertImpersonation
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSASend
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSASendDisconnect
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSASendMsg
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSASendTo
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSASetEvent
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSASetLastError
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSASetServiceA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSASetServiceW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSASetSocketPeerTargetName
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSASetSocketSecurity
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSASocketA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSASocketW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAStartup
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAStringToAddressA
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAStringToAddressW
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAUnadvertiseProvider
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAUnhookBlockingHook
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSAWaitForMultipleEvents
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCDeinstallProvider
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCDeinstallProvider32
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCEnableNSProvider
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCEnableNSProvider32
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCEnumNameSpaceProviders32
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCEnumNameSpaceProvidersEx32
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCEnumProtocols
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCEnumProtocols32
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCGetApplicationCategory
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCGetProviderInfo
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCGetProviderInfo32
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCGetProviderPath
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCGetProviderPath32
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpace
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpace32
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpaceEx
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpaceEx32
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCInstallProvider
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCSetApplicationCategory
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCSetProviderInfo
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCSetProviderInfo32
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCUnInstallNameSpace
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCUnInstallNameSpace32
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCUpdateProvider
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCUpdateProvider32
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCWriteNameSpaceOrder
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCWriteNameSpaceOrder32
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCWriteProviderOrder
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWSCWriteProviderOrder32
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWsafdisSet
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWscinstallProvider6432
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssysWindowsWin32NetworkingWinsockWscinstallProviderAndChains6432
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun acceptEx(slistensocket: Socket, sacceptsocket: Socket, lpoutputbuffer: MutPtr, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, lpdwbytesreceived: MutPtr, lpoverlapped: MutPtr): Bool =
    windowssysWindowsWin32NetworkingWinsockAcceptEx(slistensocket, sacceptsocket, lpoutputbuffer.rawAddress.toCPointer<ByteVar>(), dwreceivedatalength, dwlocaladdresslength, dwremoteaddresslength, lpdwbytesreceived.rawAddress.toCPointer<ByteVar>(), lpoverlapped.rawAddress.toCPointer<ByteVar>())

public actual fun enumProtocolsA(lpiprotocols: ConstPtr, lpprotocolbuffer: MutPtr, lpdwbufferlength: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockEnumProtocolsA(lpiprotocols.rawAddress.toCPointer<ByteVar>(), lpprotocolbuffer.rawAddress.toCPointer<ByteVar>(), lpdwbufferlength.rawAddress.toCPointer<ByteVar>())

public actual fun enumProtocolsW(lpiprotocols: ConstPtr, lpprotocolbuffer: MutPtr, lpdwbufferlength: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockEnumProtocolsW(lpiprotocols.rawAddress.toCPointer<ByteVar>(), lpprotocolbuffer.rawAddress.toCPointer<ByteVar>(), lpdwbufferlength.rawAddress.toCPointer<ByteVar>())

public actual fun freeAddrInfoEx(paddrinfoex: ConstPtr) {
    windowssysWindowsWin32NetworkingWinsockFreeAddrInfoEx(paddrinfoex.rawAddress.toCPointer<ByteVar>())
}

public actual fun freeAddrInfoExW(paddrinfoex: ConstPtr) {
    windowssysWindowsWin32NetworkingWinsockFreeAddrInfoExW(paddrinfoex.rawAddress.toCPointer<ByteVar>())
}

public actual fun freeAddrInfoW(paddrinfo: ConstPtr) {
    windowssysWindowsWin32NetworkingWinsockFreeAddrInfoW(paddrinfo.rawAddress.toCPointer<ByteVar>())
}

public actual fun getAcceptExSockaddrs(lpoutputbuffer: ConstPtr, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, localsockaddr: MutPtr, localsockaddrlength: MutPtr, remotesockaddr: MutPtr, remotesockaddrlength: MutPtr) {
    windowssysWindowsWin32NetworkingWinsockGetAcceptExSockaddrs(lpoutputbuffer.rawAddress.toCPointer<ByteVar>(), dwreceivedatalength, dwlocaladdresslength, dwremoteaddresslength, localsockaddr.rawAddress.toCPointer<ByteVar>(), localsockaddrlength.rawAddress.toCPointer<ByteVar>(), remotesockaddr.rawAddress.toCPointer<ByteVar>(), remotesockaddrlength.rawAddress.toCPointer<ByteVar>())
}

public actual fun getAddrInfoExA(pname: Pcstr, pservicename: Pcstr, dwnamespace: UInt, lpnspid: ConstPtr, hints: ConstPtr, ppresult: MutPtr, timeout: ConstPtr, lpoverlapped: ConstPtr, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockGetAddrInfoExA(pname.rawAddress.toCPointer<ByteVar>(), pservicename.rawAddress.toCPointer<ByteVar>(), dwnamespace, lpnspid.rawAddress.toCPointer<ByteVar>(), hints.rawAddress.toCPointer<ByteVar>(), ppresult.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>(), lpoverlapped.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpnamehandle.rawAddress.toCPointer<ByteVar>())

public actual fun getAddrInfoExCancel(lphandle: ConstPtr): Int =
    windowssysWindowsWin32NetworkingWinsockGetAddrInfoExCancel(lphandle.rawAddress.toCPointer<ByteVar>())

public actual fun getAddrInfoExOverlappedResult(lpoverlapped: ConstPtr): Int =
    windowssysWindowsWin32NetworkingWinsockGetAddrInfoExOverlappedResult(lpoverlapped.rawAddress.toCPointer<ByteVar>())

public actual fun getAddrInfoExW(pname: Pcwstr, pservicename: Pcwstr, dwnamespace: UInt, lpnspid: ConstPtr, hints: ConstPtr, ppresult: MutPtr, timeout: ConstPtr, lpoverlapped: ConstPtr, lpcompletionroutine: LplookupserviceCompletionRoutine, lphandle: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockGetAddrInfoExW(pname.rawAddress.toCPointer<ByteVar>(), pservicename.rawAddress.toCPointer<ByteVar>(), dwnamespace, lpnspid.rawAddress.toCPointer<ByteVar>(), hints.rawAddress.toCPointer<ByteVar>(), ppresult.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>(), lpoverlapped.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lphandle.rawAddress.toCPointer<ByteVar>())

public actual fun getAddrInfoW(pnodename: Pcwstr, pservicename: Pcwstr, phints: ConstPtr, ppresult: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockGetAddrInfoW(pnodename.rawAddress.toCPointer<ByteVar>(), pservicename.rawAddress.toCPointer<ByteVar>(), phints.rawAddress.toCPointer<ByteVar>(), ppresult.rawAddress.toCPointer<ByteVar>())

public actual fun getAddressByNameA(dwnamespace: UInt, lpservicetype: ConstPtr, lpservicename: Pcstr, lpiprotocols: ConstPtr, dwresolution: UInt, lpserviceasyncinfo: ConstPtr, lpcsaddrbuffer: MutPtr, lpdwbufferlength: MutPtr, lpaliasbuffer: Pstr, lpdwaliasbufferlength: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockGetAddressByNameA(dwnamespace, lpservicetype.rawAddress.toCPointer<ByteVar>(), lpservicename.rawAddress.toCPointer<ByteVar>(), lpiprotocols.rawAddress.toCPointer<ByteVar>(), dwresolution, lpserviceasyncinfo.rawAddress.toCPointer<ByteVar>(), lpcsaddrbuffer.rawAddress.toCPointer<ByteVar>(), lpdwbufferlength.rawAddress.toCPointer<ByteVar>(), lpaliasbuffer.rawAddress.toCPointer<ByteVar>(), lpdwaliasbufferlength.rawAddress.toCPointer<ByteVar>())

public actual fun getAddressByNameW(dwnamespace: UInt, lpservicetype: ConstPtr, lpservicename: Pcwstr, lpiprotocols: ConstPtr, dwresolution: UInt, lpserviceasyncinfo: ConstPtr, lpcsaddrbuffer: MutPtr, lpdwbufferlength: MutPtr, lpaliasbuffer: Pwstr, lpdwaliasbufferlength: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockGetAddressByNameW(dwnamespace, lpservicetype.rawAddress.toCPointer<ByteVar>(), lpservicename.rawAddress.toCPointer<ByteVar>(), lpiprotocols.rawAddress.toCPointer<ByteVar>(), dwresolution, lpserviceasyncinfo.rawAddress.toCPointer<ByteVar>(), lpcsaddrbuffer.rawAddress.toCPointer<ByteVar>(), lpdwbufferlength.rawAddress.toCPointer<ByteVar>(), lpaliasbuffer.rawAddress.toCPointer<ByteVar>(), lpdwaliasbufferlength.rawAddress.toCPointer<ByteVar>())

public actual fun getHostNameW(name: Pwstr, namelen: Int): Int =
    windowssysWindowsWin32NetworkingWinsockGetHostNameW(name.rawAddress.toCPointer<ByteVar>(), namelen)

public actual fun getNameByTypeA(lpservicetype: ConstPtr, lpservicename: Pstr, dwnamelength: UInt): Int =
    windowssysWindowsWin32NetworkingWinsockGetNameByTypeA(lpservicetype.rawAddress.toCPointer<ByteVar>(), lpservicename.rawAddress.toCPointer<ByteVar>(), dwnamelength)

public actual fun getNameByTypeW(lpservicetype: ConstPtr, lpservicename: Pwstr, dwnamelength: UInt): Int =
    windowssysWindowsWin32NetworkingWinsockGetNameByTypeW(lpservicetype.rawAddress.toCPointer<ByteVar>(), lpservicename.rawAddress.toCPointer<ByteVar>(), dwnamelength)

public actual fun getNameInfoW(psockaddr: ConstPtr, sockaddrlength: SocklenT, pnodebuffer: Pwstr, nodebuffersize: UInt, pservicebuffer: Pwstr, servicebuffersize: UInt, flags: Int): Int =
    windowssysWindowsWin32NetworkingWinsockGetNameInfoW(psockaddr.rawAddress.toCPointer<ByteVar>(), sockaddrlength, pnodebuffer.rawAddress.toCPointer<ByteVar>(), nodebuffersize, pservicebuffer.rawAddress.toCPointer<ByteVar>(), servicebuffersize, flags)

public actual fun getServiceA(dwnamespace: UInt, lpguid: ConstPtr, lpservicename: Pcstr, dwproperties: UInt, lpbuffer: MutPtr, lpdwbuffersize: MutPtr, lpserviceasyncinfo: ConstPtr): Int =
    windowssysWindowsWin32NetworkingWinsockGetServiceA(dwnamespace, lpguid.rawAddress.toCPointer<ByteVar>(), lpservicename.rawAddress.toCPointer<ByteVar>(), dwproperties, lpbuffer.rawAddress.toCPointer<ByteVar>(), lpdwbuffersize.rawAddress.toCPointer<ByteVar>(), lpserviceasyncinfo.rawAddress.toCPointer<ByteVar>())

public actual fun getServiceW(dwnamespace: UInt, lpguid: ConstPtr, lpservicename: Pcwstr, dwproperties: UInt, lpbuffer: MutPtr, lpdwbuffersize: MutPtr, lpserviceasyncinfo: ConstPtr): Int =
    windowssysWindowsWin32NetworkingWinsockGetServiceW(dwnamespace, lpguid.rawAddress.toCPointer<ByteVar>(), lpservicename.rawAddress.toCPointer<ByteVar>(), dwproperties, lpbuffer.rawAddress.toCPointer<ByteVar>(), lpdwbuffersize.rawAddress.toCPointer<ByteVar>(), lpserviceasyncinfo.rawAddress.toCPointer<ByteVar>())

public actual fun getTypeByNameA(lpservicename: Pcstr, lpservicetype: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockGetTypeByNameA(lpservicename.rawAddress.toCPointer<ByteVar>(), lpservicetype.rawAddress.toCPointer<ByteVar>())

public actual fun getTypeByNameW(lpservicename: Pcwstr, lpservicetype: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockGetTypeByNameW(lpservicename.rawAddress.toCPointer<ByteVar>(), lpservicetype.rawAddress.toCPointer<ByteVar>())

public actual fun inetNtopW(family: Int, paddr: ConstPtr, pstringbuf: Pwstr, stringbufsize: ULong): Pcwstr =
    ConstPtr(windowssysWindowsWin32NetworkingWinsockInetNtopW(family, paddr.rawAddress.toCPointer<ByteVar>(), pstringbuf.rawAddress.toCPointer<ByteVar>(), stringbufsize)?.toLong() ?: 0L)

public actual fun inetPtonW(family: Int, pszaddrstring: Pcwstr, paddrbuf: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockInetPtonW(family, pszaddrstring.rawAddress.toCPointer<ByteVar>(), paddrbuf.rawAddress.toCPointer<ByteVar>())

public actual fun processSocketNotifications(completionport: Handle, registrationcount: UInt, registrationinfos: MutPtr, timeoutms: UInt, completioncount: UInt, completionportentries: MutPtr, receivedentrycount: MutPtr): UInt =
    windowssysWindowsWin32NetworkingWinsockProcessSocketNotifications(completionport.rawAddress.toCPointer<ByteVar>(), registrationcount, registrationinfos.rawAddress.toCPointer<ByteVar>(), timeoutms, completioncount, completionportentries.rawAddress.toCPointer<ByteVar>(), receivedentrycount.rawAddress.toCPointer<ByteVar>())

public actual fun rtlEthernetAddressToStringA(addr: ConstPtr, s: Pstr): Pstr =
    MutPtr(windowssysWindowsWin32NetworkingWinsockRtlEthernetAddressToStringA(addr.rawAddress.toCPointer<ByteVar>(), s.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun rtlEthernetAddressToStringW(addr: ConstPtr, s: Pwstr): Pwstr =
    MutPtr(windowssysWindowsWin32NetworkingWinsockRtlEthernetAddressToStringW(addr.rawAddress.toCPointer<ByteVar>(), s.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun rtlEthernetStringToAddressA(s: Pcstr, terminator: MutPtr, addr: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockRtlEthernetStringToAddressA(s.rawAddress.toCPointer<ByteVar>(), terminator.rawAddress.toCPointer<ByteVar>(), addr.rawAddress.toCPointer<ByteVar>())

public actual fun rtlEthernetStringToAddressW(s: Pcwstr, terminator: MutPtr, addr: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockRtlEthernetStringToAddressW(s.rawAddress.toCPointer<ByteVar>(), terminator.rawAddress.toCPointer<ByteVar>(), addr.rawAddress.toCPointer<ByteVar>())

public actual fun rtlIpv4AddressToStringA(addr: ConstPtr, s: Pstr): Pstr =
    MutPtr(windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringA(addr.rawAddress.toCPointer<ByteVar>(), s.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun rtlIpv4AddressToStringExA(address: ConstPtr, port: UShort, addressstring: Pstr, addressstringlength: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringExA(address.rawAddress.toCPointer<ByteVar>(), port, addressstring.rawAddress.toCPointer<ByteVar>(), addressstringlength.rawAddress.toCPointer<ByteVar>())

public actual fun rtlIpv4AddressToStringExW(address: ConstPtr, port: UShort, addressstring: Pwstr, addressstringlength: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringExW(address.rawAddress.toCPointer<ByteVar>(), port, addressstring.rawAddress.toCPointer<ByteVar>(), addressstringlength.rawAddress.toCPointer<ByteVar>())

public actual fun rtlIpv4AddressToStringW(addr: ConstPtr, s: Pwstr): Pwstr =
    MutPtr(windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringW(addr.rawAddress.toCPointer<ByteVar>(), s.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun rtlIpv4StringToAddressA(s: Pcstr, strict: Boolean, terminator: MutPtr, addr: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressA(s.rawAddress.toCPointer<ByteVar>(), strict, terminator.rawAddress.toCPointer<ByteVar>(), addr.rawAddress.toCPointer<ByteVar>())

public actual fun rtlIpv4StringToAddressExA(addressstring: Pcstr, strict: Boolean, address: MutPtr, port: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressExA(addressstring.rawAddress.toCPointer<ByteVar>(), strict, address.rawAddress.toCPointer<ByteVar>(), port.rawAddress.toCPointer<ByteVar>())

public actual fun rtlIpv4StringToAddressExW(addressstring: Pcwstr, strict: Boolean, address: MutPtr, port: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressExW(addressstring.rawAddress.toCPointer<ByteVar>(), strict, address.rawAddress.toCPointer<ByteVar>(), port.rawAddress.toCPointer<ByteVar>())

public actual fun rtlIpv4StringToAddressW(s: Pcwstr, strict: Boolean, terminator: MutPtr, addr: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressW(s.rawAddress.toCPointer<ByteVar>(), strict, terminator.rawAddress.toCPointer<ByteVar>(), addr.rawAddress.toCPointer<ByteVar>())

public actual fun rtlIpv6AddressToStringA(addr: ConstPtr, s: Pstr): Pstr =
    MutPtr(windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringA(addr.rawAddress.toCPointer<ByteVar>(), s.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun rtlIpv6AddressToStringExA(address: ConstPtr, scopeid: UInt, port: UShort, addressstring: Pstr, addressstringlength: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringExA(address.rawAddress.toCPointer<ByteVar>(), scopeid, port, addressstring.rawAddress.toCPointer<ByteVar>(), addressstringlength.rawAddress.toCPointer<ByteVar>())

public actual fun rtlIpv6AddressToStringExW(address: ConstPtr, scopeid: UInt, port: UShort, addressstring: Pwstr, addressstringlength: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringExW(address.rawAddress.toCPointer<ByteVar>(), scopeid, port, addressstring.rawAddress.toCPointer<ByteVar>(), addressstringlength.rawAddress.toCPointer<ByteVar>())

public actual fun rtlIpv6AddressToStringW(addr: ConstPtr, s: Pwstr): Pwstr =
    MutPtr(windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringW(addr.rawAddress.toCPointer<ByteVar>(), s.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun rtlIpv6StringToAddressA(s: Pcstr, terminator: MutPtr, addr: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressA(s.rawAddress.toCPointer<ByteVar>(), terminator.rawAddress.toCPointer<ByteVar>(), addr.rawAddress.toCPointer<ByteVar>())

public actual fun rtlIpv6StringToAddressExA(addressstring: Pcstr, address: MutPtr, scopeid: MutPtr, port: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressExA(addressstring.rawAddress.toCPointer<ByteVar>(), address.rawAddress.toCPointer<ByteVar>(), scopeid.rawAddress.toCPointer<ByteVar>(), port.rawAddress.toCPointer<ByteVar>())

public actual fun rtlIpv6StringToAddressExW(addressstring: Pcwstr, address: MutPtr, scopeid: MutPtr, port: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressExW(addressstring.rawAddress.toCPointer<ByteVar>(), address.rawAddress.toCPointer<ByteVar>(), scopeid.rawAddress.toCPointer<ByteVar>(), port.rawAddress.toCPointer<ByteVar>())

public actual fun rtlIpv6StringToAddressW(s: Pcwstr, terminator: MutPtr, addr: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressW(s.rawAddress.toCPointer<ByteVar>(), terminator.rawAddress.toCPointer<ByteVar>(), addr.rawAddress.toCPointer<ByteVar>())

public actual fun setAddrInfoExA(pname: Pcstr, pservicename: Pcstr, paddresses: ConstPtr, dwaddresscount: UInt, lpblob: ConstPtr, dwflags: UInt, dwnamespace: UInt, lpnspid: ConstPtr, timeout: ConstPtr, lpoverlapped: ConstPtr, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockSetAddrInfoExA(pname.rawAddress.toCPointer<ByteVar>(), pservicename.rawAddress.toCPointer<ByteVar>(), paddresses.rawAddress.toCPointer<ByteVar>(), dwaddresscount, lpblob.rawAddress.toCPointer<ByteVar>(), dwflags, dwnamespace, lpnspid.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>(), lpoverlapped.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpnamehandle.rawAddress.toCPointer<ByteVar>())

public actual fun setAddrInfoExW(pname: Pcwstr, pservicename: Pcwstr, paddresses: ConstPtr, dwaddresscount: UInt, lpblob: ConstPtr, dwflags: UInt, dwnamespace: UInt, lpnspid: ConstPtr, timeout: ConstPtr, lpoverlapped: ConstPtr, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockSetAddrInfoExW(pname.rawAddress.toCPointer<ByteVar>(), pservicename.rawAddress.toCPointer<ByteVar>(), paddresses.rawAddress.toCPointer<ByteVar>(), dwaddresscount, lpblob.rawAddress.toCPointer<ByteVar>(), dwflags, dwnamespace, lpnspid.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>(), lpoverlapped.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpnamehandle.rawAddress.toCPointer<ByteVar>())

public actual fun setServiceA(dwnamespace: UInt, dwoperation: SetServiceOperation, dwflags: UInt, lpserviceinfo: ConstPtr, lpserviceasyncinfo: ConstPtr, lpdwstatusflags: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockSetServiceA(dwnamespace, dwoperation, dwflags, lpserviceinfo.rawAddress.toCPointer<ByteVar>(), lpserviceasyncinfo.rawAddress.toCPointer<ByteVar>(), lpdwstatusflags.rawAddress.toCPointer<ByteVar>())

public actual fun setServiceW(dwnamespace: UInt, dwoperation: SetServiceOperation, dwflags: UInt, lpserviceinfo: ConstPtr, lpserviceasyncinfo: ConstPtr, lpdwstatusflags: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockSetServiceW(dwnamespace, dwoperation, dwflags, lpserviceinfo.rawAddress.toCPointer<ByteVar>(), lpserviceasyncinfo.rawAddress.toCPointer<ByteVar>(), lpdwstatusflags.rawAddress.toCPointer<ByteVar>())

public actual fun setSocketMediaStreamingMode(value: Bool): Hresult =
    windowssysWindowsWin32NetworkingWinsockSetSocketMediaStreamingMode(value)

public actual fun transmitFile(hsocket: Socket, hfile: Handle, nnumberofbytestowrite: UInt, nnumberofbytespersend: UInt, lpoverlapped: MutPtr, lptransmitbuffers: ConstPtr, dwreserved: UInt): Bool =
    windowssysWindowsWin32NetworkingWinsockTransmitFile(hsocket, hfile.rawAddress.toCPointer<ByteVar>(), nnumberofbytestowrite, nnumberofbytespersend, lpoverlapped.rawAddress.toCPointer<ByteVar>(), lptransmitbuffers.rawAddress.toCPointer<ByteVar>(), dwreserved)

public actual fun wPUCompleteOverlappedRequest(s: Socket, lpoverlapped: MutPtr, dwerror: UInt, cbtransferred: UInt, lperrno: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWPUCompleteOverlappedRequest(s, lpoverlapped.rawAddress.toCPointer<ByteVar>(), dwerror, cbtransferred, lperrno.rawAddress.toCPointer<ByteVar>())

public actual fun wSAAccept(s: Socket, addr: MutPtr, addrlen: MutPtr, lpfncondition: Lpconditionproc, dwcallbackdata: ULong): Socket =
    windowssysWindowsWin32NetworkingWinsockWSAAccept(s, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwcallbackdata)

public actual fun wSAAddressToStringA(lpsaaddress: ConstPtr, dwaddresslength: UInt, lpprotocolinfo: ConstPtr, lpszaddressstring: Pstr, lpdwaddressstringlength: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSAAddressToStringA(lpsaaddress.rawAddress.toCPointer<ByteVar>(), dwaddresslength, lpprotocolinfo.rawAddress.toCPointer<ByteVar>(), lpszaddressstring.rawAddress.toCPointer<ByteVar>(), lpdwaddressstringlength.rawAddress.toCPointer<ByteVar>())

public actual fun wSAAddressToStringW(lpsaaddress: ConstPtr, dwaddresslength: UInt, lpprotocolinfo: ConstPtr, lpszaddressstring: Pwstr, lpdwaddressstringlength: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSAAddressToStringW(lpsaaddress.rawAddress.toCPointer<ByteVar>(), dwaddresslength, lpprotocolinfo.rawAddress.toCPointer<ByteVar>(), lpszaddressstring.rawAddress.toCPointer<ByteVar>(), lpdwaddressstringlength.rawAddress.toCPointer<ByteVar>())

public actual fun wSAAdvertiseProvider(puuidproviderid: ConstPtr, pnspv2routine: ConstPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSAAdvertiseProvider(puuidproviderid.rawAddress.toCPointer<ByteVar>(), pnspv2routine.rawAddress.toCPointer<ByteVar>())

public actual fun wSAAsyncGetHostByAddr(hwnd: Hwnd, wmsg: UInt, addr: Pcstr, len: Int, type: Int, buf: Pstr, buflen: Int): Handle =
    MutPtr(windowssysWindowsWin32NetworkingWinsockWSAAsyncGetHostByAddr(hwnd.rawAddress.toCPointer<ByteVar>(), wmsg, addr.rawAddress.toCPointer<ByteVar>(), len, type, buf.rawAddress.toCPointer<ByteVar>(), buflen)?.toLong() ?: 0L)

public actual fun wSAAsyncGetHostByName(hwnd: Hwnd, wmsg: UInt, name: Pcstr, buf: Pstr, buflen: Int): Handle =
    MutPtr(windowssysWindowsWin32NetworkingWinsockWSAAsyncGetHostByName(hwnd.rawAddress.toCPointer<ByteVar>(), wmsg, name.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen)?.toLong() ?: 0L)

public actual fun wSAAsyncGetProtoByName(hwnd: Hwnd, wmsg: UInt, name: Pcstr, buf: Pstr, buflen: Int): Handle =
    MutPtr(windowssysWindowsWin32NetworkingWinsockWSAAsyncGetProtoByName(hwnd.rawAddress.toCPointer<ByteVar>(), wmsg, name.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen)?.toLong() ?: 0L)

public actual fun wSAAsyncGetProtoByNumber(hwnd: Hwnd, wmsg: UInt, number: Int, buf: Pstr, buflen: Int): Handle =
    MutPtr(windowssysWindowsWin32NetworkingWinsockWSAAsyncGetProtoByNumber(hwnd.rawAddress.toCPointer<ByteVar>(), wmsg, number, buf.rawAddress.toCPointer<ByteVar>(), buflen)?.toLong() ?: 0L)

public actual fun wSAAsyncGetServByName(hwnd: Hwnd, wmsg: UInt, name: Pcstr, proto: Pcstr, buf: Pstr, buflen: Int): Handle =
    MutPtr(windowssysWindowsWin32NetworkingWinsockWSAAsyncGetServByName(hwnd.rawAddress.toCPointer<ByteVar>(), wmsg, name.rawAddress.toCPointer<ByteVar>(), proto.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen)?.toLong() ?: 0L)

public actual fun wSAAsyncGetServByPort(hwnd: Hwnd, wmsg: UInt, port: Int, proto: Pcstr, buf: Pstr, buflen: Int): Handle =
    MutPtr(windowssysWindowsWin32NetworkingWinsockWSAAsyncGetServByPort(hwnd.rawAddress.toCPointer<ByteVar>(), wmsg, port, proto.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen)?.toLong() ?: 0L)

public actual fun wSAAsyncSelect(s: Socket, hwnd: Hwnd, wmsg: UInt, levent: Int): Int =
    windowssysWindowsWin32NetworkingWinsockWSAAsyncSelect(s, hwnd.rawAddress.toCPointer<ByteVar>(), wmsg, levent)

public actual fun wSACancelAsyncRequest(hasynctaskhandle: Handle): Int =
    windowssysWindowsWin32NetworkingWinsockWSACancelAsyncRequest(hasynctaskhandle.rawAddress.toCPointer<ByteVar>())

public actual fun wSACancelBlockingCall(): Int =
    windowssysWindowsWin32NetworkingWinsockWSACancelBlockingCall()

public actual fun wSACleanup(): Int =
    windowssysWindowsWin32NetworkingWinsockWSACleanup()

public actual fun wSACloseEvent(hevent: Wsaevent): Bool =
    windowssysWindowsWin32NetworkingWinsockWSACloseEvent(hevent)

public actual fun wSAConnect(s: Socket, name: ConstPtr, namelen: Int, lpcallerdata: ConstPtr, lpcalleedata: MutPtr, lpsqos: ConstPtr, lpgqos: ConstPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSAConnect(s, name.rawAddress.toCPointer<ByteVar>(), namelen, lpcallerdata.rawAddress.toCPointer<ByteVar>(), lpcalleedata.rawAddress.toCPointer<ByteVar>(), lpsqos.rawAddress.toCPointer<ByteVar>(), lpgqos.rawAddress.toCPointer<ByteVar>())

public actual fun wSAConnectByList(s: Socket, socketaddress: ConstPtr, localaddresslength: MutPtr, localaddress: MutPtr, remoteaddresslength: MutPtr, remoteaddress: MutPtr, timeout: ConstPtr, reserved: ConstPtr): Bool =
    windowssysWindowsWin32NetworkingWinsockWSAConnectByList(s, socketaddress.rawAddress.toCPointer<ByteVar>(), localaddresslength.rawAddress.toCPointer<ByteVar>(), localaddress.rawAddress.toCPointer<ByteVar>(), remoteaddresslength.rawAddress.toCPointer<ByteVar>(), remoteaddress.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>(), reserved.rawAddress.toCPointer<ByteVar>())

public actual fun wSAConnectByNameA(s: Socket, nodename: Pcstr, servicename: Pcstr, localaddresslength: MutPtr, localaddress: MutPtr, remoteaddresslength: MutPtr, remoteaddress: MutPtr, timeout: ConstPtr, reserved: ConstPtr): Bool =
    windowssysWindowsWin32NetworkingWinsockWSAConnectByNameA(s, nodename.rawAddress.toCPointer<ByteVar>(), servicename.rawAddress.toCPointer<ByteVar>(), localaddresslength.rawAddress.toCPointer<ByteVar>(), localaddress.rawAddress.toCPointer<ByteVar>(), remoteaddresslength.rawAddress.toCPointer<ByteVar>(), remoteaddress.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>(), reserved.rawAddress.toCPointer<ByteVar>())

public actual fun wSAConnectByNameW(s: Socket, nodename: Pcwstr, servicename: Pcwstr, localaddresslength: MutPtr, localaddress: MutPtr, remoteaddresslength: MutPtr, remoteaddress: MutPtr, timeout: ConstPtr, reserved: ConstPtr): Bool =
    windowssysWindowsWin32NetworkingWinsockWSAConnectByNameW(s, nodename.rawAddress.toCPointer<ByteVar>(), servicename.rawAddress.toCPointer<ByteVar>(), localaddresslength.rawAddress.toCPointer<ByteVar>(), localaddress.rawAddress.toCPointer<ByteVar>(), remoteaddresslength.rawAddress.toCPointer<ByteVar>(), remoteaddress.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>(), reserved.rawAddress.toCPointer<ByteVar>())

public actual fun wSACreateEvent(): Wsaevent =
    windowssysWindowsWin32NetworkingWinsockWSACreateEvent()

public actual fun wSADeleteSocketPeerTargetName(socket: Socket, peeraddr: ConstPtr, peeraddrlen: UInt, overlapped: ConstPtr, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    windowssysWindowsWin32NetworkingWinsockWSADeleteSocketPeerTargetName(socket, peeraddr.rawAddress.toCPointer<ByteVar>(), peeraddrlen, overlapped.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun wSADuplicateSocketA(s: Socket, dwprocessid: UInt, lpprotocolinfo: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSADuplicateSocketA(s, dwprocessid, lpprotocolinfo.rawAddress.toCPointer<ByteVar>())

public actual fun wSADuplicateSocketW(s: Socket, dwprocessid: UInt, lpprotocolinfo: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSADuplicateSocketW(s, dwprocessid, lpprotocolinfo.rawAddress.toCPointer<ByteVar>())

public actual fun wSAEnumNameSpaceProvidersA(lpdwbufferlength: MutPtr, lpnspbuffer: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersA(lpdwbufferlength.rawAddress.toCPointer<ByteVar>(), lpnspbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun wSAEnumNameSpaceProvidersExA(lpdwbufferlength: MutPtr, lpnspbuffer: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersExA(lpdwbufferlength.rawAddress.toCPointer<ByteVar>(), lpnspbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun wSAEnumNameSpaceProvidersExW(lpdwbufferlength: MutPtr, lpnspbuffer: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersExW(lpdwbufferlength.rawAddress.toCPointer<ByteVar>(), lpnspbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun wSAEnumNameSpaceProvidersW(lpdwbufferlength: MutPtr, lpnspbuffer: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersW(lpdwbufferlength.rawAddress.toCPointer<ByteVar>(), lpnspbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun wSAEnumNetworkEvents(s: Socket, heventobject: Wsaevent, lpnetworkevents: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSAEnumNetworkEvents(s, heventobject, lpnetworkevents.rawAddress.toCPointer<ByteVar>())

public actual fun wSAEnumProtocolsA(lpiprotocols: ConstPtr, lpprotocolbuffer: MutPtr, lpdwbufferlength: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSAEnumProtocolsA(lpiprotocols.rawAddress.toCPointer<ByteVar>(), lpprotocolbuffer.rawAddress.toCPointer<ByteVar>(), lpdwbufferlength.rawAddress.toCPointer<ByteVar>())

public actual fun wSAEnumProtocolsW(lpiprotocols: ConstPtr, lpprotocolbuffer: MutPtr, lpdwbufferlength: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSAEnumProtocolsW(lpiprotocols.rawAddress.toCPointer<ByteVar>(), lpprotocolbuffer.rawAddress.toCPointer<ByteVar>(), lpdwbufferlength.rawAddress.toCPointer<ByteVar>())

public actual fun wSAEventSelect(s: Socket, heventobject: Wsaevent, lnetworkevents: Int): Int =
    windowssysWindowsWin32NetworkingWinsockWSAEventSelect(s, heventobject, lnetworkevents)

public actual fun wSAGetLastError(): WsaError =
    windowssysWindowsWin32NetworkingWinsockWSAGetLastError()

public actual fun wSAGetOverlappedResult(s: Socket, lpoverlapped: ConstPtr, lpcbtransfer: MutPtr, fwait: Bool, lpdwflags: MutPtr): Bool =
    windowssysWindowsWin32NetworkingWinsockWSAGetOverlappedResult(s, lpoverlapped.rawAddress.toCPointer<ByteVar>(), lpcbtransfer.rawAddress.toCPointer<ByteVar>(), fwait, lpdwflags.rawAddress.toCPointer<ByteVar>())

public actual fun wSAGetQOSByName(s: Socket, lpqosname: ConstPtr, lpqos: MutPtr): Bool =
    windowssysWindowsWin32NetworkingWinsockWSAGetQOSByName(s, lpqosname.rawAddress.toCPointer<ByteVar>(), lpqos.rawAddress.toCPointer<ByteVar>())

public actual fun wSAGetServiceClassInfoA(lpproviderid: ConstPtr, lpserviceclassid: ConstPtr, lpdwbufsize: MutPtr, lpserviceclassinfo: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassInfoA(lpproviderid.rawAddress.toCPointer<ByteVar>(), lpserviceclassid.rawAddress.toCPointer<ByteVar>(), lpdwbufsize.rawAddress.toCPointer<ByteVar>(), lpserviceclassinfo.rawAddress.toCPointer<ByteVar>())

public actual fun wSAGetServiceClassInfoW(lpproviderid: ConstPtr, lpserviceclassid: ConstPtr, lpdwbufsize: MutPtr, lpserviceclassinfo: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassInfoW(lpproviderid.rawAddress.toCPointer<ByteVar>(), lpserviceclassid.rawAddress.toCPointer<ByteVar>(), lpdwbufsize.rawAddress.toCPointer<ByteVar>(), lpserviceclassinfo.rawAddress.toCPointer<ByteVar>())

public actual fun wSAGetServiceClassNameByClassIdA(lpserviceclassid: ConstPtr, lpszserviceclassname: Pstr, lpdwbufferlength: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassNameByClassIdA(lpserviceclassid.rawAddress.toCPointer<ByteVar>(), lpszserviceclassname.rawAddress.toCPointer<ByteVar>(), lpdwbufferlength.rawAddress.toCPointer<ByteVar>())

public actual fun wSAGetServiceClassNameByClassIdW(lpserviceclassid: ConstPtr, lpszserviceclassname: Pwstr, lpdwbufferlength: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassNameByClassIdW(lpserviceclassid.rawAddress.toCPointer<ByteVar>(), lpszserviceclassname.rawAddress.toCPointer<ByteVar>(), lpdwbufferlength.rawAddress.toCPointer<ByteVar>())

public actual fun wSAHtonl(s: Socket, hostlong: UInt, lpnetlong: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSAHtonl(s, hostlong, lpnetlong.rawAddress.toCPointer<ByteVar>())

public actual fun wSAHtons(s: Socket, hostshort: UShort, lpnetshort: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSAHtons(s, hostshort, lpnetshort.rawAddress.toCPointer<ByteVar>())

public actual fun wSAImpersonateSocketPeer(socket: Socket, peeraddr: ConstPtr, peeraddrlen: UInt): Int =
    windowssysWindowsWin32NetworkingWinsockWSAImpersonateSocketPeer(socket, peeraddr.rawAddress.toCPointer<ByteVar>(), peeraddrlen)

public actual fun wSAInstallServiceClassA(lpserviceclassinfo: ConstPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSAInstallServiceClassA(lpserviceclassinfo.rawAddress.toCPointer<ByteVar>())

public actual fun wSAInstallServiceClassW(lpserviceclassinfo: ConstPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSAInstallServiceClassW(lpserviceclassinfo.rawAddress.toCPointer<ByteVar>())

public actual fun wSAIoctl(s: Socket, dwiocontrolcode: UInt, lpvinbuffer: ConstPtr, cbinbuffer: UInt, lpvoutbuffer: MutPtr, cboutbuffer: UInt, lpcbbytesreturned: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    windowssysWindowsWin32NetworkingWinsockWSAIoctl(s, dwiocontrolcode, lpvinbuffer.rawAddress.toCPointer<ByteVar>(), cbinbuffer, lpvoutbuffer.rawAddress.toCPointer<ByteVar>(), cboutbuffer, lpcbbytesreturned.rawAddress.toCPointer<ByteVar>(), lpoverlapped.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun wSAIsBlocking(): Bool =
    windowssysWindowsWin32NetworkingWinsockWSAIsBlocking()

public actual fun wSAJoinLeaf(s: Socket, name: ConstPtr, namelen: Int, lpcallerdata: ConstPtr, lpcalleedata: MutPtr, lpsqos: ConstPtr, lpgqos: ConstPtr, dwflags: UInt): Socket =
    windowssysWindowsWin32NetworkingWinsockWSAJoinLeaf(s, name.rawAddress.toCPointer<ByteVar>(), namelen, lpcallerdata.rawAddress.toCPointer<ByteVar>(), lpcalleedata.rawAddress.toCPointer<ByteVar>(), lpsqos.rawAddress.toCPointer<ByteVar>(), lpgqos.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun wSALookupServiceBeginA(lpqsrestrictions: ConstPtr, dwcontrolflags: UInt, lphlookup: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSALookupServiceBeginA(lpqsrestrictions.rawAddress.toCPointer<ByteVar>(), dwcontrolflags, lphlookup.rawAddress.toCPointer<ByteVar>())

public actual fun wSALookupServiceBeginW(lpqsrestrictions: ConstPtr, dwcontrolflags: UInt, lphlookup: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSALookupServiceBeginW(lpqsrestrictions.rawAddress.toCPointer<ByteVar>(), dwcontrolflags, lphlookup.rawAddress.toCPointer<ByteVar>())

public actual fun wSALookupServiceEnd(hlookup: Handle): Int =
    windowssysWindowsWin32NetworkingWinsockWSALookupServiceEnd(hlookup.rawAddress.toCPointer<ByteVar>())

public actual fun wSALookupServiceNextA(hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: MutPtr, lpqsresults: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSALookupServiceNextA(hlookup.rawAddress.toCPointer<ByteVar>(), dwcontrolflags, lpdwbufferlength.rawAddress.toCPointer<ByteVar>(), lpqsresults.rawAddress.toCPointer<ByteVar>())

public actual fun wSALookupServiceNextW(hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: MutPtr, lpqsresults: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSALookupServiceNextW(hlookup.rawAddress.toCPointer<ByteVar>(), dwcontrolflags, lpdwbufferlength.rawAddress.toCPointer<ByteVar>(), lpqsresults.rawAddress.toCPointer<ByteVar>())

public actual fun wSANSPIoctl(hlookup: Handle, dwcontrolcode: UInt, lpvinbuffer: ConstPtr, cbinbuffer: UInt, lpvoutbuffer: MutPtr, cboutbuffer: UInt, lpcbbytesreturned: MutPtr, lpcompletion: ConstPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSANSPIoctl(hlookup.rawAddress.toCPointer<ByteVar>(), dwcontrolcode, lpvinbuffer.rawAddress.toCPointer<ByteVar>(), cbinbuffer, lpvoutbuffer.rawAddress.toCPointer<ByteVar>(), cboutbuffer, lpcbbytesreturned.rawAddress.toCPointer<ByteVar>(), lpcompletion.rawAddress.toCPointer<ByteVar>())

public actual fun wSANtohl(s: Socket, netlong: UInt, lphostlong: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSANtohl(s, netlong, lphostlong.rawAddress.toCPointer<ByteVar>())

public actual fun wSANtohs(s: Socket, netshort: UShort, lphostshort: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSANtohs(s, netshort, lphostshort.rawAddress.toCPointer<ByteVar>())

public actual fun wSAPoll(fdarray: MutPtr, fds: UInt, timeout: Int): Int =
    windowssysWindowsWin32NetworkingWinsockWSAPoll(fdarray.rawAddress.toCPointer<ByteVar>(), fds, timeout)

public actual fun wSAProviderCompleteAsyncCall(hasynccall: Handle, iretcode: Int): Int =
    windowssysWindowsWin32NetworkingWinsockWSAProviderCompleteAsyncCall(hasynccall.rawAddress.toCPointer<ByteVar>(), iretcode)

public actual fun wSAProviderConfigChange(lpnotificationhandle: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    windowssysWindowsWin32NetworkingWinsockWSAProviderConfigChange(lpnotificationhandle.rawAddress.toCPointer<ByteVar>(), lpoverlapped.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun wSAQuerySocketSecurity(socket: Socket, securityquerytemplate: ConstPtr, securityquerytemplatelen: UInt, securityqueryinfo: MutPtr, securityqueryinfolen: MutPtr, overlapped: ConstPtr, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    windowssysWindowsWin32NetworkingWinsockWSAQuerySocketSecurity(socket, securityquerytemplate.rawAddress.toCPointer<ByteVar>(), securityquerytemplatelen, securityqueryinfo.rawAddress.toCPointer<ByteVar>(), securityqueryinfolen.rawAddress.toCPointer<ByteVar>(), overlapped.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun wSARecv(s: Socket, lpbuffers: ConstPtr, dwbuffercount: UInt, lpnumberofbytesrecvd: MutPtr, lpflags: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    windowssysWindowsWin32NetworkingWinsockWSARecv(s, lpbuffers.rawAddress.toCPointer<ByteVar>(), dwbuffercount, lpnumberofbytesrecvd.rawAddress.toCPointer<ByteVar>(), lpflags.rawAddress.toCPointer<ByteVar>(), lpoverlapped.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun wSARecvDisconnect(s: Socket, lpinbounddisconnectdata: ConstPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSARecvDisconnect(s, lpinbounddisconnectdata.rawAddress.toCPointer<ByteVar>())

public actual fun wSARecvEx(s: Socket, buf: Pstr, len: Int, flags: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSARecvEx(s, buf.rawAddress.toCPointer<ByteVar>(), len, flags.rawAddress.toCPointer<ByteVar>())

public actual fun wSARecvFrom(s: Socket, lpbuffers: ConstPtr, dwbuffercount: UInt, lpnumberofbytesrecvd: MutPtr, lpflags: MutPtr, lpfrom: MutPtr, lpfromlen: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    windowssysWindowsWin32NetworkingWinsockWSARecvFrom(s, lpbuffers.rawAddress.toCPointer<ByteVar>(), dwbuffercount, lpnumberofbytesrecvd.rawAddress.toCPointer<ByteVar>(), lpflags.rawAddress.toCPointer<ByteVar>(), lpfrom.rawAddress.toCPointer<ByteVar>(), lpfromlen.rawAddress.toCPointer<ByteVar>(), lpoverlapped.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun wSARemoveServiceClass(lpserviceclassid: ConstPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSARemoveServiceClass(lpserviceclassid.rawAddress.toCPointer<ByteVar>())

public actual fun wSAResetEvent(hevent: Wsaevent): Bool =
    windowssysWindowsWin32NetworkingWinsockWSAResetEvent(hevent)

public actual fun wSARevertImpersonation(): Int =
    windowssysWindowsWin32NetworkingWinsockWSARevertImpersonation()

public actual fun wSASend(s: Socket, lpbuffers: ConstPtr, dwbuffercount: UInt, lpnumberofbytessent: MutPtr, dwflags: UInt, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    windowssysWindowsWin32NetworkingWinsockWSASend(s, lpbuffers.rawAddress.toCPointer<ByteVar>(), dwbuffercount, lpnumberofbytessent.rawAddress.toCPointer<ByteVar>(), dwflags, lpoverlapped.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun wSASendDisconnect(s: Socket, lpoutbounddisconnectdata: ConstPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSASendDisconnect(s, lpoutbounddisconnectdata.rawAddress.toCPointer<ByteVar>())

public actual fun wSASendMsg(handle: Socket, lpmsg: ConstPtr, dwflags: UInt, lpnumberofbytessent: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    windowssysWindowsWin32NetworkingWinsockWSASendMsg(handle, lpmsg.rawAddress.toCPointer<ByteVar>(), dwflags, lpnumberofbytessent.rawAddress.toCPointer<ByteVar>(), lpoverlapped.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun wSASendTo(s: Socket, lpbuffers: ConstPtr, dwbuffercount: UInt, lpnumberofbytessent: MutPtr, dwflags: UInt, lpto: ConstPtr, itolen: Int, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    windowssysWindowsWin32NetworkingWinsockWSASendTo(s, lpbuffers.rawAddress.toCPointer<ByteVar>(), dwbuffercount, lpnumberofbytessent.rawAddress.toCPointer<ByteVar>(), dwflags, lpto.rawAddress.toCPointer<ByteVar>(), itolen, lpoverlapped.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun wSASetBlockingHook(lpblockfunc: Farproc): Farproc =
    null

public actual fun wSASetEvent(hevent: Wsaevent): Bool =
    windowssysWindowsWin32NetworkingWinsockWSASetEvent(hevent)

public actual fun wSASetLastError(ierror: Int) {
    windowssysWindowsWin32NetworkingWinsockWSASetLastError(ierror)
}

public actual fun wSASetServiceA(lpqsreginfo: ConstPtr, essoperation: Wsaesetserviceop, dwcontrolflags: UInt): Int =
    windowssysWindowsWin32NetworkingWinsockWSASetServiceA(lpqsreginfo.rawAddress.toCPointer<ByteVar>(), essoperation, dwcontrolflags)

public actual fun wSASetServiceW(lpqsreginfo: ConstPtr, essoperation: Wsaesetserviceop, dwcontrolflags: UInt): Int =
    windowssysWindowsWin32NetworkingWinsockWSASetServiceW(lpqsreginfo.rawAddress.toCPointer<ByteVar>(), essoperation, dwcontrolflags)

public actual fun wSASetSocketPeerTargetName(socket: Socket, peertargetname: ConstPtr, peertargetnamelen: UInt, overlapped: ConstPtr, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    windowssysWindowsWin32NetworkingWinsockWSASetSocketPeerTargetName(socket, peertargetname.rawAddress.toCPointer<ByteVar>(), peertargetnamelen, overlapped.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun wSASetSocketSecurity(socket: Socket, securitysettings: ConstPtr, securitysettingslen: UInt, overlapped: ConstPtr, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    windowssysWindowsWin32NetworkingWinsockWSASetSocketSecurity(socket, securitysettings.rawAddress.toCPointer<ByteVar>(), securitysettingslen, overlapped.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun wSASocketA(af: Int, type: Int, protocol: Int, lpprotocolinfo: ConstPtr, g: UInt, dwflags: UInt): Socket =
    windowssysWindowsWin32NetworkingWinsockWSASocketA(af, type, protocol, lpprotocolinfo.rawAddress.toCPointer<ByteVar>(), g, dwflags)

public actual fun wSASocketW(af: Int, type: Int, protocol: Int, lpprotocolinfo: ConstPtr, g: UInt, dwflags: UInt): Socket =
    windowssysWindowsWin32NetworkingWinsockWSASocketW(af, type, protocol, lpprotocolinfo.rawAddress.toCPointer<ByteVar>(), g, dwflags)

public actual fun wSAStartup(wversionrequested: UShort, lpwsadata: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSAStartup(wversionrequested, lpwsadata.rawAddress.toCPointer<ByteVar>())

public actual fun wSAStringToAddressA(addressstring: Pcstr, addressfamily: Int, lpprotocolinfo: ConstPtr, lpaddress: MutPtr, lpaddresslength: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSAStringToAddressA(addressstring.rawAddress.toCPointer<ByteVar>(), addressfamily, lpprotocolinfo.rawAddress.toCPointer<ByteVar>(), lpaddress.rawAddress.toCPointer<ByteVar>(), lpaddresslength.rawAddress.toCPointer<ByteVar>())

public actual fun wSAStringToAddressW(addressstring: Pcwstr, addressfamily: Int, lpprotocolinfo: ConstPtr, lpaddress: MutPtr, lpaddresslength: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSAStringToAddressW(addressstring.rawAddress.toCPointer<ByteVar>(), addressfamily, lpprotocolinfo.rawAddress.toCPointer<ByteVar>(), lpaddress.rawAddress.toCPointer<ByteVar>(), lpaddresslength.rawAddress.toCPointer<ByteVar>())

public actual fun wSAUnadvertiseProvider(puuidproviderid: ConstPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSAUnadvertiseProvider(puuidproviderid.rawAddress.toCPointer<ByteVar>())

public actual fun wSAUnhookBlockingHook(): Int =
    windowssysWindowsWin32NetworkingWinsockWSAUnhookBlockingHook()

public actual fun wSAWaitForMultipleEvents(cevents: UInt, lphevents: ConstPtr, fwaitall: Bool, dwtimeout: UInt, falertable: Bool): WaitEvent =
    windowssysWindowsWin32NetworkingWinsockWSAWaitForMultipleEvents(cevents, lphevents.rawAddress.toCPointer<ByteVar>(), fwaitall, dwtimeout, falertable)

public actual fun wSCDeinstallProvider(lpproviderid: ConstPtr, lperrno: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSCDeinstallProvider(lpproviderid.rawAddress.toCPointer<ByteVar>(), lperrno.rawAddress.toCPointer<ByteVar>())

public actual fun wSCDeinstallProvider32(lpproviderid: ConstPtr, lperrno: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSCDeinstallProvider32(lpproviderid.rawAddress.toCPointer<ByteVar>(), lperrno.rawAddress.toCPointer<ByteVar>())

public actual fun wSCEnableNSProvider(lpproviderid: ConstPtr, fenable: Bool): Int =
    windowssysWindowsWin32NetworkingWinsockWSCEnableNSProvider(lpproviderid.rawAddress.toCPointer<ByteVar>(), fenable)

public actual fun wSCEnableNSProvider32(lpproviderid: ConstPtr, fenable: Bool): Int =
    windowssysWindowsWin32NetworkingWinsockWSCEnableNSProvider32(lpproviderid.rawAddress.toCPointer<ByteVar>(), fenable)

public actual fun wSCEnumNameSpaceProviders32(lpdwbufferlength: MutPtr, lpnspbuffer: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSCEnumNameSpaceProviders32(lpdwbufferlength.rawAddress.toCPointer<ByteVar>(), lpnspbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun wSCEnumNameSpaceProvidersEx32(lpdwbufferlength: MutPtr, lpnspbuffer: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSCEnumNameSpaceProvidersEx32(lpdwbufferlength.rawAddress.toCPointer<ByteVar>(), lpnspbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun wSCEnumProtocols(lpiprotocols: ConstPtr, lpprotocolbuffer: MutPtr, lpdwbufferlength: MutPtr, lperrno: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSCEnumProtocols(lpiprotocols.rawAddress.toCPointer<ByteVar>(), lpprotocolbuffer.rawAddress.toCPointer<ByteVar>(), lpdwbufferlength.rawAddress.toCPointer<ByteVar>(), lperrno.rawAddress.toCPointer<ByteVar>())

public actual fun wSCEnumProtocols32(lpiprotocols: ConstPtr, lpprotocolbuffer: MutPtr, lpdwbufferlength: MutPtr, lperrno: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSCEnumProtocols32(lpiprotocols.rawAddress.toCPointer<ByteVar>(), lpprotocolbuffer.rawAddress.toCPointer<ByteVar>(), lpdwbufferlength.rawAddress.toCPointer<ByteVar>(), lperrno.rawAddress.toCPointer<ByteVar>())

public actual fun wSCGetApplicationCategory(path: Pcwstr, pathlength: UInt, extra: Pcwstr, extralength: UInt, ppermittedlspcategories: MutPtr, lperrno: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSCGetApplicationCategory(path.rawAddress.toCPointer<ByteVar>(), pathlength, extra.rawAddress.toCPointer<ByteVar>(), extralength, ppermittedlspcategories.rawAddress.toCPointer<ByteVar>(), lperrno.rawAddress.toCPointer<ByteVar>())

public actual fun wSCGetProviderInfo(lpproviderid: ConstPtr, infotype: WscProviderInfoType, info: MutPtr, infosize: MutPtr, flags: UInt, lperrno: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSCGetProviderInfo(lpproviderid.rawAddress.toCPointer<ByteVar>(), infotype, info.rawAddress.toCPointer<ByteVar>(), infosize.rawAddress.toCPointer<ByteVar>(), flags, lperrno.rawAddress.toCPointer<ByteVar>())

public actual fun wSCGetProviderInfo32(lpproviderid: ConstPtr, infotype: WscProviderInfoType, info: MutPtr, infosize: MutPtr, flags: UInt, lperrno: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSCGetProviderInfo32(lpproviderid.rawAddress.toCPointer<ByteVar>(), infotype, info.rawAddress.toCPointer<ByteVar>(), infosize.rawAddress.toCPointer<ByteVar>(), flags, lperrno.rawAddress.toCPointer<ByteVar>())

public actual fun wSCGetProviderPath(lpproviderid: ConstPtr, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: MutPtr, lperrno: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSCGetProviderPath(lpproviderid.rawAddress.toCPointer<ByteVar>(), lpszproviderdllpath.rawAddress.toCPointer<ByteVar>(), lpproviderdllpathlen.rawAddress.toCPointer<ByteVar>(), lperrno.rawAddress.toCPointer<ByteVar>())

public actual fun wSCGetProviderPath32(lpproviderid: ConstPtr, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: MutPtr, lperrno: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSCGetProviderPath32(lpproviderid.rawAddress.toCPointer<ByteVar>(), lpszproviderdllpath.rawAddress.toCPointer<ByteVar>(), lpproviderdllpathlen.rawAddress.toCPointer<ByteVar>(), lperrno.rawAddress.toCPointer<ByteVar>())

public actual fun wSCInstallNameSpace(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpace(lpszidentifier.rawAddress.toCPointer<ByteVar>(), lpszpathname.rawAddress.toCPointer<ByteVar>(), dwnamespace, dwversion, lpproviderid.rawAddress.toCPointer<ByteVar>())

public actual fun wSCInstallNameSpace32(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpace32(lpszidentifier.rawAddress.toCPointer<ByteVar>(), lpszpathname.rawAddress.toCPointer<ByteVar>(), dwnamespace, dwversion, lpproviderid.rawAddress.toCPointer<ByteVar>())

public actual fun wSCInstallNameSpaceEx(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr, lpproviderspecific: ConstPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpaceEx(lpszidentifier.rawAddress.toCPointer<ByteVar>(), lpszpathname.rawAddress.toCPointer<ByteVar>(), dwnamespace, dwversion, lpproviderid.rawAddress.toCPointer<ByteVar>(), lpproviderspecific.rawAddress.toCPointer<ByteVar>())

public actual fun wSCInstallNameSpaceEx32(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr, lpproviderspecific: ConstPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpaceEx32(lpszidentifier.rawAddress.toCPointer<ByteVar>(), lpszpathname.rawAddress.toCPointer<ByteVar>(), dwnamespace, dwversion, lpproviderid.rawAddress.toCPointer<ByteVar>(), lpproviderspecific.rawAddress.toCPointer<ByteVar>())

public actual fun wSCInstallProvider(lpproviderid: ConstPtr, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr, dwnumberofentries: UInt, lperrno: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSCInstallProvider(lpproviderid.rawAddress.toCPointer<ByteVar>(), lpszproviderdllpath.rawAddress.toCPointer<ByteVar>(), lpprotocolinfolist.rawAddress.toCPointer<ByteVar>(), dwnumberofentries, lperrno.rawAddress.toCPointer<ByteVar>())

public actual fun wscinstallProvider6432(lpproviderid: ConstPtr, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr, dwnumberofentries: UInt, lperrno: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWscinstallProvider6432(lpproviderid.rawAddress.toCPointer<ByteVar>(), lpszproviderdllpath.rawAddress.toCPointer<ByteVar>(), lpprotocolinfolist.rawAddress.toCPointer<ByteVar>(), dwnumberofentries, lperrno.rawAddress.toCPointer<ByteVar>())

public actual fun wscinstallProviderAndChains6432(lpproviderid: ConstPtr, lpszproviderdllpath: Pcwstr, lpszproviderdllpath32: Pcwstr, lpszlspname: Pcwstr, dwserviceflags: UInt, lpprotocolinfolist: MutPtr, dwnumberofentries: UInt, lpdwcatalogentryid: MutPtr, lperrno: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWscinstallProviderAndChains6432(lpproviderid.rawAddress.toCPointer<ByteVar>(), lpszproviderdllpath.rawAddress.toCPointer<ByteVar>(), lpszproviderdllpath32.rawAddress.toCPointer<ByteVar>(), lpszlspname.rawAddress.toCPointer<ByteVar>(), dwserviceflags, lpprotocolinfolist.rawAddress.toCPointer<ByteVar>(), dwnumberofentries, lpdwcatalogentryid.rawAddress.toCPointer<ByteVar>(), lperrno.rawAddress.toCPointer<ByteVar>())

public actual fun wSCSetApplicationCategory(path: Pcwstr, pathlength: UInt, extra: Pcwstr, extralength: UInt, permittedlspcategories: UInt, pprevpermlspcat: MutPtr, lperrno: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSCSetApplicationCategory(path.rawAddress.toCPointer<ByteVar>(), pathlength, extra.rawAddress.toCPointer<ByteVar>(), extralength, permittedlspcategories, pprevpermlspcat.rawAddress.toCPointer<ByteVar>(), lperrno.rawAddress.toCPointer<ByteVar>())

public actual fun wSCSetProviderInfo(lpproviderid: ConstPtr, infotype: WscProviderInfoType, info: ConstPtr, infosize: ULong, flags: UInt, lperrno: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSCSetProviderInfo(lpproviderid.rawAddress.toCPointer<ByteVar>(), infotype, info.rawAddress.toCPointer<ByteVar>(), infosize, flags, lperrno.rawAddress.toCPointer<ByteVar>())

public actual fun wSCSetProviderInfo32(lpproviderid: ConstPtr, infotype: WscProviderInfoType, info: ConstPtr, infosize: ULong, flags: UInt, lperrno: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSCSetProviderInfo32(lpproviderid.rawAddress.toCPointer<ByteVar>(), infotype, info.rawAddress.toCPointer<ByteVar>(), infosize, flags, lperrno.rawAddress.toCPointer<ByteVar>())

public actual fun wSCUnInstallNameSpace(lpproviderid: ConstPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSCUnInstallNameSpace(lpproviderid.rawAddress.toCPointer<ByteVar>())

public actual fun wSCUnInstallNameSpace32(lpproviderid: ConstPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSCUnInstallNameSpace32(lpproviderid.rawAddress.toCPointer<ByteVar>())

public actual fun wSCUpdateProvider(lpproviderid: ConstPtr, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr, dwnumberofentries: UInt, lperrno: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSCUpdateProvider(lpproviderid.rawAddress.toCPointer<ByteVar>(), lpszproviderdllpath.rawAddress.toCPointer<ByteVar>(), lpprotocolinfolist.rawAddress.toCPointer<ByteVar>(), dwnumberofentries, lperrno.rawAddress.toCPointer<ByteVar>())

public actual fun wSCUpdateProvider32(lpproviderid: ConstPtr, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr, dwnumberofentries: UInt, lperrno: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWSCUpdateProvider32(lpproviderid.rawAddress.toCPointer<ByteVar>(), lpszproviderdllpath.rawAddress.toCPointer<ByteVar>(), lpprotocolinfolist.rawAddress.toCPointer<ByteVar>(), dwnumberofentries, lperrno.rawAddress.toCPointer<ByteVar>())

public actual fun wSCWriteNameSpaceOrder(lpproviderid: MutPtr, dwnumberofentries: UInt): Int =
    windowssysWindowsWin32NetworkingWinsockWSCWriteNameSpaceOrder(lpproviderid.rawAddress.toCPointer<ByteVar>(), dwnumberofentries)

public actual fun wSCWriteNameSpaceOrder32(lpproviderid: MutPtr, dwnumberofentries: UInt): Int =
    windowssysWindowsWin32NetworkingWinsockWSCWriteNameSpaceOrder32(lpproviderid.rawAddress.toCPointer<ByteVar>(), dwnumberofentries)

public actual fun wSCWriteProviderOrder(lpwdcatalogentryid: MutPtr, dwnumberofentries: UInt): Int =
    windowssysWindowsWin32NetworkingWinsockWSCWriteProviderOrder(lpwdcatalogentryid.rawAddress.toCPointer<ByteVar>(), dwnumberofentries)

public actual fun wSCWriteProviderOrder32(lpwdcatalogentryid: MutPtr, dwnumberofentries: UInt): Int =
    windowssysWindowsWin32NetworkingWinsockWSCWriteProviderOrder32(lpwdcatalogentryid.rawAddress.toCPointer<ByteVar>(), dwnumberofentries)

public actual fun wsafdisSet(fd: Socket, param1: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockWsafdisSet(fd, param1.rawAddress.toCPointer<ByteVar>())

public actual fun accept(s: Socket, addr: MutPtr, addrlen: MutPtr): Socket =
    windowssysWindowsWin32NetworkingWinsockAccept(s, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>())

public actual fun bind(s: Socket, name: ConstPtr, namelen: Int): Int =
    windowssysWindowsWin32NetworkingWinsockBind(s, name.rawAddress.toCPointer<ByteVar>(), namelen)

public actual fun closesocket(s: Socket): Int =
    windowssysWindowsWin32NetworkingWinsockClosesocket(s)

public actual fun connect(s: Socket, name: ConstPtr, namelen: Int): Int =
    windowssysWindowsWin32NetworkingWinsockConnect(s, name.rawAddress.toCPointer<ByteVar>(), namelen)

public actual fun freeaddrinfo(paddrinfo: ConstPtr) {
    windowssysWindowsWin32NetworkingWinsockFreeaddrinfo(paddrinfo.rawAddress.toCPointer<ByteVar>())
}

public actual fun getaddrinfo(pnodename: Pcstr, pservicename: Pcstr, phints: ConstPtr, ppresult: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockGetaddrinfo(pnodename.rawAddress.toCPointer<ByteVar>(), pservicename.rawAddress.toCPointer<ByteVar>(), phints.rawAddress.toCPointer<ByteVar>(), ppresult.rawAddress.toCPointer<ByteVar>())

public actual fun gethostbyaddr(addr: Pcstr, len: Int, type: Int): MutPtr =
    MutPtr(windowssysWindowsWin32NetworkingWinsockGethostbyaddr(addr.rawAddress.toCPointer<ByteVar>(), len, type)?.toLong() ?: 0L)

public actual fun gethostbyname(name: Pcstr): MutPtr =
    MutPtr(windowssysWindowsWin32NetworkingWinsockGethostbyname(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun gethostname(name: Pstr, namelen: Int): Int =
    windowssysWindowsWin32NetworkingWinsockGethostname(name.rawAddress.toCPointer<ByteVar>(), namelen)

public actual fun getnameinfo(psockaddr: ConstPtr, sockaddrlength: SocklenT, pnodebuffer: Pstr, nodebuffersize: UInt, pservicebuffer: Pstr, servicebuffersize: UInt, flags: Int): Int =
    windowssysWindowsWin32NetworkingWinsockGetnameinfo(psockaddr.rawAddress.toCPointer<ByteVar>(), sockaddrlength, pnodebuffer.rawAddress.toCPointer<ByteVar>(), nodebuffersize, pservicebuffer.rawAddress.toCPointer<ByteVar>(), servicebuffersize, flags)

public actual fun getpeername(s: Socket, name: MutPtr, namelen: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockGetpeername(s, name.rawAddress.toCPointer<ByteVar>(), namelen.rawAddress.toCPointer<ByteVar>())

public actual fun getprotobyname(name: Pcstr): MutPtr =
    MutPtr(windowssysWindowsWin32NetworkingWinsockGetprotobyname(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getprotobynumber(number: Int): MutPtr =
    MutPtr(windowssysWindowsWin32NetworkingWinsockGetprotobynumber(number)?.toLong() ?: 0L)

public actual fun getservbyname(name: Pcstr, proto: Pcstr): MutPtr =
    MutPtr(windowssysWindowsWin32NetworkingWinsockGetservbyname(name.rawAddress.toCPointer<ByteVar>(), proto.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getservbyport(port: Int, proto: Pcstr): MutPtr =
    MutPtr(windowssysWindowsWin32NetworkingWinsockGetservbyport(port, proto.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getsockname(s: Socket, name: MutPtr, namelen: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockGetsockname(s, name.rawAddress.toCPointer<ByteVar>(), namelen.rawAddress.toCPointer<ByteVar>())

public actual fun getsockopt(s: Socket, level: Int, optname: Int, optval: Pstr, optlen: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockGetsockopt(s, level, optname, optval.rawAddress.toCPointer<ByteVar>(), optlen.rawAddress.toCPointer<ByteVar>())

public actual fun htonl(hostlong: UInt): UInt =
    windowssysWindowsWin32NetworkingWinsockHtonl(hostlong)

public actual fun htons(hostshort: UShort): UShort =
    windowssysWindowsWin32NetworkingWinsockHtons(hostshort)

public actual fun inetAddr(cp: Pcstr): UInt =
    windowssysWindowsWin32NetworkingWinsockInetAddr(cp.rawAddress.toCPointer<ByteVar>())

public actual fun inetNtoa(input: InAddr): Pstr =
    MutPtr(0L)

public actual fun inetNtop(family: Int, paddr: ConstPtr, pstringbuf: Pstr, stringbufsize: ULong): Pcstr =
    ConstPtr(windowssysWindowsWin32NetworkingWinsockInetNtop(family, paddr.rawAddress.toCPointer<ByteVar>(), pstringbuf.rawAddress.toCPointer<ByteVar>(), stringbufsize)?.toLong() ?: 0L)

public actual fun inetPton(family: Int, pszaddrstring: Pcstr, paddrbuf: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockInetPton(family, pszaddrstring.rawAddress.toCPointer<ByteVar>(), paddrbuf.rawAddress.toCPointer<ByteVar>())

public actual fun ioctlsocket(s: Socket, cmd: Int, argp: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockIoctlsocket(s, cmd, argp.rawAddress.toCPointer<ByteVar>())

public actual fun listen(s: Socket, backlog: Int): Int =
    windowssysWindowsWin32NetworkingWinsockListen(s, backlog)

public actual fun ntohl(netlong: UInt): UInt =
    windowssysWindowsWin32NetworkingWinsockNtohl(netlong)

public actual fun ntohs(netshort: UShort): UShort =
    windowssysWindowsWin32NetworkingWinsockNtohs(netshort)

public actual fun recv(s: Socket, buf: Pstr, len: Int, flags: SendRecvFlags): Int =
    windowssysWindowsWin32NetworkingWinsockRecv(s, buf.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun recvfrom(s: Socket, buf: Pstr, len: Int, flags: Int, from: MutPtr, fromlen: MutPtr): Int =
    windowssysWindowsWin32NetworkingWinsockRecvfrom(s, buf.rawAddress.toCPointer<ByteVar>(), len, flags, from.rawAddress.toCPointer<ByteVar>(), fromlen.rawAddress.toCPointer<ByteVar>())

public actual fun select(nfds: Int, readfds: MutPtr, writefds: MutPtr, exceptfds: MutPtr, timeout: ConstPtr): Int =
    windowssysWindowsWin32NetworkingWinsockSelect(nfds, readfds.rawAddress.toCPointer<ByteVar>(), writefds.rawAddress.toCPointer<ByteVar>(), exceptfds.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun send(s: Socket, buf: Pcstr, len: Int, flags: SendRecvFlags): Int =
    windowssysWindowsWin32NetworkingWinsockSend(s, buf.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun sendto(s: Socket, buf: Pcstr, len: Int, flags: Int, to: ConstPtr, tolen: Int): Int =
    windowssysWindowsWin32NetworkingWinsockSendto(s, buf.rawAddress.toCPointer<ByteVar>(), len, flags, to.rawAddress.toCPointer<ByteVar>(), tolen)

public actual fun setsockopt(s: Socket, level: Int, optname: Int, optval: Pcstr, optlen: Int): Int =
    windowssysWindowsWin32NetworkingWinsockSetsockopt(s, level, optname, optval.rawAddress.toCPointer<ByteVar>(), optlen)

public actual fun shutdown(s: Socket, how: WinsockShutdownHow): Int =
    windowssysWindowsWin32NetworkingWinsockShutdown(s, how)

public actual fun socket(af: Int, type: WinsockSocketType, protocol: Int): Socket =
    windowssysWindowsWin32NetworkingWinsockSocket(af, type, protocol)
