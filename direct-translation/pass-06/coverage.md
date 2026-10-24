# Direct candidate coverage

249 Rust files accounted for; 118,014 mapped declarations; 52,055 additional syntax candidates requiring coder integration; 7,804 unsupported declarations retained.

`complete-candidate` means every top-level item has a supported declaration rule. `complete-syntax-candidate` also permits explicitly marked syntax requiring coder integration. Neither means whole-project compilation, production adoption or Windows ABI validation. Comment-only files are not translated files. Blocked files have no counted declaration denominator.

| Status | Files |
|---|---:|
| blocked | 1 |
| complete-candidate | 4 |
| complete-syntax-candidate | 63 |
| partial-candidate | 158 |
| unsupported-only | 23 |

Compared with pass-05: **+0 mapped, +8,925 syntax candidates, -8,925 unsupported declarations** over 249 shared completed files. Prior run complete: True.

## Declaration categories

| Syn item | Mapped | Syntax only | Unsupported |
|---|---:|---:|---:|
| Const | 112467 | 6193 | 5939 |
| Fn | 0 | 0 | 2 |
| Impl | 0 | 8925 | 13 |
| ItemType | 5547 | 3779 | 0 |
| Macro | 0 | 20189 | 63 |
| Mod | 0 | 0 | 246 |
| Struct | 0 | 12969 | 34 |
| Union | 0 | 0 | 1500 |
| Use | 0 | 0 | 7 |

## Source files

| Rust source | Status | Mapped | Syntax only | Unsupported |
|---|---|---:|---:|---:|
| [Windows/Wdk/Devices/Bluetooth/mod.rs](files/Windows/Wdk/Devices/Bluetooth/mod/candidate.kt) | unsupported-only | 0 | 0 | 18 |
| [Windows/Wdk/Devices/HumanInterfaceDevice/mod.rs](files/Windows/Wdk/Devices/HumanInterfaceDevice/mod/candidate.kt) | complete-syntax-candidate | 0 | 12 | 0 |
| [Windows/Wdk/Devices/mod.rs](files/Windows/Wdk/Devices/mod/candidate.kt) | unsupported-only | 0 | 0 | 2 |
| [Windows/Wdk/Foundation/mod.rs](files/Windows/Wdk/Foundation/mod/candidate.kt) | partial-candidate | 124 | 224 | 27 |
| [Windows/Wdk/Graphics/Direct3D/mod.rs](files/Windows/Wdk/Graphics/Direct3D/mod/candidate.kt) | partial-candidate | 1902 | 1669 | 152 |
| [Windows/Wdk/Graphics/mod.rs](files/Windows/Wdk/Graphics/mod/candidate.kt) | unsupported-only | 0 | 0 | 1 |
| [Windows/Wdk/NetworkManagement/Ndis/mod.rs](files/Windows/Wdk/NetworkManagement/Ndis/mod/candidate.kt) | partial-candidate | 2336 | 404 | 12 |
| [Windows/Wdk/NetworkManagement/WindowsFilteringPlatform/mod.rs](files/Windows/Wdk/NetworkManagement/WindowsFilteringPlatform/mod/candidate.kt) | complete-syntax-candidate | 0 | 150 | 0 |
| [Windows/Wdk/NetworkManagement/mod.rs](files/Windows/Wdk/NetworkManagement/mod/candidate.kt) | unsupported-only | 0 | 0 | 2 |
| [Windows/Wdk/Storage/FileSystem/Minifilters/mod.rs](files/Windows/Wdk/Storage/FileSystem/Minifilters/mod/candidate.kt) | partial-candidate | 118 | 438 | 9 |
| [Windows/Wdk/Storage/FileSystem/mod.rs](files/Windows/Wdk/Storage/FileSystem/mod/candidate.kt) | partial-candidate | 895 | 1119 | 38 |
| [Windows/Wdk/Storage/mod.rs](files/Windows/Wdk/Storage/mod/candidate.kt) | unsupported-only | 0 | 0 | 1 |
| [Windows/Wdk/System/IO/mod.rs](files/Windows/Wdk/System/IO/mod/candidate.kt) | complete-syntax-candidate | 0 | 1 | 0 |
| [Windows/Wdk/System/Memory/mod.rs](files/Windows/Wdk/System/Memory/mod/candidate.kt) | complete-syntax-candidate | 3 | 6 | 0 |
| [Windows/Wdk/System/OfflineRegistry/mod.rs](files/Windows/Wdk/System/OfflineRegistry/mod/candidate.kt) | complete-syntax-candidate | 0 | 25 | 0 |
| [Windows/Wdk/System/Registry/mod.rs](files/Windows/Wdk/System/Registry/mod/candidate.kt) | complete-syntax-candidate | 29 | 64 | 0 |
| [Windows/Wdk/System/SystemInformation/mod.rs](files/Windows/Wdk/System/SystemInformation/mod/candidate.kt) | complete-syntax-candidate | 12 | 6 | 0 |
| [Windows/Wdk/System/SystemServices/mod.rs](files/Windows/Wdk/System/SystemServices/mod/candidate.kt) | partial-candidate | 2690 | 3120 | 286 |
| [Windows/Wdk/System/Threading/mod.rs](files/Windows/Wdk/System/Threading/mod/candidate.kt) | complete-syntax-candidate | 121 | 24 | 0 |
| [Windows/Wdk/System/mod.rs](files/Windows/Wdk/System/mod/candidate.kt) | unsupported-only | 0 | 0 | 7 |
| [Windows/Wdk/mod.rs](files/Windows/Wdk/mod/candidate.kt) | unsupported-only | 0 | 0 | 6 |
| [Windows/Win32/Data/HtmlHelp/mod.rs](files/Windows/Win32/Data/HtmlHelp/mod/candidate.kt) | partial-candidate | 274 | 31 | 15 |
| [Windows/Win32/Data/RightsManagement/mod.rs](files/Windows/Win32/Data/RightsManagement/mod/candidate.kt) | complete-syntax-candidate | 103 | 97 | 0 |
| [Windows/Win32/Data/mod.rs](files/Windows/Win32/Data/mod/candidate.kt) | unsupported-only | 0 | 0 | 2 |
| [Windows/Win32/Devices/AllJoyn/mod.rs](files/Windows/Win32/Devices/AllJoyn/mod/candidate.kt) | partial-candidate | 530 | 614 | 9 |
| [Windows/Win32/Devices/Beep/mod.rs](files/Windows/Win32/Devices/Beep/mod/candidate.kt) | complete-syntax-candidate | 3 | 3 | 0 |
| [Windows/Win32/Devices/BiometricFramework/mod.rs](files/Windows/Win32/Devices/BiometricFramework/mod/candidate.kt) | partial-candidate | 164 | 332 | 9 |
| [Windows/Win32/Devices/Bluetooth/mod.rs](files/Windows/Win32/Devices/Bluetooth/mod/candidate.kt) | partial-candidate | 880 | 157 | 23 |
| [Windows/Win32/Devices/Cdrom/mod.rs](files/Windows/Win32/Devices/Cdrom/mod/candidate.kt) | partial-candidate | 130 | 57 | 2 |
| [Windows/Win32/Devices/Communication/mod.rs](files/Windows/Win32/Devices/Communication/mod/candidate.kt) | partial-candidate | 171 | 41 | 1 |
| [Windows/Win32/Devices/DeviceAndDriverInstallation/mod.rs](files/Windows/Win32/Devices/DeviceAndDriverInstallation/mod/candidate.kt) | partial-candidate | 1296 | 1106 | 194 |
| [Windows/Win32/Devices/DeviceQuery/mod.rs](files/Windows/Win32/Devices/DeviceQuery/mod/candidate.kt) | partial-candidate | 72 | 24 | 1 |
| [Windows/Win32/Devices/Display/mod.rs](files/Windows/Win32/Devices/Display/mod/candidate.kt) | partial-candidate | 960 | 553 | 36 |
| [Windows/Win32/Devices/Dvd/mod.rs](files/Windows/Win32/Devices/Dvd/mod/candidate.kt) | partial-candidate | 56 | 101 | 5 |
| [Windows/Win32/Devices/Enumeration/Pnp/mod.rs](files/Windows/Win32/Devices/Enumeration/Pnp/mod/candidate.kt) | partial-candidate | 55 | 15 | 10 |
| [Windows/Win32/Devices/Enumeration/mod.rs](files/Windows/Win32/Devices/Enumeration/mod/candidate.kt) | unsupported-only | 0 | 0 | 1 |
| [Windows/Win32/Devices/Fax/mod.rs](files/Windows/Win32/Devices/Fax/mod/candidate.kt) | partial-candidate | 390 | 268 | 63 |
| [Windows/Win32/Devices/HumanInterfaceDevice/mod.rs](files/Windows/Win32/Devices/HumanInterfaceDevice/mod/candidate.kt) | partial-candidate | 2382 | 265 | 104 |
| [Windows/Win32/Devices/Nfc/mod.rs](files/Windows/Win32/Devices/Nfc/mod/candidate.kt) | partial-candidate | 138 | 74 | 7 |
| [Windows/Win32/Devices/Nfp/mod.rs](files/Windows/Win32/Devices/Nfp/mod/candidate.kt) | partial-candidate | 7 | 2 | 2 |
| [Windows/Win32/Devices/PortableDevices/mod.rs](files/Windows/Win32/Devices/PortableDevices/mod/candidate.kt) | partial-candidate | 291 | 349 | 776 |
| [Windows/Win32/Devices/Properties/mod.rs](files/Windows/Win32/Devices/Properties/mod/candidate.kt) | partial-candidate | 42 | 4 | 198 |
| [Windows/Win32/Devices/Pwm/mod.rs](files/Windows/Win32/Devices/Pwm/mod/candidate.kt) | partial-candidate | 23 | 10 | 1 |
| [Windows/Win32/Devices/Sensors/mod.rs](files/Windows/Win32/Devices/Sensors/mod/candidate.kt) | partial-candidate | 106 | 53 | 281 |
| [Windows/Win32/Devices/SerialCommunication/mod.rs](files/Windows/Win32/Devices/SerialCommunication/mod/candidate.kt) | partial-candidate | 82 | 28 | 3 |
| [Windows/Win32/Devices/Tapi/mod.rs](files/Windows/Win32/Devices/Tapi/mod/candidate.kt) | partial-candidate | 1631 | 403 | 10 |
| [Windows/Win32/Devices/Usb/mod.rs](files/Windows/Win32/Devices/Usb/mod/candidate.kt) | partial-candidate | 694 | 365 | 54 |
| [Windows/Win32/Devices/WebServicesOnDevices/mod.rs](files/Windows/Win32/Devices/WebServicesOnDevices/mod/candidate.kt) | partial-candidate | 95 | 176 | 1 |
| [Windows/Win32/Devices/mod.rs](files/Windows/Win32/Devices/mod/candidate.kt) | partial-candidate | 21 | 6 | 24 |
| [Windows/Win32/Foundation/mod.rs](files/Windows/Win32/Foundation/mod/candidate.kt) | partial-candidate | 10176 | 59 | 3 |
| [Windows/Win32/Gaming/mod.rs](files/Windows/Win32/Gaming/mod/candidate.kt) | partial-candidate | 55 | 35 | 4 |
| [Windows/Win32/Globalization/mod.rs](files/Windows/Win32/Globalization/mod/candidate.kt) | partial-candidate | 3160 | 1448 | 21 |
| [Windows/Win32/Graphics/Dwm/mod.rs](files/Windows/Win32/Graphics/Dwm/mod/candidate.kt) | complete-syntax-candidate | 106 | 38 | 0 |
| [Windows/Win32/Graphics/Gdi/mod.rs](files/Windows/Win32/Graphics/Gdi/mod/candidate.kt) | partial-candidate | 1766 | 650 | 4 |
| [Windows/Win32/Graphics/GdiPlus/mod.rs](files/Windows/Win32/Graphics/GdiPlus/mod/candidate.kt) | partial-candidate | 1029 | 694 | 70 |
| [Windows/Win32/Graphics/Hlsl/mod.rs](files/Windows/Win32/Graphics/Hlsl/mod/candidate.kt) | complete-candidate | 2 | 0 | 0 |
| [Windows/Win32/Graphics/OpenGL/mod.rs](files/Windows/Win32/Graphics/OpenGL/mod/candidate.kt) | complete-syntax-candidate | 733 | 449 | 0 |
| [Windows/Win32/Graphics/Printing/PrintTicket/mod.rs](files/Windows/Win32/Graphics/Printing/PrintTicket/mod/candidate.kt) | complete-syntax-candidate | 14 | 12 | 0 |
| [Windows/Win32/Graphics/Printing/mod.rs](files/Windows/Win32/Graphics/Printing/mod/candidate.kt) | partial-candidate | 1484 | 733 | 35 |
| [Windows/Win32/Graphics/mod.rs](files/Windows/Win32/Graphics/mod/candidate.kt) | unsupported-only | 0 | 0 | 6 |
| [Windows/Win32/Management/MobileDeviceManagementRegistration/mod.rs](files/Windows/Win32/Management/MobileDeviceManagementRegistration/mod/candidate.kt) | complete-syntax-candidate | 69 | 22 | 0 |
| [Windows/Win32/Management/mod.rs](files/Windows/Win32/Management/mod/candidate.kt) | unsupported-only | 0 | 0 | 1 |
| [Windows/Win32/Media/Audio/mod.rs](files/Windows/Win32/Media/Audio/mod/candidate.kt) | partial-candidate | 638 | 377 | 35 |
| [Windows/Win32/Media/DxMediaObjects/mod.rs](files/Windows/Win32/Media/DxMediaObjects/mod/candidate.kt) | partial-candidate | 46 | 16 | 10 |
| [Windows/Win32/Media/KernelStreaming/mod.rs](files/Windows/Win32/Media/KernelStreaming/mod/candidate.kt) | partial-candidate | 1638 | 607 | 545 |
| [Windows/Win32/Media/Multimedia/mod.rs](files/Windows/Win32/Media/Multimedia/mod/candidate.kt) | partial-candidate | 4640 | 442 | 5 |
| [Windows/Win32/Media/Streaming/mod.rs](files/Windows/Win32/Media/Streaming/mod/candidate.kt) | partial-candidate | 7 | 12 | 16 |
| [Windows/Win32/Media/WindowsMediaFormat/mod.rs](files/Windows/Win32/Media/WindowsMediaFormat/mod/candidate.kt) | partial-candidate | 245 | 289 | 73 |
| [Windows/Win32/Media/mod.rs](files/Windows/Win32/Media/mod/candidate.kt) | partial-candidate | 105 | 21 | 8 |
| [Windows/Win32/NetworkManagement/Dhcp/mod.rs](files/Windows/Win32/NetworkManagement/Dhcp/mod/candidate.kt) | partial-candidate | 451 | 466 | 11 |
| [Windows/Win32/NetworkManagement/Dns/mod.rs](files/Windows/Win32/NetworkManagement/Dns/mod/candidate.kt) | partial-candidate | 411 | 265 | 18 |
| [Windows/Win32/NetworkManagement/InternetConnectionWizard/mod.rs](files/Windows/Win32/NetworkManagement/InternetConnectionWizard/mod/candidate.kt) | complete-syntax-candidate | 18 | 4 | 0 |
| [Windows/Win32/NetworkManagement/IpHelper/mod.rs](files/Windows/Win32/NetworkManagement/IpHelper/mod/candidate.kt) | partial-candidate | 630 | 539 | 27 |
| [Windows/Win32/NetworkManagement/Multicast/mod.rs](files/Windows/Win32/NetworkManagement/Multicast/mod/candidate.kt) | partial-candidate | 4 | 18 | 1 |
| [Windows/Win32/NetworkManagement/Ndis/mod.rs](files/Windows/Win32/NetworkManagement/Ndis/mod/candidate.kt) | partial-candidate | 1994 | 171 | 194 |
| [Windows/Win32/NetworkManagement/NetBios/mod.rs](files/Windows/Win32/NetworkManagement/NetBios/mod/candidate.kt) | complete-syntax-candidate | 82 | 20 | 0 |
| [Windows/Win32/NetworkManagement/NetManagement/mod.rs](files/Windows/Win32/NetworkManagement/NetManagement/mod/candidate.kt) | partial-candidate | 2209 | 678 | 8 |
| [Windows/Win32/NetworkManagement/NetShell/mod.rs](files/Windows/Win32/NetworkManagement/NetShell/mod/candidate.kt) | partial-candidate | 53 | 36 | 5 |
| [Windows/Win32/NetworkManagement/NetworkDiagnosticsFramework/mod.rs](files/Windows/Win32/NetworkManagement/NetworkDiagnosticsFramework/mod/candidate.kt) | partial-candidate | 82 | 41 | 2 |
| [Windows/Win32/NetworkManagement/P2P/mod.rs](files/Windows/Win32/NetworkManagement/P2P/mod/candidate.kt) | partial-candidate | 276 | 333 | 14 |
| [Windows/Win32/NetworkManagement/QoS/mod.rs](files/Windows/Win32/NetworkManagement/QoS/mod/candidate.kt) | partial-candidate | 554 | 204 | 30 |
| [Windows/Win32/NetworkManagement/Rras/mod.rs](files/Windows/Win32/NetworkManagement/Rras/mod/candidate.kt) | partial-candidate | 859 | 639 | 6 |
| [Windows/Win32/NetworkManagement/Snmp/mod.rs](files/Windows/Win32/NetworkManagement/Snmp/mod/candidate.kt) | partial-candidate | 172 | 120 | 3 |
| [Windows/Win32/NetworkManagement/WNet/mod.rs](files/Windows/Win32/NetworkManagement/WNet/mod/candidate.kt) | complete-syntax-candidate | 140 | 124 | 0 |
| [Windows/Win32/NetworkManagement/WebDav/mod.rs](files/Windows/Win32/NetworkManagement/WebDav/mod/candidate.kt) | complete-syntax-candidate | 11 | 18 | 0 |
| [Windows/Win32/NetworkManagement/WiFi/mod.rs](files/Windows/Win32/NetworkManagement/WiFi/mod/candidate.kt) | partial-candidate | 1270 | 574 | 109 |
| [Windows/Win32/NetworkManagement/WindowsConnectionManager/mod.rs](files/Windows/Win32/NetworkManagement/WindowsConnectionManager/mod/candidate.kt) | complete-syntax-candidate | 35 | 25 | 0 |
| [Windows/Win32/NetworkManagement/WindowsFilteringPlatform/mod.rs](files/Windows/Win32/NetworkManagement/WindowsFilteringPlatform/mod/candidate.kt) | partial-candidate | 658 | 635 | 389 |
| [Windows/Win32/NetworkManagement/WindowsFirewall/mod.rs](files/Windows/Win32/NetworkManagement/WindowsFirewall/mod/candidate.kt) | partial-candidate | 171 | 36 | 10 |
| [Windows/Win32/NetworkManagement/WindowsNetworkVirtualization/mod.rs](files/Windows/Win32/NetworkManagement/WindowsNetworkVirtualization/mod/candidate.kt) | partial-candidate | 16 | 19 | 2 |
| [Windows/Win32/NetworkManagement/mod.rs](files/Windows/Win32/NetworkManagement/mod/candidate.kt) | unsupported-only | 0 | 0 | 21 |
| [Windows/Win32/Networking/ActiveDirectory/mod.rs](files/Windows/Win32/Networking/ActiveDirectory/mod/candidate.kt) | partial-candidate | 995 | 417 | 46 |
| [Windows/Win32/Networking/Clustering/mod.rs](files/Windows/Win32/Networking/Clustering/mod/candidate.kt) | partial-candidate | 1490 | 1413 | 50 |
| [Windows/Win32/Networking/HttpServer/mod.rs](files/Windows/Win32/Networking/HttpServer/mod/candidate.kt) | partial-candidate | 379 | 194 | 2 |
| [Windows/Win32/Networking/Ldap/mod.rs](files/Windows/Win32/Networking/Ldap/mod/candidate.kt) | partial-candidate | 211 | 462 | 4 |
| [Windows/Win32/Networking/WebSocket/mod.rs](files/Windows/Win32/Networking/WebSocket/mod/candidate.kt) | partial-candidate | 40 | 23 | 1 |
| [Windows/Win32/Networking/WinHttp/mod.rs](files/Windows/Win32/Networking/WinHttp/mod/candidate.kt) | partial-candidate | 716 | 120 | 4 |
| [Windows/Win32/Networking/WinInet/mod.rs](files/Windows/Win32/Networking/WinInet/mod/candidate.kt) | partial-candidate | 1077 | 487 | 9 |
| [Windows/Win32/Networking/WinSock/mod.rs](files/Windows/Win32/Networking/WinSock/mod/candidate.kt) | partial-candidate | 1651 | 826 | 60 |
| [Windows/Win32/Networking/WindowsWebServices/mod.rs](files/Windows/Win32/Networking/WindowsWebServices/mod/candidate.kt) | complete-syntax-candidate | 1091 | 716 | 0 |
| [Windows/Win32/Networking/mod.rs](files/Windows/Win32/Networking/mod/candidate.kt) | unsupported-only | 0 | 0 | 9 |
| [Windows/Win32/Security/AppLocker/mod.rs](files/Windows/Win32/Security/AppLocker/mod/candidate.kt) | complete-syntax-candidate | 66 | 33 | 0 |
| [Windows/Win32/Security/Authentication/Identity/mod.rs](files/Windows/Win32/Security/Authentication/Identity/mod/candidate.kt) | partial-candidate | 1831 | 1122 | 76 |
| [Windows/Win32/Security/Authentication/mod.rs](files/Windows/Win32/Security/Authentication/mod/candidate.kt) | unsupported-only | 0 | 0 | 1 |
| [Windows/Win32/Security/Authorization/mod.rs](files/Windows/Win32/Security/Authorization/mod/candidate.kt) | partial-candidate | 353 | 337 | 13 |
| [Windows/Win32/Security/Credentials/mod.rs](files/Windows/Win32/Security/Credentials/mod/candidate.kt) | partial-candidate | 223 | 233 | 16 |
| [Windows/Win32/Security/Cryptography/Catalog/mod.rs](files/Windows/Win32/Security/Cryptography/Catalog/mod/candidate.kt) | complete-syntax-candidate | 38 | 53 | 0 |
| [Windows/Win32/Security/Cryptography/Certificates/mod.rs](files/Windows/Win32/Security/Cryptography/Certificates/mod/candidate.kt) | partial-candidate | 1563 | 626 | 94 |
| [Windows/Win32/Security/Cryptography/Sip/mod.rs](files/Windows/Win32/Security/Cryptography/Sip/mod/candidate.kt) | partial-candidate | 16 | 37 | 2 |
| [Windows/Win32/Security/Cryptography/UI/mod.rs](files/Windows/Win32/Security/Cryptography/UI/mod/candidate.kt) | partial-candidate | 172 | 68 | 8 |
| [Windows/Win32/Security/Cryptography/mod.rs](files/Windows/Win32/Security/Cryptography/mod/candidate.kt) | partial-candidate | 2370 | 2768 | 267 |
| [Windows/Win32/Security/DiagnosticDataQuery/mod.rs](files/Windows/Win32/Security/DiagnosticDataQuery/mod/candidate.kt) | complete-syntax-candidate | 4 | 62 | 0 |
| [Windows/Win32/Security/DirectoryServices/mod.rs](files/Windows/Win32/Security/DirectoryServices/mod/candidate.kt) | complete-syntax-candidate | 7 | 6 | 0 |
| [Windows/Win32/Security/EnterpriseData/mod.rs](files/Windows/Win32/Security/EnterpriseData/mod/candidate.kt) | complete-syntax-candidate | 11 | 16 | 0 |
| [Windows/Win32/Security/ExtensibleAuthenticationProtocol/mod.rs](files/Windows/Win32/Security/ExtensibleAuthenticationProtocol/mod/candidate.kt) | partial-candidate | 480 | 137 | 57 |
| [Windows/Win32/Security/Isolation/mod.rs](files/Windows/Win32/Security/Isolation/mod/candidate.kt) | partial-candidate | 0 | 13 | 1 |
| [Windows/Win32/Security/LicenseProtection/mod.rs](files/Windows/Win32/Security/LicenseProtection/mod/candidate.kt) | complete-syntax-candidate | 6 | 2 | 0 |
| [Windows/Win32/Security/NetworkAccessProtection/mod.rs](files/Windows/Win32/Security/NetworkAccessProtection/mod/candidate.kt) | complete-syntax-candidate | 47 | 24 | 0 |
| [Windows/Win32/Security/WinTrust/mod.rs](files/Windows/Win32/Security/WinTrust/mod/candidate.kt) | partial-candidate | 137 | 194 | 43 |
| [Windows/Win32/Security/WinWlx/mod.rs](files/Windows/Win32/Security/WinWlx/mod/candidate.kt) | complete-syntax-candidate | 63 | 53 | 0 |
| [Windows/Win32/Security/mod.rs](files/Windows/Win32/Security/mod/candidate.kt) | partial-candidate | 351 | 307 | 31 |
| [Windows/Win32/Storage/Cabinets/mod.rs](files/Windows/Win32/Storage/Cabinets/mod/candidate.kt) | partial-candidate | 72 | 51 | 1 |
| [Windows/Win32/Storage/CloudFilters/mod.rs](files/Windows/Win32/Storage/CloudFilters/mod/candidate.kt) | partial-candidate | 236 | 101 | 3 |
| [Windows/Win32/Storage/Compression/mod.rs](files/Windows/Win32/Storage/Compression/mod/candidate.kt) | complete-syntax-candidate | 13 | 18 | 0 |
| [Windows/Win32/Storage/DistributedFileSystem/mod.rs](files/Windows/Win32/Storage/DistributedFileSystem/mod/candidate.kt) | complete-syntax-candidate | 44 | 74 | 0 |
| [Windows/Win32/Storage/FileHistory/mod.rs](files/Windows/Win32/Storage/FileHistory/mod/candidate.kt) | partial-candidate | 87 | 8 | 2 |
| [Windows/Win32/Storage/FileSystem/mod.rs](files/Windows/Win32/Storage/FileSystem/mod/candidate.kt) | partial-candidate | 1078 | 778 | 41 |
| [Windows/Win32/Storage/Imapi/mod.rs](files/Windows/Win32/Storage/Imapi/mod/candidate.kt) | partial-candidate | 606 | 15 | 60 |
| [Windows/Win32/Storage/IndexServer/mod.rs](files/Windows/Win32/Storage/IndexServer/mod/candidate.kt) | partial-candidate | 176 | 20 | 11 |
| [Windows/Win32/Storage/InstallableFileSystems/mod.rs](files/Windows/Win32/Storage/InstallableFileSystems/mod/candidate.kt) | partial-candidate | 132 | 54 | 3 |
| [Windows/Win32/Storage/IscsiDisc/mod.rs](files/Windows/Win32/Storage/IscsiDisc/mod/candidate.kt) | partial-candidate | 193 | 257 | 5 |
| [Windows/Win32/Storage/Jet/mod.rs](files/Windows/Win32/Storage/Jet/mod/candidate.kt) | partial-candidate | 982 | 408 | 19 |
| [Windows/Win32/Storage/Nvme/mod.rs](files/Windows/Win32/Storage/Nvme/mod/candidate.kt) | partial-candidate | 554 | 490 | 129 |
| [Windows/Win32/Storage/OfflineFiles/mod.rs](files/Windows/Win32/Storage/OfflineFiles/mod/candidate.kt) | partial-candidate | 269 | 5 | 2 |
| [Windows/Win32/Storage/OperationRecorder/mod.rs](files/Windows/Win32/Storage/OperationRecorder/mod/candidate.kt) | complete-syntax-candidate | 4 | 4 | 0 |
| [Windows/Win32/Storage/Packaging/Appx/mod.rs](files/Windows/Win32/Storage/Packaging/Appx/mod/candidate.kt) | partial-candidate | 189 | 93 | 6 |
| [Windows/Win32/Storage/Packaging/mod.rs](files/Windows/Win32/Storage/Packaging/mod/candidate.kt) | unsupported-only | 0 | 0 | 1 |
| [Windows/Win32/Storage/ProjectedFileSystem/mod.rs](files/Windows/Win32/Storage/ProjectedFileSystem/mod/candidate.kt) | partial-candidate | 63 | 60 | 3 |
| [Windows/Win32/Storage/StructuredStorage/mod.rs](files/Windows/Win32/Storage/StructuredStorage/mod/candidate.kt) | complete-candidate | 3 | 0 | 0 |
| [Windows/Win32/Storage/Vhd/mod.rs](files/Windows/Win32/Storage/Vhd/mod/candidate.kt) | partial-candidate | 202 | 129 | 20 |
| [Windows/Win32/Storage/Xps/mod.rs](files/Windows/Win32/Storage/Xps/mod/candidate.kt) | partial-candidate | 251 | 35 | 4 |
| [Windows/Win32/Storage/mod.rs](files/Windows/Win32/Storage/mod/candidate.kt) | unsupported-only | 0 | 0 | 19 |
| [Windows/Win32/System/AddressBook/mod.rs](files/Windows/Win32/System/AddressBook/mod/candidate.kt) | partial-candidate | 217 | 208 | 6 |
| [Windows/Win32/System/Antimalware/mod.rs](files/Windows/Win32/System/Antimalware/mod/candidate.kt) | partial-candidate | 35 | 23 | 2 |
| [Windows/Win32/System/ApplicationInstallationAndServicing/mod.rs](files/Windows/Win32/System/ApplicationInstallationAndServicing/mod/candidate.kt) | partial-candidate | 1106 | 669 | 16 |
| [Windows/Win32/System/ApplicationVerifier/mod.rs](files/Windows/Win32/System/ApplicationVerifier/mod/candidate.kt) | complete-syntax-candidate | 24 | 9 | 0 |
| [Windows/Win32/System/ClrHosting/mod.rs](files/Windows/Win32/System/ClrHosting/mod/candidate.kt) | partial-candidate | 196 | 53 | 13 |
| [Windows/Win32/System/Com/Marshal/mod.rs](files/Windows/Win32/System/Com/Marshal/mod/candidate.kt) | complete-syntax-candidate | 3 | 113 | 0 |
| [Windows/Win32/System/Com/StructuredStorage/mod.rs](files/Windows/Win32/System/Com/StructuredStorage/mod/candidate.kt) | partial-candidate | 114 | 197 | 3 |
| [Windows/Win32/System/Com/Urlmon/mod.rs](files/Windows/Win32/System/Com/Urlmon/mod/candidate.kt) | complete-syntax-candidate | 703 | 96 | 0 |
| [Windows/Win32/System/Com/mod.rs](files/Windows/Win32/System/Com/mod/candidate.kt) | partial-candidate | 519 | 237 | 14 |
| [Windows/Win32/System/ComponentServices/mod.rs](files/Windows/Win32/System/ComponentServices/mod/candidate.kt) | partial-candidate | 359 | 32 | 32 |
| [Windows/Win32/System/Console/mod.rs](files/Windows/Win32/System/Console/mod/candidate.kt) | partial-candidate | 96 | 130 | 3 |
| [Windows/Win32/System/CorrelationVector/mod.rs](files/Windows/Win32/System/CorrelationVector/mod/candidate.kt) | complete-syntax-candidate | 5 | 6 | 0 |
| [Windows/Win32/System/DataExchange/mod.rs](files/Windows/Win32/System/DataExchange/mod/candidate.kt) | complete-syntax-candidate | 144 | 124 | 0 |
| [Windows/Win32/System/DeploymentServices/mod.rs](files/Windows/Win32/System/DeploymentServices/mod/candidate.kt) | partial-candidate | 293 | 128 | 26 |
| [Windows/Win32/System/DeveloperLicensing/mod.rs](files/Windows/Win32/System/DeveloperLicensing/mod/candidate.kt) | complete-syntax-candidate | 0 | 3 | 0 |
| [Windows/Win32/System/Diagnostics/Ceip/mod.rs](files/Windows/Win32/System/Diagnostics/Ceip/mod/candidate.kt) | complete-syntax-candidate | 0 | 1 | 0 |
| [Windows/Win32/System/Diagnostics/Debug/Extensions/mod.rs](files/Windows/Win32/System/Diagnostics/Debug/Extensions/mod/candidate.kt) | partial-candidate | 1911 | 328 | 14 |
| [Windows/Win32/System/Diagnostics/Debug/mod.rs](files/Windows/Win32/System/Diagnostics/Debug/mod/candidate.kt) | partial-candidate | 1691 | 866 | 35 |
| [Windows/Win32/System/Diagnostics/Etw/mod.rs](files/Windows/Win32/System/Diagnostics/Etw/mod/candidate.kt) | partial-candidate | 697 | 302 | 76 |
| [Windows/Win32/System/Diagnostics/ProcessSnapshotting/mod.rs](files/Windows/Win32/System/Diagnostics/ProcessSnapshotting/mod/candidate.kt) | partial-candidate | 65 | 43 | 1 |
| [Windows/Win32/System/Diagnostics/ToolHelp/mod.rs](files/Windows/Win32/System/Diagnostics/ToolHelp/mod/candidate.kt) | complete-syntax-candidate | 15 | 28 | 0 |
| [Windows/Win32/System/Diagnostics/TraceLogging/mod.rs](files/Windows/Win32/System/Diagnostics/TraceLogging/mod/candidate.kt) | complete-candidate | 105 | 0 | 0 |
| [Windows/Win32/System/Diagnostics/mod.rs](files/Windows/Win32/System/Diagnostics/mod/candidate.kt) | unsupported-only | 0 | 0 | 6 |
| [Windows/Win32/System/DistributedTransactionCoordinator/mod.rs](files/Windows/Win32/System/DistributedTransactionCoordinator/mod/candidate.kt) | partial-candidate | 210 | 31 | 2 |
| [Windows/Win32/System/Environment/mod.rs](files/Windows/Win32/System/Environment/mod/candidate.kt) | complete-syntax-candidate | 23 | 72 | 0 |
| [Windows/Win32/System/ErrorReporting/mod.rs](files/Windows/Win32/System/ErrorReporting/mod/candidate.kt) | complete-syntax-candidate | 143 | 81 | 0 |
| [Windows/Win32/System/EventCollector/mod.rs](files/Windows/Win32/System/EventCollector/mod/candidate.kt) | partial-candidate | 82 | 18 | 1 |
| [Windows/Win32/System/EventLog/mod.rs](files/Windows/Win32/System/EventLog/mod/candidate.kt) | partial-candidate | 217 | 65 | 1 |
| [Windows/Win32/System/EventNotificationService/mod.rs](files/Windows/Win32/System/EventNotificationService/mod/candidate.kt) | partial-candidate | 8 | 5 | 8 |
| [Windows/Win32/System/GroupPolicy/mod.rs](files/Windows/Win32/System/GroupPolicy/mod/candidate.kt) | partial-candidate | 194 | 68 | 51 |
| [Windows/Win32/System/HostCompute/mod.rs](files/Windows/Win32/System/HostCompute/mod/candidate.kt) | complete-syntax-candidate | 0 | 1 | 0 |
| [Windows/Win32/System/HostComputeNetwork/mod.rs](files/Windows/Win32/System/HostComputeNetwork/mod/candidate.kt) | complete-syntax-candidate | 23 | 46 | 0 |
| [Windows/Win32/System/HostComputeSystem/mod.rs](files/Windows/Win32/System/HostComputeSystem/mod/candidate.kt) | complete-syntax-candidate | 70 | 78 | 0 |
| [Windows/Win32/System/Hypervisor/mod.rs](files/Windows/Win32/System/Hypervisor/mod/candidate.kt) | partial-candidate | 693 | 331 | 57 |
| [Windows/Win32/System/IO/mod.rs](files/Windows/Win32/System/IO/mod/candidate.kt) | partial-candidate | 0 | 22 | 2 |
| [Windows/Win32/System/Iis/mod.rs](files/Windows/Win32/System/Iis/mod/candidate.kt) | partial-candidate | 903 | 150 | 21 |
| [Windows/Win32/System/Ioctl/mod.rs](files/Windows/Win32/System/Ioctl/mod/candidate.kt) | partial-candidate | 1736 | 730 | 69 |
| [Windows/Win32/System/JobObjects/mod.rs](files/Windows/Win32/System/JobObjects/mod/candidate.kt) | partial-candidate | 128 | 56 | 7 |
| [Windows/Win32/System/Js/mod.rs](files/Windows/Win32/System/Js/mod/candidate.kt) | complete-syntax-candidate | 56 | 87 | 0 |
| [Windows/Win32/System/Kernel/mod.rs](files/Windows/Win32/System/Kernel/mod/candidate.kt) | partial-candidate | 50 | 53 | 7 |
| [Windows/Win32/System/LibraryLoader/mod.rs](files/Windows/Win32/System/LibraryLoader/mod/candidate.kt) | complete-syntax-candidate | 29 | 63 | 0 |
| [Windows/Win32/System/Mailslots/mod.rs](files/Windows/Win32/System/Mailslots/mod/candidate.kt) | complete-syntax-candidate | 0 | 4 | 0 |
| [Windows/Win32/System/Mapi/mod.rs](files/Windows/Win32/System/Mapi/mod/candidate.kt) | complete-syntax-candidate | 55 | 28 | 0 |
| [Windows/Win32/System/Memory/NonVolatile/mod.rs](files/Windows/Win32/System/Memory/NonVolatile/mod/candidate.kt) | complete-syntax-candidate | 0 | 9 | 0 |
| [Windows/Win32/System/Memory/mod.rs](files/Windows/Win32/System/Memory/mod/candidate.kt) | partial-candidate | 159 | 139 | 4 |
| [Windows/Win32/System/MessageQueuing/mod.rs](files/Windows/Win32/System/MessageQueuing/mod/candidate.kt) | partial-candidate | 527 | 88 | 17 |
| [Windows/Win32/System/MixedReality/mod.rs](files/Windows/Win32/System/MixedReality/mod/candidate.kt) | partial-candidate | 0 | 2 | 1 |
| [Windows/Win32/System/Ole/mod.rs](files/Windows/Win32/System/Ole/mod/candidate.kt) | partial-candidate | 1082 | 592 | 35 |
| [Windows/Win32/System/PasswordManagement/mod.rs](files/Windows/Win32/System/PasswordManagement/mod/candidate.kt) | complete-syntax-candidate | 0 | 10 | 0 |
| [Windows/Win32/System/Performance/HardwareCounterProfiling/mod.rs](files/Windows/Win32/System/Performance/HardwareCounterProfiling/mod/candidate.kt) | complete-syntax-candidate | 3 | 7 | 0 |
| [Windows/Win32/System/Performance/mod.rs](files/Windows/Win32/System/Performance/mod/candidate.kt) | partial-candidate | 350 | 232 | 41 |
| [Windows/Win32/System/Pipes/mod.rs](files/Windows/Win32/System/Pipes/mod/candidate.kt) | complete-syntax-candidate | 15 | 22 | 0 |
| [Windows/Win32/System/Power/mod.rs](files/Windows/Win32/System/Power/mod/candidate.kt) | partial-candidate | 471 | 209 | 33 |
| [Windows/Win32/System/ProcessStatus/mod.rs](files/Windows/Win32/System/ProcessStatus/mod/candidate.kt) | partial-candidate | 6 | 76 | 3 |
| [Windows/Win32/System/Recovery/mod.rs](files/Windows/Win32/System/Recovery/mod/candidate.kt) | complete-syntax-candidate | 5 | 8 | 0 |
| [Windows/Win32/System/Registry/mod.rs](files/Windows/Win32/System/Registry/mod/candidate.kt) | partial-candidate | 196 | 849 | 10 |
| [Windows/Win32/System/RemoteDesktop/mod.rs](files/Windows/Win32/System/RemoteDesktop/mod/candidate.kt) | partial-candidate | 576 | 237 | 25 |
| [Windows/Win32/System/RemoteManagement/mod.rs](files/Windows/Win32/System/RemoteManagement/mod/candidate.kt) | partial-candidate | 641 | 119 | 5 |
| [Windows/Win32/System/RestartManager/mod.rs](files/Windows/Win32/System/RestartManager/mod/candidate.kt) | partial-candidate | 42 | 18 | 1 |
| [Windows/Win32/System/Restore/mod.rs](files/Windows/Win32/System/Restore/mod/candidate.kt) | complete-syntax-candidate | 32 | 10 | 0 |
| [Windows/Win32/System/Rpc/mod.rs](files/Windows/Win32/System/Rpc/mod/candidate.kt) | partial-candidate | 504 | 815 | 26 |
| [Windows/Win32/System/Search/Common/mod.rs](files/Windows/Win32/System/Search/Common/mod/candidate.kt) | complete-candidate | 21 | 0 | 0 |
| [Windows/Win32/System/Search/mod.rs](files/Windows/Win32/System/Search/mod/candidate.kt) | partial-candidate | 4485 | 425 | 66 |
| [Windows/Win32/System/SecurityCenter/mod.rs](files/Windows/Win32/System/SecurityCenter/mod/candidate.kt) | partial-candidate | 32 | 6 | 2 |
| [Windows/Win32/System/Services/mod.rs](files/Windows/Win32/System/Services/mod/candidate.kt) | partial-candidate | 214 | 144 | 12 |
| [Windows/Win32/System/SetupAndMigration/mod.rs](files/Windows/Win32/System/SetupAndMigration/mod/candidate.kt) | complete-syntax-candidate | 0 | 4 | 0 |
| [Windows/Win32/System/Shutdown/mod.rs](files/Windows/Win32/System/Shutdown/mod/candidate.kt) | complete-syntax-candidate | 97 | 14 | 0 |
| [Windows/Win32/System/StationsAndDesktops/mod.rs](files/Windows/Win32/System/StationsAndDesktops/mod/candidate.kt) | complete-syntax-candidate | 40 | 40 | 0 |
| [Windows/Win32/System/SubsystemForLinux/mod.rs](files/Windows/Win32/System/SubsystemForLinux/mod/candidate.kt) | complete-syntax-candidate | 5 | 7 | 0 |
| [Windows/Win32/System/SystemInformation/mod.rs](files/Windows/Win32/System/SystemInformation/mod/candidate.kt) | partial-candidate | 414 | 113 | 8 |
| [Windows/Win32/System/SystemServices/mod.rs](files/Windows/Win32/System/SystemServices/mod/candidate.kt) | partial-candidate | 2405 | 389 | 271 |
| [Windows/Win32/System/Threading/mod.rs](files/Windows/Win32/System/Threading/mod/candidate.kt) | partial-candidate | 378 | 415 | 7 |
| [Windows/Win32/System/Time/mod.rs](files/Windows/Win32/System/Time/mod/candidate.kt) | complete-syntax-candidate | 5 | 25 | 0 |
| [Windows/Win32/System/TpmBaseServices/mod.rs](files/Windows/Win32/System/TpmBaseServices/mod/candidate.kt) | partial-candidate | 39 | 22 | 1 |
| [Windows/Win32/System/UserAccessLogging/mod.rs](files/Windows/Win32/System/UserAccessLogging/mod/candidate.kt) | complete-syntax-candidate | 0 | 6 | 0 |
| [Windows/Win32/System/Variant/mod.rs](files/Windows/Win32/System/Variant/mod/candidate.kt) | partial-candidate | 72 | 94 | 2 |
| [Windows/Win32/System/VirtualDosMachines/mod.rs](files/Windows/Win32/System/VirtualDosMachines/mod/candidate.kt) | partial-candidate | 95 | 51 | 1 |
| [Windows/Win32/System/WindowsProgramming/mod.rs](files/Windows/Win32/System/WindowsProgramming/mod/candidate.kt) | partial-candidate | 622 | 391 | 32 |
| [Windows/Win32/System/Wmi/mod.rs](files/Windows/Win32/System/Wmi/mod/candidate.kt) | partial-candidate | 957 | 274 | 49 |
| [Windows/Win32/System/mod.rs](files/Windows/Win32/System/mod/candidate.kt) | unsupported-only | 0 | 0 | 66 |
| [Windows/Win32/UI/Accessibility/mod.rs](files/Windows/Win32/UI/Accessibility/mod/candidate.kt) | partial-candidate | 907 | 195 | 418 |
| [Windows/Win32/UI/ColorSystem/mod.rs](files/Windows/Win32/UI/ColorSystem/mod/candidate.kt) | partial-candidate | 187 | 175 | 2 |
| [Windows/Win32/UI/Controls/Dialogs/mod.rs](files/Windows/Win32/UI/Controls/Dialogs/mod/candidate.kt) | complete-syntax-candidate | 268 | 134 | 0 |
| [Windows/Win32/UI/Controls/mod.rs](files/Windows/Win32/UI/Controls/mod/candidate.kt) | partial-candidate | 4364 | 764 | 45 |
| [Windows/Win32/UI/HiDpi/mod.rs](files/Windows/Win32/UI/HiDpi/mod/candidate.kt) | partial-candidate | 27 | 30 | 5 |
| [Windows/Win32/UI/Input/Ime/mod.rs](files/Windows/Win32/UI/Input/Ime/mod/candidate.kt) | partial-candidate | 757 | 198 | 20 |
| [Windows/Win32/UI/Input/KeyboardAndMouse/mod.rs](files/Windows/Win32/UI/Input/KeyboardAndMouse/mod/candidate.kt) | partial-candidate | 418 | 132 | 1 |
| [Windows/Win32/UI/Input/Pointer/mod.rs](files/Windows/Win32/UI/Input/Pointer/mod/candidate.kt) | partial-candidate | 36 | 37 | 1 |
| [Windows/Win32/UI/Input/Touch/mod.rs](files/Windows/Win32/UI/Input/Touch/mod/candidate.kt) | partial-candidate | 32 | 19 | 2 |
| [Windows/Win32/UI/Input/XboxController/mod.rs](files/Windows/Win32/UI/Input/XboxController/mod/candidate.kt) | complete-syntax-candidate | 94 | 16 | 0 |
| [Windows/Win32/UI/Input/mod.rs](files/Windows/Win32/UI/Input/mod/candidate.kt) | partial-candidate | 40 | 34 | 8 |
| [Windows/Win32/UI/InteractionContext/mod.rs](files/Windows/Win32/UI/InteractionContext/mod/candidate.kt) | partial-candidate | 103 | 46 | 2 |
| [Windows/Win32/UI/Magnification/mod.rs](files/Windows/Win32/UI/Magnification/mod/candidate.kt) | complete-syntax-candidate | 6 | 28 | 0 |
| [Windows/Win32/UI/Shell/Common/mod.rs](files/Windows/Win32/UI/Shell/Common/mod/candidate.kt) | partial-candidate | 67 | 10 | 1 |
| [Windows/Win32/UI/Shell/PropertiesSystem/mod.rs](files/Windows/Win32/UI/Shell/PropertiesSystem/mod/candidate.kt) | partial-candidate | 207 | 78 | 3 |
| [Windows/Win32/UI/Shell/mod.rs](files/Windows/Win32/UI/Shell/mod/candidate.kt) | partial-candidate | 3536 | 1094 | 492 |
| [Windows/Win32/UI/TabletPC/mod.rs](files/Windows/Win32/UI/TabletPC/mod/candidate.kt) | partial-candidate | 1183 | 139 | 51 |
| [Windows/Win32/UI/TextServices/mod.rs](files/Windows/Win32/UI/TextServices/mod/candidate.kt) | partial-candidate | 438 | 41 | 187 |
| [Windows/Win32/UI/WindowsAndMessaging/mod.rs](files/Windows/Win32/UI/WindowsAndMessaging/mod/candidate.kt) | partial-candidate | 2207 | 594 | 110 |
| [Windows/Win32/UI/mod.rs](files/Windows/Win32/UI/mod/candidate.kt) | unsupported-only | 0 | 0 | 11 |
| [Windows/Win32/Web/InternetExplorer/mod.rs](files/Windows/Win32/Web/InternetExplorer/mod/candidate.kt) | partial-candidate | 350 | 221 | 23 |
| [Windows/Win32/Web/mod.rs](files/Windows/Win32/Web/mod/candidate.kt) | unsupported-only | 0 | 0 | 1 |
| [Windows/Win32/mod.rs](files/Windows/Win32/mod/candidate.kt) | unsupported-only | 0 | 0 | 15 |
| [Windows/mod.rs](files/Windows/mod/candidate.kt) | unsupported-only | 0 | 0 | 2 |
| [core/literals.rs](files/core/literals/candidate.kt) | unsupported-only | 0 | 0 | 6 |
| [core/mod.rs](files/core/mod/candidate.kt) | partial-candidate | 2 | 9 | 5 |
| lib.rs | blocked | 0 | 0 | 0 |

## Leading unsupported constructs

| Diagnostic | Declarations/files |
|---|---:|
| missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule | 4448 |
| declaration Union has no candidate rule; syntax: no per-file syntax rule for Union | 1500 |
| qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule | 748 |
| qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule | 343 |
| non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule | 308 |
| declaration Mod has no candidate rule; syntax: no per-file syntax rule for Mod | 246 |
| foreign declaration requires explicit native target and interop package; syntax: foreign signature shape unsupported | 49 |
| qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: constant expression has no syntax candidate rule | 34 |
| declaration Struct has no candidate rule; syntax: only named record shapes currently supported | 34 |
| qualified type requires source-backed binding: super::super::super::Win32::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule | 14 |
| declaration Impl has no candidate rule; syntax: factory impl contains Const; no associated items are omitted | 12 |
| unresolved scalar type SID_IDENTIFIER_AUTHORITY; syntax: constant expression has no syntax candidate rule | 12 |
| attribute cfg requires explicit semantics/configuration; syntax: foreign signature shape unsupported | 12 |
| attribute cfg requires explicit semantics/configuration; syntax: constant expression has no syntax candidate rule | 11 |
| declaration Use has no candidate rule; syntax: no per-file syntax rule for Use | 7 |
| qualified type requires source-backed binding: super::super::Foundation::HWND; syntax: constant expression has no syntax candidate rule | 7 |
| unresolved scalar type f32; syntax: constant expression has no syntax candidate rule | 6 |
| unresolved scalar type GUID; syntax: constant expression has no syntax candidate rule | 2 |
| attribute macro_export requires explicit semantics/configuration; syntax: macro has no recognized windows-link contract | 2 |
| declaration Fn has no candidate rule; syntax: no per-file syntax rule for Fn | 2 |
