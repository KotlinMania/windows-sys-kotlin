# Direct candidate coverage

249 Rust files accounted for; 118,014 mapped declarations; 43,130 additional syntax candidates requiring coder integration; 16,729 unsupported declarations retained.

`complete-candidate` means every top-level item has a supported declaration rule. `complete-syntax-candidate` also permits explicitly marked syntax requiring coder integration. Neither means whole-project compilation, production adoption or Windows ABI validation. Comment-only files are not translated files. Blocked files have no counted declaration denominator.

| Status | Files |
|---|---:|
| blocked | 1 |
| complete-candidate | 4 |
| complete-syntax-candidate | 26 |
| partial-candidate | 195 |
| unsupported-only | 23 |

Compared with pass-04: **+0 mapped, +6,193 syntax candidates, -6,193 unsupported declarations** over 249 shared completed files. Prior run complete: True.

## Declaration categories

| Syn item | Mapped | Syntax only | Unsupported |
|---|---:|---:|---:|
| Const | 112467 | 6193 | 5939 |
| Fn | 0 | 0 | 2 |
| Impl | 0 | 0 | 8938 |
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
| [Windows/Wdk/Devices/HumanInterfaceDevice/mod.rs](files/Windows/Wdk/Devices/HumanInterfaceDevice/mod/candidate.kt) | partial-candidate | 0 | 10 | 2 |
| [Windows/Wdk/Devices/mod.rs](files/Windows/Wdk/Devices/mod/candidate.kt) | unsupported-only | 0 | 0 | 2 |
| [Windows/Wdk/Foundation/mod.rs](files/Windows/Wdk/Foundation/mod/candidate.kt) | partial-candidate | 124 | 136 | 115 |
| [Windows/Wdk/Graphics/Direct3D/mod.rs](files/Windows/Wdk/Graphics/Direct3D/mod/candidate.kt) | partial-candidate | 1902 | 1194 | 627 |
| [Windows/Wdk/Graphics/mod.rs](files/Windows/Wdk/Graphics/mod/candidate.kt) | unsupported-only | 0 | 0 | 1 |
| [Windows/Wdk/NetworkManagement/Ndis/mod.rs](files/Windows/Wdk/NetworkManagement/Ndis/mod/candidate.kt) | partial-candidate | 2336 | 333 | 83 |
| [Windows/Wdk/NetworkManagement/WindowsFilteringPlatform/mod.rs](files/Windows/Wdk/NetworkManagement/WindowsFilteringPlatform/mod/candidate.kt) | complete-syntax-candidate | 0 | 150 | 0 |
| [Windows/Wdk/NetworkManagement/mod.rs](files/Windows/Wdk/NetworkManagement/mod/candidate.kt) | unsupported-only | 0 | 0 | 2 |
| [Windows/Wdk/Storage/FileSystem/Minifilters/mod.rs](files/Windows/Wdk/Storage/FileSystem/Minifilters/mod/candidate.kt) | partial-candidate | 118 | 371 | 76 |
| [Windows/Wdk/Storage/FileSystem/mod.rs](files/Windows/Wdk/Storage/FileSystem/mod/candidate.kt) | partial-candidate | 895 | 974 | 183 |
| [Windows/Wdk/Storage/mod.rs](files/Windows/Wdk/Storage/mod/candidate.kt) | unsupported-only | 0 | 0 | 1 |
| [Windows/Wdk/System/IO/mod.rs](files/Windows/Wdk/System/IO/mod/candidate.kt) | complete-syntax-candidate | 0 | 1 | 0 |
| [Windows/Wdk/System/Memory/mod.rs](files/Windows/Wdk/System/Memory/mod/candidate.kt) | complete-syntax-candidate | 3 | 6 | 0 |
| [Windows/Wdk/System/OfflineRegistry/mod.rs](files/Windows/Wdk/System/OfflineRegistry/mod/candidate.kt) | complete-syntax-candidate | 0 | 25 | 0 |
| [Windows/Wdk/System/Registry/mod.rs](files/Windows/Wdk/System/Registry/mod/candidate.kt) | partial-candidate | 29 | 57 | 7 |
| [Windows/Wdk/System/SystemInformation/mod.rs](files/Windows/Wdk/System/SystemInformation/mod/candidate.kt) | complete-syntax-candidate | 12 | 6 | 0 |
| [Windows/Wdk/System/SystemServices/mod.rs](files/Windows/Wdk/System/SystemServices/mod/candidate.kt) | partial-candidate | 2690 | 2481 | 925 |
| [Windows/Wdk/System/Threading/mod.rs](files/Windows/Wdk/System/Threading/mod/candidate.kt) | complete-syntax-candidate | 121 | 24 | 0 |
| [Windows/Wdk/System/mod.rs](files/Windows/Wdk/System/mod/candidate.kt) | unsupported-only | 0 | 0 | 7 |
| [Windows/Wdk/mod.rs](files/Windows/Wdk/mod/candidate.kt) | unsupported-only | 0 | 0 | 6 |
| [Windows/Win32/Data/HtmlHelp/mod.rs](files/Windows/Win32/Data/HtmlHelp/mod/candidate.kt) | partial-candidate | 274 | 19 | 27 |
| [Windows/Win32/Data/RightsManagement/mod.rs](files/Windows/Win32/Data/RightsManagement/mod/candidate.kt) | partial-candidate | 103 | 92 | 5 |
| [Windows/Win32/Data/mod.rs](files/Windows/Win32/Data/mod/candidate.kt) | unsupported-only | 0 | 0 | 2 |
| [Windows/Win32/Devices/AllJoyn/mod.rs](files/Windows/Win32/Devices/AllJoyn/mod/candidate.kt) | partial-candidate | 530 | 608 | 15 |
| [Windows/Win32/Devices/Beep/mod.rs](files/Windows/Win32/Devices/Beep/mod/candidate.kt) | complete-syntax-candidate | 3 | 3 | 0 |
| [Windows/Win32/Devices/BiometricFramework/mod.rs](files/Windows/Win32/Devices/BiometricFramework/mod/candidate.kt) | partial-candidate | 164 | 286 | 55 |
| [Windows/Win32/Devices/Bluetooth/mod.rs](files/Windows/Win32/Devices/Bluetooth/mod/candidate.kt) | partial-candidate | 880 | 115 | 65 |
| [Windows/Win32/Devices/Cdrom/mod.rs](files/Windows/Win32/Devices/Cdrom/mod/candidate.kt) | partial-candidate | 130 | 34 | 25 |
| [Windows/Win32/Devices/Communication/mod.rs](files/Windows/Win32/Devices/Communication/mod/candidate.kt) | partial-candidate | 171 | 37 | 5 |
| [Windows/Win32/Devices/DeviceAndDriverInstallation/mod.rs](files/Windows/Win32/Devices/DeviceAndDriverInstallation/mod/candidate.kt) | partial-candidate | 1296 | 979 | 321 |
| [Windows/Win32/Devices/DeviceQuery/mod.rs](files/Windows/Win32/Devices/DeviceQuery/mod/candidate.kt) | partial-candidate | 72 | 20 | 5 |
| [Windows/Win32/Devices/Display/mod.rs](files/Windows/Win32/Devices/Display/mod/candidate.kt) | partial-candidate | 960 | 419 | 170 |
| [Windows/Win32/Devices/Dvd/mod.rs](files/Windows/Win32/Devices/Dvd/mod/candidate.kt) | partial-candidate | 56 | 55 | 51 |
| [Windows/Win32/Devices/Enumeration/Pnp/mod.rs](files/Windows/Win32/Devices/Enumeration/Pnp/mod/candidate.kt) | partial-candidate | 55 | 14 | 11 |
| [Windows/Win32/Devices/Enumeration/mod.rs](files/Windows/Win32/Devices/Enumeration/mod/candidate.kt) | unsupported-only | 0 | 0 | 1 |
| [Windows/Win32/Devices/Fax/mod.rs](files/Windows/Win32/Devices/Fax/mod/candidate.kt) | partial-candidate | 390 | 237 | 94 |
| [Windows/Win32/Devices/HumanInterfaceDevice/mod.rs](files/Windows/Win32/Devices/HumanInterfaceDevice/mod/candidate.kt) | partial-candidate | 2382 | 201 | 168 |
| [Windows/Win32/Devices/Nfc/mod.rs](files/Windows/Win32/Devices/Nfc/mod/candidate.kt) | partial-candidate | 138 | 52 | 29 |
| [Windows/Win32/Devices/Nfp/mod.rs](files/Windows/Win32/Devices/Nfp/mod/candidate.kt) | partial-candidate | 7 | 1 | 3 |
| [Windows/Win32/Devices/PortableDevices/mod.rs](files/Windows/Win32/Devices/PortableDevices/mod/candidate.kt) | partial-candidate | 291 | 349 | 776 |
| [Windows/Win32/Devices/Properties/mod.rs](files/Windows/Win32/Devices/Properties/mod/candidate.kt) | partial-candidate | 42 | 2 | 200 |
| [Windows/Win32/Devices/Pwm/mod.rs](files/Windows/Win32/Devices/Pwm/mod/candidate.kt) | partial-candidate | 23 | 10 | 1 |
| [Windows/Win32/Devices/Sensors/mod.rs](files/Windows/Win32/Devices/Sensors/mod/candidate.kt) | partial-candidate | 106 | 48 | 286 |
| [Windows/Win32/Devices/SerialCommunication/mod.rs](files/Windows/Win32/Devices/SerialCommunication/mod/candidate.kt) | partial-candidate | 82 | 24 | 7 |
| [Windows/Win32/Devices/Tapi/mod.rs](files/Windows/Win32/Devices/Tapi/mod/candidate.kt) | partial-candidate | 1631 | 372 | 41 |
| [Windows/Win32/Devices/Usb/mod.rs](files/Windows/Win32/Devices/Usb/mod/candidate.kt) | partial-candidate | 694 | 237 | 182 |
| [Windows/Win32/Devices/WebServicesOnDevices/mod.rs](files/Windows/Win32/Devices/WebServicesOnDevices/mod/candidate.kt) | partial-candidate | 95 | 108 | 69 |
| [Windows/Win32/Devices/mod.rs](files/Windows/Win32/Devices/mod/candidate.kt) | partial-candidate | 21 | 4 | 26 |
| [Windows/Win32/Foundation/mod.rs](files/Windows/Win32/Foundation/mod/candidate.kt) | partial-candidate | 10176 | 54 | 8 |
| [Windows/Win32/Gaming/mod.rs](files/Windows/Win32/Gaming/mod/candidate.kt) | partial-candidate | 55 | 35 | 4 |
| [Windows/Win32/Globalization/mod.rs](files/Windows/Win32/Globalization/mod/candidate.kt) | partial-candidate | 3160 | 1418 | 51 |
| [Windows/Win32/Graphics/Dwm/mod.rs](files/Windows/Win32/Graphics/Dwm/mod/candidate.kt) | partial-candidate | 106 | 37 | 1 |
| [Windows/Win32/Graphics/Gdi/mod.rs](files/Windows/Win32/Graphics/Gdi/mod/candidate.kt) | partial-candidate | 1766 | 581 | 73 |
| [Windows/Win32/Graphics/GdiPlus/mod.rs](files/Windows/Win32/Graphics/GdiPlus/mod/candidate.kt) | partial-candidate | 1029 | 681 | 83 |
| [Windows/Win32/Graphics/Hlsl/mod.rs](files/Windows/Win32/Graphics/Hlsl/mod/candidate.kt) | complete-candidate | 2 | 0 | 0 |
| [Windows/Win32/Graphics/OpenGL/mod.rs](files/Windows/Win32/Graphics/OpenGL/mod/candidate.kt) | complete-syntax-candidate | 733 | 449 | 0 |
| [Windows/Win32/Graphics/Printing/PrintTicket/mod.rs](files/Windows/Win32/Graphics/Printing/PrintTicket/mod/candidate.kt) | complete-syntax-candidate | 14 | 12 | 0 |
| [Windows/Win32/Graphics/Printing/mod.rs](files/Windows/Win32/Graphics/Printing/mod/candidate.kt) | partial-candidate | 1484 | 566 | 202 |
| [Windows/Win32/Graphics/mod.rs](files/Windows/Win32/Graphics/mod/candidate.kt) | unsupported-only | 0 | 0 | 6 |
| [Windows/Win32/Management/MobileDeviceManagementRegistration/mod.rs](files/Windows/Win32/Management/MobileDeviceManagementRegistration/mod/candidate.kt) | partial-candidate | 69 | 20 | 2 |
| [Windows/Win32/Management/mod.rs](files/Windows/Win32/Management/mod/candidate.kt) | unsupported-only | 0 | 0 | 1 |
| [Windows/Win32/Media/Audio/mod.rs](files/Windows/Win32/Media/Audio/mod/candidate.kt) | partial-candidate | 638 | 296 | 116 |
| [Windows/Win32/Media/DxMediaObjects/mod.rs](files/Windows/Win32/Media/DxMediaObjects/mod/candidate.kt) | partial-candidate | 46 | 14 | 12 |
| [Windows/Win32/Media/KernelStreaming/mod.rs](files/Windows/Win32/Media/KernelStreaming/mod/candidate.kt) | partial-candidate | 1638 | 382 | 770 |
| [Windows/Win32/Media/Multimedia/mod.rs](files/Windows/Win32/Media/Multimedia/mod/candidate.kt) | partial-candidate | 4640 | 357 | 90 |
| [Windows/Win32/Media/Streaming/mod.rs](files/Windows/Win32/Media/Streaming/mod/candidate.kt) | partial-candidate | 7 | 12 | 16 |
| [Windows/Win32/Media/WindowsMediaFormat/mod.rs](files/Windows/Win32/Media/WindowsMediaFormat/mod/candidate.kt) | partial-candidate | 245 | 272 | 90 |
| [Windows/Win32/Media/mod.rs](files/Windows/Win32/Media/mod/candidate.kt) | partial-candidate | 105 | 16 | 13 |
| [Windows/Win32/NetworkManagement/Dhcp/mod.rs](files/Windows/Win32/NetworkManagement/Dhcp/mod/candidate.kt) | partial-candidate | 451 | 349 | 128 |
| [Windows/Win32/NetworkManagement/Dns/mod.rs](files/Windows/Win32/NetworkManagement/Dns/mod/candidate.kt) | partial-candidate | 411 | 163 | 120 |
| [Windows/Win32/NetworkManagement/InternetConnectionWizard/mod.rs](files/Windows/Win32/NetworkManagement/InternetConnectionWizard/mod/candidate.kt) | complete-syntax-candidate | 18 | 4 | 0 |
| [Windows/Win32/NetworkManagement/IpHelper/mod.rs](files/Windows/Win32/NetworkManagement/IpHelper/mod/candidate.kt) | partial-candidate | 630 | 399 | 167 |
| [Windows/Win32/NetworkManagement/Multicast/mod.rs](files/Windows/Win32/NetworkManagement/Multicast/mod/candidate.kt) | partial-candidate | 4 | 12 | 7 |
| [Windows/Win32/NetworkManagement/Ndis/mod.rs](files/Windows/Win32/NetworkManagement/Ndis/mod/candidate.kt) | partial-candidate | 1994 | 125 | 240 |
| [Windows/Win32/NetworkManagement/NetBios/mod.rs](files/Windows/Win32/NetworkManagement/NetBios/mod/candidate.kt) | partial-candidate | 82 | 13 | 7 |
| [Windows/Win32/NetworkManagement/NetManagement/mod.rs](files/Windows/Win32/NetworkManagement/NetManagement/mod/candidate.kt) | partial-candidate | 2209 | 571 | 115 |
| [Windows/Win32/NetworkManagement/NetShell/mod.rs](files/Windows/Win32/NetworkManagement/NetShell/mod/candidate.kt) | partial-candidate | 53 | 28 | 13 |
| [Windows/Win32/NetworkManagement/NetworkDiagnosticsFramework/mod.rs](files/Windows/Win32/NetworkManagement/NetworkDiagnosticsFramework/mod/candidate.kt) | partial-candidate | 82 | 29 | 14 |
| [Windows/Win32/NetworkManagement/P2P/mod.rs](files/Windows/Win32/NetworkManagement/P2P/mod/candidate.kt) | partial-candidate | 276 | 277 | 70 |
| [Windows/Win32/NetworkManagement/QoS/mod.rs](files/Windows/Win32/NetworkManagement/QoS/mod/candidate.kt) | partial-candidate | 554 | 137 | 97 |
| [Windows/Win32/NetworkManagement/Rras/mod.rs](files/Windows/Win32/NetworkManagement/Rras/mod/candidate.kt) | partial-candidate | 859 | 516 | 129 |
| [Windows/Win32/NetworkManagement/Snmp/mod.rs](files/Windows/Win32/NetworkManagement/Snmp/mod/candidate.kt) | partial-candidate | 172 | 106 | 17 |
| [Windows/Win32/NetworkManagement/WNet/mod.rs](files/Windows/Win32/NetworkManagement/WNet/mod/candidate.kt) | partial-candidate | 140 | 111 | 13 |
| [Windows/Win32/NetworkManagement/WebDav/mod.rs](files/Windows/Win32/NetworkManagement/WebDav/mod/candidate.kt) | partial-candidate | 11 | 16 | 2 |
| [Windows/Win32/NetworkManagement/WiFi/mod.rs](files/Windows/Win32/NetworkManagement/WiFi/mod/candidate.kt) | partial-candidate | 1270 | 390 | 293 |
| [Windows/Win32/NetworkManagement/WindowsConnectionManager/mod.rs](files/Windows/Win32/NetworkManagement/WindowsConnectionManager/mod/candidate.kt) | partial-candidate | 35 | 21 | 4 |
| [Windows/Win32/NetworkManagement/WindowsFilteringPlatform/mod.rs](files/Windows/Win32/NetworkManagement/WindowsFilteringPlatform/mod/candidate.kt) | partial-candidate | 658 | 418 | 606 |
| [Windows/Win32/NetworkManagement/WindowsFirewall/mod.rs](files/Windows/Win32/NetworkManagement/WindowsFirewall/mod/candidate.kt) | partial-candidate | 171 | 28 | 18 |
| [Windows/Win32/NetworkManagement/WindowsNetworkVirtualization/mod.rs](files/Windows/Win32/NetworkManagement/WindowsNetworkVirtualization/mod/candidate.kt) | partial-candidate | 16 | 10 | 11 |
| [Windows/Win32/NetworkManagement/mod.rs](files/Windows/Win32/NetworkManagement/mod/candidate.kt) | unsupported-only | 0 | 0 | 21 |
| [Windows/Win32/Networking/ActiveDirectory/mod.rs](files/Windows/Win32/Networking/ActiveDirectory/mod/candidate.kt) | partial-candidate | 995 | 325 | 138 |
| [Windows/Win32/Networking/Clustering/mod.rs](files/Windows/Win32/Networking/Clustering/mod/candidate.kt) | partial-candidate | 1490 | 1326 | 137 |
| [Windows/Win32/Networking/HttpServer/mod.rs](files/Windows/Win32/Networking/HttpServer/mod/candidate.kt) | partial-candidate | 379 | 139 | 57 |
| [Windows/Win32/Networking/Ldap/mod.rs](files/Windows/Win32/Networking/Ldap/mod/candidate.kt) | partial-candidate | 211 | 444 | 22 |
| [Windows/Win32/Networking/WebSocket/mod.rs](files/Windows/Win32/Networking/WebSocket/mod/candidate.kt) | partial-candidate | 40 | 18 | 6 |
| [Windows/Win32/Networking/WinHttp/mod.rs](files/Windows/Win32/Networking/WinHttp/mod/candidate.kt) | partial-candidate | 716 | 94 | 30 |
| [Windows/Win32/Networking/WinInet/mod.rs](files/Windows/Win32/Networking/WinInet/mod/candidate.kt) | partial-candidate | 1077 | 421 | 75 |
| [Windows/Win32/Networking/WinSock/mod.rs](files/Windows/Win32/Networking/WinSock/mod/candidate.kt) | partial-candidate | 1651 | 609 | 277 |
| [Windows/Win32/Networking/WindowsWebServices/mod.rs](files/Windows/Win32/Networking/WindowsWebServices/mod/candidate.kt) | partial-candidate | 1091 | 569 | 147 |
| [Windows/Win32/Networking/mod.rs](files/Windows/Win32/Networking/mod/candidate.kt) | unsupported-only | 0 | 0 | 9 |
| [Windows/Win32/Security/AppLocker/mod.rs](files/Windows/Win32/Security/AppLocker/mod/candidate.kt) | partial-candidate | 66 | 28 | 5 |
| [Windows/Win32/Security/Authentication/Identity/mod.rs](files/Windows/Win32/Security/Authentication/Identity/mod/candidate.kt) | partial-candidate | 1831 | 906 | 292 |
| [Windows/Win32/Security/Authentication/mod.rs](files/Windows/Win32/Security/Authentication/mod/candidate.kt) | unsupported-only | 0 | 0 | 1 |
| [Windows/Win32/Security/Authorization/mod.rs](files/Windows/Win32/Security/Authorization/mod/candidate.kt) | partial-candidate | 353 | 293 | 57 |
| [Windows/Win32/Security/Credentials/mod.rs](files/Windows/Win32/Security/Credentials/mod/candidate.kt) | partial-candidate | 223 | 207 | 42 |
| [Windows/Win32/Security/Cryptography/Catalog/mod.rs](files/Windows/Win32/Security/Cryptography/Catalog/mod/candidate.kt) | partial-candidate | 38 | 47 | 6 |
| [Windows/Win32/Security/Cryptography/Certificates/mod.rs](files/Windows/Win32/Security/Cryptography/Certificates/mod/candidate.kt) | partial-candidate | 1563 | 623 | 97 |
| [Windows/Win32/Security/Cryptography/Sip/mod.rs](files/Windows/Win32/Security/Cryptography/Sip/mod/candidate.kt) | partial-candidate | 16 | 29 | 10 |
| [Windows/Win32/Security/Cryptography/UI/mod.rs](files/Windows/Win32/Security/Cryptography/UI/mod/candidate.kt) | partial-candidate | 172 | 38 | 38 |
| [Windows/Win32/Security/Cryptography/mod.rs](files/Windows/Win32/Security/Cryptography/mod/candidate.kt) | partial-candidate | 2370 | 2419 | 616 |
| [Windows/Win32/Security/DiagnosticDataQuery/mod.rs](files/Windows/Win32/Security/DiagnosticDataQuery/mod/candidate.kt) | partial-candidate | 4 | 53 | 9 |
| [Windows/Win32/Security/DirectoryServices/mod.rs](files/Windows/Win32/Security/DirectoryServices/mod/candidate.kt) | complete-syntax-candidate | 7 | 6 | 0 |
| [Windows/Win32/Security/EnterpriseData/mod.rs](files/Windows/Win32/Security/EnterpriseData/mod/candidate.kt) | partial-candidate | 11 | 15 | 1 |
| [Windows/Win32/Security/ExtensibleAuthenticationProtocol/mod.rs](files/Windows/Win32/Security/ExtensibleAuthenticationProtocol/mod/candidate.kt) | partial-candidate | 480 | 102 | 92 |
| [Windows/Win32/Security/Isolation/mod.rs](files/Windows/Win32/Security/Isolation/mod/candidate.kt) | partial-candidate | 0 | 13 | 1 |
| [Windows/Win32/Security/LicenseProtection/mod.rs](files/Windows/Win32/Security/LicenseProtection/mod/candidate.kt) | complete-syntax-candidate | 6 | 2 | 0 |
| [Windows/Win32/Security/NetworkAccessProtection/mod.rs](files/Windows/Win32/Security/NetworkAccessProtection/mod/candidate.kt) | partial-candidate | 47 | 15 | 9 |
| [Windows/Win32/Security/WinTrust/mod.rs](files/Windows/Win32/Security/WinTrust/mod/candidate.kt) | partial-candidate | 137 | 148 | 89 |
| [Windows/Win32/Security/WinWlx/mod.rs](files/Windows/Win32/Security/WinWlx/mod/candidate.kt) | partial-candidate | 63 | 43 | 10 |
| [Windows/Win32/Security/mod.rs](files/Windows/Win32/Security/mod/candidate.kt) | partial-candidate | 351 | 269 | 69 |
| [Windows/Win32/Storage/Cabinets/mod.rs](files/Windows/Win32/Storage/Cabinets/mod/candidate.kt) | partial-candidate | 72 | 42 | 10 |
| [Windows/Win32/Storage/CloudFilters/mod.rs](files/Windows/Win32/Storage/CloudFilters/mod/candidate.kt) | partial-candidate | 236 | 78 | 26 |
| [Windows/Win32/Storage/Compression/mod.rs](files/Windows/Win32/Storage/Compression/mod/candidate.kt) | partial-candidate | 13 | 17 | 1 |
| [Windows/Win32/Storage/DistributedFileSystem/mod.rs](files/Windows/Win32/Storage/DistributedFileSystem/mod/candidate.kt) | partial-candidate | 44 | 55 | 19 |
| [Windows/Win32/Storage/FileHistory/mod.rs](files/Windows/Win32/Storage/FileHistory/mod/candidate.kt) | partial-candidate | 87 | 8 | 2 |
| [Windows/Win32/Storage/FileSystem/mod.rs](files/Windows/Win32/Storage/FileSystem/mod/candidate.kt) | partial-candidate | 1078 | 654 | 165 |
| [Windows/Win32/Storage/Imapi/mod.rs](files/Windows/Win32/Storage/Imapi/mod/candidate.kt) | partial-candidate | 606 | 13 | 62 |
| [Windows/Win32/Storage/IndexServer/mod.rs](files/Windows/Win32/Storage/IndexServer/mod/candidate.kt) | partial-candidate | 176 | 12 | 19 |
| [Windows/Win32/Storage/InstallableFileSystems/mod.rs](files/Windows/Win32/Storage/InstallableFileSystems/mod/candidate.kt) | partial-candidate | 132 | 45 | 12 |
| [Windows/Win32/Storage/IscsiDisc/mod.rs](files/Windows/Win32/Storage/IscsiDisc/mod/candidate.kt) | partial-candidate | 193 | 197 | 65 |
| [Windows/Win32/Storage/Jet/mod.rs](files/Windows/Win32/Storage/Jet/mod/candidate.kt) | partial-candidate | 982 | 329 | 98 |
| [Windows/Win32/Storage/Nvme/mod.rs](files/Windows/Win32/Storage/Nvme/mod/candidate.kt) | partial-candidate | 554 | 287 | 332 |
| [Windows/Win32/Storage/OfflineFiles/mod.rs](files/Windows/Win32/Storage/OfflineFiles/mod/candidate.kt) | partial-candidate | 269 | 5 | 2 |
| [Windows/Win32/Storage/OperationRecorder/mod.rs](files/Windows/Win32/Storage/OperationRecorder/mod/candidate.kt) | complete-syntax-candidate | 4 | 4 | 0 |
| [Windows/Win32/Storage/Packaging/Appx/mod.rs](files/Windows/Win32/Storage/Packaging/Appx/mod/candidate.kt) | partial-candidate | 189 | 80 | 19 |
| [Windows/Win32/Storage/Packaging/mod.rs](files/Windows/Win32/Storage/Packaging/mod/candidate.kt) | unsupported-only | 0 | 0 | 1 |
| [Windows/Win32/Storage/ProjectedFileSystem/mod.rs](files/Windows/Win32/Storage/ProjectedFileSystem/mod/candidate.kt) | partial-candidate | 63 | 48 | 15 |
| [Windows/Win32/Storage/StructuredStorage/mod.rs](files/Windows/Win32/Storage/StructuredStorage/mod/candidate.kt) | complete-candidate | 3 | 0 | 0 |
| [Windows/Win32/Storage/Vhd/mod.rs](files/Windows/Win32/Storage/Vhd/mod/candidate.kt) | partial-candidate | 202 | 80 | 69 |
| [Windows/Win32/Storage/Xps/mod.rs](files/Windows/Win32/Storage/Xps/mod/candidate.kt) | partial-candidate | 251 | 30 | 9 |
| [Windows/Win32/Storage/mod.rs](files/Windows/Win32/Storage/mod/candidate.kt) | unsupported-only | 0 | 0 | 19 |
| [Windows/Win32/System/AddressBook/mod.rs](files/Windows/Win32/System/AddressBook/mod/candidate.kt) | partial-candidate | 217 | 150 | 64 |
| [Windows/Win32/System/Antimalware/mod.rs](files/Windows/Win32/System/Antimalware/mod/candidate.kt) | partial-candidate | 35 | 16 | 9 |
| [Windows/Win32/System/ApplicationInstallationAndServicing/mod.rs](files/Windows/Win32/System/ApplicationInstallationAndServicing/mod/candidate.kt) | partial-candidate | 1106 | 634 | 51 |
| [Windows/Win32/System/ApplicationVerifier/mod.rs](files/Windows/Win32/System/ApplicationVerifier/mod/candidate.kt) | partial-candidate | 24 | 7 | 2 |
| [Windows/Win32/System/ClrHosting/mod.rs](files/Windows/Win32/System/ClrHosting/mod/candidate.kt) | partial-candidate | 196 | 45 | 21 |
| [Windows/Win32/System/Com/Marshal/mod.rs](files/Windows/Win32/System/Com/Marshal/mod/candidate.kt) | complete-syntax-candidate | 3 | 113 | 0 |
| [Windows/Win32/System/Com/StructuredStorage/mod.rs](files/Windows/Win32/System/Com/StructuredStorage/mod/candidate.kt) | partial-candidate | 114 | 160 | 40 |
| [Windows/Win32/System/Com/Urlmon/mod.rs](files/Windows/Win32/System/Com/Urlmon/mod/candidate.kt) | partial-candidate | 703 | 86 | 10 |
| [Windows/Win32/System/Com/mod.rs](files/Windows/Win32/System/Com/mod/candidate.kt) | partial-candidate | 519 | 177 | 74 |
| [Windows/Win32/System/ComponentServices/mod.rs](files/Windows/Win32/System/ComponentServices/mod/candidate.kt) | partial-candidate | 359 | 26 | 38 |
| [Windows/Win32/System/Console/mod.rs](files/Windows/Win32/System/Console/mod/candidate.kt) | partial-candidate | 96 | 118 | 15 |
| [Windows/Win32/System/CorrelationVector/mod.rs](files/Windows/Win32/System/CorrelationVector/mod/candidate.kt) | partial-candidate | 5 | 5 | 1 |
| [Windows/Win32/System/DataExchange/mod.rs](files/Windows/Win32/System/DataExchange/mod/candidate.kt) | partial-candidate | 144 | 109 | 15 |
| [Windows/Win32/System/DeploymentServices/mod.rs](files/Windows/Win32/System/DeploymentServices/mod/candidate.kt) | partial-candidate | 293 | 114 | 40 |
| [Windows/Win32/System/DeveloperLicensing/mod.rs](files/Windows/Win32/System/DeveloperLicensing/mod/candidate.kt) | complete-syntax-candidate | 0 | 3 | 0 |
| [Windows/Win32/System/Diagnostics/Ceip/mod.rs](files/Windows/Win32/System/Diagnostics/Ceip/mod/candidate.kt) | complete-syntax-candidate | 0 | 1 | 0 |
| [Windows/Win32/System/Diagnostics/Debug/Extensions/mod.rs](files/Windows/Win32/System/Diagnostics/Debug/Extensions/mod/candidate.kt) | partial-candidate | 1911 | 253 | 89 |
| [Windows/Win32/System/Diagnostics/Debug/mod.rs](files/Windows/Win32/System/Diagnostics/Debug/mod/candidate.kt) | partial-candidate | 1691 | 681 | 220 |
| [Windows/Win32/System/Diagnostics/Etw/mod.rs](files/Windows/Win32/System/Diagnostics/Etw/mod/candidate.kt) | partial-candidate | 697 | 213 | 165 |
| [Windows/Win32/System/Diagnostics/ProcessSnapshotting/mod.rs](files/Windows/Win32/System/Diagnostics/ProcessSnapshotting/mod/candidate.kt) | partial-candidate | 65 | 31 | 13 |
| [Windows/Win32/System/Diagnostics/ToolHelp/mod.rs](files/Windows/Win32/System/Diagnostics/ToolHelp/mod/candidate.kt) | partial-candidate | 15 | 23 | 5 |
| [Windows/Win32/System/Diagnostics/TraceLogging/mod.rs](files/Windows/Win32/System/Diagnostics/TraceLogging/mod/candidate.kt) | complete-candidate | 105 | 0 | 0 |
| [Windows/Win32/System/Diagnostics/mod.rs](files/Windows/Win32/System/Diagnostics/mod/candidate.kt) | unsupported-only | 0 | 0 | 6 |
| [Windows/Win32/System/DistributedTransactionCoordinator/mod.rs](files/Windows/Win32/System/DistributedTransactionCoordinator/mod/candidate.kt) | partial-candidate | 210 | 27 | 6 |
| [Windows/Win32/System/Environment/mod.rs](files/Windows/Win32/System/Environment/mod/candidate.kt) | partial-candidate | 23 | 65 | 7 |
| [Windows/Win32/System/ErrorReporting/mod.rs](files/Windows/Win32/System/ErrorReporting/mod/candidate.kt) | partial-candidate | 143 | 68 | 13 |
| [Windows/Win32/System/EventCollector/mod.rs](files/Windows/Win32/System/EventCollector/mod/candidate.kt) | partial-candidate | 82 | 16 | 3 |
| [Windows/Win32/System/EventLog/mod.rs](files/Windows/Win32/System/EventLog/mod/candidate.kt) | partial-candidate | 217 | 61 | 5 |
| [Windows/Win32/System/EventNotificationService/mod.rs](files/Windows/Win32/System/EventNotificationService/mod/candidate.kt) | partial-candidate | 8 | 5 | 8 |
| [Windows/Win32/System/GroupPolicy/mod.rs](files/Windows/Win32/System/GroupPolicy/mod/candidate.kt) | partial-candidate | 194 | 58 | 61 |
| [Windows/Win32/System/HostCompute/mod.rs](files/Windows/Win32/System/HostCompute/mod/candidate.kt) | complete-syntax-candidate | 0 | 1 | 0 |
| [Windows/Win32/System/HostComputeNetwork/mod.rs](files/Windows/Win32/System/HostComputeNetwork/mod/candidate.kt) | complete-syntax-candidate | 23 | 46 | 0 |
| [Windows/Win32/System/HostComputeSystem/mod.rs](files/Windows/Win32/System/HostComputeSystem/mod/candidate.kt) | partial-candidate | 70 | 75 | 3 |
| [Windows/Win32/System/Hypervisor/mod.rs](files/Windows/Win32/System/Hypervisor/mod/candidate.kt) | partial-candidate | 693 | 250 | 138 |
| [Windows/Win32/System/IO/mod.rs](files/Windows/Win32/System/IO/mod/candidate.kt) | partial-candidate | 0 | 17 | 7 |
| [Windows/Win32/System/Iis/mod.rs](files/Windows/Win32/System/Iis/mod/candidate.kt) | partial-candidate | 903 | 116 | 55 |
| [Windows/Win32/System/Ioctl/mod.rs](files/Windows/Win32/System/Ioctl/mod/candidate.kt) | partial-candidate | 1736 | 490 | 309 |
| [Windows/Win32/System/JobObjects/mod.rs](files/Windows/Win32/System/JobObjects/mod/candidate.kt) | partial-candidate | 128 | 38 | 25 |
| [Windows/Win32/System/Js/mod.rs](files/Windows/Win32/System/Js/mod/candidate.kt) | complete-syntax-candidate | 56 | 87 | 0 |
| [Windows/Win32/System/Kernel/mod.rs](files/Windows/Win32/System/Kernel/mod/candidate.kt) | partial-candidate | 50 | 33 | 27 |
| [Windows/Win32/System/LibraryLoader/mod.rs](files/Windows/Win32/System/LibraryLoader/mod/candidate.kt) | partial-candidate | 29 | 60 | 3 |
| [Windows/Win32/System/Mailslots/mod.rs](files/Windows/Win32/System/Mailslots/mod/candidate.kt) | complete-syntax-candidate | 0 | 4 | 0 |
| [Windows/Win32/System/Mapi/mod.rs](files/Windows/Win32/System/Mapi/mod/candidate.kt) | partial-candidate | 55 | 21 | 7 |
| [Windows/Win32/System/Memory/NonVolatile/mod.rs](files/Windows/Win32/System/Memory/NonVolatile/mod/candidate.kt) | partial-candidate | 0 | 8 | 1 |
| [Windows/Win32/System/Memory/mod.rs](files/Windows/Win32/System/Memory/mod/candidate.kt) | partial-candidate | 159 | 125 | 18 |
| [Windows/Win32/System/MessageQueuing/mod.rs](files/Windows/Win32/System/MessageQueuing/mod/candidate.kt) | partial-candidate | 527 | 79 | 26 |
| [Windows/Win32/System/MixedReality/mod.rs](files/Windows/Win32/System/MixedReality/mod/candidate.kt) | partial-candidate | 0 | 2 | 1 |
| [Windows/Win32/System/Ole/mod.rs](files/Windows/Win32/System/Ole/mod/candidate.kt) | partial-candidate | 1082 | 530 | 97 |
| [Windows/Win32/System/PasswordManagement/mod.rs](files/Windows/Win32/System/PasswordManagement/mod/candidate.kt) | partial-candidate | 0 | 6 | 4 |
| [Windows/Win32/System/Performance/HardwareCounterProfiling/mod.rs](files/Windows/Win32/System/Performance/HardwareCounterProfiling/mod/candidate.kt) | partial-candidate | 3 | 6 | 1 |
| [Windows/Win32/System/Performance/mod.rs](files/Windows/Win32/System/Performance/mod/candidate.kt) | partial-candidate | 350 | 198 | 75 |
| [Windows/Win32/System/Pipes/mod.rs](files/Windows/Win32/System/Pipes/mod/candidate.kt) | complete-syntax-candidate | 15 | 22 | 0 |
| [Windows/Win32/System/Power/mod.rs](files/Windows/Win32/System/Power/mod/candidate.kt) | partial-candidate | 471 | 177 | 65 |
| [Windows/Win32/System/ProcessStatus/mod.rs](files/Windows/Win32/System/ProcessStatus/mod/candidate.kt) | partial-candidate | 6 | 69 | 10 |
| [Windows/Win32/System/Recovery/mod.rs](files/Windows/Win32/System/Recovery/mod/candidate.kt) | complete-syntax-candidate | 5 | 8 | 0 |
| [Windows/Win32/System/Registry/mod.rs](files/Windows/Win32/System/Registry/mod/candidate.kt) | partial-candidate | 196 | 843 | 16 |
| [Windows/Win32/System/RemoteDesktop/mod.rs](files/Windows/Win32/System/RemoteDesktop/mod/candidate.kt) | partial-candidate | 576 | 163 | 99 |
| [Windows/Win32/System/RemoteManagement/mod.rs](files/Windows/Win32/System/RemoteManagement/mod/candidate.kt) | partial-candidate | 641 | 87 | 37 |
| [Windows/Win32/System/RestartManager/mod.rs](files/Windows/Win32/System/RestartManager/mod/candidate.kt) | partial-candidate | 42 | 15 | 4 |
| [Windows/Win32/System/Restore/mod.rs](files/Windows/Win32/System/Restore/mod/candidate.kt) | partial-candidate | 32 | 7 | 3 |
| [Windows/Win32/System/Rpc/mod.rs](files/Windows/Win32/System/Rpc/mod/candidate.kt) | partial-candidate | 504 | 703 | 138 |
| [Windows/Win32/System/Search/Common/mod.rs](files/Windows/Win32/System/Search/Common/mod/candidate.kt) | complete-candidate | 21 | 0 | 0 |
| [Windows/Win32/System/Search/mod.rs](files/Windows/Win32/System/Search/mod/candidate.kt) | partial-candidate | 4485 | 337 | 154 |
| [Windows/Win32/System/SecurityCenter/mod.rs](files/Windows/Win32/System/SecurityCenter/mod/candidate.kt) | partial-candidate | 32 | 6 | 2 |
| [Windows/Win32/System/Services/mod.rs](files/Windows/Win32/System/Services/mod/candidate.kt) | partial-candidate | 214 | 116 | 40 |
| [Windows/Win32/System/SetupAndMigration/mod.rs](files/Windows/Win32/System/SetupAndMigration/mod/candidate.kt) | complete-syntax-candidate | 0 | 4 | 0 |
| [Windows/Win32/System/Shutdown/mod.rs](files/Windows/Win32/System/Shutdown/mod/candidate.kt) | complete-syntax-candidate | 97 | 14 | 0 |
| [Windows/Win32/System/StationsAndDesktops/mod.rs](files/Windows/Win32/System/StationsAndDesktops/mod/candidate.kt) | partial-candidate | 40 | 39 | 1 |
| [Windows/Win32/System/SubsystemForLinux/mod.rs](files/Windows/Win32/System/SubsystemForLinux/mod/candidate.kt) | complete-syntax-candidate | 5 | 7 | 0 |
| [Windows/Win32/System/SystemInformation/mod.rs](files/Windows/Win32/System/SystemInformation/mod/candidate.kt) | partial-candidate | 414 | 90 | 31 |
| [Windows/Win32/System/SystemServices/mod.rs](files/Windows/Win32/System/SystemServices/mod/candidate.kt) | partial-candidate | 2405 | 233 | 427 |
| [Windows/Win32/System/Threading/mod.rs](files/Windows/Win32/System/Threading/mod/candidate.kt) | partial-candidate | 378 | 389 | 33 |
| [Windows/Win32/System/Time/mod.rs](files/Windows/Win32/System/Time/mod/candidate.kt) | partial-candidate | 5 | 23 | 2 |
| [Windows/Win32/System/TpmBaseServices/mod.rs](files/Windows/Win32/System/TpmBaseServices/mod/candidate.kt) | partial-candidate | 39 | 19 | 4 |
| [Windows/Win32/System/UserAccessLogging/mod.rs](files/Windows/Win32/System/UserAccessLogging/mod/candidate.kt) | partial-candidate | 0 | 5 | 1 |
| [Windows/Win32/System/Variant/mod.rs](files/Windows/Win32/System/Variant/mod/candidate.kt) | partial-candidate | 72 | 89 | 7 |
| [Windows/Win32/System/VirtualDosMachines/mod.rs](files/Windows/Win32/System/VirtualDosMachines/mod/candidate.kt) | partial-candidate | 95 | 43 | 9 |
| [Windows/Win32/System/WindowsProgramming/mod.rs](files/Windows/Win32/System/WindowsProgramming/mod/candidate.kt) | partial-candidate | 622 | 335 | 88 |
| [Windows/Win32/System/Wmi/mod.rs](files/Windows/Win32/System/Wmi/mod/candidate.kt) | partial-candidate | 957 | 192 | 131 |
| [Windows/Win32/System/mod.rs](files/Windows/Win32/System/mod/candidate.kt) | unsupported-only | 0 | 0 | 66 |
| [Windows/Win32/UI/Accessibility/mod.rs](files/Windows/Win32/UI/Accessibility/mod/candidate.kt) | partial-candidate | 907 | 171 | 442 |
| [Windows/Win32/UI/ColorSystem/mod.rs](files/Windows/Win32/UI/ColorSystem/mod/candidate.kt) | partial-candidate | 187 | 159 | 18 |
| [Windows/Win32/UI/Controls/Dialogs/mod.rs](files/Windows/Win32/UI/Controls/Dialogs/mod/candidate.kt) | partial-candidate | 268 | 94 | 40 |
| [Windows/Win32/UI/Controls/mod.rs](files/Windows/Win32/UI/Controls/mod/candidate.kt) | partial-candidate | 4364 | 603 | 206 |
| [Windows/Win32/UI/HiDpi/mod.rs](files/Windows/Win32/UI/HiDpi/mod/candidate.kt) | partial-candidate | 27 | 30 | 5 |
| [Windows/Win32/UI/Input/Ime/mod.rs](files/Windows/Win32/UI/Input/Ime/mod/candidate.kt) | partial-candidate | 757 | 154 | 64 |
| [Windows/Win32/UI/Input/KeyboardAndMouse/mod.rs](files/Windows/Win32/UI/Input/KeyboardAndMouse/mod/candidate.kt) | partial-candidate | 418 | 106 | 27 |
| [Windows/Win32/UI/Input/Pointer/mod.rs](files/Windows/Win32/UI/Input/Pointer/mod/candidate.kt) | partial-candidate | 36 | 34 | 4 |
| [Windows/Win32/UI/Input/Touch/mod.rs](files/Windows/Win32/UI/Input/Touch/mod/candidate.kt) | partial-candidate | 32 | 16 | 5 |
| [Windows/Win32/UI/Input/XboxController/mod.rs](files/Windows/Win32/UI/Input/XboxController/mod/candidate.kt) | complete-syntax-candidate | 94 | 16 | 0 |
| [Windows/Win32/UI/Input/mod.rs](files/Windows/Win32/UI/Input/mod/candidate.kt) | partial-candidate | 40 | 24 | 18 |
| [Windows/Win32/UI/InteractionContext/mod.rs](files/Windows/Win32/UI/InteractionContext/mod/candidate.kt) | partial-candidate | 103 | 42 | 6 |
| [Windows/Win32/UI/Magnification/mod.rs](files/Windows/Win32/UI/Magnification/mod/candidate.kt) | partial-candidate | 6 | 26 | 2 |
| [Windows/Win32/UI/Shell/Common/mod.rs](files/Windows/Win32/UI/Shell/Common/mod/candidate.kt) | partial-candidate | 67 | 5 | 6 |
| [Windows/Win32/UI/Shell/PropertiesSystem/mod.rs](files/Windows/Win32/UI/Shell/PropertiesSystem/mod/candidate.kt) | partial-candidate | 207 | 77 | 4 |
| [Windows/Win32/UI/Shell/mod.rs](files/Windows/Win32/UI/Shell/mod/candidate.kt) | partial-candidate | 3536 | 957 | 629 |
| [Windows/Win32/UI/TabletPC/mod.rs](files/Windows/Win32/UI/TabletPC/mod/candidate.kt) | partial-candidate | 1183 | 128 | 62 |
| [Windows/Win32/UI/TextServices/mod.rs](files/Windows/Win32/UI/TextServices/mod/candidate.kt) | partial-candidate | 438 | 28 | 200 |
| [Windows/Win32/UI/WindowsAndMessaging/mod.rs](files/Windows/Win32/UI/WindowsAndMessaging/mod/candidate.kt) | partial-candidate | 2207 | 535 | 169 |
| [Windows/Win32/UI/mod.rs](files/Windows/Win32/UI/mod/candidate.kt) | unsupported-only | 0 | 0 | 11 |
| [Windows/Win32/Web/InternetExplorer/mod.rs](files/Windows/Win32/Web/InternetExplorer/mod/candidate.kt) | partial-candidate | 350 | 220 | 24 |
| [Windows/Win32/Web/mod.rs](files/Windows/Win32/Web/mod/candidate.kt) | unsupported-only | 0 | 0 | 1 |
| [Windows/Win32/mod.rs](files/Windows/Win32/mod/candidate.kt) | unsupported-only | 0 | 0 | 15 |
| [Windows/mod.rs](files/Windows/mod/candidate.kt) | unsupported-only | 0 | 0 | 2 |
| [core/literals.rs](files/core/literals/candidate.kt) | unsupported-only | 0 | 0 | 6 |
| [core/mod.rs](files/core/mod/candidate.kt) | partial-candidate | 2 | 9 | 5 |
| lib.rs | blocked | 0 | 0 | 0 |

## Leading unsupported constructs

| Diagnostic | Declarations/files |
|---|---:|
| declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl | 8938 |
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
| unresolved scalar type SID_IDENTIFIER_AUTHORITY; syntax: constant expression has no syntax candidate rule | 12 |
| attribute cfg requires explicit semantics/configuration; syntax: foreign signature shape unsupported | 12 |
| attribute cfg requires explicit semantics/configuration; syntax: constant expression has no syntax candidate rule | 11 |
| declaration Use has no candidate rule; syntax: no per-file syntax rule for Use | 7 |
| qualified type requires source-backed binding: super::super::Foundation::HWND; syntax: constant expression has no syntax candidate rule | 7 |
| unresolved scalar type f32; syntax: constant expression has no syntax candidate rule | 6 |
| unresolved scalar type GUID; syntax: constant expression has no syntax candidate rule | 2 |
| attribute macro_export requires explicit semantics/configuration; syntax: macro has no recognized windows-link contract | 2 |
| declaration Fn has no candidate rule; syntax: no per-file syntax rule for Fn | 2 |
