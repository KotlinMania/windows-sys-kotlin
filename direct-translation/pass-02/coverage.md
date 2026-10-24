# Direct candidate coverage

249 Rust files accounted for; 118,014 mapped declarations; 0 additional syntax candidates requiring coder integration; 59,859 unsupported declarations retained.

`complete-candidate` means every top-level item has a supported declaration rule. `complete-syntax-candidate` also permits explicitly marked syntax requiring coder integration. Neither means whole-project compilation, production adoption or Windows ABI validation. Comment-only files are not translated files. Blocked files have no counted declaration denominator.

| Status | Files |
|---|---:|
| blocked | 1 |
| complete-candidate | 4 |
| partial-candidate | 206 |
| unsupported-only | 38 |

Compared with pass-01: **+3,152 mapped, +0 syntax candidates, -3,152 unsupported declarations** over 245 shared completed files. Prior run complete: False.

## Declaration categories

| Syn item | Mapped | Syntax only | Unsupported |
|---|---:|---:|---:|
| Const | 112467 | 0 | 12132 |
| Fn | 0 | 0 | 2 |
| Impl | 0 | 0 | 8938 |
| ItemType | 5547 | 0 | 3779 |
| Macro | 0 | 0 | 20252 |
| Mod | 0 | 0 | 246 |
| Struct | 0 | 0 | 13003 |
| Union | 0 | 0 | 1500 |
| Use | 0 | 0 | 7 |

## Source files

| Rust source | Status | Mapped | Syntax only | Unsupported |
|---|---|---:|---:|---:|
| [Windows/Wdk/Devices/Bluetooth/mod.rs](files/Windows/Wdk/Devices/Bluetooth/mod/candidate.kt) | unsupported-only | 0 | 0 | 18 |
| [Windows/Wdk/Devices/HumanInterfaceDevice/mod.rs](files/Windows/Wdk/Devices/HumanInterfaceDevice/mod/candidate.kt) | unsupported-only | 0 | 0 | 12 |
| [Windows/Wdk/Devices/mod.rs](files/Windows/Wdk/Devices/mod/candidate.kt) | unsupported-only | 0 | 0 | 2 |
| [Windows/Wdk/Foundation/mod.rs](files/Windows/Wdk/Foundation/mod/candidate.kt) | partial-candidate | 124 | 0 | 251 |
| [Windows/Wdk/Graphics/Direct3D/mod.rs](files/Windows/Wdk/Graphics/Direct3D/mod/candidate.kt) | partial-candidate | 1902 | 0 | 1821 |
| [Windows/Wdk/Graphics/mod.rs](files/Windows/Wdk/Graphics/mod/candidate.kt) | unsupported-only | 0 | 0 | 1 |
| [Windows/Wdk/NetworkManagement/Ndis/mod.rs](files/Windows/Wdk/NetworkManagement/Ndis/mod/candidate.kt) | partial-candidate | 2336 | 0 | 416 |
| [Windows/Wdk/NetworkManagement/WindowsFilteringPlatform/mod.rs](files/Windows/Wdk/NetworkManagement/WindowsFilteringPlatform/mod/candidate.kt) | unsupported-only | 0 | 0 | 150 |
| [Windows/Wdk/NetworkManagement/mod.rs](files/Windows/Wdk/NetworkManagement/mod/candidate.kt) | unsupported-only | 0 | 0 | 2 |
| [Windows/Wdk/Storage/FileSystem/Minifilters/mod.rs](files/Windows/Wdk/Storage/FileSystem/Minifilters/mod/candidate.kt) | partial-candidate | 118 | 0 | 447 |
| [Windows/Wdk/Storage/FileSystem/mod.rs](files/Windows/Wdk/Storage/FileSystem/mod/candidate.kt) | partial-candidate | 895 | 0 | 1157 |
| [Windows/Wdk/Storage/mod.rs](files/Windows/Wdk/Storage/mod/candidate.kt) | unsupported-only | 0 | 0 | 1 |
| [Windows/Wdk/System/IO/mod.rs](files/Windows/Wdk/System/IO/mod/candidate.kt) | unsupported-only | 0 | 0 | 1 |
| [Windows/Wdk/System/Memory/mod.rs](files/Windows/Wdk/System/Memory/mod/candidate.kt) | partial-candidate | 3 | 0 | 6 |
| [Windows/Wdk/System/OfflineRegistry/mod.rs](files/Windows/Wdk/System/OfflineRegistry/mod/candidate.kt) | unsupported-only | 0 | 0 | 25 |
| [Windows/Wdk/System/Registry/mod.rs](files/Windows/Wdk/System/Registry/mod/candidate.kt) | partial-candidate | 29 | 0 | 64 |
| [Windows/Wdk/System/SystemInformation/mod.rs](files/Windows/Wdk/System/SystemInformation/mod/candidate.kt) | partial-candidate | 12 | 0 | 6 |
| [Windows/Wdk/System/SystemServices/mod.rs](files/Windows/Wdk/System/SystemServices/mod/candidate.kt) | partial-candidate | 2690 | 0 | 3406 |
| [Windows/Wdk/System/Threading/mod.rs](files/Windows/Wdk/System/Threading/mod/candidate.kt) | partial-candidate | 121 | 0 | 24 |
| [Windows/Wdk/System/mod.rs](files/Windows/Wdk/System/mod/candidate.kt) | unsupported-only | 0 | 0 | 7 |
| [Windows/Wdk/mod.rs](files/Windows/Wdk/mod/candidate.kt) | unsupported-only | 0 | 0 | 6 |
| [Windows/Win32/Data/HtmlHelp/mod.rs](files/Windows/Win32/Data/HtmlHelp/mod/candidate.kt) | partial-candidate | 274 | 0 | 46 |
| [Windows/Win32/Data/RightsManagement/mod.rs](files/Windows/Win32/Data/RightsManagement/mod/candidate.kt) | partial-candidate | 103 | 0 | 97 |
| [Windows/Win32/Data/mod.rs](files/Windows/Win32/Data/mod/candidate.kt) | unsupported-only | 0 | 0 | 2 |
| [Windows/Win32/Devices/AllJoyn/mod.rs](files/Windows/Win32/Devices/AllJoyn/mod/candidate.kt) | partial-candidate | 530 | 0 | 623 |
| [Windows/Win32/Devices/Beep/mod.rs](files/Windows/Win32/Devices/Beep/mod/candidate.kt) | partial-candidate | 3 | 0 | 3 |
| [Windows/Win32/Devices/BiometricFramework/mod.rs](files/Windows/Win32/Devices/BiometricFramework/mod/candidate.kt) | partial-candidate | 164 | 0 | 341 |
| [Windows/Win32/Devices/Bluetooth/mod.rs](files/Windows/Win32/Devices/Bluetooth/mod/candidate.kt) | partial-candidate | 880 | 0 | 180 |
| [Windows/Win32/Devices/Cdrom/mod.rs](files/Windows/Win32/Devices/Cdrom/mod/candidate.kt) | partial-candidate | 130 | 0 | 59 |
| [Windows/Win32/Devices/Communication/mod.rs](files/Windows/Win32/Devices/Communication/mod/candidate.kt) | partial-candidate | 171 | 0 | 42 |
| [Windows/Win32/Devices/DeviceAndDriverInstallation/mod.rs](files/Windows/Win32/Devices/DeviceAndDriverInstallation/mod/candidate.kt) | partial-candidate | 1296 | 0 | 1300 |
| [Windows/Win32/Devices/DeviceQuery/mod.rs](files/Windows/Win32/Devices/DeviceQuery/mod/candidate.kt) | partial-candidate | 72 | 0 | 25 |
| [Windows/Win32/Devices/Display/mod.rs](files/Windows/Win32/Devices/Display/mod/candidate.kt) | partial-candidate | 960 | 0 | 589 |
| [Windows/Win32/Devices/Dvd/mod.rs](files/Windows/Win32/Devices/Dvd/mod/candidate.kt) | partial-candidate | 56 | 0 | 106 |
| [Windows/Win32/Devices/Enumeration/Pnp/mod.rs](files/Windows/Win32/Devices/Enumeration/Pnp/mod/candidate.kt) | partial-candidate | 55 | 0 | 25 |
| [Windows/Win32/Devices/Enumeration/mod.rs](files/Windows/Win32/Devices/Enumeration/mod/candidate.kt) | unsupported-only | 0 | 0 | 1 |
| [Windows/Win32/Devices/Fax/mod.rs](files/Windows/Win32/Devices/Fax/mod/candidate.kt) | partial-candidate | 390 | 0 | 331 |
| [Windows/Win32/Devices/HumanInterfaceDevice/mod.rs](files/Windows/Win32/Devices/HumanInterfaceDevice/mod/candidate.kt) | partial-candidate | 2382 | 0 | 369 |
| [Windows/Win32/Devices/Nfc/mod.rs](files/Windows/Win32/Devices/Nfc/mod/candidate.kt) | partial-candidate | 138 | 0 | 81 |
| [Windows/Win32/Devices/Nfp/mod.rs](files/Windows/Win32/Devices/Nfp/mod/candidate.kt) | partial-candidate | 7 | 0 | 4 |
| [Windows/Win32/Devices/PortableDevices/mod.rs](files/Windows/Win32/Devices/PortableDevices/mod/candidate.kt) | partial-candidate | 291 | 0 | 1125 |
| [Windows/Win32/Devices/Properties/mod.rs](files/Windows/Win32/Devices/Properties/mod/candidate.kt) | partial-candidate | 42 | 0 | 202 |
| [Windows/Win32/Devices/Pwm/mod.rs](files/Windows/Win32/Devices/Pwm/mod/candidate.kt) | partial-candidate | 23 | 0 | 11 |
| [Windows/Win32/Devices/Sensors/mod.rs](files/Windows/Win32/Devices/Sensors/mod/candidate.kt) | partial-candidate | 106 | 0 | 334 |
| [Windows/Win32/Devices/SerialCommunication/mod.rs](files/Windows/Win32/Devices/SerialCommunication/mod/candidate.kt) | partial-candidate | 82 | 0 | 31 |
| [Windows/Win32/Devices/Tapi/mod.rs](files/Windows/Win32/Devices/Tapi/mod/candidate.kt) | partial-candidate | 1631 | 0 | 413 |
| [Windows/Win32/Devices/Usb/mod.rs](files/Windows/Win32/Devices/Usb/mod/candidate.kt) | partial-candidate | 694 | 0 | 419 |
| [Windows/Win32/Devices/WebServicesOnDevices/mod.rs](files/Windows/Win32/Devices/WebServicesOnDevices/mod/candidate.kt) | partial-candidate | 95 | 0 | 177 |
| [Windows/Win32/Devices/mod.rs](files/Windows/Win32/Devices/mod/candidate.kt) | partial-candidate | 21 | 0 | 30 |
| [Windows/Win32/Foundation/mod.rs](files/Windows/Win32/Foundation/mod/candidate.kt) | partial-candidate | 10176 | 0 | 62 |
| [Windows/Win32/Gaming/mod.rs](files/Windows/Win32/Gaming/mod/candidate.kt) | partial-candidate | 55 | 0 | 39 |
| [Windows/Win32/Globalization/mod.rs](files/Windows/Win32/Globalization/mod/candidate.kt) | partial-candidate | 3160 | 0 | 1469 |
| [Windows/Win32/Graphics/Dwm/mod.rs](files/Windows/Win32/Graphics/Dwm/mod/candidate.kt) | partial-candidate | 106 | 0 | 38 |
| [Windows/Win32/Graphics/Gdi/mod.rs](files/Windows/Win32/Graphics/Gdi/mod/candidate.kt) | partial-candidate | 1766 | 0 | 654 |
| [Windows/Win32/Graphics/GdiPlus/mod.rs](files/Windows/Win32/Graphics/GdiPlus/mod/candidate.kt) | partial-candidate | 1029 | 0 | 764 |
| [Windows/Win32/Graphics/Hlsl/mod.rs](files/Windows/Win32/Graphics/Hlsl/mod/candidate.kt) | complete-candidate | 2 | 0 | 0 |
| [Windows/Win32/Graphics/OpenGL/mod.rs](files/Windows/Win32/Graphics/OpenGL/mod/candidate.kt) | partial-candidate | 733 | 0 | 449 |
| [Windows/Win32/Graphics/Printing/PrintTicket/mod.rs](files/Windows/Win32/Graphics/Printing/PrintTicket/mod/candidate.kt) | partial-candidate | 14 | 0 | 12 |
| [Windows/Win32/Graphics/Printing/mod.rs](files/Windows/Win32/Graphics/Printing/mod/candidate.kt) | partial-candidate | 1484 | 0 | 768 |
| [Windows/Win32/Graphics/mod.rs](files/Windows/Win32/Graphics/mod/candidate.kt) | unsupported-only | 0 | 0 | 6 |
| [Windows/Win32/Management/MobileDeviceManagementRegistration/mod.rs](files/Windows/Win32/Management/MobileDeviceManagementRegistration/mod/candidate.kt) | partial-candidate | 69 | 0 | 22 |
| [Windows/Win32/Management/mod.rs](files/Windows/Win32/Management/mod/candidate.kt) | unsupported-only | 0 | 0 | 1 |
| [Windows/Win32/Media/Audio/mod.rs](files/Windows/Win32/Media/Audio/mod/candidate.kt) | partial-candidate | 638 | 0 | 412 |
| [Windows/Win32/Media/DxMediaObjects/mod.rs](files/Windows/Win32/Media/DxMediaObjects/mod/candidate.kt) | partial-candidate | 46 | 0 | 26 |
| [Windows/Win32/Media/KernelStreaming/mod.rs](files/Windows/Win32/Media/KernelStreaming/mod/candidate.kt) | partial-candidate | 1638 | 0 | 1152 |
| [Windows/Win32/Media/Multimedia/mod.rs](files/Windows/Win32/Media/Multimedia/mod/candidate.kt) | partial-candidate | 4640 | 0 | 447 |
| [Windows/Win32/Media/Streaming/mod.rs](files/Windows/Win32/Media/Streaming/mod/candidate.kt) | partial-candidate | 7 | 0 | 28 |
| [Windows/Win32/Media/WindowsMediaFormat/mod.rs](files/Windows/Win32/Media/WindowsMediaFormat/mod/candidate.kt) | partial-candidate | 245 | 0 | 362 |
| [Windows/Win32/Media/mod.rs](files/Windows/Win32/Media/mod/candidate.kt) | partial-candidate | 105 | 0 | 29 |
| [Windows/Win32/NetworkManagement/Dhcp/mod.rs](files/Windows/Win32/NetworkManagement/Dhcp/mod/candidate.kt) | partial-candidate | 451 | 0 | 477 |
| [Windows/Win32/NetworkManagement/Dns/mod.rs](files/Windows/Win32/NetworkManagement/Dns/mod/candidate.kt) | partial-candidate | 411 | 0 | 283 |
| [Windows/Win32/NetworkManagement/InternetConnectionWizard/mod.rs](files/Windows/Win32/NetworkManagement/InternetConnectionWizard/mod/candidate.kt) | partial-candidate | 18 | 0 | 4 |
| [Windows/Win32/NetworkManagement/IpHelper/mod.rs](files/Windows/Win32/NetworkManagement/IpHelper/mod/candidate.kt) | partial-candidate | 630 | 0 | 566 |
| [Windows/Win32/NetworkManagement/Multicast/mod.rs](files/Windows/Win32/NetworkManagement/Multicast/mod/candidate.kt) | partial-candidate | 4 | 0 | 19 |
| [Windows/Win32/NetworkManagement/Ndis/mod.rs](files/Windows/Win32/NetworkManagement/Ndis/mod/candidate.kt) | partial-candidate | 1994 | 0 | 365 |
| [Windows/Win32/NetworkManagement/NetBios/mod.rs](files/Windows/Win32/NetworkManagement/NetBios/mod/candidate.kt) | partial-candidate | 82 | 0 | 20 |
| [Windows/Win32/NetworkManagement/NetManagement/mod.rs](files/Windows/Win32/NetworkManagement/NetManagement/mod/candidate.kt) | partial-candidate | 2209 | 0 | 686 |
| [Windows/Win32/NetworkManagement/NetShell/mod.rs](files/Windows/Win32/NetworkManagement/NetShell/mod/candidate.kt) | partial-candidate | 53 | 0 | 41 |
| [Windows/Win32/NetworkManagement/NetworkDiagnosticsFramework/mod.rs](files/Windows/Win32/NetworkManagement/NetworkDiagnosticsFramework/mod/candidate.kt) | partial-candidate | 82 | 0 | 43 |
| [Windows/Win32/NetworkManagement/P2P/mod.rs](files/Windows/Win32/NetworkManagement/P2P/mod/candidate.kt) | partial-candidate | 276 | 0 | 347 |
| [Windows/Win32/NetworkManagement/QoS/mod.rs](files/Windows/Win32/NetworkManagement/QoS/mod/candidate.kt) | partial-candidate | 554 | 0 | 234 |
| [Windows/Win32/NetworkManagement/Rras/mod.rs](files/Windows/Win32/NetworkManagement/Rras/mod/candidate.kt) | partial-candidate | 859 | 0 | 645 |
| [Windows/Win32/NetworkManagement/Snmp/mod.rs](files/Windows/Win32/NetworkManagement/Snmp/mod/candidate.kt) | partial-candidate | 172 | 0 | 123 |
| [Windows/Win32/NetworkManagement/WNet/mod.rs](files/Windows/Win32/NetworkManagement/WNet/mod/candidate.kt) | partial-candidate | 140 | 0 | 124 |
| [Windows/Win32/NetworkManagement/WebDav/mod.rs](files/Windows/Win32/NetworkManagement/WebDav/mod/candidate.kt) | partial-candidate | 11 | 0 | 18 |
| [Windows/Win32/NetworkManagement/WiFi/mod.rs](files/Windows/Win32/NetworkManagement/WiFi/mod/candidate.kt) | partial-candidate | 1270 | 0 | 683 |
| [Windows/Win32/NetworkManagement/WindowsConnectionManager/mod.rs](files/Windows/Win32/NetworkManagement/WindowsConnectionManager/mod/candidate.kt) | partial-candidate | 35 | 0 | 25 |
| [Windows/Win32/NetworkManagement/WindowsFilteringPlatform/mod.rs](files/Windows/Win32/NetworkManagement/WindowsFilteringPlatform/mod/candidate.kt) | partial-candidate | 658 | 0 | 1024 |
| [Windows/Win32/NetworkManagement/WindowsFirewall/mod.rs](files/Windows/Win32/NetworkManagement/WindowsFirewall/mod/candidate.kt) | partial-candidate | 171 | 0 | 46 |
| [Windows/Win32/NetworkManagement/WindowsNetworkVirtualization/mod.rs](files/Windows/Win32/NetworkManagement/WindowsNetworkVirtualization/mod/candidate.kt) | partial-candidate | 16 | 0 | 21 |
| [Windows/Win32/NetworkManagement/mod.rs](files/Windows/Win32/NetworkManagement/mod/candidate.kt) | unsupported-only | 0 | 0 | 21 |
| [Windows/Win32/Networking/ActiveDirectory/mod.rs](files/Windows/Win32/Networking/ActiveDirectory/mod/candidate.kt) | partial-candidate | 995 | 0 | 463 |
| [Windows/Win32/Networking/Clustering/mod.rs](files/Windows/Win32/Networking/Clustering/mod/candidate.kt) | partial-candidate | 1490 | 0 | 1463 |
| [Windows/Win32/Networking/HttpServer/mod.rs](files/Windows/Win32/Networking/HttpServer/mod/candidate.kt) | partial-candidate | 379 | 0 | 196 |
| [Windows/Win32/Networking/Ldap/mod.rs](files/Windows/Win32/Networking/Ldap/mod/candidate.kt) | partial-candidate | 211 | 0 | 466 |
| [Windows/Win32/Networking/WebSocket/mod.rs](files/Windows/Win32/Networking/WebSocket/mod/candidate.kt) | partial-candidate | 40 | 0 | 24 |
| [Windows/Win32/Networking/WinHttp/mod.rs](files/Windows/Win32/Networking/WinHttp/mod/candidate.kt) | partial-candidate | 716 | 0 | 124 |
| [Windows/Win32/Networking/WinInet/mod.rs](files/Windows/Win32/Networking/WinInet/mod/candidate.kt) | partial-candidate | 1077 | 0 | 496 |
| [Windows/Win32/Networking/WinSock/mod.rs](files/Windows/Win32/Networking/WinSock/mod/candidate.kt) | partial-candidate | 1651 | 0 | 886 |
| [Windows/Win32/Networking/WindowsWebServices/mod.rs](files/Windows/Win32/Networking/WindowsWebServices/mod/candidate.kt) | partial-candidate | 1091 | 0 | 716 |
| [Windows/Win32/Networking/mod.rs](files/Windows/Win32/Networking/mod/candidate.kt) | unsupported-only | 0 | 0 | 9 |
| [Windows/Win32/Security/AppLocker/mod.rs](files/Windows/Win32/Security/AppLocker/mod/candidate.kt) | partial-candidate | 66 | 0 | 33 |
| [Windows/Win32/Security/Authentication/Identity/mod.rs](files/Windows/Win32/Security/Authentication/Identity/mod/candidate.kt) | partial-candidate | 1831 | 0 | 1198 |
| [Windows/Win32/Security/Authentication/mod.rs](files/Windows/Win32/Security/Authentication/mod/candidate.kt) | unsupported-only | 0 | 0 | 1 |
| [Windows/Win32/Security/Authorization/mod.rs](files/Windows/Win32/Security/Authorization/mod/candidate.kt) | partial-candidate | 353 | 0 | 350 |
| [Windows/Win32/Security/Credentials/mod.rs](files/Windows/Win32/Security/Credentials/mod/candidate.kt) | partial-candidate | 223 | 0 | 249 |
| [Windows/Win32/Security/Cryptography/Catalog/mod.rs](files/Windows/Win32/Security/Cryptography/Catalog/mod/candidate.kt) | partial-candidate | 38 | 0 | 53 |
| [Windows/Win32/Security/Cryptography/Certificates/mod.rs](files/Windows/Win32/Security/Cryptography/Certificates/mod/candidate.kt) | partial-candidate | 1563 | 0 | 720 |
| [Windows/Win32/Security/Cryptography/Sip/mod.rs](files/Windows/Win32/Security/Cryptography/Sip/mod/candidate.kt) | partial-candidate | 16 | 0 | 39 |
| [Windows/Win32/Security/Cryptography/UI/mod.rs](files/Windows/Win32/Security/Cryptography/UI/mod/candidate.kt) | partial-candidate | 172 | 0 | 76 |
| [Windows/Win32/Security/Cryptography/mod.rs](files/Windows/Win32/Security/Cryptography/mod/candidate.kt) | partial-candidate | 2370 | 0 | 3035 |
| [Windows/Win32/Security/DiagnosticDataQuery/mod.rs](files/Windows/Win32/Security/DiagnosticDataQuery/mod/candidate.kt) | partial-candidate | 4 | 0 | 62 |
| [Windows/Win32/Security/DirectoryServices/mod.rs](files/Windows/Win32/Security/DirectoryServices/mod/candidate.kt) | partial-candidate | 7 | 0 | 6 |
| [Windows/Win32/Security/EnterpriseData/mod.rs](files/Windows/Win32/Security/EnterpriseData/mod/candidate.kt) | partial-candidate | 11 | 0 | 16 |
| [Windows/Win32/Security/ExtensibleAuthenticationProtocol/mod.rs](files/Windows/Win32/Security/ExtensibleAuthenticationProtocol/mod/candidate.kt) | partial-candidate | 480 | 0 | 194 |
| [Windows/Win32/Security/Isolation/mod.rs](files/Windows/Win32/Security/Isolation/mod/candidate.kt) | unsupported-only | 0 | 0 | 14 |
| [Windows/Win32/Security/LicenseProtection/mod.rs](files/Windows/Win32/Security/LicenseProtection/mod/candidate.kt) | partial-candidate | 6 | 0 | 2 |
| [Windows/Win32/Security/NetworkAccessProtection/mod.rs](files/Windows/Win32/Security/NetworkAccessProtection/mod/candidate.kt) | partial-candidate | 47 | 0 | 24 |
| [Windows/Win32/Security/WinTrust/mod.rs](files/Windows/Win32/Security/WinTrust/mod/candidate.kt) | partial-candidate | 137 | 0 | 237 |
| [Windows/Win32/Security/WinWlx/mod.rs](files/Windows/Win32/Security/WinWlx/mod/candidate.kt) | partial-candidate | 63 | 0 | 53 |
| [Windows/Win32/Security/mod.rs](files/Windows/Win32/Security/mod/candidate.kt) | partial-candidate | 351 | 0 | 338 |
| [Windows/Win32/Storage/Cabinets/mod.rs](files/Windows/Win32/Storage/Cabinets/mod/candidate.kt) | partial-candidate | 72 | 0 | 52 |
| [Windows/Win32/Storage/CloudFilters/mod.rs](files/Windows/Win32/Storage/CloudFilters/mod/candidate.kt) | partial-candidate | 236 | 0 | 104 |
| [Windows/Win32/Storage/Compression/mod.rs](files/Windows/Win32/Storage/Compression/mod/candidate.kt) | partial-candidate | 13 | 0 | 18 |
| [Windows/Win32/Storage/DistributedFileSystem/mod.rs](files/Windows/Win32/Storage/DistributedFileSystem/mod/candidate.kt) | partial-candidate | 44 | 0 | 74 |
| [Windows/Win32/Storage/FileHistory/mod.rs](files/Windows/Win32/Storage/FileHistory/mod/candidate.kt) | partial-candidate | 87 | 0 | 10 |
| [Windows/Win32/Storage/FileSystem/mod.rs](files/Windows/Win32/Storage/FileSystem/mod/candidate.kt) | partial-candidate | 1078 | 0 | 819 |
| [Windows/Win32/Storage/Imapi/mod.rs](files/Windows/Win32/Storage/Imapi/mod/candidate.kt) | partial-candidate | 606 | 0 | 75 |
| [Windows/Win32/Storage/IndexServer/mod.rs](files/Windows/Win32/Storage/IndexServer/mod/candidate.kt) | partial-candidate | 176 | 0 | 31 |
| [Windows/Win32/Storage/InstallableFileSystems/mod.rs](files/Windows/Win32/Storage/InstallableFileSystems/mod/candidate.kt) | partial-candidate | 132 | 0 | 57 |
| [Windows/Win32/Storage/IscsiDisc/mod.rs](files/Windows/Win32/Storage/IscsiDisc/mod/candidate.kt) | partial-candidate | 193 | 0 | 262 |
| [Windows/Win32/Storage/Jet/mod.rs](files/Windows/Win32/Storage/Jet/mod/candidate.kt) | partial-candidate | 982 | 0 | 427 |
| [Windows/Win32/Storage/Nvme/mod.rs](files/Windows/Win32/Storage/Nvme/mod/candidate.kt) | partial-candidate | 554 | 0 | 619 |
| [Windows/Win32/Storage/OfflineFiles/mod.rs](files/Windows/Win32/Storage/OfflineFiles/mod/candidate.kt) | partial-candidate | 269 | 0 | 7 |
| [Windows/Win32/Storage/OperationRecorder/mod.rs](files/Windows/Win32/Storage/OperationRecorder/mod/candidate.kt) | partial-candidate | 4 | 0 | 4 |
| [Windows/Win32/Storage/Packaging/Appx/mod.rs](files/Windows/Win32/Storage/Packaging/Appx/mod/candidate.kt) | partial-candidate | 189 | 0 | 99 |
| [Windows/Win32/Storage/Packaging/mod.rs](files/Windows/Win32/Storage/Packaging/mod/candidate.kt) | unsupported-only | 0 | 0 | 1 |
| [Windows/Win32/Storage/ProjectedFileSystem/mod.rs](files/Windows/Win32/Storage/ProjectedFileSystem/mod/candidate.kt) | partial-candidate | 63 | 0 | 63 |
| [Windows/Win32/Storage/StructuredStorage/mod.rs](files/Windows/Win32/Storage/StructuredStorage/mod/candidate.kt) | complete-candidate | 3 | 0 | 0 |
| [Windows/Win32/Storage/Vhd/mod.rs](files/Windows/Win32/Storage/Vhd/mod/candidate.kt) | partial-candidate | 202 | 0 | 149 |
| [Windows/Win32/Storage/Xps/mod.rs](files/Windows/Win32/Storage/Xps/mod/candidate.kt) | partial-candidate | 251 | 0 | 39 |
| [Windows/Win32/Storage/mod.rs](files/Windows/Win32/Storage/mod/candidate.kt) | unsupported-only | 0 | 0 | 19 |
| [Windows/Win32/System/AddressBook/mod.rs](files/Windows/Win32/System/AddressBook/mod/candidate.kt) | partial-candidate | 217 | 0 | 214 |
| [Windows/Win32/System/Antimalware/mod.rs](files/Windows/Win32/System/Antimalware/mod/candidate.kt) | partial-candidate | 35 | 0 | 25 |
| [Windows/Win32/System/ApplicationInstallationAndServicing/mod.rs](files/Windows/Win32/System/ApplicationInstallationAndServicing/mod/candidate.kt) | partial-candidate | 1106 | 0 | 685 |
| [Windows/Win32/System/ApplicationVerifier/mod.rs](files/Windows/Win32/System/ApplicationVerifier/mod/candidate.kt) | partial-candidate | 24 | 0 | 9 |
| [Windows/Win32/System/ClrHosting/mod.rs](files/Windows/Win32/System/ClrHosting/mod/candidate.kt) | partial-candidate | 196 | 0 | 66 |
| [Windows/Win32/System/Com/Marshal/mod.rs](files/Windows/Win32/System/Com/Marshal/mod/candidate.kt) | partial-candidate | 3 | 0 | 113 |
| [Windows/Win32/System/Com/StructuredStorage/mod.rs](files/Windows/Win32/System/Com/StructuredStorage/mod/candidate.kt) | partial-candidate | 114 | 0 | 200 |
| [Windows/Win32/System/Com/Urlmon/mod.rs](files/Windows/Win32/System/Com/Urlmon/mod/candidate.kt) | partial-candidate | 703 | 0 | 96 |
| [Windows/Win32/System/Com/mod.rs](files/Windows/Win32/System/Com/mod/candidate.kt) | partial-candidate | 519 | 0 | 251 |
| [Windows/Win32/System/ComponentServices/mod.rs](files/Windows/Win32/System/ComponentServices/mod/candidate.kt) | partial-candidate | 359 | 0 | 64 |
| [Windows/Win32/System/Console/mod.rs](files/Windows/Win32/System/Console/mod/candidate.kt) | partial-candidate | 96 | 0 | 133 |
| [Windows/Win32/System/CorrelationVector/mod.rs](files/Windows/Win32/System/CorrelationVector/mod/candidate.kt) | partial-candidate | 5 | 0 | 6 |
| [Windows/Win32/System/DataExchange/mod.rs](files/Windows/Win32/System/DataExchange/mod/candidate.kt) | partial-candidate | 144 | 0 | 124 |
| [Windows/Win32/System/DeploymentServices/mod.rs](files/Windows/Win32/System/DeploymentServices/mod/candidate.kt) | partial-candidate | 293 | 0 | 154 |
| [Windows/Win32/System/DeveloperLicensing/mod.rs](files/Windows/Win32/System/DeveloperLicensing/mod/candidate.kt) | unsupported-only | 0 | 0 | 3 |
| [Windows/Win32/System/Diagnostics/Ceip/mod.rs](files/Windows/Win32/System/Diagnostics/Ceip/mod/candidate.kt) | unsupported-only | 0 | 0 | 1 |
| [Windows/Win32/System/Diagnostics/Debug/Extensions/mod.rs](files/Windows/Win32/System/Diagnostics/Debug/Extensions/mod/candidate.kt) | partial-candidate | 1911 | 0 | 342 |
| [Windows/Win32/System/Diagnostics/Debug/mod.rs](files/Windows/Win32/System/Diagnostics/Debug/mod/candidate.kt) | partial-candidate | 1691 | 0 | 901 |
| [Windows/Win32/System/Diagnostics/Etw/mod.rs](files/Windows/Win32/System/Diagnostics/Etw/mod/candidate.kt) | partial-candidate | 697 | 0 | 378 |
| [Windows/Win32/System/Diagnostics/ProcessSnapshotting/mod.rs](files/Windows/Win32/System/Diagnostics/ProcessSnapshotting/mod/candidate.kt) | partial-candidate | 65 | 0 | 44 |
| [Windows/Win32/System/Diagnostics/ToolHelp/mod.rs](files/Windows/Win32/System/Diagnostics/ToolHelp/mod/candidate.kt) | partial-candidate | 15 | 0 | 28 |
| [Windows/Win32/System/Diagnostics/TraceLogging/mod.rs](files/Windows/Win32/System/Diagnostics/TraceLogging/mod/candidate.kt) | complete-candidate | 105 | 0 | 0 |
| [Windows/Win32/System/Diagnostics/mod.rs](files/Windows/Win32/System/Diagnostics/mod/candidate.kt) | unsupported-only | 0 | 0 | 6 |
| [Windows/Win32/System/DistributedTransactionCoordinator/mod.rs](files/Windows/Win32/System/DistributedTransactionCoordinator/mod/candidate.kt) | partial-candidate | 210 | 0 | 33 |
| [Windows/Win32/System/Environment/mod.rs](files/Windows/Win32/System/Environment/mod/candidate.kt) | partial-candidate | 23 | 0 | 72 |
| [Windows/Win32/System/ErrorReporting/mod.rs](files/Windows/Win32/System/ErrorReporting/mod/candidate.kt) | partial-candidate | 143 | 0 | 81 |
| [Windows/Win32/System/EventCollector/mod.rs](files/Windows/Win32/System/EventCollector/mod/candidate.kt) | partial-candidate | 82 | 0 | 19 |
| [Windows/Win32/System/EventLog/mod.rs](files/Windows/Win32/System/EventLog/mod/candidate.kt) | partial-candidate | 217 | 0 | 66 |
| [Windows/Win32/System/EventNotificationService/mod.rs](files/Windows/Win32/System/EventNotificationService/mod/candidate.kt) | partial-candidate | 8 | 0 | 13 |
| [Windows/Win32/System/GroupPolicy/mod.rs](files/Windows/Win32/System/GroupPolicy/mod/candidate.kt) | partial-candidate | 194 | 0 | 119 |
| [Windows/Win32/System/HostCompute/mod.rs](files/Windows/Win32/System/HostCompute/mod/candidate.kt) | unsupported-only | 0 | 0 | 1 |
| [Windows/Win32/System/HostComputeNetwork/mod.rs](files/Windows/Win32/System/HostComputeNetwork/mod/candidate.kt) | partial-candidate | 23 | 0 | 46 |
| [Windows/Win32/System/HostComputeSystem/mod.rs](files/Windows/Win32/System/HostComputeSystem/mod/candidate.kt) | partial-candidate | 70 | 0 | 78 |
| [Windows/Win32/System/Hypervisor/mod.rs](files/Windows/Win32/System/Hypervisor/mod/candidate.kt) | partial-candidate | 693 | 0 | 388 |
| [Windows/Win32/System/IO/mod.rs](files/Windows/Win32/System/IO/mod/candidate.kt) | unsupported-only | 0 | 0 | 24 |
| [Windows/Win32/System/Iis/mod.rs](files/Windows/Win32/System/Iis/mod/candidate.kt) | partial-candidate | 903 | 0 | 171 |
| [Windows/Win32/System/Ioctl/mod.rs](files/Windows/Win32/System/Ioctl/mod/candidate.kt) | partial-candidate | 1736 | 0 | 799 |
| [Windows/Win32/System/JobObjects/mod.rs](files/Windows/Win32/System/JobObjects/mod/candidate.kt) | partial-candidate | 128 | 0 | 63 |
| [Windows/Win32/System/Js/mod.rs](files/Windows/Win32/System/Js/mod/candidate.kt) | partial-candidate | 56 | 0 | 87 |
| [Windows/Win32/System/Kernel/mod.rs](files/Windows/Win32/System/Kernel/mod/candidate.kt) | partial-candidate | 50 | 0 | 60 |
| [Windows/Win32/System/LibraryLoader/mod.rs](files/Windows/Win32/System/LibraryLoader/mod/candidate.kt) | partial-candidate | 29 | 0 | 63 |
| [Windows/Win32/System/Mailslots/mod.rs](files/Windows/Win32/System/Mailslots/mod/candidate.kt) | unsupported-only | 0 | 0 | 4 |
| [Windows/Win32/System/Mapi/mod.rs](files/Windows/Win32/System/Mapi/mod/candidate.kt) | partial-candidate | 55 | 0 | 28 |
| [Windows/Win32/System/Memory/NonVolatile/mod.rs](files/Windows/Win32/System/Memory/NonVolatile/mod/candidate.kt) | unsupported-only | 0 | 0 | 9 |
| [Windows/Win32/System/Memory/mod.rs](files/Windows/Win32/System/Memory/mod/candidate.kt) | partial-candidate | 159 | 0 | 143 |
| [Windows/Win32/System/MessageQueuing/mod.rs](files/Windows/Win32/System/MessageQueuing/mod/candidate.kt) | partial-candidate | 527 | 0 | 105 |
| [Windows/Win32/System/MixedReality/mod.rs](files/Windows/Win32/System/MixedReality/mod/candidate.kt) | unsupported-only | 0 | 0 | 3 |
| [Windows/Win32/System/Ole/mod.rs](files/Windows/Win32/System/Ole/mod/candidate.kt) | partial-candidate | 1082 | 0 | 627 |
| [Windows/Win32/System/PasswordManagement/mod.rs](files/Windows/Win32/System/PasswordManagement/mod/candidate.kt) | unsupported-only | 0 | 0 | 10 |
| [Windows/Win32/System/Performance/HardwareCounterProfiling/mod.rs](files/Windows/Win32/System/Performance/HardwareCounterProfiling/mod/candidate.kt) | partial-candidate | 3 | 0 | 7 |
| [Windows/Win32/System/Performance/mod.rs](files/Windows/Win32/System/Performance/mod/candidate.kt) | partial-candidate | 350 | 0 | 273 |
| [Windows/Win32/System/Pipes/mod.rs](files/Windows/Win32/System/Pipes/mod/candidate.kt) | partial-candidate | 15 | 0 | 22 |
| [Windows/Win32/System/Power/mod.rs](files/Windows/Win32/System/Power/mod/candidate.kt) | partial-candidate | 471 | 0 | 242 |
| [Windows/Win32/System/ProcessStatus/mod.rs](files/Windows/Win32/System/ProcessStatus/mod/candidate.kt) | partial-candidate | 6 | 0 | 79 |
| [Windows/Win32/System/Recovery/mod.rs](files/Windows/Win32/System/Recovery/mod/candidate.kt) | partial-candidate | 5 | 0 | 8 |
| [Windows/Win32/System/Registry/mod.rs](files/Windows/Win32/System/Registry/mod/candidate.kt) | partial-candidate | 196 | 0 | 859 |
| [Windows/Win32/System/RemoteDesktop/mod.rs](files/Windows/Win32/System/RemoteDesktop/mod/candidate.kt) | partial-candidate | 576 | 0 | 262 |
| [Windows/Win32/System/RemoteManagement/mod.rs](files/Windows/Win32/System/RemoteManagement/mod/candidate.kt) | partial-candidate | 641 | 0 | 124 |
| [Windows/Win32/System/RestartManager/mod.rs](files/Windows/Win32/System/RestartManager/mod/candidate.kt) | partial-candidate | 42 | 0 | 19 |
| [Windows/Win32/System/Restore/mod.rs](files/Windows/Win32/System/Restore/mod/candidate.kt) | partial-candidate | 32 | 0 | 10 |
| [Windows/Win32/System/Rpc/mod.rs](files/Windows/Win32/System/Rpc/mod/candidate.kt) | partial-candidate | 504 | 0 | 841 |
| [Windows/Win32/System/Search/Common/mod.rs](files/Windows/Win32/System/Search/Common/mod/candidate.kt) | complete-candidate | 21 | 0 | 0 |
| [Windows/Win32/System/Search/mod.rs](files/Windows/Win32/System/Search/mod/candidate.kt) | partial-candidate | 4485 | 0 | 491 |
| [Windows/Win32/System/SecurityCenter/mod.rs](files/Windows/Win32/System/SecurityCenter/mod/candidate.kt) | partial-candidate | 32 | 0 | 8 |
| [Windows/Win32/System/Services/mod.rs](files/Windows/Win32/System/Services/mod/candidate.kt) | partial-candidate | 214 | 0 | 156 |
| [Windows/Win32/System/SetupAndMigration/mod.rs](files/Windows/Win32/System/SetupAndMigration/mod/candidate.kt) | unsupported-only | 0 | 0 | 4 |
| [Windows/Win32/System/Shutdown/mod.rs](files/Windows/Win32/System/Shutdown/mod/candidate.kt) | partial-candidate | 97 | 0 | 14 |
| [Windows/Win32/System/StationsAndDesktops/mod.rs](files/Windows/Win32/System/StationsAndDesktops/mod/candidate.kt) | partial-candidate | 40 | 0 | 40 |
| [Windows/Win32/System/SubsystemForLinux/mod.rs](files/Windows/Win32/System/SubsystemForLinux/mod/candidate.kt) | partial-candidate | 5 | 0 | 7 |
| [Windows/Win32/System/SystemInformation/mod.rs](files/Windows/Win32/System/SystemInformation/mod/candidate.kt) | partial-candidate | 414 | 0 | 121 |
| [Windows/Win32/System/SystemServices/mod.rs](files/Windows/Win32/System/SystemServices/mod/candidate.kt) | partial-candidate | 2405 | 0 | 660 |
| [Windows/Win32/System/Threading/mod.rs](files/Windows/Win32/System/Threading/mod/candidate.kt) | partial-candidate | 378 | 0 | 422 |
| [Windows/Win32/System/Time/mod.rs](files/Windows/Win32/System/Time/mod/candidate.kt) | partial-candidate | 5 | 0 | 25 |
| [Windows/Win32/System/TpmBaseServices/mod.rs](files/Windows/Win32/System/TpmBaseServices/mod/candidate.kt) | partial-candidate | 39 | 0 | 23 |
| [Windows/Win32/System/UserAccessLogging/mod.rs](files/Windows/Win32/System/UserAccessLogging/mod/candidate.kt) | unsupported-only | 0 | 0 | 6 |
| [Windows/Win32/System/Variant/mod.rs](files/Windows/Win32/System/Variant/mod/candidate.kt) | partial-candidate | 72 | 0 | 96 |
| [Windows/Win32/System/VirtualDosMachines/mod.rs](files/Windows/Win32/System/VirtualDosMachines/mod/candidate.kt) | partial-candidate | 95 | 0 | 52 |
| [Windows/Win32/System/WindowsProgramming/mod.rs](files/Windows/Win32/System/WindowsProgramming/mod/candidate.kt) | partial-candidate | 622 | 0 | 423 |
| [Windows/Win32/System/Wmi/mod.rs](files/Windows/Win32/System/Wmi/mod/candidate.kt) | partial-candidate | 957 | 0 | 323 |
| [Windows/Win32/System/mod.rs](files/Windows/Win32/System/mod/candidate.kt) | unsupported-only | 0 | 0 | 66 |
| [Windows/Win32/UI/Accessibility/mod.rs](files/Windows/Win32/UI/Accessibility/mod/candidate.kt) | partial-candidate | 907 | 0 | 613 |
| [Windows/Win32/UI/ColorSystem/mod.rs](files/Windows/Win32/UI/ColorSystem/mod/candidate.kt) | partial-candidate | 187 | 0 | 177 |
| [Windows/Win32/UI/Controls/Dialogs/mod.rs](files/Windows/Win32/UI/Controls/Dialogs/mod/candidate.kt) | partial-candidate | 268 | 0 | 134 |
| [Windows/Win32/UI/Controls/mod.rs](files/Windows/Win32/UI/Controls/mod/candidate.kt) | partial-candidate | 4364 | 0 | 809 |
| [Windows/Win32/UI/HiDpi/mod.rs](files/Windows/Win32/UI/HiDpi/mod/candidate.kt) | partial-candidate | 27 | 0 | 35 |
| [Windows/Win32/UI/Input/Ime/mod.rs](files/Windows/Win32/UI/Input/Ime/mod/candidate.kt) | partial-candidate | 757 | 0 | 218 |
| [Windows/Win32/UI/Input/KeyboardAndMouse/mod.rs](files/Windows/Win32/UI/Input/KeyboardAndMouse/mod/candidate.kt) | partial-candidate | 418 | 0 | 133 |
| [Windows/Win32/UI/Input/Pointer/mod.rs](files/Windows/Win32/UI/Input/Pointer/mod/candidate.kt) | partial-candidate | 36 | 0 | 38 |
| [Windows/Win32/UI/Input/Touch/mod.rs](files/Windows/Win32/UI/Input/Touch/mod/candidate.kt) | partial-candidate | 32 | 0 | 21 |
| [Windows/Win32/UI/Input/XboxController/mod.rs](files/Windows/Win32/UI/Input/XboxController/mod/candidate.kt) | partial-candidate | 94 | 0 | 16 |
| [Windows/Win32/UI/Input/mod.rs](files/Windows/Win32/UI/Input/mod/candidate.kt) | partial-candidate | 40 | 0 | 42 |
| [Windows/Win32/UI/InteractionContext/mod.rs](files/Windows/Win32/UI/InteractionContext/mod/candidate.kt) | partial-candidate | 103 | 0 | 48 |
| [Windows/Win32/UI/Magnification/mod.rs](files/Windows/Win32/UI/Magnification/mod/candidate.kt) | partial-candidate | 6 | 0 | 28 |
| [Windows/Win32/UI/Shell/Common/mod.rs](files/Windows/Win32/UI/Shell/Common/mod/candidate.kt) | partial-candidate | 67 | 0 | 11 |
| [Windows/Win32/UI/Shell/PropertiesSystem/mod.rs](files/Windows/Win32/UI/Shell/PropertiesSystem/mod/candidate.kt) | partial-candidate | 207 | 0 | 81 |
| [Windows/Win32/UI/Shell/mod.rs](files/Windows/Win32/UI/Shell/mod/candidate.kt) | partial-candidate | 3536 | 0 | 1586 |
| [Windows/Win32/UI/TabletPC/mod.rs](files/Windows/Win32/UI/TabletPC/mod/candidate.kt) | partial-candidate | 1183 | 0 | 190 |
| [Windows/Win32/UI/TextServices/mod.rs](files/Windows/Win32/UI/TextServices/mod/candidate.kt) | partial-candidate | 438 | 0 | 228 |
| [Windows/Win32/UI/WindowsAndMessaging/mod.rs](files/Windows/Win32/UI/WindowsAndMessaging/mod/candidate.kt) | partial-candidate | 2207 | 0 | 704 |
| [Windows/Win32/UI/mod.rs](files/Windows/Win32/UI/mod/candidate.kt) | unsupported-only | 0 | 0 | 11 |
| [Windows/Win32/Web/InternetExplorer/mod.rs](files/Windows/Win32/Web/InternetExplorer/mod/candidate.kt) | partial-candidate | 350 | 0 | 244 |
| [Windows/Win32/Web/mod.rs](files/Windows/Win32/Web/mod/candidate.kt) | unsupported-only | 0 | 0 | 1 |
| [Windows/Win32/mod.rs](files/Windows/Win32/mod/candidate.kt) | unsupported-only | 0 | 0 | 15 |
| [Windows/mod.rs](files/Windows/mod/candidate.kt) | unsupported-only | 0 | 0 | 2 |
| [core/literals.rs](files/core/literals/candidate.kt) | unsupported-only | 0 | 0 | 6 |
| [core/mod.rs](files/core/mod/candidate.kt) | partial-candidate | 2 | 0 | 14 |
| lib.rs | blocked | 0 | 0 | 0 |

## Leading unsupported constructs

| Diagnostic | Declarations/files |
|---|---:|
| declaration Macro has no candidate rule | 20252 |
| declaration Struct has no candidate rule | 13003 |
| declaration Impl has no candidate rule | 8938 |
| non-scalar type Ptr unsupported | 6681 |
| missing/ambiguous source-backed scalar alias windows_sys::core::GUID | 4448 |
| generic scalar type unsupported | 2915 |
| declaration Union has no candidate rule | 1500 |
| qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY | 748 |
| attribute cfg requires explicit semantics/configuration | 695 |
| qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY | 343 |
| declaration Mod has no candidate rule | 246 |
| qualified type requires source-backed binding: super::super::Foundation::NTSTATUS | 34 |
| qualified type requires source-backed binding: super::super::super::Win32::Foundation::DEVPROPKEY | 14 |
| unresolved scalar type SID_IDENTIFIER_AUTHORITY | 12 |
| declaration Use has no candidate rule | 7 |
| qualified type requires source-backed binding: super::super::Foundation::HWND | 7 |
| unresolved scalar type f32 | 6 |
| unresolved scalar type GUID | 2 |
| declaration Fn has no candidate rule | 2 |
| qualified type requires source-backed binding: super::super::Foundation::HANDLE | 2 |
