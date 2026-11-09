#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_DISPLAY_WINDOWS_WIN32_DEVICES_DISPLAY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_DISPLAY_WINDOWS_WIN32_DEVICES_DISPLAY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* windowssys_windows_win32_devices_display_BRUSHOBJ_hGetColorTransform(void* pbo);
void* windowssys_windows_win32_devices_display_BRUSHOBJ_pvAllocRbrush(void* pbo, uint32_t cj);
void* windowssys_windows_win32_devices_display_BRUSHOBJ_pvGetRbrush(void* pbo);
uint32_t windowssys_windows_win32_devices_display_BRUSHOBJ_ulGetBrushColor(void* pbo);
int32_t windowssys_windows_win32_devices_display_CLIPOBJ_bEnum(void* pco, uint32_t cj, void* pul);
uint32_t windowssys_windows_win32_devices_display_CLIPOBJ_cEnumStart(void* pco, int32_t ball, uint32_t itype, uint32_t idirection, uint32_t climit);
void* windowssys_windows_win32_devices_display_CLIPOBJ_ppoGetPath(void* pco);
int32_t windowssys_windows_win32_devices_display_CapabilitiesRequestAndCapabilitiesReply(void* hmonitor, void* pszasciicapabilitiesstring, uint32_t dwcapabilitiesstringlengthincharacters);
int32_t windowssys_windows_win32_devices_display_DegaussMonitor(void* hmonitor);
int32_t windowssys_windows_win32_devices_display_DestroyPhysicalMonitor(void* hmonitor);
int32_t windowssys_windows_win32_devices_display_DestroyPhysicalMonitors(uint32_t dwphysicalmonitorarraysize, void* pphysicalmonitorarray);
int32_t windowssys_windows_win32_devices_display_DisplayConfigGetDeviceInfo(void* requestpacket);
int32_t windowssys_windows_win32_devices_display_DisplayConfigSetDeviceInfo(void* setpacket);
void windowssys_windows_win32_devices_display_EngAcquireSemaphore(void* hsem);
int32_t windowssys_windows_win32_devices_display_EngAlphaBlend(void* psodest, void* psosrc, void* pco, void* pxlo, void* prcldest, void* prclsrc, void* pblendobj);
int32_t windowssys_windows_win32_devices_display_EngAssociateSurface(void* hsurf, void* hdev, uint32_t flhooks);
int32_t windowssys_windows_win32_devices_display_EngBitBlt(void* psotrg, void* psosrc, void* psomask, void* pco, void* pxlo, void* prcltrg, void* pptlsrc, void* pptlmask, void* pbo, void* pptlbrush, uint32_t rop4);
int32_t windowssys_windows_win32_devices_display_EngCheckAbort(void* pso);
void* windowssys_windows_win32_devices_display_EngComputeGlyphSet(int32_t ncodepage, int32_t nfirstchar, int32_t cchars);
int32_t windowssys_windows_win32_devices_display_EngCopyBits(void* psodest, void* psosrc, void* pco, void* pxlo, void* prcldest, void* pptlsrc);
void* windowssys_windows_win32_devices_display_EngCreateClip(void);
void* windowssys_windows_win32_devices_display_EngCreatePalette(uint32_t imode, uint32_t ccolors, void* pulcolors, uint32_t flred, uint32_t flgreen, uint32_t flblue);
void* windowssys_windows_win32_devices_display_EngCreateSemaphore(void);
void windowssys_windows_win32_devices_display_EngDeleteClip(void* pco);
int32_t windowssys_windows_win32_devices_display_EngDeletePalette(void* hpal);
void windowssys_windows_win32_devices_display_EngDeletePath(void* ppo);
void windowssys_windows_win32_devices_display_EngDeleteSemaphore(void* hsem);
int32_t windowssys_windows_win32_devices_display_EngDeleteSurface(void* hsurf);
int32_t windowssys_windows_win32_devices_display_EngEraseSurface(void* pso, void* prcl, uint32_t icolor);
int32_t windowssys_windows_win32_devices_display_EngFillPath(void* pso, void* ppo, void* pco, void* pbo, void* pptlbrushorg, uint32_t mix, uint32_t floptions);
void* windowssys_windows_win32_devices_display_EngFindResource(void* h, int32_t iname, int32_t itype, void* pulsize);
void windowssys_windows_win32_devices_display_EngFreeModule(void* h);
void windowssys_windows_win32_devices_display_EngGetCurrentCodePage(void* oemcodepage, void* ansicodepage);
void* windowssys_windows_win32_devices_display_EngGetDriverName(void* hdev);
void* windowssys_windows_win32_devices_display_EngGetPrinterDataFileName(void* hdev);
int32_t windowssys_windows_win32_devices_display_EngGradientFill(void* psodest, void* pco, void* pxlo, void* pvertex, uint32_t nvertex, void* pmesh, uint32_t nmesh, void* prclextents, void* pptlditherorg, uint32_t ulmode);
int32_t windowssys_windows_win32_devices_display_EngLineTo(void* pso, void* pco, void* pbo, int32_t x1, int32_t y1, int32_t x2, int32_t y2, void* prclbounds, uint32_t mix);
void* windowssys_windows_win32_devices_display_EngLoadModule(void* pwsz);
void* windowssys_windows_win32_devices_display_EngLockSurface(void* hsurf);
int32_t windowssys_windows_win32_devices_display_EngMarkBandingSurface(void* hsurf);
void windowssys_windows_win32_devices_display_EngMultiByteToUnicodeN(void* unicodestring, uint32_t maxbytesinunicodestring, void* bytesinunicodestring, void* multibytestring, uint32_t bytesinmultibytestring);
int32_t windowssys_windows_win32_devices_display_EngMultiByteToWideChar(uint32_t codepage, void* widecharstring, int32_t bytesinwidecharstring, void* multibytestring, int32_t bytesinmultibytestring);
int32_t windowssys_windows_win32_devices_display_EngPaint(void* pso, void* pco, void* pbo, void* pptlbrushorg, uint32_t mix);
int32_t windowssys_windows_win32_devices_display_EngPlgBlt(void* psotrg, void* psosrc, void* psomsk, void* pco, void* pxlo, void* pca, void* pptlbrushorg, void* pptfx, void* prcl, void* pptl, uint32_t imode);
int32_t windowssys_windows_win32_devices_display_EngQueryEMFInfo(void* hdev, void* pemfinfo);
void windowssys_windows_win32_devices_display_EngQueryLocalTime(void* param0);
void windowssys_windows_win32_devices_display_EngReleaseSemaphore(void* hsem);
int32_t windowssys_windows_win32_devices_display_EngStretchBlt(void* psodest, void* psosrc, void* psomask, void* pco, void* pxlo, void* pca, void* pptlhtorg, void* prcldest, void* prclsrc, void* pptlmask, uint32_t imode);
int32_t windowssys_windows_win32_devices_display_EngStretchBltROP(void* psodest, void* psosrc, void* psomask, void* pco, void* pxlo, void* pca, void* pptlhtorg, void* prcldest, void* prclsrc, void* pptlmask, uint32_t imode, void* pbo, uint32_t rop4);
int32_t windowssys_windows_win32_devices_display_EngStrokeAndFillPath(void* pso, void* ppo, void* pco, void* pxo, void* pbostroke, void* plineattrs, void* pbofill, void* pptlbrushorg, uint32_t mixfill, uint32_t floptions);
int32_t windowssys_windows_win32_devices_display_EngStrokePath(void* pso, void* ppo, void* pco, void* pxo, void* pbo, void* pptlbrushorg, void* plineattrs, uint32_t mix);
int32_t windowssys_windows_win32_devices_display_EngTextOut(void* pso, void* pstro, void* pfo, void* pco, void* prclextra, void* prclopaque, void* pbofore, void* pboopaque, void* pptlorg, uint32_t mix);
int32_t windowssys_windows_win32_devices_display_EngTransparentBlt(void* psodst, void* psosrc, void* pco, void* pxlo, void* prcldst, void* prclsrc, uint32_t transcolor, uint32_t bcalledfrombitblt);
void windowssys_windows_win32_devices_display_EngUnicodeToMultiByteN(void* multibytestring, uint32_t maxbytesinmultibytestring, void* bytesinmultibytestring, void* unicodestring, uint32_t bytesinunicodestring);
void windowssys_windows_win32_devices_display_EngUnlockSurface(void* pso);
int32_t windowssys_windows_win32_devices_display_EngWideCharToMultiByte(uint32_t codepage, void* widecharstring, int32_t bytesinwidecharstring, void* multibytestring, int32_t bytesinmultibytestring);
uint32_t windowssys_windows_win32_devices_display_FONTOBJ_cGetAllGlyphHandles(void* pfo, void* phg);
uint32_t windowssys_windows_win32_devices_display_FONTOBJ_cGetGlyphs(void* pfo, uint32_t imode, uint32_t cglyph, void* phg, void* ppvglyph);
void* windowssys_windows_win32_devices_display_FONTOBJ_pQueryGlyphAttrs(void* pfo, uint32_t imode);
void* windowssys_windows_win32_devices_display_FONTOBJ_pfdg(void* pfo);
void* windowssys_windows_win32_devices_display_FONTOBJ_pifi(void* pfo);
void* windowssys_windows_win32_devices_display_FONTOBJ_pvTrueTypeFontFile(void* pfo, void* pcjfile);
void* windowssys_windows_win32_devices_display_FONTOBJ_pxoGetXform(void* pfo);
void windowssys_windows_win32_devices_display_FONTOBJ_vGetInfo(void* pfo, uint32_t cjsize, void* pfi);
int32_t windowssys_windows_win32_devices_display_GetAutoRotationState(void* pstate);
int32_t windowssys_windows_win32_devices_display_GetCapabilitiesStringLength(void* hmonitor, void* pdwcapabilitiesstringlengthincharacters);
int32_t windowssys_windows_win32_devices_display_GetDisplayAutoRotationPreferences(void* porientation);
uint32_t windowssys_windows_win32_devices_display_GetDisplayConfigBufferSizes(uint32_t flags, void* numpatharrayelements, void* nummodeinfoarrayelements);
int32_t windowssys_windows_win32_devices_display_GetMonitorBrightness(void* hmonitor, void* pdwminimumbrightness, void* pdwcurrentbrightness, void* pdwmaximumbrightness);
int32_t windowssys_windows_win32_devices_display_GetMonitorCapabilities(void* hmonitor, void* pdwmonitorcapabilities, void* pdwsupportedcolortemperatures);
int32_t windowssys_windows_win32_devices_display_GetMonitorColorTemperature(void* hmonitor, void* pctcurrentcolortemperature);
int32_t windowssys_windows_win32_devices_display_GetMonitorContrast(void* hmonitor, void* pdwminimumcontrast, void* pdwcurrentcontrast, void* pdwmaximumcontrast);
int32_t windowssys_windows_win32_devices_display_GetMonitorDisplayAreaPosition(void* hmonitor, int32_t ptpositiontype, void* pdwminimumposition, void* pdwcurrentposition, void* pdwmaximumposition);
int32_t windowssys_windows_win32_devices_display_GetMonitorDisplayAreaSize(void* hmonitor, int32_t stsizetype, void* pdwminimumwidthorheight, void* pdwcurrentwidthorheight, void* pdwmaximumwidthorheight);
int32_t windowssys_windows_win32_devices_display_GetMonitorRedGreenOrBlueDrive(void* hmonitor, int32_t dtdrivetype, void* pdwminimumdrive, void* pdwcurrentdrive, void* pdwmaximumdrive);
int32_t windowssys_windows_win32_devices_display_GetMonitorRedGreenOrBlueGain(void* hmonitor, int32_t gtgaintype, void* pdwminimumgain, void* pdwcurrentgain, void* pdwmaximumgain);
int32_t windowssys_windows_win32_devices_display_GetMonitorTechnologyType(void* hmonitor, void* pdtydisplaytechnologytype);
int32_t windowssys_windows_win32_devices_display_GetNumberOfPhysicalMonitorsFromHMONITOR(void* hmonitor, void* pdwnumberofphysicalmonitors);
int32_t windowssys_windows_win32_devices_display_GetPhysicalMonitorsFromHMONITOR(void* hmonitor, uint32_t dwphysicalmonitorarraysize, void* pphysicalmonitorarray);
int32_t windowssys_windows_win32_devices_display_GetTimingReport(void* hmonitor, void* pmtrmonitortimingreport);
int32_t windowssys_windows_win32_devices_display_GetVCPFeatureAndVCPFeatureReply(void* hmonitor, uint8_t bvcpcode, void* pvct, void* pdwcurrentvalue, void* pdwmaximumvalue);
int32_t windowssys_windows_win32_devices_display_HT_Get8BPPFormatPalette(void* ppaletteentry, uint16_t redgamma, uint16_t greengamma, uint16_t bluegamma);
int32_t windowssys_windows_win32_devices_display_HT_Get8BPPMaskPalette(void* ppaletteentry, int32_t use8bppmaskpal, uint8_t cmymask, uint16_t redgamma, uint16_t greengamma, uint16_t bluegamma);
int32_t windowssys_windows_win32_devices_display_PATHOBJ_bEnum(void* ppo, void* ppd);
int32_t windowssys_windows_win32_devices_display_PATHOBJ_bEnumClipLines(void* ppo, uint32_t cb, void* pcl);
void windowssys_windows_win32_devices_display_PATHOBJ_vEnumStart(void* ppo);
void windowssys_windows_win32_devices_display_PATHOBJ_vEnumStartClipLines(void* ppo, void* pco, void* pso, void* pla);
void windowssys_windows_win32_devices_display_PATHOBJ_vGetBounds(void* ppo, void* prectfx);
uint32_t windowssys_windows_win32_devices_display_QueryDisplayConfig(uint32_t flags, void* numpatharrayelements, void* patharray, void* nummodeinfoarrayelements, void* modeinfoarray, void* currenttopologyid);
int32_t windowssys_windows_win32_devices_display_RestoreMonitorFactoryColorDefaults(void* hmonitor);
int32_t windowssys_windows_win32_devices_display_RestoreMonitorFactoryDefaults(void* hmonitor);
int32_t windowssys_windows_win32_devices_display_STROBJ_bEnum(void* pstro, void* pc, void* ppgpos);
int32_t windowssys_windows_win32_devices_display_STROBJ_bEnumPositionsOnly(void* pstro, void* pc, void* ppgpos);
int32_t windowssys_windows_win32_devices_display_STROBJ_bGetAdvanceWidths(void* pso, uint32_t ifirst, uint32_t c, void* pptqd);
uint32_t windowssys_windows_win32_devices_display_STROBJ_dwGetCodePage(void* pstro);
void windowssys_windows_win32_devices_display_STROBJ_vEnumStart(void* pstro);
int32_t windowssys_windows_win32_devices_display_SaveCurrentMonitorSettings(void* hmonitor);
int32_t windowssys_windows_win32_devices_display_SaveCurrentSettings(void* hmonitor);
int32_t windowssys_windows_win32_devices_display_SetDisplayAutoRotationPreferences(int32_t orientation);
int32_t windowssys_windows_win32_devices_display_SetDisplayConfig(uint32_t numpatharrayelements, void* patharray, uint32_t nummodeinfoarrayelements, void* modeinfoarray, uint32_t flags);
int32_t windowssys_windows_win32_devices_display_SetMonitorBrightness(void* hmonitor, uint32_t dwnewbrightness);
int32_t windowssys_windows_win32_devices_display_SetMonitorColorTemperature(void* hmonitor, int32_t ctcurrentcolortemperature);
int32_t windowssys_windows_win32_devices_display_SetMonitorContrast(void* hmonitor, uint32_t dwnewcontrast);
int32_t windowssys_windows_win32_devices_display_SetMonitorDisplayAreaPosition(void* hmonitor, int32_t ptpositiontype, uint32_t dwnewposition);
int32_t windowssys_windows_win32_devices_display_SetMonitorDisplayAreaSize(void* hmonitor, int32_t stsizetype, uint32_t dwnewdisplayareawidthorheight);
int32_t windowssys_windows_win32_devices_display_SetMonitorRedGreenOrBlueDrive(void* hmonitor, int32_t dtdrivetype, uint32_t dwnewdrive);
int32_t windowssys_windows_win32_devices_display_SetMonitorRedGreenOrBlueGain(void* hmonitor, int32_t gtgaintype, uint32_t dwnewgain);
int32_t windowssys_windows_win32_devices_display_SetVCPFeature(void* hmonitor, uint8_t bvcpcode, uint32_t dwnewvalue);
int32_t windowssys_windows_win32_devices_display_XFORMOBJ_bApplyXform(void* pxo, uint32_t imode, uint32_t cpoints, void* pvin, void* pvout);
uint32_t windowssys_windows_win32_devices_display_XFORMOBJ_iGetXform(void* pxo, void* pxform);
uint32_t windowssys_windows_win32_devices_display_XLATEOBJ_cGetPalette(void* pxlo, uint32_t ipal, uint32_t cpal, void* ppal);
void* windowssys_windows_win32_devices_display_XLATEOBJ_hGetColorTransform(void* pxlo);
uint32_t windowssys_windows_win32_devices_display_XLATEOBJ_iXlate(void* pxlo, uint32_t icolor);
void* windowssys_windows_win32_devices_display_XLATEOBJ_piVector(void* pxlo);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_DISPLAY_WINDOWS_WIN32_DEVICES_DISPLAY_WRAPPER_H */
