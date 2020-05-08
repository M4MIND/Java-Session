package com.company;

public class ControllingLoopsWithBreakAndContinue {
    public static void main(String[] args) {
        for (Map.Entry<Integer, String> certEntry : certificates.entrySet()) {
            Integer certId = certEntry.getKey();
            String certJson = certEntry.getValue();

            Map<String, Object> cert = parseJson(certId, certJson);
            //Изменить нужно только строки кода, идущие ниже
            if (cert != null) {
                parseFieldNames(cert);
            }
        }

        for (ExpertResponse item : list) {
            if (item.getRang() == null) continue;
            BigDecimal total = item.getRang().getTotal();
            if (total != null) {

                if (!map.containsKey(total)) {
                    map.put(total, new ArrayList());
                }
                map.get(total).add(item);
            }
        }
    }
}
