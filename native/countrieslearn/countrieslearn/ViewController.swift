//
//  ViewController.swift
//  countrieslearn
//
//  Created by Angélica Oliveira on 10/09/19.
//  Copyright © 2019 Angélica Oliveira. All rights reserved.
//

import UIKit
import SharedData

class ViewController: UIViewController {
    private let cellIdentifier = "CellIdentifier"
    @IBOutlet weak var tableView: UITableView!
    private var countries: [Country] = [] {
        didSet {
            tableView.reloadData()
        }
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()

        //Instantiate repository
    }
}


extension ViewController: UITableViewDataSource, UITableViewDelegate {
    func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return countries.count
    }
    
    func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        guard let cell = tableView.dequeueReusableCell(withIdentifier: cellIdentifier, for: indexPath) as? CountryCell else {
            return UITableViewCell()
        }
        
        cell.configure(country: countries[indexPath.row])
        return cell
    }
}
