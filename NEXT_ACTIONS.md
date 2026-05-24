# Immediate Actions - High-Value Files

Based on AST analysis, here are the concrete next steps.

## Summary

- **Files Present:** 11/249 (4.4%)
- **Function parity:** 3/3 matched (target 8) — 100.0%
- **Class/type parity:** 13/13 matched (target 17) — 100.0%
- **Combined symbol parity:** 16/16 matched (target 25) — 100.0%
- **Average inline-code cosine:** 0.84 (function body across 1 matched files)
- **Average documentation cosine:** 1.00 (doc text across 1 matched files)
- **Cheat-zeroed Files:** 10
- **Critical Issues:** 10 files with <0.60 function similarity

## Priority 1: Fix Incomplete High-Dependency Files

No incomplete high-dependency files detected.

## Priority 2: Port Missing High-Value Files

Critical missing files (>10 dependencies):

No missing high-value files detected.

## Detailed Work Items

Every matched file is listed below with function and type symbol parity.

### 1. core.mod

- **Target:** `core.Core [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 1210.0
- **Functions:** 1/1 matched (target 2)
- **Missing functions:** _none_
- **Types:** 11/11 matched
- **Missing types:** _none_

### 2. core.literals

- **Target:** `core.Literals`
- **Similarity:** 0.84
- **Dependents:** 0
- **Priority Score:** 201.6
- **Functions:** 2/2 matched (target 6)
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 1)
- **Missing types:** _none_

### 3. Beep.mod

- **Target:** `beep.Beep [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 110.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 1/1 matched
- **Missing types:** _none_

### 4. HostCompute.mod

- **Target:** `hostcompute.HostCompute [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 110.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 1/1 matched
- **Missing types:** _none_

### 5. Windows.mod

- **Target:** `windows.Windows [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 10.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 1)
- **Missing types:** _none_

### 6. Wdk.mod

- **Target:** `wdk.Wdk [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 10.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 1)
- **Missing types:** _none_

### 7. Win32.mod

- **Target:** `win32.Win32 [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 10.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 1)
- **Missing types:** _none_

### 8. Storage.mod

- **Target:** `storage.Storage [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 10.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched
- **Missing types:** _none_

### 9. Graphics.mod

- **Target:** `graphics.Graphics [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 10.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched
- **Missing types:** _none_

### 10. Packaging.mod

- **Target:** `packaging.Packaging [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 10.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched
- **Missing types:** _none_

### 11. Enumeration.mod

- **Target:** `enumeration.Enumeration [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 10.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched
- **Missing types:** _none_

## Success Criteria

For each file to be considered "complete":
- **Similarity ≥ 0.85** (Excellent threshold)
- All public APIs ported
- All tests ported
- Documentation ported
- port-lint header present

## Reexport / Wiring Modules

These files match `reexport_modules` patterns in `.ast_distance_config.json`. They are filtered out of
normal priority and missing-file ladders because they are wiring
modules, not direct logic ports. Consult them for call-site routing;
do not treat them as the next implementation target by default.

### Missing

| Source | Expected target | Deps | Source path | Expected path |
|--------|-----------------|------|-------------|---------------|
| `DistributedFileSystem.mod` | `windows.win32.storage.distributedfilesystem.Mod` | 0 | `Windows/Win32/Storage/DistributedFileSystem/mod.rs` | `windows/win32/storage/distributedfilesystem/Mod.kt` |
| `HumanInterfaceDevice.mod` | `windows.wdk.devices.humaninterfacedevice.Mod` | 0 | `Windows/Wdk/Devices/HumanInterfaceDevice/mod.rs` | `windows/wdk/devices/humaninterfacedevice/Mod.kt` |
| `Devices.mod` | `windows.wdk.devices.Mod` | 0 | `Windows/Wdk/Devices/mod.rs` | `windows/wdk/devices/Mod.kt` |
| `Foundation.mod` | `windows.wdk.foundation.Mod` | 0 | `Windows/Wdk/Foundation/mod.rs` | `windows/wdk/foundation/Mod.kt` |
| `Direct3D.mod` | `windows.wdk.graphics.direct3d.Mod` | 0 | `Windows/Wdk/Graphics/Direct3D/mod.rs` | `windows/wdk/graphics/direct3d/Mod.kt` |
| `Ndis.mod` | `windows.wdk.networkmanagement.ndis.Mod` | 0 | `Windows/Wdk/NetworkManagement/Ndis/mod.rs` | `windows/wdk/networkmanagement/ndis/Mod.kt` |
| `WindowsFilteringPlatform.mod` | `windows.wdk.networkmanagement.windowsfilteringplatform.Mod` | 0 | `Windows/Wdk/NetworkManagement/WindowsFilteringPlatform/mod.rs` | `windows/wdk/networkmanagement/windowsfilteringplatform/Mod.kt` |
| `NetworkManagement.mod` | `windows.wdk.networkmanagement.Mod` | 0 | `Windows/Wdk/NetworkManagement/mod.rs` | `windows/wdk/networkmanagement/Mod.kt` |
| `Minifilters.mod` | `windows.wdk.storage.filesystem.minifilters.Mod` | 0 | `Windows/Wdk/Storage/FileSystem/Minifilters/mod.rs` | `windows/wdk/storage/filesystem/minifilters/Mod.kt` |
| `FileSystem.mod` | `windows.wdk.storage.filesystem.Mod` | 0 | `Windows/Wdk/Storage/FileSystem/mod.rs` | `windows/wdk/storage/filesystem/Mod.kt` |
| `IO.mod` | `windows.wdk.system.io.Mod` | 0 | `Windows/Wdk/System/IO/mod.rs` | `windows/wdk/system/io/Mod.kt` |
| `Memory.mod` | `windows.wdk.system.memory.Mod` | 0 | `Windows/Wdk/System/Memory/mod.rs` | `windows/wdk/system/memory/Mod.kt` |
| `OfflineRegistry.mod` | `windows.wdk.system.offlineregistry.Mod` | 0 | `Windows/Wdk/System/OfflineRegistry/mod.rs` | `windows/wdk/system/offlineregistry/Mod.kt` |
| `Registry.mod` | `windows.wdk.system.registry.Mod` | 0 | `Windows/Wdk/System/Registry/mod.rs` | `windows/wdk/system/registry/Mod.kt` |
| `SystemInformation.mod` | `windows.wdk.system.systeminformation.Mod` | 0 | `Windows/Wdk/System/SystemInformation/mod.rs` | `windows/wdk/system/systeminformation/Mod.kt` |
| `SystemServices.mod` | `windows.wdk.system.systemservices.Mod` | 0 | `Windows/Wdk/System/SystemServices/mod.rs` | `windows/wdk/system/systemservices/Mod.kt` |
| `Threading.mod` | `windows.wdk.system.threading.Mod` | 0 | `Windows/Wdk/System/Threading/mod.rs` | `windows/wdk/system/threading/Mod.kt` |
| `System.mod` | `windows.wdk.system.Mod` | 0 | `Windows/Wdk/System/mod.rs` | `windows/wdk/system/Mod.kt` |
| `HtmlHelp.mod` | `windows.win32.data.htmlhelp.Mod` | 0 | `Windows/Win32/Data/HtmlHelp/mod.rs` | `windows/win32/data/htmlhelp/Mod.kt` |
| `RightsManagement.mod` | `windows.win32.data.rightsmanagement.Mod` | 0 | `Windows/Win32/Data/RightsManagement/mod.rs` | `windows/win32/data/rightsmanagement/Mod.kt` |
| `Data.mod` | `windows.win32.data.Mod` | 0 | `Windows/Win32/Data/mod.rs` | `windows/win32/data/Mod.kt` |
| `AllJoyn.mod` | `windows.win32.devices.alljoyn.Mod` | 0 | `Windows/Win32/Devices/AllJoyn/mod.rs` | `windows/win32/devices/alljoyn/Mod.kt` |
| `BiometricFramework.mod` | `windows.win32.devices.biometricframework.Mod` | 0 | `Windows/Win32/Devices/BiometricFramework/mod.rs` | `windows/win32/devices/biometricframework/Mod.kt` |
| `Windows.Win32.Devices.Bluetooth.mod` | `windows.win32.devices.bluetooth.Mod` | 0 | `Windows/Win32/Devices/Bluetooth/mod.rs` | `windows/win32/devices/bluetooth/Mod.kt` |
| `Cdrom.mod` | `windows.win32.devices.cdrom.Mod` | 0 | `Windows/Win32/Devices/Cdrom/mod.rs` | `windows/win32/devices/cdrom/Mod.kt` |
| `Communication.mod` | `windows.win32.devices.communication.Mod` | 0 | `Windows/Win32/Devices/Communication/mod.rs` | `windows/win32/devices/communication/Mod.kt` |
| `DeviceAndDriverInstallation.mod` | `windows.win32.devices.deviceanddriverinstallation.Mod` | 0 | `Windows/Win32/Devices/DeviceAndDriverInstallation/mod.rs` | `windows/win32/devices/deviceanddriverinstallation/Mod.kt` |
| `DeviceQuery.mod` | `windows.win32.devices.devicequery.Mod` | 0 | `Windows/Win32/Devices/DeviceQuery/mod.rs` | `windows/win32/devices/devicequery/Mod.kt` |
| `Display.mod` | `windows.win32.devices.display.Mod` | 0 | `Windows/Win32/Devices/Display/mod.rs` | `windows/win32/devices/display/Mod.kt` |
| `Dvd.mod` | `windows.win32.devices.dvd.Mod` | 0 | `Windows/Win32/Devices/Dvd/mod.rs` | `windows/win32/devices/dvd/Mod.kt` |
| `Pnp.mod` | `windows.win32.devices.enumeration.pnp.Mod` | 0 | `Windows/Win32/Devices/Enumeration/Pnp/mod.rs` | `windows/win32/devices/enumeration/pnp/Mod.kt` |
| `Fax.mod` | `windows.win32.devices.fax.Mod` | 0 | `Windows/Win32/Devices/Fax/mod.rs` | `windows/win32/devices/fax/Mod.kt` |
| `Windows.Win32.Devices.HumanInterfaceDevice.mod` | `windows.win32.devices.humaninterfacedevice.Mod` | 0 | `Windows/Win32/Devices/HumanInterfaceDevice/mod.rs` | `windows/win32/devices/humaninterfacedevice/Mod.kt` |
| `Nfc.mod` | `windows.win32.devices.nfc.Mod` | 0 | `Windows/Win32/Devices/Nfc/mod.rs` | `windows/win32/devices/nfc/Mod.kt` |
| `Nfp.mod` | `windows.win32.devices.nfp.Mod` | 0 | `Windows/Win32/Devices/Nfp/mod.rs` | `windows/win32/devices/nfp/Mod.kt` |
| `PortableDevices.mod` | `windows.win32.devices.portabledevices.Mod` | 0 | `Windows/Win32/Devices/PortableDevices/mod.rs` | `windows/win32/devices/portabledevices/Mod.kt` |
| `Properties.mod` | `windows.win32.devices.properties.Mod` | 0 | `Windows/Win32/Devices/Properties/mod.rs` | `windows/win32/devices/properties/Mod.kt` |
| `Pwm.mod` | `windows.win32.devices.pwm.Mod` | 0 | `Windows/Win32/Devices/Pwm/mod.rs` | `windows/win32/devices/pwm/Mod.kt` |
| `Sensors.mod` | `windows.win32.devices.sensors.Mod` | 0 | `Windows/Win32/Devices/Sensors/mod.rs` | `windows/win32/devices/sensors/Mod.kt` |
| `SerialCommunication.mod` | `windows.win32.devices.serialcommunication.Mod` | 0 | `Windows/Win32/Devices/SerialCommunication/mod.rs` | `windows/win32/devices/serialcommunication/Mod.kt` |
| `Tapi.mod` | `windows.win32.devices.tapi.Mod` | 0 | `Windows/Win32/Devices/Tapi/mod.rs` | `windows/win32/devices/tapi/Mod.kt` |
| `Usb.mod` | `windows.win32.devices.usb.Mod` | 0 | `Windows/Win32/Devices/Usb/mod.rs` | `windows/win32/devices/usb/Mod.kt` |
| `WebServicesOnDevices.mod` | `windows.win32.devices.webservicesondevices.Mod` | 0 | `Windows/Win32/Devices/WebServicesOnDevices/mod.rs` | `windows/win32/devices/webservicesondevices/Mod.kt` |
| `Windows.Win32.Devices.mod` | `windows.win32.devices.Mod` | 0 | `Windows/Win32/Devices/mod.rs` | `windows/win32/devices/Mod.kt` |
| `Windows.Win32.Foundation.mod` | `windows.win32.foundation.Mod` | 0 | `Windows/Win32/Foundation/mod.rs` | `windows/win32/foundation/Mod.kt` |
| `Gaming.mod` | `windows.win32.gaming.Mod` | 0 | `Windows/Win32/Gaming/mod.rs` | `windows/win32/gaming/Mod.kt` |
| `Globalization.mod` | `windows.win32.globalization.Mod` | 0 | `Windows/Win32/Globalization/mod.rs` | `windows/win32/globalization/Mod.kt` |
| `Dwm.mod` | `windows.win32.graphics.dwm.Mod` | 0 | `Windows/Win32/Graphics/Dwm/mod.rs` | `windows/win32/graphics/dwm/Mod.kt` |
| `Gdi.mod` | `windows.win32.graphics.gdi.Mod` | 0 | `Windows/Win32/Graphics/Gdi/mod.rs` | `windows/win32/graphics/gdi/Mod.kt` |
| `GdiPlus.mod` | `windows.win32.graphics.gdiplus.Mod` | 0 | `Windows/Win32/Graphics/GdiPlus/mod.rs` | `windows/win32/graphics/gdiplus/Mod.kt` |
| `Hlsl.mod` | `windows.win32.graphics.hlsl.Mod` | 0 | `Windows/Win32/Graphics/Hlsl/mod.rs` | `windows/win32/graphics/hlsl/Mod.kt` |
| `OpenGL.mod` | `windows.win32.graphics.opengl.Mod` | 0 | `Windows/Win32/Graphics/OpenGL/mod.rs` | `windows/win32/graphics/opengl/Mod.kt` |
| `PrintTicket.mod` | `windows.win32.graphics.printing.printticket.Mod` | 0 | `Windows/Win32/Graphics/Printing/PrintTicket/mod.rs` | `windows/win32/graphics/printing/printticket/Mod.kt` |
| `Printing.mod` | `windows.win32.graphics.printing.Mod` | 0 | `Windows/Win32/Graphics/Printing/mod.rs` | `windows/win32/graphics/printing/Mod.kt` |
| `Windows.Win32.Graphics.mod` | `windows.win32.graphics.Mod` | 0 | `Windows/Win32/Graphics/mod.rs` | `windows/win32/graphics/Mod.kt` |
| `MobileDeviceManagementRegistration.mod` | `windows.win32.management.mobiledevicemanagementregistration.Mod` | 0 | `Windows/Win32/Management/MobileDeviceManagementRegistration/mod.rs` | `windows/win32/management/mobiledevicemanagementregistration/Mod.kt` |
| `Management.mod` | `windows.win32.management.Mod` | 0 | `Windows/Win32/Management/mod.rs` | `windows/win32/management/Mod.kt` |
| `Audio.mod` | `windows.win32.media.audio.Mod` | 0 | `Windows/Win32/Media/Audio/mod.rs` | `windows/win32/media/audio/Mod.kt` |
| `DxMediaObjects.mod` | `windows.win32.media.dxmediaobjects.Mod` | 0 | `Windows/Win32/Media/DxMediaObjects/mod.rs` | `windows/win32/media/dxmediaobjects/Mod.kt` |
| `KernelStreaming.mod` | `windows.win32.media.kernelstreaming.Mod` | 0 | `Windows/Win32/Media/KernelStreaming/mod.rs` | `windows/win32/media/kernelstreaming/Mod.kt` |
| `Multimedia.mod` | `windows.win32.media.multimedia.Mod` | 0 | `Windows/Win32/Media/Multimedia/mod.rs` | `windows/win32/media/multimedia/Mod.kt` |
| `Streaming.mod` | `windows.win32.media.streaming.Mod` | 0 | `Windows/Win32/Media/Streaming/mod.rs` | `windows/win32/media/streaming/Mod.kt` |
| `WindowsMediaFormat.mod` | `windows.win32.media.windowsmediaformat.Mod` | 0 | `Windows/Win32/Media/WindowsMediaFormat/mod.rs` | `windows/win32/media/windowsmediaformat/Mod.kt` |
| `Media.mod` | `windows.win32.media.Mod` | 0 | `Windows/Win32/Media/mod.rs` | `windows/win32/media/Mod.kt` |
| `Dhcp.mod` | `windows.win32.networkmanagement.dhcp.Mod` | 0 | `Windows/Win32/NetworkManagement/Dhcp/mod.rs` | `windows/win32/networkmanagement/dhcp/Mod.kt` |
| `Dns.mod` | `windows.win32.networkmanagement.dns.Mod` | 0 | `Windows/Win32/NetworkManagement/Dns/mod.rs` | `windows/win32/networkmanagement/dns/Mod.kt` |
| `InternetConnectionWizard.mod` | `windows.win32.networkmanagement.internetconnectionwizard.Mod` | 0 | `Windows/Win32/NetworkManagement/InternetConnectionWizard/mod.rs` | `windows/win32/networkmanagement/internetconnectionwizard/Mod.kt` |
| `IpHelper.mod` | `windows.win32.networkmanagement.iphelper.Mod` | 0 | `Windows/Win32/NetworkManagement/IpHelper/mod.rs` | `windows/win32/networkmanagement/iphelper/Mod.kt` |
| `Multicast.mod` | `windows.win32.networkmanagement.multicast.Mod` | 0 | `Windows/Win32/NetworkManagement/Multicast/mod.rs` | `windows/win32/networkmanagement/multicast/Mod.kt` |
| `Windows.Win32.NetworkManagement.Ndis.mod` | `windows.win32.networkmanagement.ndis.Mod` | 0 | `Windows/Win32/NetworkManagement/Ndis/mod.rs` | `windows/win32/networkmanagement/ndis/Mod.kt` |
| `NetBios.mod` | `windows.win32.networkmanagement.netbios.Mod` | 0 | `Windows/Win32/NetworkManagement/NetBios/mod.rs` | `windows/win32/networkmanagement/netbios/Mod.kt` |
| `NetManagement.mod` | `windows.win32.networkmanagement.netmanagement.Mod` | 0 | `Windows/Win32/NetworkManagement/NetManagement/mod.rs` | `windows/win32/networkmanagement/netmanagement/Mod.kt` |
| `NetShell.mod` | `windows.win32.networkmanagement.netshell.Mod` | 0 | `Windows/Win32/NetworkManagement/NetShell/mod.rs` | `windows/win32/networkmanagement/netshell/Mod.kt` |
| `NetworkDiagnosticsFramework.mod` | `windows.win32.networkmanagement.networkdiagnosticsframework.Mod` | 0 | `Windows/Win32/NetworkManagement/NetworkDiagnosticsFramework/mod.rs` | `windows/win32/networkmanagement/networkdiagnosticsframework/Mod.kt` |
| `P2P.mod` | `windows.win32.networkmanagement.p2p.Mod` | 0 | `Windows/Win32/NetworkManagement/P2P/mod.rs` | `windows/win32/networkmanagement/p2p/Mod.kt` |
| `QoS.mod` | `windows.win32.networkmanagement.qos.Mod` | 0 | `Windows/Win32/NetworkManagement/QoS/mod.rs` | `windows/win32/networkmanagement/qos/Mod.kt` |
| `Rras.mod` | `windows.win32.networkmanagement.rras.Mod` | 0 | `Windows/Win32/NetworkManagement/Rras/mod.rs` | `windows/win32/networkmanagement/rras/Mod.kt` |
| `Snmp.mod` | `windows.win32.networkmanagement.snmp.Mod` | 0 | `Windows/Win32/NetworkManagement/Snmp/mod.rs` | `windows/win32/networkmanagement/snmp/Mod.kt` |
| `WNet.mod` | `windows.win32.networkmanagement.wnet.Mod` | 0 | `Windows/Win32/NetworkManagement/WNet/mod.rs` | `windows/win32/networkmanagement/wnet/Mod.kt` |
| `WebDav.mod` | `windows.win32.networkmanagement.webdav.Mod` | 0 | `Windows/Win32/NetworkManagement/WebDav/mod.rs` | `windows/win32/networkmanagement/webdav/Mod.kt` |
| `WiFi.mod` | `windows.win32.networkmanagement.wifi.Mod` | 0 | `Windows/Win32/NetworkManagement/WiFi/mod.rs` | `windows/win32/networkmanagement/wifi/Mod.kt` |
| `WindowsConnectionManager.mod` | `windows.win32.networkmanagement.windowsconnectionmanager.Mod` | 0 | `Windows/Win32/NetworkManagement/WindowsConnectionManager/mod.rs` | `windows/win32/networkmanagement/windowsconnectionmanager/Mod.kt` |
| `Windows.Win32.NetworkManagement.WindowsFilteringPlatform.mod` | `windows.win32.networkmanagement.windowsfilteringplatform.Mod` | 0 | `Windows/Win32/NetworkManagement/WindowsFilteringPlatform/mod.rs` | `windows/win32/networkmanagement/windowsfilteringplatform/Mod.kt` |
| `WindowsFirewall.mod` | `windows.win32.networkmanagement.windowsfirewall.Mod` | 0 | `Windows/Win32/NetworkManagement/WindowsFirewall/mod.rs` | `windows/win32/networkmanagement/windowsfirewall/Mod.kt` |
| `WindowsNetworkVirtualization.mod` | `windows.win32.networkmanagement.windowsnetworkvirtualization.Mod` | 0 | `Windows/Win32/NetworkManagement/WindowsNetworkVirtualization/mod.rs` | `windows/win32/networkmanagement/windowsnetworkvirtualization/Mod.kt` |
| `Windows.Win32.NetworkManagement.mod` | `windows.win32.networkmanagement.Mod` | 0 | `Windows/Win32/NetworkManagement/mod.rs` | `windows/win32/networkmanagement/Mod.kt` |
| `ActiveDirectory.mod` | `windows.win32.networking.activedirectory.Mod` | 0 | `Windows/Win32/Networking/ActiveDirectory/mod.rs` | `windows/win32/networking/activedirectory/Mod.kt` |
| `Clustering.mod` | `windows.win32.networking.clustering.Mod` | 0 | `Windows/Win32/Networking/Clustering/mod.rs` | `windows/win32/networking/clustering/Mod.kt` |
| `HttpServer.mod` | `windows.win32.networking.httpserver.Mod` | 0 | `Windows/Win32/Networking/HttpServer/mod.rs` | `windows/win32/networking/httpserver/Mod.kt` |
| `Ldap.mod` | `windows.win32.networking.ldap.Mod` | 0 | `Windows/Win32/Networking/Ldap/mod.rs` | `windows/win32/networking/ldap/Mod.kt` |
| `WebSocket.mod` | `windows.win32.networking.websocket.Mod` | 0 | `Windows/Win32/Networking/WebSocket/mod.rs` | `windows/win32/networking/websocket/Mod.kt` |
| `WinHttp.mod` | `windows.win32.networking.winhttp.Mod` | 0 | `Windows/Win32/Networking/WinHttp/mod.rs` | `windows/win32/networking/winhttp/Mod.kt` |
| `WinInet.mod` | `windows.win32.networking.wininet.Mod` | 0 | `Windows/Win32/Networking/WinInet/mod.rs` | `windows/win32/networking/wininet/Mod.kt` |
| `WinSock.mod` | `windows.win32.networking.winsock.Mod` | 0 | `Windows/Win32/Networking/WinSock/mod.rs` | `windows/win32/networking/winsock/Mod.kt` |
| `WindowsWebServices.mod` | `windows.win32.networking.windowswebservices.Mod` | 0 | `Windows/Win32/Networking/WindowsWebServices/mod.rs` | `windows/win32/networking/windowswebservices/Mod.kt` |
| `Networking.mod` | `windows.win32.networking.Mod` | 0 | `Windows/Win32/Networking/mod.rs` | `windows/win32/networking/Mod.kt` |
| `AppLocker.mod` | `windows.win32.security.applocker.Mod` | 0 | `Windows/Win32/Security/AppLocker/mod.rs` | `windows/win32/security/applocker/Mod.kt` |
| `Identity.mod` | `windows.win32.security.authentication.identity.Mod` | 0 | `Windows/Win32/Security/Authentication/Identity/mod.rs` | `windows/win32/security/authentication/identity/Mod.kt` |
| `Authentication.mod` | `windows.win32.security.authentication.Mod` | 0 | `Windows/Win32/Security/Authentication/mod.rs` | `windows/win32/security/authentication/Mod.kt` |
| `Authorization.mod` | `windows.win32.security.authorization.Mod` | 0 | `Windows/Win32/Security/Authorization/mod.rs` | `windows/win32/security/authorization/Mod.kt` |
| `Credentials.mod` | `windows.win32.security.credentials.Mod` | 0 | `Windows/Win32/Security/Credentials/mod.rs` | `windows/win32/security/credentials/Mod.kt` |
| `Catalog.mod` | `windows.win32.security.cryptography.catalog.Mod` | 0 | `Windows/Win32/Security/Cryptography/Catalog/mod.rs` | `windows/win32/security/cryptography/catalog/Mod.kt` |
| `Certificates.mod` | `windows.win32.security.cryptography.certificates.Mod` | 0 | `Windows/Win32/Security/Cryptography/Certificates/mod.rs` | `windows/win32/security/cryptography/certificates/Mod.kt` |
| `Sip.mod` | `windows.win32.security.cryptography.sip.Mod` | 0 | `Windows/Win32/Security/Cryptography/Sip/mod.rs` | `windows/win32/security/cryptography/sip/Mod.kt` |
| `Windows.Win32.Security.Cryptography.UI.mod` | `windows.win32.security.cryptography.ui.Mod` | 0 | `Windows/Win32/Security/Cryptography/UI/mod.rs` | `windows/win32/security/cryptography/ui/Mod.kt` |
| `Cryptography.mod` | `windows.win32.security.cryptography.Mod` | 0 | `Windows/Win32/Security/Cryptography/mod.rs` | `windows/win32/security/cryptography/Mod.kt` |
| `DiagnosticDataQuery.mod` | `windows.win32.security.diagnosticdataquery.Mod` | 0 | `Windows/Win32/Security/DiagnosticDataQuery/mod.rs` | `windows/win32/security/diagnosticdataquery/Mod.kt` |
| `DirectoryServices.mod` | `windows.win32.security.directoryservices.Mod` | 0 | `Windows/Win32/Security/DirectoryServices/mod.rs` | `windows/win32/security/directoryservices/Mod.kt` |
| `EnterpriseData.mod` | `windows.win32.security.enterprisedata.Mod` | 0 | `Windows/Win32/Security/EnterpriseData/mod.rs` | `windows/win32/security/enterprisedata/Mod.kt` |
| `ExtensibleAuthenticationProtocol.mod` | `windows.win32.security.extensibleauthenticationprotocol.Mod` | 0 | `Windows/Win32/Security/ExtensibleAuthenticationProtocol/mod.rs` | `windows/win32/security/extensibleauthenticationprotocol/Mod.kt` |
| `Isolation.mod` | `windows.win32.security.isolation.Mod` | 0 | `Windows/Win32/Security/Isolation/mod.rs` | `windows/win32/security/isolation/Mod.kt` |
| `LicenseProtection.mod` | `windows.win32.security.licenseprotection.Mod` | 0 | `Windows/Win32/Security/LicenseProtection/mod.rs` | `windows/win32/security/licenseprotection/Mod.kt` |
| `NetworkAccessProtection.mod` | `windows.win32.security.networkaccessprotection.Mod` | 0 | `Windows/Win32/Security/NetworkAccessProtection/mod.rs` | `windows/win32/security/networkaccessprotection/Mod.kt` |
| `WinTrust.mod` | `windows.win32.security.wintrust.Mod` | 0 | `Windows/Win32/Security/WinTrust/mod.rs` | `windows/win32/security/wintrust/Mod.kt` |
| `WinWlx.mod` | `windows.win32.security.winwlx.Mod` | 0 | `Windows/Win32/Security/WinWlx/mod.rs` | `windows/win32/security/winwlx/Mod.kt` |
| `Security.mod` | `windows.win32.security.Mod` | 0 | `Windows/Win32/Security/mod.rs` | `windows/win32/security/Mod.kt` |
| `Cabinets.mod` | `windows.win32.storage.cabinets.Mod` | 0 | `Windows/Win32/Storage/Cabinets/mod.rs` | `windows/win32/storage/cabinets/Mod.kt` |
| `CloudFilters.mod` | `windows.win32.storage.cloudfilters.Mod` | 0 | `Windows/Win32/Storage/CloudFilters/mod.rs` | `windows/win32/storage/cloudfilters/Mod.kt` |
| `Compression.mod` | `windows.win32.storage.compression.Mod` | 0 | `Windows/Win32/Storage/Compression/mod.rs` | `windows/win32/storage/compression/Mod.kt` |
| `Bluetooth.mod` | `windows.wdk.devices.bluetooth.Mod` | 0 | `Windows/Wdk/Devices/Bluetooth/mod.rs` | `windows/wdk/devices/bluetooth/Mod.kt` |
| `FileHistory.mod` | `windows.win32.storage.filehistory.Mod` | 0 | `Windows/Win32/Storage/FileHistory/mod.rs` | `windows/win32/storage/filehistory/Mod.kt` |
| `Windows.Win32.Storage.FileSystem.mod` | `windows.win32.storage.filesystem.Mod` | 0 | `Windows/Win32/Storage/FileSystem/mod.rs` | `windows/win32/storage/filesystem/Mod.kt` |
| `Imapi.mod` | `windows.win32.storage.imapi.Mod` | 0 | `Windows/Win32/Storage/Imapi/mod.rs` | `windows/win32/storage/imapi/Mod.kt` |
| `IndexServer.mod` | `windows.win32.storage.indexserver.Mod` | 0 | `Windows/Win32/Storage/IndexServer/mod.rs` | `windows/win32/storage/indexserver/Mod.kt` |
| `InstallableFileSystems.mod` | `windows.win32.storage.installablefilesystems.Mod` | 0 | `Windows/Win32/Storage/InstallableFileSystems/mod.rs` | `windows/win32/storage/installablefilesystems/Mod.kt` |
| `IscsiDisc.mod` | `windows.win32.storage.iscsidisc.Mod` | 0 | `Windows/Win32/Storage/IscsiDisc/mod.rs` | `windows/win32/storage/iscsidisc/Mod.kt` |
| `Jet.mod` | `windows.win32.storage.jet.Mod` | 0 | `Windows/Win32/Storage/Jet/mod.rs` | `windows/win32/storage/jet/Mod.kt` |
| `Nvme.mod` | `windows.win32.storage.nvme.Mod` | 0 | `Windows/Win32/Storage/Nvme/mod.rs` | `windows/win32/storage/nvme/Mod.kt` |
| `OfflineFiles.mod` | `windows.win32.storage.offlinefiles.Mod` | 0 | `Windows/Win32/Storage/OfflineFiles/mod.rs` | `windows/win32/storage/offlinefiles/Mod.kt` |
| `OperationRecorder.mod` | `windows.win32.storage.operationrecorder.Mod` | 0 | `Windows/Win32/Storage/OperationRecorder/mod.rs` | `windows/win32/storage/operationrecorder/Mod.kt` |
| `Appx.mod` | `windows.win32.storage.packaging.appx.Mod` | 0 | `Windows/Win32/Storage/Packaging/Appx/mod.rs` | `windows/win32/storage/packaging/appx/Mod.kt` |
| `ProjectedFileSystem.mod` | `windows.win32.storage.projectedfilesystem.Mod` | 0 | `Windows/Win32/Storage/ProjectedFileSystem/mod.rs` | `windows/win32/storage/projectedfilesystem/Mod.kt` |
| `StructuredStorage.mod` | `windows.win32.storage.structuredstorage.Mod` | 0 | `Windows/Win32/Storage/StructuredStorage/mod.rs` | `windows/win32/storage/structuredstorage/Mod.kt` |
| `Vhd.mod` | `windows.win32.storage.vhd.Mod` | 0 | `Windows/Win32/Storage/Vhd/mod.rs` | `windows/win32/storage/vhd/Mod.kt` |
| `Xps.mod` | `windows.win32.storage.xps.Mod` | 0 | `Windows/Win32/Storage/Xps/mod.rs` | `windows/win32/storage/xps/Mod.kt` |
| `Windows.Win32.Storage.mod` | `windows.win32.storage.Mod` | 0 | `Windows/Win32/Storage/mod.rs` | `windows/win32/storage/Mod.kt` |
| `AddressBook.mod` | `windows.win32.system.addressbook.Mod` | 0 | `Windows/Win32/System/AddressBook/mod.rs` | `windows/win32/system/addressbook/Mod.kt` |
| `Antimalware.mod` | `windows.win32.system.antimalware.Mod` | 0 | `Windows/Win32/System/Antimalware/mod.rs` | `windows/win32/system/antimalware/Mod.kt` |
| `ApplicationInstallationAndServicing.mod` | `windows.win32.system.applicationinstallationandservicing.Mod` | 0 | `Windows/Win32/System/ApplicationInstallationAndServicing/mod.rs` | `windows/win32/system/applicationinstallationandservicing/Mod.kt` |
| `ApplicationVerifier.mod` | `windows.win32.system.applicationverifier.Mod` | 0 | `Windows/Win32/System/ApplicationVerifier/mod.rs` | `windows/win32/system/applicationverifier/Mod.kt` |
| `ClrHosting.mod` | `windows.win32.system.clrhosting.Mod` | 0 | `Windows/Win32/System/ClrHosting/mod.rs` | `windows/win32/system/clrhosting/Mod.kt` |
| `Marshal.mod` | `windows.win32.system.com.marshal.Mod` | 0 | `Windows/Win32/System/Com/Marshal/mod.rs` | `windows/win32/system/com/marshal/Mod.kt` |
| `Windows.Win32.System.Com.StructuredStorage.mod` | `windows.win32.system.com.structuredstorage.Mod` | 0 | `Windows/Win32/System/Com/StructuredStorage/mod.rs` | `windows/win32/system/com/structuredstorage/Mod.kt` |
| `Urlmon.mod` | `windows.win32.system.com.urlmon.Mod` | 0 | `Windows/Win32/System/Com/Urlmon/mod.rs` | `windows/win32/system/com/urlmon/Mod.kt` |
| `Com.mod` | `windows.win32.system.com.Mod` | 0 | `Windows/Win32/System/Com/mod.rs` | `windows/win32/system/com/Mod.kt` |
| `ComponentServices.mod` | `windows.win32.system.componentservices.Mod` | 0 | `Windows/Win32/System/ComponentServices/mod.rs` | `windows/win32/system/componentservices/Mod.kt` |
| `Console.mod` | `windows.win32.system.console.Mod` | 0 | `Windows/Win32/System/Console/mod.rs` | `windows/win32/system/console/Mod.kt` |
| `CorrelationVector.mod` | `windows.win32.system.correlationvector.Mod` | 0 | `Windows/Win32/System/CorrelationVector/mod.rs` | `windows/win32/system/correlationvector/Mod.kt` |
| `DataExchange.mod` | `windows.win32.system.dataexchange.Mod` | 0 | `Windows/Win32/System/DataExchange/mod.rs` | `windows/win32/system/dataexchange/Mod.kt` |
| `DeploymentServices.mod` | `windows.win32.system.deploymentservices.Mod` | 0 | `Windows/Win32/System/DeploymentServices/mod.rs` | `windows/win32/system/deploymentservices/Mod.kt` |
| `DeveloperLicensing.mod` | `windows.win32.system.developerlicensing.Mod` | 0 | `Windows/Win32/System/DeveloperLicensing/mod.rs` | `windows/win32/system/developerlicensing/Mod.kt` |
| `Ceip.mod` | `windows.win32.system.diagnostics.ceip.Mod` | 0 | `Windows/Win32/System/Diagnostics/Ceip/mod.rs` | `windows/win32/system/diagnostics/ceip/Mod.kt` |
| `Extensions.mod` | `windows.win32.system.diagnostics.debug.extensions.Mod` | 0 | `Windows/Win32/System/Diagnostics/Debug/Extensions/mod.rs` | `windows/win32/system/diagnostics/debug/extensions/Mod.kt` |
| `Debug.mod` | `windows.win32.system.diagnostics.debug.Mod` | 0 | `Windows/Win32/System/Diagnostics/Debug/mod.rs` | `windows/win32/system/diagnostics/debug/Mod.kt` |
| `Etw.mod` | `windows.win32.system.diagnostics.etw.Mod` | 0 | `Windows/Win32/System/Diagnostics/Etw/mod.rs` | `windows/win32/system/diagnostics/etw/Mod.kt` |
| `ProcessSnapshotting.mod` | `windows.win32.system.diagnostics.processsnapshotting.Mod` | 0 | `Windows/Win32/System/Diagnostics/ProcessSnapshotting/mod.rs` | `windows/win32/system/diagnostics/processsnapshotting/Mod.kt` |
| `ToolHelp.mod` | `windows.win32.system.diagnostics.toolhelp.Mod` | 0 | `Windows/Win32/System/Diagnostics/ToolHelp/mod.rs` | `windows/win32/system/diagnostics/toolhelp/Mod.kt` |
| `TraceLogging.mod` | `windows.win32.system.diagnostics.tracelogging.Mod` | 0 | `Windows/Win32/System/Diagnostics/TraceLogging/mod.rs` | `windows/win32/system/diagnostics/tracelogging/Mod.kt` |
| `Diagnostics.mod` | `windows.win32.system.diagnostics.Mod` | 0 | `Windows/Win32/System/Diagnostics/mod.rs` | `windows/win32/system/diagnostics/Mod.kt` |
| `DistributedTransactionCoordinator.mod` | `windows.win32.system.distributedtransactioncoordinator.Mod` | 0 | `Windows/Win32/System/DistributedTransactionCoordinator/mod.rs` | `windows/win32/system/distributedtransactioncoordinator/Mod.kt` |
| `Environment.mod` | `windows.win32.system.environment.Mod` | 0 | `Windows/Win32/System/Environment/mod.rs` | `windows/win32/system/environment/Mod.kt` |
| `ErrorReporting.mod` | `windows.win32.system.errorreporting.Mod` | 0 | `Windows/Win32/System/ErrorReporting/mod.rs` | `windows/win32/system/errorreporting/Mod.kt` |
| `EventCollector.mod` | `windows.win32.system.eventcollector.Mod` | 0 | `Windows/Win32/System/EventCollector/mod.rs` | `windows/win32/system/eventcollector/Mod.kt` |
| `EventLog.mod` | `windows.win32.system.eventlog.Mod` | 0 | `Windows/Win32/System/EventLog/mod.rs` | `windows/win32/system/eventlog/Mod.kt` |
| `EventNotificationService.mod` | `windows.win32.system.eventnotificationservice.Mod` | 0 | `Windows/Win32/System/EventNotificationService/mod.rs` | `windows/win32/system/eventnotificationservice/Mod.kt` |
| `GroupPolicy.mod` | `windows.win32.system.grouppolicy.Mod` | 0 | `Windows/Win32/System/GroupPolicy/mod.rs` | `windows/win32/system/grouppolicy/Mod.kt` |
| `HostComputeNetwork.mod` | `windows.win32.system.hostcomputenetwork.Mod` | 0 | `Windows/Win32/System/HostComputeNetwork/mod.rs` | `windows/win32/system/hostcomputenetwork/Mod.kt` |
| `HostComputeSystem.mod` | `windows.win32.system.hostcomputesystem.Mod` | 0 | `Windows/Win32/System/HostComputeSystem/mod.rs` | `windows/win32/system/hostcomputesystem/Mod.kt` |
| `Hypervisor.mod` | `windows.win32.system.hypervisor.Mod` | 0 | `Windows/Win32/System/Hypervisor/mod.rs` | `windows/win32/system/hypervisor/Mod.kt` |
| `Windows.Win32.System.IO.mod` | `windows.win32.system.io.Mod` | 0 | `Windows/Win32/System/IO/mod.rs` | `windows/win32/system/io/Mod.kt` |
| `Iis.mod` | `windows.win32.system.iis.Mod` | 0 | `Windows/Win32/System/Iis/mod.rs` | `windows/win32/system/iis/Mod.kt` |
| `Ioctl.mod` | `windows.win32.system.ioctl.Mod` | 0 | `Windows/Win32/System/Ioctl/mod.rs` | `windows/win32/system/ioctl/Mod.kt` |
| `JobObjects.mod` | `windows.win32.system.jobobjects.Mod` | 0 | `Windows/Win32/System/JobObjects/mod.rs` | `windows/win32/system/jobobjects/Mod.kt` |
| `Js.mod` | `windows.win32.system.js.Mod` | 0 | `Windows/Win32/System/Js/mod.rs` | `windows/win32/system/js/Mod.kt` |
| `Kernel.mod` | `windows.win32.system.kernel.Mod` | 0 | `Windows/Win32/System/Kernel/mod.rs` | `windows/win32/system/kernel/Mod.kt` |
| `LibraryLoader.mod` | `windows.win32.system.libraryloader.Mod` | 0 | `Windows/Win32/System/LibraryLoader/mod.rs` | `windows/win32/system/libraryloader/Mod.kt` |
| `Mailslots.mod` | `windows.win32.system.mailslots.Mod` | 0 | `Windows/Win32/System/Mailslots/mod.rs` | `windows/win32/system/mailslots/Mod.kt` |
| `Mapi.mod` | `windows.win32.system.mapi.Mod` | 0 | `Windows/Win32/System/Mapi/mod.rs` | `windows/win32/system/mapi/Mod.kt` |
| `NonVolatile.mod` | `windows.win32.system.memory.nonvolatile.Mod` | 0 | `Windows/Win32/System/Memory/NonVolatile/mod.rs` | `windows/win32/system/memory/nonvolatile/Mod.kt` |
| `Windows.Win32.System.Memory.mod` | `windows.win32.system.memory.Mod` | 0 | `Windows/Win32/System/Memory/mod.rs` | `windows/win32/system/memory/Mod.kt` |
| `MessageQueuing.mod` | `windows.win32.system.messagequeuing.Mod` | 0 | `Windows/Win32/System/MessageQueuing/mod.rs` | `windows/win32/system/messagequeuing/Mod.kt` |
| `MixedReality.mod` | `windows.win32.system.mixedreality.Mod` | 0 | `Windows/Win32/System/MixedReality/mod.rs` | `windows/win32/system/mixedreality/Mod.kt` |
| `Ole.mod` | `windows.win32.system.ole.Mod` | 0 | `Windows/Win32/System/Ole/mod.rs` | `windows/win32/system/ole/Mod.kt` |
| `PasswordManagement.mod` | `windows.win32.system.passwordmanagement.Mod` | 0 | `Windows/Win32/System/PasswordManagement/mod.rs` | `windows/win32/system/passwordmanagement/Mod.kt` |
| `HardwareCounterProfiling.mod` | `windows.win32.system.performance.hardwarecounterprofiling.Mod` | 0 | `Windows/Win32/System/Performance/HardwareCounterProfiling/mod.rs` | `windows/win32/system/performance/hardwarecounterprofiling/Mod.kt` |
| `Performance.mod` | `windows.win32.system.performance.Mod` | 0 | `Windows/Win32/System/Performance/mod.rs` | `windows/win32/system/performance/Mod.kt` |
| `Pipes.mod` | `windows.win32.system.pipes.Mod` | 0 | `Windows/Win32/System/Pipes/mod.rs` | `windows/win32/system/pipes/Mod.kt` |
| `Power.mod` | `windows.win32.system.power.Mod` | 0 | `Windows/Win32/System/Power/mod.rs` | `windows/win32/system/power/Mod.kt` |
| `ProcessStatus.mod` | `windows.win32.system.processstatus.Mod` | 0 | `Windows/Win32/System/ProcessStatus/mod.rs` | `windows/win32/system/processstatus/Mod.kt` |
| `Recovery.mod` | `windows.win32.system.recovery.Mod` | 0 | `Windows/Win32/System/Recovery/mod.rs` | `windows/win32/system/recovery/Mod.kt` |
| `Windows.Win32.System.Registry.mod` | `windows.win32.system.registry.Mod` | 0 | `Windows/Win32/System/Registry/mod.rs` | `windows/win32/system/registry/Mod.kt` |
| `RemoteDesktop.mod` | `windows.win32.system.remotedesktop.Mod` | 0 | `Windows/Win32/System/RemoteDesktop/mod.rs` | `windows/win32/system/remotedesktop/Mod.kt` |
| `RemoteManagement.mod` | `windows.win32.system.remotemanagement.Mod` | 0 | `Windows/Win32/System/RemoteManagement/mod.rs` | `windows/win32/system/remotemanagement/Mod.kt` |
| `RestartManager.mod` | `windows.win32.system.restartmanager.Mod` | 0 | `Windows/Win32/System/RestartManager/mod.rs` | `windows/win32/system/restartmanager/Mod.kt` |
| `Restore.mod` | `windows.win32.system.restore.Mod` | 0 | `Windows/Win32/System/Restore/mod.rs` | `windows/win32/system/restore/Mod.kt` |
| `Rpc.mod` | `windows.win32.system.rpc.Mod` | 0 | `Windows/Win32/System/Rpc/mod.rs` | `windows/win32/system/rpc/Mod.kt` |
| `Windows.Win32.System.Search.Common.mod` | `windows.win32.system.search.common.Mod` | 0 | `Windows/Win32/System/Search/Common/mod.rs` | `windows/win32/system/search/common/Mod.kt` |
| `Search.mod` | `windows.win32.system.search.Mod` | 0 | `Windows/Win32/System/Search/mod.rs` | `windows/win32/system/search/Mod.kt` |
| `SecurityCenter.mod` | `windows.win32.system.securitycenter.Mod` | 0 | `Windows/Win32/System/SecurityCenter/mod.rs` | `windows/win32/system/securitycenter/Mod.kt` |
| `Services.mod` | `windows.win32.system.services.Mod` | 0 | `Windows/Win32/System/Services/mod.rs` | `windows/win32/system/services/Mod.kt` |
| `SetupAndMigration.mod` | `windows.win32.system.setupandmigration.Mod` | 0 | `Windows/Win32/System/SetupAndMigration/mod.rs` | `windows/win32/system/setupandmigration/Mod.kt` |
| `Shutdown.mod` | `windows.win32.system.shutdown.Mod` | 0 | `Windows/Win32/System/Shutdown/mod.rs` | `windows/win32/system/shutdown/Mod.kt` |
| `StationsAndDesktops.mod` | `windows.win32.system.stationsanddesktops.Mod` | 0 | `Windows/Win32/System/StationsAndDesktops/mod.rs` | `windows/win32/system/stationsanddesktops/Mod.kt` |
| `SubsystemForLinux.mod` | `windows.win32.system.subsystemforlinux.Mod` | 0 | `Windows/Win32/System/SubsystemForLinux/mod.rs` | `windows/win32/system/subsystemforlinux/Mod.kt` |
| `Windows.Win32.System.SystemInformation.mod` | `windows.win32.system.systeminformation.Mod` | 0 | `Windows/Win32/System/SystemInformation/mod.rs` | `windows/win32/system/systeminformation/Mod.kt` |
| `Windows.Win32.System.SystemServices.mod` | `windows.win32.system.systemservices.Mod` | 0 | `Windows/Win32/System/SystemServices/mod.rs` | `windows/win32/system/systemservices/Mod.kt` |
| `Windows.Win32.System.Threading.mod` | `windows.win32.system.threading.Mod` | 0 | `Windows/Win32/System/Threading/mod.rs` | `windows/win32/system/threading/Mod.kt` |
| `Time.mod` | `windows.win32.system.time.Mod` | 0 | `Windows/Win32/System/Time/mod.rs` | `windows/win32/system/time/Mod.kt` |
| `TpmBaseServices.mod` | `windows.win32.system.tpmbaseservices.Mod` | 0 | `Windows/Win32/System/TpmBaseServices/mod.rs` | `windows/win32/system/tpmbaseservices/Mod.kt` |
| `UserAccessLogging.mod` | `windows.win32.system.useraccesslogging.Mod` | 0 | `Windows/Win32/System/UserAccessLogging/mod.rs` | `windows/win32/system/useraccesslogging/Mod.kt` |
| `Variant.mod` | `windows.win32.system.variant.Mod` | 0 | `Windows/Win32/System/Variant/mod.rs` | `windows/win32/system/variant/Mod.kt` |
| `VirtualDosMachines.mod` | `windows.win32.system.virtualdosmachines.Mod` | 0 | `Windows/Win32/System/VirtualDosMachines/mod.rs` | `windows/win32/system/virtualdosmachines/Mod.kt` |
| `WindowsProgramming.mod` | `windows.win32.system.windowsprogramming.Mod` | 0 | `Windows/Win32/System/WindowsProgramming/mod.rs` | `windows/win32/system/windowsprogramming/Mod.kt` |
| `Wmi.mod` | `windows.win32.system.wmi.Mod` | 0 | `Windows/Win32/System/Wmi/mod.rs` | `windows/win32/system/wmi/Mod.kt` |
| `Windows.Win32.System.mod` | `windows.win32.system.Mod` | 0 | `Windows/Win32/System/mod.rs` | `windows/win32/system/Mod.kt` |
| `Accessibility.mod` | `windows.win32.ui.accessibility.Mod` | 0 | `Windows/Win32/UI/Accessibility/mod.rs` | `windows/win32/ui/accessibility/Mod.kt` |
| `ColorSystem.mod` | `windows.win32.ui.colorsystem.Mod` | 0 | `Windows/Win32/UI/ColorSystem/mod.rs` | `windows/win32/ui/colorsystem/Mod.kt` |
| `Dialogs.mod` | `windows.win32.ui.controls.dialogs.Mod` | 0 | `Windows/Win32/UI/Controls/Dialogs/mod.rs` | `windows/win32/ui/controls/dialogs/Mod.kt` |
| `Controls.mod` | `windows.win32.ui.controls.Mod` | 0 | `Windows/Win32/UI/Controls/mod.rs` | `windows/win32/ui/controls/Mod.kt` |
| `HiDpi.mod` | `windows.win32.ui.hidpi.Mod` | 0 | `Windows/Win32/UI/HiDpi/mod.rs` | `windows/win32/ui/hidpi/Mod.kt` |
| `Ime.mod` | `windows.win32.ui.input.ime.Mod` | 0 | `Windows/Win32/UI/Input/Ime/mod.rs` | `windows/win32/ui/input/ime/Mod.kt` |
| `KeyboardAndMouse.mod` | `windows.win32.ui.input.keyboardandmouse.Mod` | 0 | `Windows/Win32/UI/Input/KeyboardAndMouse/mod.rs` | `windows/win32/ui/input/keyboardandmouse/Mod.kt` |
| `Pointer.mod` | `windows.win32.ui.input.pointer.Mod` | 0 | `Windows/Win32/UI/Input/Pointer/mod.rs` | `windows/win32/ui/input/pointer/Mod.kt` |
| `Touch.mod` | `windows.win32.ui.input.touch.Mod` | 0 | `Windows/Win32/UI/Input/Touch/mod.rs` | `windows/win32/ui/input/touch/Mod.kt` |
| `XboxController.mod` | `windows.win32.ui.input.xboxcontroller.Mod` | 0 | `Windows/Win32/UI/Input/XboxController/mod.rs` | `windows/win32/ui/input/xboxcontroller/Mod.kt` |
| `Input.mod` | `windows.win32.ui.input.Mod` | 0 | `Windows/Win32/UI/Input/mod.rs` | `windows/win32/ui/input/Mod.kt` |
| `InteractionContext.mod` | `windows.win32.ui.interactioncontext.Mod` | 0 | `Windows/Win32/UI/InteractionContext/mod.rs` | `windows/win32/ui/interactioncontext/Mod.kt` |
| `Magnification.mod` | `windows.win32.ui.magnification.Mod` | 0 | `Windows/Win32/UI/Magnification/mod.rs` | `windows/win32/ui/magnification/Mod.kt` |
| `Common.mod` | `windows.win32.ui.shell.common.Mod` | 0 | `Windows/Win32/UI/Shell/Common/mod.rs` | `windows/win32/ui/shell/common/Mod.kt` |
| `PropertiesSystem.mod` | `windows.win32.ui.shell.propertiessystem.Mod` | 0 | `Windows/Win32/UI/Shell/PropertiesSystem/mod.rs` | `windows/win32/ui/shell/propertiessystem/Mod.kt` |
| `Shell.mod` | `windows.win32.ui.shell.Mod` | 0 | `Windows/Win32/UI/Shell/mod.rs` | `windows/win32/ui/shell/Mod.kt` |
| `TabletPC.mod` | `windows.win32.ui.tabletpc.Mod` | 0 | `Windows/Win32/UI/TabletPC/mod.rs` | `windows/win32/ui/tabletpc/Mod.kt` |
| `TextServices.mod` | `windows.win32.ui.textservices.Mod` | 0 | `Windows/Win32/UI/TextServices/mod.rs` | `windows/win32/ui/textservices/Mod.kt` |
| `WindowsAndMessaging.mod` | `windows.win32.ui.windowsandmessaging.Mod` | 0 | `Windows/Win32/UI/WindowsAndMessaging/mod.rs` | `windows/win32/ui/windowsandmessaging/Mod.kt` |
| `UI.mod` | `windows.win32.ui.Mod` | 0 | `Windows/Win32/UI/mod.rs` | `windows/win32/ui/Mod.kt` |
| `InternetExplorer.mod` | `windows.win32.web.internetexplorer.Mod` | 0 | `Windows/Win32/Web/InternetExplorer/mod.rs` | `windows/win32/web/internetexplorer/Mod.kt` |
| `Web.mod` | `windows.win32.web.Mod` | 0 | `Windows/Win32/Web/mod.rs` | `windows/win32/web/Mod.kt` |
| `lib` | `Lib` | 0 | `lib.rs` | `Lib.kt` |

