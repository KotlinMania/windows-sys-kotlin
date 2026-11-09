#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_BLUETOOTH_WINDOWS_WIN32_DEVICES_BLUETOOTH_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_BLUETOOTH_WINDOWS_WIN32_DEVICES_BLUETOOTH_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_devices_bluetooth_BluetoothAuthenticateDevice(void* hwndparent, void* hradio, void* pbtbi, void* pszpasskey, uint32_t ulpasskeylength);
uint32_t windowssys_windows_win32_devices_bluetooth_BluetoothAuthenticateDeviceEx(void* hwndparentin, void* hradioin, void* pbtdiinout, void* pbtoobdata, int32_t authenticationrequirement);
uint32_t windowssys_windows_win32_devices_bluetooth_BluetoothAuthenticateMultipleDevices(void* hwndparent, void* hradio, uint32_t cdevices, void* rgbtdi);
int32_t windowssys_windows_win32_devices_bluetooth_BluetoothDisplayDeviceProperties(void* hwndparent, void* pbtdi);
int32_t windowssys_windows_win32_devices_bluetooth_BluetoothEnableDiscovery(void* hradio, int32_t fenabled);
int32_t windowssys_windows_win32_devices_bluetooth_BluetoothEnableIncomingConnections(void* hradio, int32_t fenabled);
uint32_t windowssys_windows_win32_devices_bluetooth_BluetoothEnumerateInstalledServices(void* hradio, void* pbtdi, void* pcserviceinout, void* pguidservices);
int32_t windowssys_windows_win32_devices_bluetooth_BluetoothFindDeviceClose(void* hfind);
void* windowssys_windows_win32_devices_bluetooth_BluetoothFindFirstDevice(void* pbtsp, void* pbtdi);
void* windowssys_windows_win32_devices_bluetooth_BluetoothFindFirstRadio(void* pbtfrp, void* phradio);
int32_t windowssys_windows_win32_devices_bluetooth_BluetoothFindNextDevice(void* hfind, void* pbtdi);
int32_t windowssys_windows_win32_devices_bluetooth_BluetoothFindNextRadio(void* hfind, void* phradio);
int32_t windowssys_windows_win32_devices_bluetooth_BluetoothFindRadioClose(void* hfind);
int32_t windowssys_windows_win32_devices_bluetooth_BluetoothGATTAbortReliableWrite(void* hdevice, uint64_t reliablewritecontext, uint32_t flags);
int32_t windowssys_windows_win32_devices_bluetooth_BluetoothGATTBeginReliableWrite(void* hdevice, void* reliablewritecontext, uint32_t flags);
int32_t windowssys_windows_win32_devices_bluetooth_BluetoothGATTEndReliableWrite(void* hdevice, uint64_t reliablewritecontext, uint32_t flags);
int32_t windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetCharacteristicValue(void* hdevice, void* characteristic, uint32_t characteristicvaluedatasize, void* characteristicvalue, void* characteristicvaluesizerequired, uint32_t flags);
int32_t windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetCharacteristics(void* hdevice, void* service, uint16_t characteristicsbuffercount, void* characteristicsbuffer, void* characteristicsbufferactual, uint32_t flags);
int32_t windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetDescriptorValue(void* hdevice, void* descriptor, uint32_t descriptorvaluedatasize, void* descriptorvalue, void* descriptorvaluesizerequired, uint32_t flags);
int32_t windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetDescriptors(void* hdevice, void* characteristic, uint16_t descriptorsbuffercount, void* descriptorsbuffer, void* descriptorsbufferactual, uint32_t flags);
int32_t windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetIncludedServices(void* hdevice, void* parentservice, uint16_t includedservicesbuffercount, void* includedservicesbuffer, void* includedservicesbufferactual, uint32_t flags);
int32_t windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetServices(void* hdevice, uint16_t servicesbuffercount, void* servicesbuffer, void* servicesbufferactual, uint32_t flags);
int32_t windowssys_windows_win32_devices_bluetooth_BluetoothGATTRegisterEvent(void* hservice, int32_t eventtype, void* eventparameterin, void* callback, void* callbackcontext, void* peventhandle, uint32_t flags);
int32_t windowssys_windows_win32_devices_bluetooth_BluetoothGATTSetCharacteristicValue(void* hdevice, void* characteristic, void* characteristicvalue, uint64_t reliablewritecontext, uint32_t flags);
int32_t windowssys_windows_win32_devices_bluetooth_BluetoothGATTSetDescriptorValue(void* hdevice, void* descriptor, void* descriptorvalue, uint32_t flags);
int32_t windowssys_windows_win32_devices_bluetooth_BluetoothGATTUnregisterEvent(int64_t eventhandle, uint32_t flags);
uint32_t windowssys_windows_win32_devices_bluetooth_BluetoothGetDeviceInfo(void* hradio, void* pbtdi);
uint32_t windowssys_windows_win32_devices_bluetooth_BluetoothGetRadioInfo(void* hradio, void* pradioinfo);
int32_t windowssys_windows_win32_devices_bluetooth_BluetoothIsConnectable(void* hradio);
int32_t windowssys_windows_win32_devices_bluetooth_BluetoothIsDiscoverable(void* hradio);
int32_t windowssys_windows_win32_devices_bluetooth_BluetoothIsVersionAvailable(uint8_t majorversion, uint8_t minorversion);
uint32_t windowssys_windows_win32_devices_bluetooth_BluetoothRegisterForAuthentication(void* pbtdi, void* phreghandle, void* pfncallback, void* pvparam);
uint32_t windowssys_windows_win32_devices_bluetooth_BluetoothRegisterForAuthenticationEx(void* pbtdiin, void* phreghandleout, void* pfncallbackin, void* pvparam);
uint32_t windowssys_windows_win32_devices_bluetooth_BluetoothRemoveDevice(void* paddress);
int32_t windowssys_windows_win32_devices_bluetooth_BluetoothSdpEnumAttributes(void* psdpstream, uint32_t cbstreamsize, void* pfncallback, void* pvparam);
uint32_t windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetAttributeValue(void* precordstream, uint32_t cbrecordlength, uint16_t usattributeid, void* pattributedata);
uint32_t windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetContainerElementData(void* pcontainerstream, uint32_t cbcontainerlength, void* pelement, void* pdata);
uint32_t windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetElementData(void* psdpstream, uint32_t cbsdpstreamlength, void* pdata);
uint32_t windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetString(void* precordstream, uint32_t cbrecordlength, void* pstringdata, uint16_t usstringoffset, void* pszstring, void* pcchstringlength);
int32_t windowssys_windows_win32_devices_bluetooth_BluetoothSelectDevices(void* pbtsdp);
int32_t windowssys_windows_win32_devices_bluetooth_BluetoothSelectDevicesFree(void* pbtsdp);
uint32_t windowssys_windows_win32_devices_bluetooth_BluetoothSendAuthenticationResponse(void* hradio, void* pbtdi, void* pszpasskey);
uint32_t windowssys_windows_win32_devices_bluetooth_BluetoothSendAuthenticationResponseEx(void* hradioin, void* pauthresponse);
uint32_t windowssys_windows_win32_devices_bluetooth_BluetoothSetLocalServiceInfo(void* hradioin, void* pclassguid, uint32_t ulinstance, void* pserviceinfoin);
uint32_t windowssys_windows_win32_devices_bluetooth_BluetoothSetServiceState(void* hradio, void* pbtdi, void* pguidservice, uint32_t dwserviceflags);
int32_t windowssys_windows_win32_devices_bluetooth_BluetoothUnregisterAuthentication(int64_t hreghandle);
uint32_t windowssys_windows_win32_devices_bluetooth_BluetoothUpdateDeviceRecord(void* pbtdi);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_BLUETOOTH_WINDOWS_WIN32_DEVICES_BLUETOOTH_WRAPPER_H */
