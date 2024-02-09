Feature: Is it Wednesday yet?
  Everybody wants to know when it's Friday

  Scenario: Wednesday isn't Friday
    Given today is Sunday
    When I ask whether it's Friday yet i need to add ploskiy JSON
      | actionType                          | ANALYZE                                    |
      | Канал                               | ISSUER                                     |
      | Подканал                            | ISSUER~ISSUER                              |
      | Тип                                 | PAYMENT                                    |
      | Подтип                              | PAYMENT~ATM_PAYMENT                        |
      | Описание события                    | 680 Покупка через ePOS – терминал Purchase |
      | Идентификатор клиентской транзакции | Случайный карточный TRANSACTION_ID         |
      | Номер карты клиента                 | #{CARD}                                    |
      | Сумма платежа                       | 800                                        |
      | BIN карты клиента                   | 548220                                     |
      | Владелец карты                      | AT-T1727                                   |
    Then I should be told "Nope"
